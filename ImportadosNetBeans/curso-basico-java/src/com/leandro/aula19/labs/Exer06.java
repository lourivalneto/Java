package com.leandro.aula19.labs;

public class Exer06 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        
        for (int i = 0; i < 10; i++) {
            a[i]  = (i+1);
            b[i] = a[i] * i;
            c[i] = a[i] + b[i];
            System.out.print("Vetor a: " + a[i] + "\n");
            System.out.print("Vetor b: " + b[i] + "\n");
            System.out.print("Vetor c: " + c[i] + "\n");
        }
    }
}
