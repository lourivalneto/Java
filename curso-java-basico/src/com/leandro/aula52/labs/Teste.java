package com.leandro.aula52.labs;

import java.util.Scanner;

public class Teste extends Agenda{
	private static Scanner scan = new Scanner(System.in);
	private static Agenda agenda = new Agenda();
	
	public static void main(String[] args) throws ContatoNaoExisteException, AgendaCheiaException {
		menu();


	}

	public static void menu() throws ContatoNaoExisteException, AgendaCheiaException {
		int op = 0;
		
		boolean menuValido = false;
		while(!menuValido) {
			System.out.println("1) Consultar um contato da Agenda;"
					+ "\n2) Adicionar um contato;"
					+ "\n3) Sair.");
			op = scan.nextInt();
			if(op > 0 && op < 4) {
				menuValido = true;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		switch(op) {
		case 1:
			agenda.consultarContatos();
			voltarMenu();
			break;
		case 2:
			agenda.adicionarContato();
			voltarMenu();
			break;
		case 3:
			System.exit(0);
			break;
		}
		
	}
	
	public static void voltarMenu() throws ContatoNaoExisteException, AgendaCheiaException {
		boolean menuValido = false;
		int op = 0;
		while(!menuValido) {
			System.out.println("\n\t\t\t1) Voltar ao menu principal;\n\t\t\t2) Sair;");
			op = scan.nextInt();
			if(op > 0 && op < 3) {
				menuValido = true;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		if(op == 1) {
			menu();
		} else {
			System.exit(0);
		}
	}

}
