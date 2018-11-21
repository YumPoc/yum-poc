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

    private float bateriaUsada;
    private float usoCPU;
    private float usoDisco;
    private float download;
    private float upload;
    private float usoRAM;
    private NetworkIF ethernet0 = hardware.getNetworkIFs()[0];

    connectionyum.ConnectionFactory connectionUrl = new ConnectionFactory();

    private void enviaDados() {

    }
    
    /*private void enviarDadosDentroDeUmaThread() {
        new Thread() {
            @Override
            public void run() {
                enviaDados();
            }
        }.start();
    }*/

    public void atualizarDinamico() {
        setUsoDisco();
        setDownload();
        setUsoCPU();
        setBateriaUsada();
        setUsoRAM();
        setUpload();

    }

    public float getBateriaUsada() {
        return bateriaUsada;
    }

    private void setBateriaUsada() {
        PowerSource[] powerSources = hardware.getPowerSources();
        double capacidadeRestante = powerSources[0].getRemainingCapacity();
        this.bateriaUsada = (float) capacidadeRestante;
    }

    public float getUsoCPU() {
        return usoCPU;
    }

    private void setUsoCPU() {
        CentralProcessor cpu = hardware.getProcessor();
        double systemCpuLoad = cpu.getSystemCpuLoad();
        float percentage = (float) (systemCpuLoad * 100);
        percentage = Math.round(percentage);
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
                perc = (100.0 * transferDelta) / tempoDelta;
            } else {
                perc = 0.0;
                transferDelta = 0;
            }
            this.usoDisco = (float) perc;
            
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException InfoDinamicas setUsoDisco");
            System.out.println(ex);
            this.usoDisco = -1;
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
            this.download = downloadMbps;
            
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException InfoDinamicas setDownload");
            System.out.println(ex);
            this.download = -1;            
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
            this.upload = uploadKbps;
            
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException InfoDinamicas setUpload");
            System.out.println(ex);
            this.upload = -1;            
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
        this.usoRAM = 100 - percentualOcupado;

    }

}
