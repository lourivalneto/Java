package com.leandro.aula20.labs;

import java.util.Scanner;

public class Exer06 {

    int contJogador1 = 0;
    int contJogador2 = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeJogador1 = "";
        String nomeJogador2 = "";
        int jogador1 = 0;
        int jogador2 = 0;
        System.out.println("Digite o nome do Jogador 1: ");
        nomeJogador1 = scan.next();
        System.out.println("Digite o nome do Jogador 2: ");
        nomeJogador2 = scan.next();

        int linhaJogador1 = 0;
        int colunaJogador1 = 0;

        int linhaJogador2 = 0;
        int colunaJogador2 = 0;

        boolean resposta = false;

        int[][] jogoDaVelha = new int[3][3];

        System.out.println(
                "\tCOLUNA 1 COLUNA 2 COLUNA 3\n"
                + "\n\t\t|\t|\n"
                + "LINHA 1 \t|\t|\n"
                + "\t\t|\t|\n"
                + "\t_ _ _ __|_ _ _ _|__ _ _ _\n"
                + "\t\t|\t|\n"
                + "LINHA 2\t\t|\t|\n"
                + "\t\t|\t|\n"
                + "\t_ _ _ __|_ _ _ _|__ _ _ _\n"
                + "\t\t|\t|\n"
                + "\t\t|\t|\n"
                + "LINHA 3\t\t|\t|\n"
                + "\t\t|\t|\n");

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.println("\t" + nomeJogador1 + ", em que posição "
                            + "você irá marcar a bolinha(O)?: ");
                    System.out.println("Linha: ");
                    linhaJogador1 = scan.nextInt();
                    System.out.println("Coluna: ");
                    colunaJogador1 = scan.nextInt();
                    if ((linhaJogador1 < 1 || linhaJogador1 > 3) || (colunaJogador1 < 1 || colunaJogador1 > 3)) {
                        do {
                            System.out.println("Opção(ões) inválida(s). Tente novamente.");
                            System.out.println("\t" + nomeJogador1 + ", em que posição "
                                    + "você irá marcar a bolinha(O)?: ");
                            System.out.println("Linha: ");
                            linhaJogador1 = scan.nextInt();
                            System.out.println("Coluna: ");
                            colunaJogador1 = scan.nextInt();

                        } while ((linhaJogador1 < 1 || linhaJogador1 > 3) || (colunaJogador1 < 1 || colunaJogador1 > 3));
                    }

                    if (jogoDaVelha[linhaJogador1 - 1][colunaJogador1 - 1] == 0) {
                        jogoDaVelha[linhaJogador1 - 1][colunaJogador1 - 1] = -1;
                    } else { // EVITANDO PREENCHIMENTO EM POSIÇÃO JÁ PREENCHIDA
                        do {
                            System.out.println("Essa posição já está marcada. Tente outra posição.");
                            do {
                                System.out.println("Opção(ões) inválida(s). Tente novamente.");
                                System.out.println("\t" + nomeJogador1 + ", em que posição "
                                        + "você irá marcar a bolinha(O)?: ");
                                System.out.println("Linha: ");
                                linhaJogador1 = scan.nextInt();
                                System.out.println("Coluna: ");
                                colunaJogador1 = scan.nextInt();

                            } while ((linhaJogador1 < 1 || linhaJogador1 > 3) || (colunaJogador1 < 1 || colunaJogador1 > 3));
                        } while (jogoDaVelha[linhaJogador1 - 1][colunaJogador1 - 1] != 0);
                        jogoDaVelha[linhaJogador1 - 1][colunaJogador1 - 1] = -1;
                        resposta = verificaGanhador1(jogoDaVelha);
                        if (resposta) {
                            System.out.println(nomeJogador1 + ", você é o grande ganhador deste Jogo.");
                            break;
                        }
                    }

                } else if (j % 2 != 0) {
                    System.out.println("\t" + nomeJogador2 + ", em que posição "
                            + "você irá marcar o \"X\")?: ");
                    System.out.println("Linha: ");
                    linhaJogador2 = scan.nextInt();
                    System.out.println("Coluna: ");
                    colunaJogador2 = scan.nextInt();
                    if ((linhaJogador2 < 1 || linhaJogador2 > 3) || (colunaJogador2 < 1 || colunaJogador2 > 3)) {
                        do {
                            System.out.println("Opção(ões) inválida(s). Tente novamente.");
                            System.out.println("\t" + nomeJogador2 + ", em que posição "
                                    + "você irá marcar o \"X\"?: ");
                            System.out.println("Linha: ");
                            linhaJogador2 = scan.nextInt();
                            System.out.println("Coluna: ");
                            colunaJogador2 = scan.nextInt();

                        } while ((linhaJogador2 < 1 || linhaJogador2 > 3) || (colunaJogador2 < 1 || colunaJogador2 > 3));
                    }

                    if (jogoDaVelha[linhaJogador2 - 1][colunaJogador2 - 1] == 0) {
                        jogoDaVelha[linhaJogador2 - 1][colunaJogador2 - 1] = 1;
                    } else { // EVITANDO PREENCHIMENTO EM POSIÇÃO JÁ PREENCHIDA
                        do {
                            System.out.println("Essa posição já está marcada. Tente outra posição.");
                            do {
                                System.out.println("Opção(ões) inválida(s). Tente novamente.");
                                System.out.println("\t" + nomeJogador2 + ", em que posição "
                                        + "você irá marcar o \"X\"?: ");
                                System.out.println("Linha: ");
                                linhaJogador2 = scan.nextInt();
                                System.out.println("Coluna: ");
                                colunaJogador2 = scan.nextInt();

                            } while ((linhaJogador2 < 1 || linhaJogador2 > 3) || (colunaJogador2 < 1 || colunaJogador2 > 3));
                        } while (jogoDaVelha[linhaJogador2 - 1][colunaJogador2 - 1] != 0);
                        jogoDaVelha[linhaJogador2 - 1][colunaJogador2 - 1] = 1;
                        resposta = verificaGanhador1(jogoDaVelha);
                        if (resposta) {
                            System.out.println(nomeJogador2 + ", você é o grande ganhador deste Jogo.");
                            break;
                        }
                    }
                }
            }
        }
    }

    public static boolean verificaGanhador1(int[][] array) {
        
        boolean resposta = false;
        

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[0][0] + array[0][1] + array[0][2] == -3) {
                    resposta = true;

                } else if (array[1][0] + array[1][1] + array[1][2] == -3) {
                    resposta = true;
                } else if (array[2][0] + array[2][1] + array[2][2] == -3) {
                    resposta = true;
                } else if (array[0][0] + array[1][1] + array[2][2] == -3) {
                    resposta = true;
                } else if (array[0][2] + array[1][1] + array[2][0] == -3) {
                    resposta = true;
                }

            }

        }
        return resposta;

    }
    
    public static boolean verificaGanhador2(int[][] array) {
        
        boolean resposta = false;
        

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[0][0] + array[0][1] + array[0][2] == 3) {
                    resposta = true;

                } else if (array[1][0] + array[1][1] + array[1][2] == 3) {
                    resposta = true;
                } else if (array[2][0] + array[2][1] + array[2][2] == 3) {
                    resposta = true;
                } else if (array[0][0] + array[1][1] + array[2][2] == 3) {
                    resposta = true;
                } else if (array[0][2] + array[1][1] + array[2][0] == 3) {
                    resposta = true;
                }

            }

        }
        return resposta;

    }

}
