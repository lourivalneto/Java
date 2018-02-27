package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTabuada = 0;
        int numInicial = 0;
        int numFinal = 0;

        do {
            System.out.println("Digite o número da tabuada que quer visualizar.");
            numTabuada = scan.nextInt();
            if (numTabuada < 0) {
                System.out.println("Não é aceito tabuada inferior a 0. Tente novamente.");
            }
        } while (numTabuada < 0);

        do {
            System.out.println("Digite o número inicial dessa tabuada que quer"
                    + " ver, ex: \" 5 \", pra ver somente do 5 x 5 em diante.");
            numInicial = scan.nextInt();
            if (numInicial < 0) {
                System.out.println("Não é aceito número inicial inferior a 0. Tente novamente.");
            }
        } while (numInicial < 0);

        do {
            System.out.println("Digite o número final do intervalo"
                    + " que quer ver da tabuada do " + numTabuada + ".");
            numFinal = scan.nextInt();
            if (numFinal < 0 | numFinal < numInicial) {
                System.out.println("Não é aceito número final inferior a 0 e "
                        + "inferior ao número inicial. Tente novamente.");
            }
        } while (numFinal < 0 | numFinal < numInicial);
        
        System.out.println("Começar por: " + numInicial);
        System.out.println("Terminar em: " + numFinal + "\n");
        
        for (int i = numInicial; i <= numFinal; i++) {
            System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
        }
    }

}
