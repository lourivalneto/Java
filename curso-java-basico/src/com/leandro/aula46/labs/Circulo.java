package com.leandro.aula46.labs;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	private final double PI = 3.14;
	private double raio;
	private double area;
	
	@Override
	public void calcularArea() {
		
		this.area = this.getPI() * (this.getRaio() * this.getRaio());
		System.out.print(String.format("%.2f",area));
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}
	
	

}
