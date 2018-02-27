package com.leandro.aula20.labs;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        System.out.println("Digite números inteiros para cada uma das posições da matriz"
                + " 3x3.");
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Posição i[" + i + "]j[" + j + "]: ");
                numeros [i][j] = scan.nextInt();
            }
            
        }
        System.out.println("Todos os valores digitados da matriz: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            
        }
        
        System.out.println("\nPares: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j] % 2 == 0) {
                    System.out.print(numeros[i][j] + "\t");
                }
            }
            
        }
        
        System.out.println("\nÍmpares: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j] % 2 != 0) {
                    System.out.print(numeros[i][j] + "\t");
                }
            }
            
        }
    }
    
}
