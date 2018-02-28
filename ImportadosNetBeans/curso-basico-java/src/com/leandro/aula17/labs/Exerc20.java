package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de integrantes da sua turma.");
        int idades = scan.nextInt();

        double idade = 0;
        double soma = 0;
        double media = 0;

        for (int i = 0; i < idades; i++) {
            System.out.println("Entre com a idade: " + (i + 1));
            idade = scan.nextDouble();

            soma += idade;
        }

        media = soma / idades;
        if (media > 0 & media <= 25) {
            System.out.println("A média de idade de sua turma é: " + media);
            System.out.println("Sua turma é jovem.");
        } else if (media > 25 & media <= 60) {
            System.out.println("A média de idade de sua turma é: " + media);
            System.out.println("Sua turma é adulta.");
        } else if (media > 60) {
            System.out.println("A média de idade de sua turma é: " + media);
            System.out.println("Sua turma é idosa.");
        }
    }

}
