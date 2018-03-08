package com.leandro.aula46.labs;

public class Piramide extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica{
	private double arestaBase;
	private double altura;
	private double apotemaPiramide;
	private double apotemaBase;
	private double apotemaPiramideRegular;
	private double areaTotalFacesLaterais;
	private double areaBase;
	private double areaPiramide;

	@Override
	public void calcularArea() {
		apotemaPiramide =  Math.sqrt((Math.pow(apotemaPiramide, 2) + Math.pow(this.getAltura(), 2))) ;
		apotemaPiramideRegular = apotemaPiramide * arestaBase;
		areaTotalFacesLaterais = 4 * apotemaPiramideRegular;
		areaBase = Math.pow(arestaBase, 2);
		areaPiramide = areaPiramide + areaTotalFacesLaterais;
		System.out.println(areaPiramide);
		
	}

	@Override
	public void calcularVolume() {
		double volumePiramide = (this.getAreaBase() * this.getAltura()) / 3;
		
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getApotemaPiramide() {
		return apotemaPiramide;
	}

	public void setApotemaPiramide(double apotemaPiramide) {
		this.apotemaPiramide = apotemaPiramide;
	}

	public double getApotemaBase() {
		return apotemaBase;
	}

	public void setApotemaBase(double apotemaBase) {
		this.apotemaBase = apotemaBase;
	}

	public double getApotemaPiramideRegular() {
		return apotemaPiramideRegular;
	}

	public void setApotemaPiramideRegular(double apotemaPiramideRegular) {
		this.apotemaPiramideRegular = apotemaPiramideRegular;
	}

	public double getAreaTotalFacesLaterais() {
		return areaTotalFacesLaterais;
	}

	public void setAreaTotalFacesLaterais(double areaTotalFacesLaterais) {
		this.areaTotalFacesLaterais = areaTotalFacesLaterais;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAreaPiramide() {
		return areaPiramide;
	}

	public void setAreaPiramide(double areaPiramide) {
		this.areaPiramide = areaPiramide;
	}
	
	

	
}
