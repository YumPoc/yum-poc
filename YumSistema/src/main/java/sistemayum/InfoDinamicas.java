/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemayum;

import connectionyum.ConnectionFactory;
import interfaceyum.YumAPP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oshi.SystemInfo;
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
    private int bateriaUsada;
    private int usoCPU;
    private int usoDisco;
    private int download;
    private int upload;
    private int usoRAM;
    
    private boolean resultado = false;
    connectionyum.ConnectionFactory connectionUrl = new ConnectionFactory();
        
    private void enviarDados() {
        
        new Thread() {
     
            @Override
            public void run() {
                int y = 0;
                try {
                    System.out.println("x.i: " + YumAPP.isAtivo);

                        while (YumAPP.isAtivo) {
                            try {
                                // cria um preparedStatement
                                Connection connection = connectionUrl.getConnection();
                                PreparedStatement stmt = connection.prepareStatement("insert into COMPUTADORES_DINAMICO (cod_computador, quant_bateria_usada, uso_cpu, uso_disco, download, upload, uso_ram) values (?, ?, ?, ?, ?, ?, ?);");

                                // preenche os valores
                                stmt.setInt(1, getCodComputador());
                                stmt.setInt(2, getBateriaUsada());
                                stmt.setInt(3, getUsoCPU());
                                stmt.setInt(4, getUsoDisco());
                                stmt.setInt(5, getDownload());
                                stmt.setInt(6, getUpload());
                                stmt.setInt(7, getUsoRAM());

                                // executa
                                stmt.execute();
                                stmt.close();

                                System.out.println("Foi um " + y++);
                            } catch (SQLException e) {
                                System.out.println("InsertException: " + e);
                            }

                            Thread.sleep(5000);
                            
                        }
                } catch (Exception e) {
                    System.out.println("WhileException: " + e);
                }
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

    public int getBateriaUsada() {
        return bateriaUsada;
    }

    private void setBateriaUsada() {
        this.bateriaUsada = bateriaUsada;
    }

    public int getUsoCPU() {
        return usoCPU;
    }

    private void setUsoCPU() {
        this.usoCPU = usoCPU;
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
        this.download = download;
    }

    public int getUpload() {
        return upload;
    }

    private void setUpload() {
        this.upload = upload;
    }
    
    public int getUsoRAM() {
        return usoRAM;
    }

    private void setUsoRAM() {
         GlobalMemory ram = hardware.getMemory();
        float percentualDisponivel = ((ram.getAvailable() * 100) / ram.getTotal());
        float percentalOcupado = 100 - percentualDisponivel;
        this.usoRAM = (int) percentalOcupado;
    }
    
    
}
