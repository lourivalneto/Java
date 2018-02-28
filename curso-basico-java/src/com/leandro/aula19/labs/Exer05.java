package com.leandro.aula19.labs;

public class Exer05 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int[] b = new int[15];
        
        for (int i = 0; i < 15; i++) {
            a[i]  = (i+1);
            b[i] = a[i] * i;
            System.out.print("Vetor a: " + a[i] + "\n");
            System.out.print("Vetor b: " + b[i] + "\n");
        }
    }
}
