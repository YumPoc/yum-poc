package br.com.poc.yum.modelos;

public class Computador {
	private int codCliente;
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
	public int getCodCliente() {
		return codCliente;
	}

	public void setIdComputador(int idComputador) {
		this.idComputador = idComputador;
	}

	public void setNumeroIp(String numeroIp) {
		this.numeroIp = numeroIp;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEnderecoMac(String enderecoMac) {
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

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
		
	}

}