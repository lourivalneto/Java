package com.leandro.aula19.labs;

public class Exer17 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        int cont = 0;
        
        for ( int i = 0, j=34; i < 10; i++,j++) {
            idades[i] = j;
            
            if(idades[i] > 35) {
                cont++;
            }
        }
        System.out.println(cont + " pessoas tem mais de 35 anos de idade.");
    }
    
}
