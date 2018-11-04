package br.com.poc.yum.modelos;

import oshi.SystemInfo;
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
        private SystemInfo si = new SystemInfo() ;
        
    public void setIdComputador(int idComputador) {
        
        this.idComputador = idComputador;
    }

    public void setNumeroIp() {
            HardwareAbstractionLayer hardware = si.getHardware();
            NetworkIF[] networkIFs = hardware.getNetworkIFs();
            String[] ips = networkIFs[0].getIPv4addr();
            this.numeroIp=ips[0];          
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnderecoMac(String enderecoMac) {
        HardwareAbstractionLayer hardware = si.getHardware();
            NetworkIF[] networkIFs = hardware.getNetworkIFs();
            networkIFs[0].ge
        this.enderecoMac = enderecoMac;
    }

    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setTamanhoHd(String tamanhoHd) {
        this.tamanhoHd = tamanhoHd;
    }

    public void setTamanhoRam(String tamanhoRam) {
        this.tamanhoRam = tamanhoRam;
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