package com.leandro.aula34;

import com.leandro.aula34.labs.Contador;

public class TestaContador {

	public static void main(String[] args) {

		Contador cont = new Contador();
		System.out.println(cont.getContaInstanciacoes());
		Contador cont2 = new Contador();
		System.out.println(cont2.getContaInstanciacoes());

	}

}
