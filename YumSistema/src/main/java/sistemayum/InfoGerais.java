/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemayum;

import connectionyum.ConnectionFactory;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
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

    private String setorHospital;
    private String numeroIp;
    private String nomeComputador;
    private String enderecoMac;
    private String tipoProcessador;
    private String sistemaOperacional;
    private String tamanhoHd;
    private String tamanhoRam;

    public void atualizarInfoGerais() {
        setIpMac();
        setNomeComputador();
        setSistemaOperacional();
        setTamanhoHd();
        setTamanhoRam();
        setTipoProcessador();
        setSetorHospital();

    }

    public String getNumeroIp() {
        return numeroIp;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    private void setIpMac() {

        StringBuilder numerosIP = new StringBuilder();

        NetworkIF[] cabosDeRede = hardware.getNetworkIFs();
        for (NetworkIF caboDeRede : cabosDeRede) {

            String[] iPv4s = caboDeRede.getIPv4addr();
            for (String iPv4 : iPv4s) {
                if (!iPv4.isEmpty()) {//se tiver IPv4 (Não esta vazio) concatena!!
                    numerosIP.append(caboDeRede.getDisplayName() + ": " + iPv4);
                }
            }
        }
//        numerosIP.append("IPv4(Gateway): ");
//        numerosIP.append(os.getNetworkParams().getIpv4DefaultGateway());
//        numerosIP.append("/IPv6(Gateway): ");
//        numerosIP.append(os.getNetworkParams().getIpv6DefaultGateway());

        this.numeroIp = numerosIP.toString();

        this.enderecoMac = cabosDeRede[0].getMacaddr();
        this.enderecoMac = this.enderecoMac.replace(":", "-").toUpperCase();
    }

    public String getNomeComputador() {
        return nomeComputador;
    }

    private void setNomeComputador() {
        String computername = null;
        Baseboard placaMae = hardware.getComputerSystem().getBaseboard();
        computername = placaMae.getManufacturer() + " " + placaMae.getModel() + " serial: " + placaMae.getSerialNumber() + " version: " + placaMae.getVersion();
        System.out.println("nome computador: " + computername);
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

    public String getSetorHospital() {
        return setorHospital;
    }

    public void setSetorHospital() {
        this.setorHospital = "DEFAULT";
    }

}
