package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número inteiro: ");
		int num = scan.nextInt();
	        
	        for(int i = 2; i <= num; i++) {//Número que vai ser verificado
	            int contador = 0;
	            for(int j = 2; j <= i; j++) {//Itera entre 2 e a variável i para verificar se é primo
	                if(i % j == 0) {
	                    contador++;
	                }
	            }
	            if(contador == 1) {//Como todo número inteiro é divisivel por 1, é testado apenas se ele é divisivel por ele mesmo.
	                System.out.println("O número "+ i +" é primo.");
	            }
	        }
	    }
	}
