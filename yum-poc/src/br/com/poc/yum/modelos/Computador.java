package br.com.poc.yum.modelos;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.poc.yum.jsonview.Views;

public class Computador {
	@JsonView(Views.Public.class)
	private int idComputador;
	@JsonView(Views.Public.class)
	private String numeroIp;
	@JsonView(Views.Public.class)
	private String nome;
	@JsonView(Views.Public.class)
	private String enderecoMac;

	

	@JsonView(Views.Public.class)
	private String tipoProcessador;
	@JsonView(Views.Public.class)
	private String sistemaOperacional;
	@JsonView(Views.Public.class)
	private String tamanhoHd;
	@JsonView(Views.Public.class)
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

}