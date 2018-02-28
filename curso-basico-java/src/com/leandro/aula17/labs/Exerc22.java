package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos CD você tem?");
        int qtdeCd = scan.nextInt();
        double valor = 0;
        double soma = 0;
        double media = 0;
        
        for ( int i = 0; i < qtdeCd ; i++) {
            System.out.println("Que valor pagou no " + (i+1) + "º cd?");
            valor = scan.nextDouble();
            soma += valor;
        }
        media = soma / qtdeCd;
        System.out.println("O valor médio pago por CD é de: " + media);
    }

}
