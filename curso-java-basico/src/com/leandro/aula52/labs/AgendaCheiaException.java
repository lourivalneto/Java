package com.leandro.aula52.labs;

public class AgendaCheiaException extends Exception {

	@Override
	public String toString() {
		return "AgendaCheiaException: não há mais espaço na agenda.";
	}
	
}
