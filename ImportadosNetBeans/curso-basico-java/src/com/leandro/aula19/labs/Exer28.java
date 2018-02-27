package com.leandro.aula19.labs;

public class Exer28 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        
        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (int)(Math.random() * 100);
            System.out.print("A: " + a[i] + " ");
            if(i == 9) {
                for (int j = 9, k = 0; j > -1; j--, k++) {
                    b[j] = a[k];
                    
                }
            }
        }
        System.out.println("");
        for(int l = 0; l < 10; l++) {
            System.out.print("B: " + b[l] + " ");
        }
        
        System.out.println("");
    }
    
}
