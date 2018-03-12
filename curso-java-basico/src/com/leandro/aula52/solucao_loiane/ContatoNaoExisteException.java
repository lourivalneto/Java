package com.leandro.aula52.solucao_loiane;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		return "Contato não existe na agenda.";
	}
	
}
