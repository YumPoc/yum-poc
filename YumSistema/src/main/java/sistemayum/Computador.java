package sistemayum;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;

public class Computador {

    private int idComputador;
    private String numeroIp;
    private String nome;
    private String enderecoMac;
    private String tipoProcessador;
    private String sistemaOperacional;
    private String tamanhoHd;
    private String tamanhoRam;
    private int quantidadeBateriaUsada;
    private int usoCpu;
    private int usoDisco;
    private int usoRam;
    private String statusRede;
    private SystemInfo si = new SystemInfo();
    
    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public void setNumeroIp() {
        HardwareAbstractionLayer hardware = si.getHardware();
        NetworkIF[] networkIFs = hardware.getNetworkIFs();
        String[] ips = networkIFs[0].getIPv4addr();
        this.numeroIp = ips[0];
        
    }

    public void setNome() {
        HardwareAbstractionLayer hardware = si.getHardware();
        ComputerSystem computerSystem = hardware.getComputerSystem();
        this.nome = computerSystem.getManufacturer();
        
    }

    public void setEnderecoMac() {
        HardwareAbstractionLayer hardware = si.getHardware();
        NetworkIF[] networkIFs = hardware.getNetworkIFs();
        this.enderecoMac = networkIFs[0].getMacaddr();

    }

    public void setTipoProcessador() {
        HardwareAbstractionLayer hardware = si.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        this.tipoProcessador = processor.getName();
        
    }

    public void setSistemaOperacional() {
        HardwareAbstractionLayer hardware = si.getHardware();
        ComputerSystem computerSystem = hardware.getComputerSystem();
        this.sistemaOperacional = computerSystem.getModel();
         
    }

    public void setTamanhoHd() {
        HardwareAbstractionLayer hardware = si.getHardware();
        HWDiskStore[] diskStores = hardware.getDiskStores();
        this.tamanhoHd = String.valueOf( diskStores[0].getSize());
        
    }

    public void setTamanhoRam() {        
        HardwareAbstractionLayer hardware = si.getHardware();
        GlobalMemory memory = hardware.getMemory();
        this.tamanhoRam =String.valueOf(memory.getTotal());
        
    }

    public void setQuantidadeBateriaUsada(int quantidadeBateriaUsada) {
        this.quantidadeBateriaUsada = quantidadeBateriaUsada;
    }

    public void setUsoCpu(int usoCpu) {
        this.usoCpu = usoCpu;
    }

    public void setUsoDisco(int usoDisco) {
        this.usoDisco = usoDisco;
    }

    public void setUsoRam(int usoRam) {
        this.usoRam = usoRam;
    }

    public void setStatusRede(String statusRede) {
        this.statusRede = statusRede;
    }

    public int getIdComputador() {
        return idComputador;
    }

    public String getNumeroIp() {
        return numeroIp;
    }

    public String getNome() {
        return nome;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getTamanhoHd() {
        return tamanhoHd;
    }

    public String getTamanhoRam() {
        return tamanhoRam;
    }

    public int getQuantidadeBateriaUsada() {
        return quantidadeBateriaUsada;
    }

    public int getUsoCpu() {
        return usoCpu;
    }

    public int getUsoDisco() {
        return usoDisco;
    }

    public int getUsoRam() {
        return usoRam;
    }

    public String getStatusRede() {
        return statusRede;
    }

}
