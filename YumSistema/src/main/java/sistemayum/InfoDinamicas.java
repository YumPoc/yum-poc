package sistemayum;

import connectionyum.ConnectionFactory;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.hardware.PowerSource;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author YumPoc
 */
public class InfoDinamicas {

    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hardware = si.getHardware();
    private OperatingSystem os = si.getOperatingSystem();

    private float bateria;
    private float usoCPU;
    private float usoDisco;
    private float download;
    private float upload;
    private float usoRAM;
    private NetworkIF ethernet0 = hardware.getNetworkIFs()[0];
    //gerar um contador para a situação universal atributo private
    private int contagemCpu = 0;
    private int contagemDisco = 0;
    private int contagemBateria = 0;
    private int contagemRam = 0;
    private static int TEMPO_SILENCIADO=12;//12*5seg(per loop)
    connectionyum.ConnectionFactory connectionUrl = new ConnectionFactory();

    public void atualizarDinamico() {
        setBateria();
        setUsoDisco();
        setUsoCPU();
        setDownload();
        setUpload();
        setUsoRAM();
        contagemCpu++;
        contagemBateria++;
        contagemDisco++;
        contagemRam++;
    }

    public float getBateria() {        
        if (contagemBateria >= TEMPO_SILENCIADO && bateria <= 5) {
            YumSlack.Alerta("Bateria está baixa "+bateria+"%", OpcaoDeComponente.BATERIA, true);
            Log.log("Bateria está em "+bateria+"%");
            contagemBateria = 0;
        }else if(contagemBateria >= TEMPO_SILENCIADO && bateria <= 15){ 
            YumSlack.Alerta("Bateria está baixa "+bateria+"%", OpcaoDeComponente.BATERIA, false);
            Log.log("Bateria está em "+bateria+"%");
            contagemBateria = 0;
        }
        
        return bateria;
    }

    private void setBateria() {
        PowerSource[] powerSources = hardware.getPowerSources();
        double capacidadeRestante = powerSources[0].getRemainingCapacity();
        capacidadeRestante = Math.round(capacidadeRestante * 100);
        if(capacidadeRestante < 0){
            capacidadeRestante = 100;
        }
        this.bateria = (float) capacidadeRestante;

    }

    public float getUsoCPU() {
        if (contagemCpu >= 6 && usoCPU >= 95) {
            YumSlack.Alerta("Uso de CPU está "+bateria+"%", OpcaoDeComponente.CPU, true);
            Log.log("CPU está em "+usoCPU+"%");
            contagemCpu = 0;
        }        else if (contagemCpu >= 6 && usoCPU >= 85) {
            YumSlack.Alerta("Uso de CPU está "+bateria+"%", OpcaoDeComponente.CPU, false);
            Log.log("CPU está em "+usoCPU+"%");
            contagemCpu = 0;
        }
        return usoCPU;
    }

    private void setUsoCPU() {
        CentralProcessor cpu = hardware.getProcessor();
        double systemCpuLoad = cpu.getSystemCpuLoad();
        float percentage = (float) (systemCpuLoad * 100);
        percentage = Math.round(percentage);
        if (percentage < 0) {
            Log.log("Não Conseguiu capturar uso da CPU");
            percentage = 0;
        }
        this.usoCPU = percentage;

    }

    public float getUsoDisco() {
        if(usoDisco >= 90 && contagemDisco >= TEMPO_SILENCIADO){
            YumSlack.Alerta("Uso do HD atingiu "+usoDisco+"%", OpcaoDeComponente.HD, true);
            Log.log("Uso do HD atingiu "+usoDisco+"%");
            contagemDisco=0;
        } else if(usoDisco >= 80 && contagemDisco >= TEMPO_SILENCIADO){
            YumSlack.Alerta("Uso do HD atingiu "+usoDisco+"%", OpcaoDeComponente.HD, false);
            Log.log("Uso do HD atingiu "+usoDisco+"%");
            contagemDisco=0;
        }
        return usoDisco;
    }

    private void setUsoDisco() {
        HWDiskStore diskStores = hardware.getDiskStores()[0];

        try {
            long tempoAnterior = System.currentTimeMillis();
            long transferAnterior = diskStores.getTransferTime();
            Thread.sleep(1000);
            diskStores.updateDiskStats();
            long tempoAtual = System.currentTimeMillis();
            long transferAtual = diskStores.getTransferTime();
            int tempoDelta = (int) (tempoAtual - tempoAnterior);
            int transferDelta;
            double perc;
            tempoAnterior = tempoAtual;
            if (transferAtual > transferAnterior) {
                transferDelta = (int) (transferAtual - transferAnterior);
                transferAnterior = transferAtual;
                perc = (100 * transferDelta) / tempoDelta;

                if (perc > 100) {
                    perc = 100;
                }

            } else {
                perc = 0;
                transferDelta = 0;
            }

            this.usoDisco = (float) (Math.round(perc * 100) / 100);

        } catch (InterruptedException ex) {
            Log.log("InfoDinamicas setUsoDisco: " + ex);
            this.usoDisco = 0;
        }

    }

    public float getDownload() {
        return download;
    }

    private void setDownload() {

        try {
            ethernet0.updateNetworkStats();
            long bytesRecebidosPassado = ethernet0.getBytesRecv();//Received
            Thread.sleep(1500);
            ethernet0.updateNetworkStats();
            long bytesRecebidos = ethernet0.getBytesRecv();
            long bytesVariadosDownload = bytesRecebidos - bytesRecebidosPassado;
            float downloadMbps = (float) ((bytesVariadosDownload / 1500) * 8) / 1000;//KiloBytes para MegaBits 
            this.download = (Math.round(downloadMbps * 100) / 100);

        } catch (InterruptedException ex) {
            Log.log("InfoDinamicas setDownload: " + ex);
            this.download = 0;
        }
    }

    public float getUpload() {
        return upload;
    }

    private void setUpload() {
        try {
            ethernet0.updateNetworkStats();
            long bytesEnviadosPassado = ethernet0.getBytesSent();//Sent
            Thread.sleep(1500);
            ethernet0.updateNetworkStats();
            long bytesEnviadosAtual = ethernet0.getBytesSent();
            long bytesVariadosUpload = bytesEnviadosAtual - bytesEnviadosPassado;
            float uploadKbps = (float) ((bytesVariadosUpload / 1500) * 8);//KiloBytes para KiloBits
            this.upload = (Math.round(uploadKbps * 100) / 100);

        } catch (InterruptedException ex) {
            Log.log("InfoDinamicas setUpload: " + ex);
            this.upload = 0;
        }
    }

    public float getUsoRAM() {
        if(usoRAM >= 90 && contagemRam >= TEMPO_SILENCIADO){
            YumSlack.Alerta("Uso da RAM atingiu "+usoRAM+"%", OpcaoDeComponente.RAM, true);
            contagemRam=0;
        } else if(usoRAM >= 80 && contagemRam >= TEMPO_SILENCIADO){
            YumSlack.Alerta("Uso da RAM atingiu "+usoRAM+"%", OpcaoDeComponente.RAM, false);
            contagemRam=0;
        }
        return usoRAM;
    }

    private void setUsoRAM() {
        GlobalMemory ram = hardware.getMemory();
        long disponivel = ram.getAvailable();
        long total = ram.getTotal();
        float percentualOcupado = ((disponivel * 100) / total);
        this.usoRAM = percentualOcupado - 100;

    }

}
