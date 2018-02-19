package com.leandro.aula19.labs;

public class Exer14 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int cont = 0;
        double media = 0;
        double soma = 0;
        
        for(int i=0; i < 10; i++){
            a[i] = i;
            
            if(a[i]%2 != 0) {
                cont++;
                soma += a[i];
            }
        }
        media = soma / cont;
        System.out.println("A  média de " + cont + " números ímpares é: " + media);
    }
    
}
