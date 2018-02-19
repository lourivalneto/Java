package com.leandro.aula33.labs;

import java.util.Scanner;

public class JogoVelha {
	Scanner scan = new Scanner(System.in);

	private char[][] jogoVelha = new char[3][3];
	private boolean ganhou = false;
	private int jogada = 1;
	private char sinal;
	private int linha = 0, coluna = 0;
	private String nomeJogador1 = "";
	private String nomeJogador2 = "";
	
	public void iniciarJogoVelha() {
		System.out.println("Nome do Jogador 1:");
		this.nomeJogador1 = scan.nextLine();
		System.out.println("Nome do Jogador 2:");
		this.nomeJogador2 = scan.nextLine();
		System.out.println(nomeJogador1 + ": X");
		System.out.println(nomeJogador2 + ": O");
	}
	
	public void validacoes() {
		while (!ganhou) {
			if (jogada % 2 == 1) { // jogador 1
				System.out.println(nomeJogador1 + " escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {
				System.out.println(nomeJogador2 + " escolha linha e coluna (1-3)");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}
			//verifica posição válida
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente.");
			} else { // jogada válida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			
			
			
			imprimirTabuleiro();
			ganhou = verificarGanhador(sinal);
			//verificarGanhador(sinal);
			

		}
	}
	
	public boolean verificarGanhador(char sinal) {
		if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha 1
				(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha 2
				(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || // coluna 1
				(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || // coluna 2
				(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || // coluna 3

				(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || // diagonal descendo
																								// da esquerda para
																								// a direita
				(jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) { // diagonal descendo
																								// da direita para a
			if(sinal == 'X') {
				System.out.println("Parabéns, " + nomeJogador1 + ", você ganhou!");
			} else if (sinal == 'O') {
				System.out.println("Parabéns, " + nomeJogador2 + ", você ganhou!");
			} else if(jogada > 9 ){
				System.out.println("Ninguém ganhou essa partida.");
			}
				
			
			return ganhou = true;
			

		} 
		
		return ganhou = false;
		
	}

	public void imprimirTabuleiro() {
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
		
	}

	public boolean verificarGanhador() {
		
		return ganhou = false;
	}

}
