package com.leandro.aula19.labs;

public class Exer34 {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        for(int i = 0; i < 10; i++) {
            a[i] = 1 + (int) (Math.random() * 100);
            System.out.println("A[" + i + "] = " + a[i] + " e todos os pares até ele: ");
            for (int j = 0; j <= a[i]; j++) {
                if(j == a[i] ) {
                    if(j % 2 ==  0) {
                    System.out.print(j + ". ");
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                }
                
                if(j == a[i] -1 & j % 2 == 0) {
                    System.out.print(j + ". ");
                    System.out.println("");
                    System.out.println("");
                    break;
                }
                if(j % 2 ==  0) {
                    System.out.print(j + ", ");
                }
                
            }
        }
    }
    
}
