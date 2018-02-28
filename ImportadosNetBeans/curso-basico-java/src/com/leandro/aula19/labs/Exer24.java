package com.leandro.aula19.labs;

public class Exer24 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int cont = 0;

        for (int i = 0; i < 4; i++) {

            a[i] = (i + 1); // 1 2 3 4

            System.out.print("A[" + a[i] + "]" + " "); // 1 2 3 4
        }
        System.out.println("");
        for (int j = 4, i = 4; j > -1; j--, i++) {
            a[i] = (j + 1);
            System.out.print("A[" + a[i] + "] "); // 5 4 3 2 1
        }

        for (int i = 0, j = 8; i < 4; i++, j--) {
            if (a[i] == a[j]) { // a0 vale 1 e a7 vale 1
                cont++;
            }
            /*
            0 e 7 // 1 e 6 // 2 e 5 //  3 e 4
     cont vira 1 // vira 2 // vira 3 e vira 4
             */
        }

        if (cont == 4) {
            System.out.println("\nO vetor A é palíndromo.");
        } else {
            System.out.println("\nO vetor A não é palíndromo.");
        }

    }

}
