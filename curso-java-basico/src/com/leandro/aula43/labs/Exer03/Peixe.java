package com.leandro.aula43.labs.Exer03;

public class Peixe extends Animal{
	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += "\nAmbiente: " + this.getAmbiente();
		s += "\nVelocidade: " + this.getVelocidade() + " m/s";
		s += "\nCaracterística: " + this.getCaracteristicas() + ".";
		s += "\n--------------------------";
		return s;
		
	}
	
}
