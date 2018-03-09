package com.leandro.aula46.labs;

public class Cilindro extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica{
	private final double PI = 3.141592;
	private double raio;
	private double altura;
	double areaBase;
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		this.areaBase = this.getPI() * (Math.pow(this.getRaio(), 2));
		double areaLado = 2 * this.getPI() * this.getRaio() * this.getAltura();
		double areaTotal = 2 * areaBase + areaLado;
		System.out.print(areaTotal);
		
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
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

	@Override
	public void calcularVolume() {
		double volumeCilindro = this.areaBase * this.getAltura();
		System.out.print(volumeCilindro + "\n");
		
	}

}
