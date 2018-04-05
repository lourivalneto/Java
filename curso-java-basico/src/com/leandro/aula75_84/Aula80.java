package com.leandro.aula75_84;

import java.util.Scanner;

public class Aula80 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String teste = "Isso é um teste.";
		
		 System.out.println(teste);
		 System.out.println(teste.substring(10));
		 System.out.println(teste.substring(10, 15));
		 
		 /*String nomeCompleto;
		 System.out.println("Digite seu nome completo.");
		 nomeCompleto = scan.nextLine();
		 int posBranco = 0;
		 char[] StringNomeCompleto = nomeCompleto.toCharArray();
		 for(int i = 0; i < StringNomeCompleto.length; i++) {
			 if(StringNomeCompleto[i] == ' ') {
				 posBranco = i;
				 break;
			 }
		 }
		 System.out.println("Olá " + nomeCompleto.substring(0, posBranco));*/
		 
		 String ola = "olá";
		 String mundo = " mundo";
		 String olaMundo = ola.concat(mundo);
		 System.out.println(olaMundo);
		 
		 String espacos = "i s p a ç o";
		 String semEspacos = espacos.replace('i', 'e');
		 System.out.println(semEspacos);
		 
		 semEspacos = semEspacos.replaceAll(" ", "");
		 System.out.println(semEspacos);
		 
		 String nome = " meu nome é: ";
		 System.out.println(nome);
		 System.out.println(nome.trim());

	}

}
