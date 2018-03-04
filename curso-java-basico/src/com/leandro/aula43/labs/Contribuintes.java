package com.leandro.aula43.labs;

public abstract class Contribuintes {
	private String nome;
	private double renda;

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Contribuinte: " + this.getNome() + ".";
	}
	
	
}
