package com.leandro.aula43.labs;

public class pessoaJuridica extends Contribuintes{
	private final double AL_QUALQUER_RB = 0.1;

	

	public double getAL_QUALQUER_RB() {
		return AL_QUALQUER_RB;
	}
	
	public double getCalculo() {
		double calculo = this.getRenda() * this.getAL_QUALQUER_RB();
		return calculo;
	}



	@Override
	public String toString() {
		if(this.getRenda() > 0) {
			return "Imposto de Renda para " + this.getNome() + ", sendo 10% da renda bruta da empresa: R$"
					+ this.getCalculo();
		}
		return "Renda menor ou igual a zero.";
	}
	
	
}
