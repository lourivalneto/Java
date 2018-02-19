package com.leandro.aula20.labs;

public class Exer01 {
    public static void main(String[] args) {
        int[][] numeros = new int [4][4];
        int maior = 0;
        int posI = 0;
        int posJ = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 10);
                if(i == 0 & j == 0) {
                    maior = numeros[i][j];
                }
                if(numeros[i][j] > maior) {
                    maior = numeros[i][j];
                    posI = i;
                    posJ = j;
                }
                System.out.println("Posição i[" + i + "] e posição j[" + j + "] = " + numeros[i][j]);
            }
        }
        System.out.println("O maior número aleatório entre 0 e 9 é " + maior);
        System.out.println("A posição do maior número é i[" + posI + "]j[" + posJ + "].");
        
    }
    
}
