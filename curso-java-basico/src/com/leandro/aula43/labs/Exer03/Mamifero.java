package com.leandro.aula43.labs.Exer03;

public class Mamifero extends Animal {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += "\nAmbiente: " + this.getAmbiente();
		s += "\nVelocidade: " + this.getVelocidade() + " m/s";
		if (this.getAlimento() != null) {
			s += "\nAlimento: " + this.getAlimento();
		}

		s += "\n--------------------------";
		return s;
	}

}
