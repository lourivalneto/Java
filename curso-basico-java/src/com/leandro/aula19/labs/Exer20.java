package com.leandro.aula19.labs;

public class Exer20 {

    public static void main(String[] args) {
        double[] A = new double[20];

        for (int i = 1, j = 0; i <= 20; i++, j++) {
            A[j] = (3.1787 * i);
            if (i == 1) {
                System.out.println(i + " dólar: R$" + A[j]);
            } else {
                System.out.println(i + " dólares: R$" + A[j]);
            }
        }
    }
}
