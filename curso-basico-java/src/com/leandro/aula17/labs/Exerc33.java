package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de termos das frações propostas.");
        int termos = scan.nextInt();
        int num = 0;
        int den = 0;
        double numDouble = 0;
        double denDouble = 0;
        
        double soma = 0;
        System.out.print("S = ");
        for (num = 1, den=1; num <= termos; num++) {
            if(num == termos){ // se num for igual a 9
                System.out.print(num + "/" + den + " = ");
                numDouble = num;
                denDouble = den;
                soma += numDouble/denDouble;
                break;
            }
            System.out.print(num + "/" + den + " + ");
            numDouble = num;
            denDouble = den;
            soma += numDouble/denDouble; // 0+1/2 // 1/2+2/3 ...
            den += 2;
            
        }
        
        System.out.print(soma + ". \n");

    }

}
