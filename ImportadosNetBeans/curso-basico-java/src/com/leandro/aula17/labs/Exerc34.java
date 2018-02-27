package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc34 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de termos das frações propostas.");
        int termos = scan.nextInt();
        int num = 1;
        double soma = 0;
        double denDouble = 0;
        System.out.print("H = ");
        for (int i = 1; i <= termos; i++, num = num) {
            if (i == termos) {
                System.out.print(num + "/" + i + " = ");
                denDouble = i;
                soma += num / denDouble;
                break;
            }

            System.out.print(num + "/" + i + " + ");
            denDouble = i;
            soma += num / denDouble;
        }

        System.out.print(soma + ". \n");
    }

}
