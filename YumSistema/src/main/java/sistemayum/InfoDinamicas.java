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
    private int contagem = 0;

    connectionyum.ConnectionFactory connectionUrl = new ConnectionFactory();

    public void atualizarDinamico() {
        setBateria();
        setUsoDisco();
        setUsoCPU();
        setDownload();
        setUpload();
        setUsoRAM();
        contagem++;

    }

    public float getBateria() {
        if (contagem >= 6 && bateria <= 15) {
            //JSlack.menssagem(Alerta);
            Log.log("Bateria está em 15%");
            contagem = 0;
        }
        return bateria;
    }

    private void setBateria() {
        PowerSource[] powerSources = hardware.getPowerSources();
        double capacidadeRestante = powerSources[0].getRemainingCapacity();
        capacidadeRestante = Math.round(capacidadeRestante * 100);
        this.bateria = (float) capacidadeRestante;

    }

    public float getUsoCPU() {
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
