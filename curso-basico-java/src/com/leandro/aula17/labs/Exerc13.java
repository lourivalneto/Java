package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base.");
        double base = scan.nextDouble();

        System.out.println("Entre com o expoente.");
        double expoente = scan.nextDouble();

        double resultPotencia = 0;
        double produto = 0; // 
        double soma = base; // 2

        for (double i=2 ; i <= expoente; i++) {

            produto = soma*base; // 2*2=4 // 4*2=8
            soma = produto; // 4 // 8
            
        }

        System.out.println("O resultado da potência é: " + soma);
    }
}
