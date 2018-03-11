package com.leandro.aula52.labs;

public class ContatoNaoExisteException extends Exception {
	private int id;
	
	

	public ContatoNaoExisteException(int id) {
		super();
		this.id = id;
	}



	@Override
	public String toString() {
		return "ContatoNaoExisteException: contato com a id : " + (this.id + 1) + " não existe.";
	}
	
}
