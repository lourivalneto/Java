package com.leandro.aula19.labs;

public class Exer15 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int contImpar = 0;
        int contPar = 0;
        double percentual = 0;
        
        for(int i=0; i < 10; i++){
            a[i] = i;
            
            if(a[i]%2 != 0) {
                contImpar++;
            } else {
                contPar++;
            }
        }
        
        System.out.println("O percentual de  " + contImpar + " números "
                + "ímpares é: " + (contImpar * 100 / 10) + "%.");
        System.out.println("O percentual de  " + contPar + " números "
                + "ímpares é: " + (contPar * 100 / 10 + "%."));
    }    
}
