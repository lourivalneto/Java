package com.leandro.aula34.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaConversaoDeUnidadesDeTempo {
	static Scanner scan = new Scanner(System.in);
	private static DecimalFormat formato = new DecimalFormat("################################.#################################");
	static int op = 0;
	static boolean menuValido = false;
	static double horas;
	static double minutos;
	static double dias;
	static double semanas;
	static double meses;
	static double anos;
	

	public static void main(String[] args) {

		tela();

	}
	
	public static void tela() {
		menuValido = false;
		op = 0;
		while(!menuValido) {
			System.out.println("\t\tConversor de Unidades de Tempo"
					+ "\n\t1) Minuto(s) para Segundo(s);"
					+ "\n\t2) Hora(s) para Minuto(s);"
					+ "\n\t3) Dia(s) para Hora(s);"
					+ "\n\t4) Semana(s) para Dia(s);"
					+ "\n\t5) Mês(eses) para Dia(s);"
					+ "\n\t6) Ano(s) para Dia(s);"
					+ "\n\t7) Sair.");
			op = scan.nextInt();
			if ( op > 0 && op < 8) {
				menuValido = true;
			} else {
				System.out.println("\t\tTela Principal\n\t\tOpção inválida. Tente novamente. Enter para continuar.");
			}
		}
		
		switch(op) {
		case 1:
			
			System.out.println("Minuto(s): ");
			minutos = scan.nextDouble();
			if(minutos > 1) {
				System.out.println(formato.format(minutos) + " minutos = " + ConversaoDeUnidadesDeTempo.converterMS(minutos) + " s.");
			} else {
				System.out.println(formato.format(minutos) + " minuto = " + ConversaoDeUnidadesDeTempo.converterMS(minutos) + " s.");
			}
			
			retornarAoMenu();
			
			break;
		case 2:
			
			System.out.println("Hora(s): ");
			horas = scan.nextDouble();
			if(horas > 1) {
				System.out.println(formato.format(horas) + " horas = " + ConversaoDeUnidadesDeTempo.converterHM(horas) + " min.");
			} else {
				System.out.println(formato.format(horas) + " hora = " + ConversaoDeUnidadesDeTempo.converterHM(horas) + " min.");
			}
			
			retornarAoMenu();
			
			break;
		case 3:
			
			System.out.println("Dia(s): ");
			dias = scan.nextDouble();
			if(dias > 1) {
				System.out.println(formato.format(dias) + " dias = " + ConversaoDeUnidadesDeTempo.converterDH(dias) + " H.");
			} else {
				System.out.println(formato.format(dias) + " dia = " + ConversaoDeUnidadesDeTempo.converterDH(dias) + " H.");
			}
			
			retornarAoMenu();
			
			break;
		case 4:
			
			System.out.println("Semana(s): ");
			semanas = scan.nextDouble();
			if(semanas > 1) {
				System.out.println(formato.format(semanas) + " semanas = " + ConversaoDeUnidadesDeTempo.converterSD(semanas) + " D.");
			} else {
				System.out.println(formato.format(semanas) + " semana = " + ConversaoDeUnidadesDeTempo.converterSD(semanas) + " D.");
			}
			
			retornarAoMenu();
			
			break;
		case 5:
			
			System.out.println("Mês(eses): ");
			meses = scan.nextDouble();
			if(meses > 1) {
				System.out.println(formato.format(meses) + " meses = " + ConversaoDeUnidadesDeTempo.converterMD(meses) + " D.");
			} else {
				System.out.println(formato.format(meses) + " mês = " + ConversaoDeUnidadesDeTempo.converterMD(meses) + " D.");
			}
			
			retornarAoMenu();
			
			break;
		case 6:
			
			System.out.println("Ano(s): ");
			anos = scan.nextDouble();
			if(anos > 1) {
				System.out.println(formato.format(anos) + " anos = " + ConversaoDeUnidadesDeTempo.converterAD(anos) + " D.");
			} else {
				System.out.println(formato.format(anos) + " ano = " + ConversaoDeUnidadesDeTempo.converterAD(anos) + " D.");
			}
			
			retornarAoMenu();
			
			break;
		case 7:
			System.exit(0);
		}
	}
	
	public static void retornarAoMenu() {
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
	}
}
