package br.com.poc.yum.modelos;

public class ComputadorDinamico {
	private float quantidadeBateriaUsada;
	private float usoCpu;
	private float usoDisco;
	private float usoRam;
	

	public float getQuantidadeBateriaUsada() {
		return quantidadeBateriaUsada;
	}

	public void setQuantidadeBateriaUsada(float quantidadeBateriaUsada) {
		this.quantidadeBateriaUsada = quantidadeBateriaUsada;
	}

	public float getUsoCpu() {
		return usoCpu;
	}

	public void setUsoCpu(float usoCpu) {
		this.usoCpu = usoCpu;
	}

	public float getUsoDisco() {
		return usoDisco;
	}

	public void setUsoDisco(float usoDisco) {
		this.usoDisco = usoDisco;
	}

	public float getUsoRam() {
		return usoRam;
	}

	public void setUsoRam(float usoRam) {
		this.usoRam = usoRam;
	}

}
