package com.leandro.aula19.labs;

public class Exer26 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (int) (Math.random() * 1000);
            b[i] = 1 + (int) (Math.random() * 1000);

            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else if (a[i] < b[i]) {
                c[i] = -1;
            }
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i]);
            System.out.println("C: " + c[i]);
        }
    }

}
