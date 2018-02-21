package com.leandro.aula34.labs;

public class Contador {
	private static int contaInstanciacoes;
	
	
	
	public Contador() {
		this.contaInstanciacoes++;
	}



	public static int getContaInstanciacoes() {
		return contaInstanciacoes;
	}



	public static void setContaInstanciacoes(int contaInstanciacoes) {
		Contador.contaInstanciacoes = contaInstanciacoes;
	}

}
