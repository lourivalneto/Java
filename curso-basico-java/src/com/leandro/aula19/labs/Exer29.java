package com.leandro.aula19.labs;

public class Exer29 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (int) (Math.random() * 100);
            System.out.print("A[" + i + "]: " + a[i] + "\n");
            b[i] = 1 + (int) (Math.random() * 100);
            System.out.print("B[" + i + "]:" + b[i] + "\n");
        }
        System.out.println("");
        int k = 10;
        int l = 0;
        for (int j = 0; j < 20; j++) {

            if (j <= 9) { // qndo o J for 10, o K é 10 e passa a ser usado e o L é 0 e passa a 
                // ser usado
                c[j] = a[j]; // c na posição j recebe a na posição j
                System.out.println("C[" + j + "]: " + c[j] + " ");
            } else {
                c[k] = b[l]; // c na posição k=10 recebe b na posição l=0
                System.out.println("C[" + k + "]: "+ c[k] + " ");
                k++;
                l++;
            }
        }
    }

}
