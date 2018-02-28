package com.leandro.aula19.labs;

public class Exer27 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (int) (Math.random() * 20);
            if (a[i] < 7) {
                b[i] = 'a';
            } else if (a[i] == 7) {
                b[i] = 'b';
            } else if (a[i] > 7 & a[i] < 10) {
                b[i] = 'c';
            } else if (a[i] == 10) {
                b[i] = 'd';
            } else if (a[i] > 10) {
                b[i] = 'e';
            }
            System.out.println("A: " + a[i]);
            System.out.println("B: " + b[i]);
        }
    }

}
