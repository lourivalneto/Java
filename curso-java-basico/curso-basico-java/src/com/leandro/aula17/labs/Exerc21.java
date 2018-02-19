package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a qtde de turmas?");
        int turmas = scan.nextInt();
        double media = 0;
        int qtdeTurma = 0;
        int soma = 0;

        for (int i = 0; i < turmas; i++) {
            System.out.println("Digite a qtde da turma " + (i + 1) + ".");
            qtdeTurma = scan.nextInt();

            if (qtdeTurma > 40) {
                do {
                    System.out.println("Uma turma não pode ter mais do que 40"
                            + " alunos. Tente novamente para a turma " + (i + 1));
                    qtdeTurma = scan.nextInt();
                } while (qtdeTurma > 40);
            }

            soma += qtdeTurma;
        }
        media = soma / turmas;
        System.out.println("A média de alunos por turma é de: " + media + ".");
    }

}
