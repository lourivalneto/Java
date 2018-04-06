package com.leandro.aula85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milissegundos desde 1970 " + hoje.getTime());
		
		System.out.println(hoje.getDate());

	}

}
