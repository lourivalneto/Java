package com.leandro.aula35.labs; // que trava

import java.util.Scanner;

public class TesteFibonacciRecursivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n Termo que quer obter da sequência Fibonacci.");
		int nTermo = scan.nextInt();

		System.out.println(FibonacciRecursivo.fibonacciR(nTermo));

	}

}
