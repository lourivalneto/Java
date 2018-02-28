package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc26 {

    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número para ver seu fatorial.");
        num = scan.nextInt();
        System.out.print(num + " ! = ");
        int produto = 0;
        int somaProduto = num;
        int proxNum = 1;

        for (int i = num - 1, trocaNum = num; trocaNum > 0; i--, trocaNum--) {

            if (trocaNum > 1 & i > 0) {
                produto = somaProduto * i; // 5*4=20 // 20*3=60 // 60*2=120
                somaProduto = produto; // 20 // 60 // 120
                System.out.print(trocaNum + " . "); // 5 .
            }
            if (trocaNum == 1) {
                System.out.print(trocaNum + " = " + somaProduto + "\n"); //

            }
        }
    }

}
