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
	private float quantidadeBateriaUsada;
	private float usoCpu;
	private float usoDisco;
	private float usoRam;
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

	public float getQuantidadeBateriaUsada() {
		return quantidadeBateriaUsada;
	}

	public float getUsoCpu() {
		return usoCpu;
	}

	public float getUsoDisco() {
		return usoDisco;
	}

	public float getUsoRam() {
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

	public void setQuantidadeBateriaUsada(float quantidadeBateriaUsada) {
		this.quantidadeBateriaUsada = quantidadeBateriaUsada;
	}

	public void setUsoCpu(float usoCpu) {
		this.usoCpu = usoCpu;
	}

	public void setUsoDisco(float usoDisco) {
		this.usoDisco = usoDisco;
	}

	public void setUsoRam(float usoRam) {
		this.usoRam = usoRam;
	}

	public void setStatusRede(String statusRede) {
		this.statusRede = statusRede;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
		
	}

}