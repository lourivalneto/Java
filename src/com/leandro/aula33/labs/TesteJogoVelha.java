package com.leandro.aula33.labs;

public class TesteJogoVelha {

	public static void main(String[] args) {
		JogoVelha jogo = new JogoVelha();
		jogo.iniciarJogoVelha();
		jogo.validacoes();
		
		jogo.verificarGanhador();

	}

}
