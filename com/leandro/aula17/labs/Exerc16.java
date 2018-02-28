package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int soma = 0;
        int trocaNum1 = 0;

        //System.out.println("Entre com o n-ésimo termo.\n");
        //int termo = scan.nextInt();
        int termo = 500;
        System.out.print("0 1 ");

        //for (int i = 0; i <= 500; i++) { // 0 // 1
        for (soma = 0; soma <= termo;) {
            soma = num1 + num2; // 0+1=1 // 1+

            /*if (soma < termo | soma == termo) {
                System.out.print(soma + " "); // Imprime: 1 
            }*/
            System.out.print(soma + " ");
            num1 = num2; //era 0, vira 1
            trocaNum1 = num1; // era 0, continua 0
            num2 = soma; // era 0, vira 1

            //num2 = trocaNum1; // era 1, vira 0
        }
    }

}
