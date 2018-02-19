package com.leandro.aula27.labs;

import java.util.Scanner;

public class JogoVelha {
    boolean ganhou = false;
    int jogada = 1;
    String jogador1;
    String jogador2;

    Scanner scan = new Scanner(System.in);

    char[][] jogoVelha = new char[3][3];

    public void inicioJogo(){
        System.out.println("Jogador 1: X");
        System.out.println("Jogador 2: O");
        
        validacoes();
    }
    
    public void validacoes(){
        System.out.println("Qual o nome do Jogador 1? ");
        jogador1 = scan.nextLine();
        System.out.println("Qual o nome do Jogador 2? ");
        jogador2 = scan.nextLine();
        char sinal;
        int linha = 0, coluna = 0;
        while (!ganhou) {
            if (jogada % 2 == 1) { // jogador 1
                System.out.println(jogador1 + ", escolha linha e coluna (1-3)");
                sinal = 'X';
            } else {
                System.out.println(jogador2 + ", escolha linha e coluna (1-3)");
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
            } else { // jogada v�lida
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            // imprimir tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }
            verificarGanhador();
            

        }
    }
    
    public void verificarGanhador(){
        // verifica se tem ganhador
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
                    || // linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')
                    || // linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')
                    || // linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')
                    || // coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')
                    || // coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')
                    || // coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')
                    || // diagonal descendo
                    // da esquerda para
                    // a direita
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { // diagonal descendo
                // da direita para a
                // esquerda

                ganhou = true;
                System.out.println("Parabéns, " + jogador1 + ", você é o grande vencedor deste jogo. Venha pra cá.");

            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
                    || // linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')
                    || // linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')
                    || // linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')
                    || // coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')
                    || // coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')
                    || // coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')
                    || // diagonal descendo
                    // da esquerda para
                    // a direita
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) { // diagonal descendo
                // da direita para a
                // esquerda

                ganhou = true;
                System.out.println("Parabéns, " + jogador2 + ", você é o grande vencedor deste jogo. Venha pra cá.");

            } else if (jogada > 9) {
                System.out.println("Que pena pra vocês, porque o nosso está garantido. "
                        + "Ninguém ganhou essa partida.");
            }
    }
}
