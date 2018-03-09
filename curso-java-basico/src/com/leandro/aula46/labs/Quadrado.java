package com.leandro.aula46.labs;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	private double lado;
	private double area;

	@Override
	public void calcularArea() {
		this.area  = Math.pow(lado, 2);
		System.out.print(this.area);
		
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
