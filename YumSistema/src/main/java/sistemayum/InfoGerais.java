/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemayum;

import connectionyum.ConnectionFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;
import oshi.util.FormatUtil;

/**
 *
 * @author YumPoc
 */
public class InfoGerais {

    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hardware = si.getHardware();
    private OperatingSystem os = si.getOperatingSystem();
    private ConnectionFactory cliente = new ConnectionFactory();
    
    private int idComputador;
    private int codCliente;
    private String setorHospital;
    private String numeroIp;
    private String nomeComputador;
    private String enderecoMac;
    private String tipoProcessador;
    private String sistemaOperacional;
    private String tamanhoHd;
    private String tamanhoRam;
    
    public void AtualizarInfoGerais() {
        setIpMac();
        setNomeComputador();
        setSistemaOperacional();
        setTamanhoHd();
        setTamanhoRam();
        setTipoProcessador();
        setCodCliente();
        setSetorHospital();
        setIdComputador();
        
    }
    
    public String getNumeroIp() {
        return numeroIp;
    }
    
    public String getEnderecoMac() {
        return enderecoMac;
    }
    
    private void setIpMac() {

        StringBuilder numerosIP = new StringBuilder();
        StringBuilder enderecoMAC = new StringBuilder();

        NetworkIF[] cabosDeRede = hardware.getNetworkIFs();
        for (NetworkIF caboDeRede : cabosDeRede) {
            String[] iPv4s = caboDeRede.getIPv4addr();
            String[] iPv6s = caboDeRede.getIPv6addr();
            numerosIP.append("IPv4:");
            for (String iPv4 : iPv4s) {
                numerosIP.append(iPv4);
                numerosIP.append("|");
            }
            numerosIP.append("IPv6:");
            numerosIP.append("|");
            for (String iPv6 : iPv6s) {
                numerosIP.append(iPv6);
                numerosIP.append("|");
            }
            enderecoMAC.append(caboDeRede.getMacaddr());
            if (cabosDeRede.length > 1) {
                enderecoMAC.append(" | ");
            }
        }
        numerosIP.append("IPv4: ");
        numerosIP.append(os.getNetworkParams().getIpv4DefaultGateway());
        numerosIP.append("/IPv6: ");
        numerosIP.append(os.getNetworkParams().getIpv6DefaultGateway());

        this.numeroIp = numerosIP.toString();
        this.enderecoMac = enderecoMAC.toString();

    }

    public String getNomeComputador() {
        return nomeComputador;
    }

    private void setNomeComputador() {
        String computername = null;
        try {
            computername = InetAddress.getLocalHost().getHostName();
            System.out.println("nome computador: "+computername);
        } catch (UnknownHostException e) {
            System.out.println("Exception caught =" + e.getMessage());
        }
        this.nomeComputador = computername;
    }

    public String getTipoProcessador() {
        return tipoProcessador;
    }

    private void setTipoProcessador() {
        CentralProcessor processor = hardware.getProcessor();
        this.tipoProcessador = processor.getName();
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    private void setSistemaOperacional() {
        String manufacturer = os.getManufacturer();
        String family = os.getFamily();
        OperatingSystemVersion version = os.getVersion();
        String version1 = version.getVersion();
        this.sistemaOperacional = manufacturer + " " + family + " " + version1;
    }

    public String getTamanhoHd() {
        return tamanhoHd;
    }

    private void setTamanhoHd() {
        HWDiskStore[] discos = hardware.getDiskStores();
        long tamanhoTotalHDD = 0;
        for (HWDiskStore disco : discos) {
            tamanhoTotalHDD = disco.getSize();
        }
        this.tamanhoHd = FormatUtil.formatBytesDecimal(tamanhoTotalHDD);
    }

    public String getTamanhoRam() {
        return tamanhoRam;
    }

    private void setTamanhoRam() {
        GlobalMemory memory = hardware.getMemory();
        long tamanhoTotalRAM = memory.getTotal();        
        this.tamanhoRam = FormatUtil.formatBytesDecimal(tamanhoTotalRAM);
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente() {
        this.codCliente = cliente.getId_cliente();
    }

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador() {
        //colocar valor que será gerado apenas uma vez no computador iduUnico
        //com dia mes ano horas minutos e segundos
        this.idComputador = 11112018;
    }

    public String getSetorHospital() {
        return setorHospital;
    }

    public void setSetorHospital() {
        this.setorHospital  = "DEFAULT";
    }
    
}
