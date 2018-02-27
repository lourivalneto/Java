package com.leandro.aula19.labs;

public class Exer35 {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (int) (Math.random() * 100);
            System.out.println(a[i]+ ": ");
            for (int j = 1; j <= a[i]; j++) {
                if(j == a[i]) {
                System.out.print(j + "\n");  
                break;
              }
              if(a[i] % j == 0) {
                  System.out.print(j + " ");
              }
              
            }
        }
    }
    
}
