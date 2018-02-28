package com.leandro.aula19.labs;

public class Exer36 {

    public static void main(String[] args) {
        double[] a = new double[11];

        for (int i = 0; i <= 10; i++) {
            a[i] = Math.pow(2,i);
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }

}
