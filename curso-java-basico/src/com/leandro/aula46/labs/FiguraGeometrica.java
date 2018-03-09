package com.leandro.aula46.labs;

public abstract class FiguraGeometrica implements DimensaoSuperficial,DimensaoVolumetrica{
	private String nome;
	private String cor;
	@Override
	public void calcularVolume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
