package com.leandro.aula19.labs;

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
        double media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a 1ª nota do aluno " + (i + 1) + ": ");
            nota1[i] = scan.nextDouble();
            System.out.println("Digite a 2ª nota do aluno " + (i + 1) + ": ");
            nota2[i] = scan.nextDouble();
            media = (nota1[i] + nota2[i]) / 2;
            result[i] = media;

            if (result[i] >= 7) {
                System.out.println("O " + (i + 1) + "º aluno está APROVADO.");
            } else {
                System.out.println("O " + (i + 1) + "º aluno está REPROVADO.");
            }
        }
    }
}
