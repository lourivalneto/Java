package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int primeiro = 1;
        int segundo = 1;
        int proximo;
        int trocaNum1 = 0;

        System.out.println("Entre com o n-ésimo termo da série de Fibonacci.\n\t\t\t");
        System.out.println("\t\t\t");
        int n = scan.nextInt();
        System.out.print("\n" + primeiro + ", " + segundo + " ,");

        //for (int i = 0; i <= 500; i++) { // 0 // 1
        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            if (i == n) {
                System.out.print(proximo + ".\n\n\n\n");
            } else {
                System.out.print(proximo + ", ");
            }
        }

    }

}
