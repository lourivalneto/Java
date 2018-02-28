package com.leandro.aula33.labs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		boolean estado = true;
		if(lamp.desligarLampada(estado) == true) {
			System.out.println("A lâmpada foi desligada com sucesso;");
		} else {
			System.out.println("Ao executar o método de desligar a lâmpada, ela permaneceu"
					+ " no seu estado padrão.");
		}
		estado = true;
		if(lamp.ligarLampada(estado) == true) {
			System.out.println("A lâmpada foi ligada com sucesso.");
		} else {
			System.out.println("Ao executar o método de ligar a lâmpada, ela permaneceu no estado"
					+ " padrão.");
		}

	}

}
