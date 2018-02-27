package com.leandro.aula19.labs;

import java.util.Scanner;

public class Exer33 {

    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros para saber se cada um é primo.");
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
            int cont = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    cont++;

                }

            }
            if (cont == 2) {
                System.out.println(a[i] + " é primo");
            } else if (cont > 2) {
                System.out.println(a[i] + " NÃO é primo");
            }
        }
    }

}
