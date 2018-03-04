package com.leandro.aula43.labs;

import java.util.Scanner;

public class Exer02 {
	private static Scanner scan = new Scanner(System.in);
	private static pessoaFisica pessoaFisica1 =  new pessoaFisica();
	private static pessoaFisica pessoaFisica2 =  new pessoaFisica();
	private static pessoaFisica pessoaFisica3 =  new pessoaFisica();
	
	private static pessoaJuridica pessoaJuridica1 = new pessoaJuridica();
	private static pessoaJuridica pessoaJuridica2 = new pessoaJuridica();
	private static pessoaJuridica pessoaJuridica3 = new pessoaJuridica();

	public static void main(String[] args) {
		telaPrincipal();

	}
	
	private static void telaPrincipal() {
		
		boolean menuVoltarValido = false;
		int op = 0;
		while(!menuVoltarValido) {
			System.out.println("1) Informar renda de R$0 a R$1400,00 para o exemplo 1 de pessoa física;"
					+ "\n2) Informar renda de R$1400,01 a R$2100,00 para o exemplo 2 de pessoa física;"
					+ "\n3) Informar renda de R$2100,01 a R$2800,00 para o exemplo 3 de pessoa física;"
					+ "\n4) Informar renda para o exemplo 1 de uma pessoa jurídica;"
					+ "\n5) Informar renda para o exemplo 2 de uma pessoa jurídica;"
					+ "\n6) Informar renda para o exemplo 3 de uma pessoa jurídica;"
					+ "\n7) Sair.");
			op = scan.nextInt();
			if(op > 0 && op < 8) {
				menuVoltarValido = true;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		switch(op) {
			case 1:
				System.out.println("Digite o nome do exemplo 1 do menu.");
				scan.nextLine();
				pessoaFisica1.setNome(scan.nextLine());
				System.out.println("Digite a renda para o exemplo 1 do menu (se for fora do limite do"
						+ " exemplo, será retornado a própria renda).");
				pessoaFisica1.setRenda(scan.nextDouble());
				System.out.println(pessoaFisica1.toString());
				menuVoltar();
				break;
			case 2:
				System.out.println("Digite o nome do exemplo 2 do menu.");
				scan.nextLine();
				pessoaFisica2.setNome(scan.nextLine());
				System.out.println("Digite a renda para o exemplo 2 do menu (se for fora do limite do"
						+ " exemplo, será retornado a própria renda).");
				pessoaFisica2.setRenda(scan.nextDouble());
				System.out.println(pessoaFisica2.toString());
				menuVoltar();
				break;
			case 3:
				System.out.println("Digite o nome do exemplo 3 do menu.");
				scan.nextLine();
				pessoaFisica3.setNome(scan.nextLine());
				System.out.println("Digite a renda para o exemplo 3 do menu (se for fora do limite do"
						+ " exemplo, será retornado a própria renda).");
				pessoaFisica3.setRenda(scan.nextDouble());
				System.out.println(pessoaFisica3.toString());
				menuVoltar();
				break;
			case 4:
				System.out.println("Digite o nome do exemplo 1 de PJ do menu.");
				scan.nextLine();
				pessoaJuridica1.setNome(scan.nextLine());
				System.out.println("Digite a renda para o exemplo 1 de PJ do menu (se for fora do limite do"
						+ " exemplo, será retornado a própria renda).");
				pessoaJuridica1.setRenda(scan.nextDouble());
				System.out.println(pessoaJuridica1.toString());
				menuVoltar();
				break;
			case 5:
				menuVoltar();
				break;
			case 6:
				menuVoltar();
				break;
			case 7:
				System.exit(0);
				break;
		}
		

	}
	
	private static void menuVoltar() {
		boolean menuVoltarValido = false;
		int op = 0;
		while(!menuVoltarValido) {
			System.out.println("1) Voltar à tela principal;"
					+ "\n2) Sair.");
			op = scan.nextInt();
			if(op > 0 && op < 3) {
				menuVoltarValido = true;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		if(op == 1) {
			telaPrincipal();
		} else if(op == 2) {
			System.exit(0);
		}
		
	}

}
