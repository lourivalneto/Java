package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com 10 números inteiros.");
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }

        }

        System.out.println("Você digitou " + contPar + " número(s) par(es)");
        System.out.println("Você digitou " + contImpar + " número(s) ímpar(es)");
    }

}
