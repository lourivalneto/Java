package com.leandro.aula19.labs;

public class Exer37 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int[] b = new int[15];
        
        
        for (int i = 0; i < 15; i++) {
            a[i] = 1 + (int) (Math.random() * 10);
            int j = 0;
            int fat = 1;
            for (j = 1; j <= a[i]; j++) {
                fat *= j;
            }
            b[i] = fat;
            System.out.print("B[" + i + "]= " + b[i] + " \n");
            
            System.out.println("Fatorial de " + a[i] + " é: " + fat);
        }
    }
    
}
