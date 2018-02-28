package com.leandro.aula19.labs;

public class Exer25 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i;
            if(a[i]%2==0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
            System.out.print("a: " + a[i] + " ");
            System.out.print("b: " + b[i] + " ");
        }
    }

}
