package com.leandro.aula52.solucao_loiane;

public class AgendaCheiaException extends Exception {
	@Override
	public String getMessage() {
		
		return "Agenda já está cheia.";
	}
}
