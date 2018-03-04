package com.leandro.aula43.labs;

public class pessoaJuridica extends Contribuintes{
	private final double AL_QUALQUER_RB = 0.1;
	private double calculo = this.getRenda() * this.AL_QUALQUER_RB;

	public double getRENDABRUTA() {
		return AL_QUALQUER_RB;
	}

	@Override
	public String toString() {
		return "Imposto de Renda para " + this.getNome() + ", sendo 10% da renda bruta da empresa: R$"
				+ this.calculo;
	}
	
	
}
