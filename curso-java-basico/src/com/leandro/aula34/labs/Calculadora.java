package com.leandro.aula34.labs;

public class Calculadora {
	private static int soma;
	private static int subtracao;
	private static int multiplicacao;
	private static int divisao;
	private static double potencia;
	private static double fatorial = 1;
	
	
	
	public static int somar(int num1, int num2) {
		soma = num1 + num2;
		return soma;
	}
	
	public static int subtrair(int num1, int num2) {
		subtracao =  num1 - num2;
		return subtracao;
	}
	
	public static int multiplicar(int num1, int num2) {
		multiplicacao = num1 * num2;
		return multiplicacao;
	}
	
	public static int dividir(int num1, int num2) {
		divisao =  num1 / num2;
		return divisao;
	}
	
	public static double elevar(int num1, int num2) { // EX: 2 elevado a 3
		
		for(int i = 1; i < num2; i++) {
			if(i == 1) {
				potencia = num1; // potencia recebe 2, na primeira passagem // NÃO ENTRA MAIS
			}
			potencia *= num1; // ex: potencia recebe ele (2) vezes num1 = 2x2 = 4 // 4X2 = 8
		}
		return potencia;
		
	}
	
	// EXERCÍCIO 3 NESSA MESMA CLASSE
	public static double fatorar(int num) {
		if (num == 0) {
			return 1;
		}
		for(int i=1; i <= num; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

}
