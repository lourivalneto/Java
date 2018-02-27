package com.leandro.aula34.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaConversaoDeUnidadesDeVolume {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat formato = new DecimalFormat("###################.########");

	public static void main(String[] args) {

		tela();

	}

	public static void tela() {
		int op = 0;
		boolean menuValido = false;
		double litros = 0;
		double metros = 0;
		double galaoAmericano = 0;

		while (!menuValido) {
			System.out.println("\t\tConversão de Unidades de Volume" + "\n\t\t1) Litros para Centímetros Cúbicos;"
					+ "\n\t\t2) Metros Cúbicos para Litros;" + "\n\t\t3) Metros Cúbicos para Pés Cúbicos;"
					+ "\n\t\t4) Galão Americano para Polegadas Cúbicas;" + "\n\t\t5) Galão Americano para Litros;"
					+ "\n\t\t6) Sair.");
			op = scan.nextInt();
			if (op > 0 && op < 7) {
				menuValido = true;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}

		}

		switch (op) {
		case 1:
			System.out.println("Litros: ");
			litros = scan.nextDouble();
			System.out.println(formato.format(litros) + " litro(s) = " + ConversaoDeUnidadesDeVolume.converterLC(litros)
					+ " cm³.");
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) Não]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOpção inválida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}

			break;
		case 2:
			System.out.println("Metros: ");
			metros = scan.nextDouble();
			System.out.println(formato.format(metros) + " m³ = " + ConversaoDeUnidadesDeVolume.converterML(metros)
					+ " litros.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) Não]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOpção inválida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2) {
					System.exit(0);
				}
			}
			
			break;
		case 3:
			System.out.println("Metros: ");
			metros = scan.nextDouble();
			System.out.println(formato.format(metros) + " m³ = " + ConversaoDeUnidadesDeVolume.converterMP(metros)
					+ " ft³.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) Não]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOpção inválida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}
			
			break;
		case 4:
			System.out.println("Galão Americano: ");
			galaoAmericano = scan.nextDouble();
			System.out.println(formato.format(galaoAmericano) + " galão(ões) americano(s) = "
					+ ConversaoDeUnidadesDeVolume.converterGP(galaoAmericano) + " in³.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) Não]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOpção inválida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}
			
			
			break;
		case 5:
			System.out.println("Galão Americano: ");
			galaoAmericano = scan.nextDouble();
			System.out.println(formato.format(galaoAmericano) + " galão(ões) americano(s) = "
					+ ConversaoDeUnidadesDeVolume.converterGL(galaoAmericano) + " litros.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) Não]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOpção inválida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}
			break;
		case 6:
			System.exit(0);
			break;
		}
	}

}
