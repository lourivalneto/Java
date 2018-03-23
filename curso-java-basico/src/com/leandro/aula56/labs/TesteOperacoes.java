package com.leandro.aula56.labs;

public class TesteOperacoes {

	public static void main(String[] args) {
		
		Operacoes soma = Operacoes.SOMA;
		Operacoes subtracao = Operacoes.SUBTRACAO;
		Operacoes multiplicacao = Operacoes.MULTIPLICACAO;
		Operacoes divisao = Operacoes.DIVISAO;
		Operacoes potencia = Operacoes.POTENCIA;
		
		
		System.out.println("Uso do método soma do Enum Operações: " + soma.executarOperacao(10, 10));
		System.out.println("Uso do método subtracao do Enum Operações: " + subtracao.executarOperacao(10, 10));
		System.out.println("Uso do método multiplicacao do Enum Operações: " + multiplicacao.executarOperacao(10, 10));
		System.out.println("Uso do método divisao do Enum Operações: " + divisao.executarOperacao(10, 10));
		System.out.println("Uso do método potencia do Enum Operações: " + potencia.executarOperacao(2, 5));
		System.out.println("toString de soma: " + soma);
		System.out.println("toString de subtracao: " + subtracao);
		System.out.println("toString de multiplicacao: " + multiplicacao);
		System.out.println("toString de divisao: " + divisao);
		System.out.println("toString de potencia: " + potencia);
		
		System.out.println("\nUsando Values\n");
		
		for(Operacoes operacoes : Operacoes.values()){
			System.out.println("Uso da operação \"" + operacoes + "\" do Enum Operações: " + operacoes.executarOperacao(10, 2));
		}

	}

}
