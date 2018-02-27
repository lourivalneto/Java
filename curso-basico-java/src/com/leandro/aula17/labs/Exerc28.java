package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro e positivo, para saber se é primo.");

        int num = scan.nextInt();
        int cont = 0;

        if (num <= 0) {
            do {
                System.out.println("Número inválido. Tente novamente, conforme"
                        + " enunciado.");
                num = scan.nextInt();
            } while (num <= 0);
        }

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }

}
