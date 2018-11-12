/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemayum;

import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;

/**
 *
 * @author Germano
 */
public class ComputadorInfoDinamicas {

    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer Hardware = si.getHardware();
    private OperatingSystem os = si.getOperatingSystem();
    private CentralProcessor cpu = Hardware.getProcessor();
    private NetworkIF[] net = Hardware.getNetworkIFs();
    private float bateriaUsada;
    private float usoCPU;
    private float usoDisco;
    private float download;
    private float upload;
    private float usoRAM;

    public void atualiza() {
        usoDisco = atualizaUsoDisco();
        usoRAM = atualizaRAMpercentualDeUso();
        usoCPU = (float) getProcessingUse(1000L);
        download = PegarVelocidadeDownloadMbpsDaInternet(net[0], 1000);
        upload = PegarVelocidadeUploadKbpsDaInternet(net[0], 0);
        bateriaUsada = (float) Hardware.getPowerSources()[0].getRemainingCapacity();
    }

    private float atualizaUsoDisco() {
        return -1;
    }

    private float atualizaRAMpercentualDeUso() {
        GlobalMemory ram = Hardware.getMemory();
        float percentualDisponivel = ((ram.getAvailable() * 100) / ram.getTotal());
        float percentalOcupado = 100 - percentualDisponivel;
        usoRAM = percentalOcupado;
        return usoRAM;
    }

    private double getProcessingUse(long delay) {
        double percentage = cpu.getSystemCpuLoad() * 100;
        percentage = Math.round(percentage);
        System.out.println(percentage + "%");
        try {
            Thread.sleep(delay);
            return percentage;
        } catch (InterruptedException ex) {
            System.out.println(ex);
            return -1;
        }
    }

    //Sinaliza aquele problema de classificação de cabo
    private void AtualizaInfoInternet() {
        String[] netNames = new String[net.length];
        for (int i = 0; i < net.length; i++) {
            //System.out.println(net.getMacaddr());
            netNames[i] = net[i].getDisplayName();
        }
        while (true) {
            for (int i = 0; i < net.length; i++) {
                System.out.println(netNames[i]);
                PegarVelocidadeDownloadMbpsDaInternet(net[i], 1000);
            }
        }
    }

    private static float PegarVelocidadeUploadKbpsDaInternet(NetworkIF net, int deltaTime) {
        try {
            net.updateNetworkStats();
            long upld = net.getBytesSent();//Sent
            Thread.sleep(deltaTime);
            net.updateNetworkStats();
            long upld2 = net.getBytesSent() - upld;
            float uploadSpeed = (float) ((upld2 / deltaTime) * 8);//KiloBytes para KiloBits
            return uploadSpeed;
        } catch (InterruptedException ex) {
            return -1;
        }
    }

    private static float PegarVelocidadeDownloadMbpsDaInternet(NetworkIF net, int deltaTime) {
        try {
            net.updateNetworkStats();
            long dwnld = net.getBytesRecv();//Received
            Thread.sleep(deltaTime);
            net.updateNetworkStats();
            long dwnld2 = net.getBytesRecv() - dwnld;
            float downloadSpeed = (float) ((dwnld2 / deltaTime) * 8) / 1000;//KiloBytes para MegaBits 
            return downloadSpeed;
        } catch (InterruptedException ex) {
            return -1;
        }
    }

}
