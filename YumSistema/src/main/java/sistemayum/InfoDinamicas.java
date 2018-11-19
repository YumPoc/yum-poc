/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemayum;

import connectionyum.ConnectionFactory;
import interfaceyum.YumAPP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author juven
 */
public class InfoDinamicas {
    
    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hardware = si.getHardware();
    private OperatingSystem os = si.getOperatingSystem();    
    
    private int codComputador;
    private float bateriaUsada;
    private float usoCPU;
    private int usoDisco;
    private int download;
    private int upload;
    private float usoRAM;
    
    private boolean resultado = false;
    connectionyum.ConnectionFactory connectionUrl = new ConnectionFactory();
    private void enviaDados(){
        
    }
    private void enviarDadosDentroDeUmaThread() {
        new Thread() {
            @Override
            public void run() {
                enviaDados();
            }
        }.start();    
    }

    public void atualizarDinamico(){
        setBateriaUsada();
        setCodComputador();
        setDownload();
        setUpload();
        setUsoCPU();
        setUsoDisco();
        setUsoRAM();

    }
    
    public int getCodComputador() {
        return codComputador;
    }

    private void setCodComputador() {
        this.codComputador = codComputador;
    }

    public float getBateriaUsada() {
        return bateriaUsada;
    }

    private void setBateriaUsada() {
        float bateria = (float) hardware.getPowerSources()[0].getRemainingCapacity();
        this.bateriaUsada = bateria;
    }

    public float getUsoCPU() {
        return usoCPU;
    }

    private void setUsoCPU() {
        CentralProcessor cpu = hardware.getProcessor();
        float percentage = (float) (cpu.getSystemCpuLoad() * 100);
        percentage = Math.round(percentage);
        System.out.println(percentage + "%");
        try {
            Thread.sleep(2000);
            this.usoCPU = percentage;
        } catch (InterruptedException ex) {
            System.out.println(ex);
            this.usoCPU = 1;
        }
    }

    public int getUsoDisco() {
        return usoDisco;
    }

    private void setUsoDisco() {
        this.usoDisco = -1;
    }

    public int getDownload() {
        return download;
    }

    private void setDownload() {
       
    }

    public int getUpload() {
        return upload;
    }

    private void setUpload() {
        this.upload = upload;
    }
    
    public float getUsoRAM() {
        return usoRAM;
    }

    private void setUsoRAM() {
        GlobalMemory ram = hardware.getMemory();
        float percentualDisponivel = ((ram.getAvailable() * 100) / ram.getTotal());
        float percentalOcupado = 100 - percentualDisponivel;
        this.usoRAM = percentalOcupado;
       
    }
    
    
}
