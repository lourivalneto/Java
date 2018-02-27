package com.leandro.aula35.labs; //

import java.util.Scanner;

public class TesteSomarAteNTermo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n termo para ver o somat�rio de 1 at� ele.");
		double nTermo = scan.nextDouble();
		System.out.println("O somat�rio de 1 at� " + nTermo + " �: " + SomatorioANTermo.somarAteNTermo(nTermo));

	}

}
