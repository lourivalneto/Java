package com.leandro.aula33.labs;

public class Lampada {
	
	private String cor;
	private double potencia;
	private double garantia;
	private double tensao;
	private double  altura;
	private double largura;
	private double vidaUtil;
	private boolean estado = false;
	
	private boolean ligarLampada() {
		this.estado = true;
		return this.estado;
	}
	
	private boolean desligarLampada() {
		this.estado = false;
		return this.estado;
	}
	
	public boolean ligarLampada(boolean estado) {
		boolean ligada;
		if(estado == true) {
			ligada = this.ligarLampada();
			return ligada;
		}
		return false;
	}
	
	public boolean desligarLampada(boolean estado) {
		boolean desligada;
		if(estado == false) {
			desligada = this.desligarLampada();
			return desligada;
		}
		return false;
	}
	
	public String getCor() {
		return cor;
	}
	public Lampada(String cor, double potencia, double garantia, double tensao, double altura, double largura,
			double vidaUtil, boolean estado) {
		super();
		this.cor = cor;
		this.potencia = potencia;
		this.garantia = garantia;
		this.tensao = tensao;
		this.altura = altura;
		this.largura = largura;
		this.vidaUtil = vidaUtil;
		this.estado = estado;
	}
	public Lampada() {
		
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getGarantia() {
		return garantia;
	}
	public void setGarantia(double garantia) {
		this.garantia = garantia;
	}
	public double getTensao() {
		return tensao;
	}
	public void setTensao(double tensao) {
		this.tensao = tensao;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(double vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
