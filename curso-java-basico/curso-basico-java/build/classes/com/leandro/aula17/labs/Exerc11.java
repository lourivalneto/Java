
package com.leandro.aula17.labs;

import java.util.Scanner;


public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, trocaNum1;
		System.out.println("Entre com dois números inteiro.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
                int soma = 0;
		
		if (num2 < num1) {
			trocaNum1 = num1;
			num1 = num2;
			num2 = trocaNum1;
		}
                
		//System.out.println(num1);
		//System.out.println(num2);
		
		for (int i = num1 + 1; i < num2; i++) {

			System.out.print(i + " ");
                        soma += i;
		}
                
                int somaTodos = num1+num2+soma;
                System.out.println("\nA soma dos números entre os dois digitados é: " + somaTodos);
    }
    
}
