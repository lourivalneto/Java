package com.leandro.aula35.labs;

import java.util.Scanner;

public class TesteSomarAteNTermo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n termo para ver o somatório de 1 até ele.");
		double nTermo = scan.nextDouble();
		System.out.println("O somatório de 1 até " + nTermo + " é: " + SomatorioANTermo.somarAteNTermo(nTermo));

	}

}
