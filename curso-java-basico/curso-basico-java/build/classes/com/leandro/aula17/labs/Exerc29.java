package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro e positivo, para saber se é primo.");

        int num = scan.nextInt();
        int cont = 0;
        int i = 0;
        int j = 0;

        if (num <= 0) {
            do {
                System.out.println("Número inválido. Tente novamente, conforme"
                        + " enunciado.");
                num = scan.nextInt();
            } while (num <= 0);
        }
        
        for (i = 2; i <= num; i++) { // de 1 a 19
            cont = 0;
            for(j=2;j<=i;j++){ // de 1 ao número de i
                
                
               if(i%j==0) { // se a divisão de i por j restar 0
                   cont++; // contador incrementa 1
               }
               
            }
            if(cont==1){
                   System.out.print(i + " ");
               } 
        }
        
        System.out.println("");
        

    }

}
