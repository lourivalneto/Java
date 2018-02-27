package com.leandro.aula19.labs;

public class Exer02 {
    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        
        for(int i=0;i<=7;i++) {
            vetorA[i] = (i+10);
            vetorB[i] = (vetorA[i]*2);
            //System.out.println(vetorA[i] + " ");
            
            System.out.println(vetorB[i] + " ");
        }
        
    }
    
}
