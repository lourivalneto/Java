package com.leandro.aula34.labs;

public class TestaContador {

	public static void main(String[] args) {

		Contador cont = new Contador();
		System.out.println(Contador.getContaInstanciacoes());
		Contador cont2 = new Contador();
		System.out.println(Contador.getContaInstanciacoes());
		Contador cont3 = new Contador();
		System.out.println(Contador.getContaInstanciacoes());

	}

}
