package com.leandro.aula19.labs;

import java.text.DecimalFormat;

public class Exer09 {
    public static void main(String[] args) {
        double[] a = new double[10];
        double[] b = new double[10];
        double[] c = new double[10];
        
        for (int i = 0; i < 10; i++) {
            a[i]  = (i+1);
            b[i] = a[i] * (i+1);
            c[i] = a[i] / b[i];
            DecimalFormat df = new DecimalFormat("###,###.##");
            System.out.print("Vetor a: " + df.format(a[i]) + "\n");
            System.out.print("Vetor b: " + df.format(b[i]) + "\n");
            System.out.print("Vetor c: " + df.format(c[i]) + "\n");
        }
    }
}
