package com.leandro.aula19.labs;

import java.text.DecimalFormat;

public class Exer04 {
    public static void main(String[] args) {
        double[] a = new double[15];
        double[] b = new double[15];
        
        for (int i = 0; i < 15; i++) {
            a[i]  = (i+1);
            b[i] = Math.sqrt(a[i]);
            DecimalFormat df = new DecimalFormat("###,###.##");
            System.out.print("Vetor a: " + df.format(a[i]) + "\n");
            System.out.print("Vetor b: " + df.format(b[i]) + "\n");
        }
    }
    
}
