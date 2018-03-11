package com.leandro.aula52.labs;

import java.util.Scanner;

public class Teste extends Agenda{
	private static Scanner scan = new Scanner(System.in);
	private static Agenda agenda = new Agenda();
	
	public static void main(String[] args)  {
		try {
			menu();
			voltarMenu();
		} catch (ContatoNaoExisteException e) {
			e.printStackTrace();
		} catch (AgendaCheiaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}

	public static void menu() {
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
			try {
				agenda.consultarContatos();
			} catch (ContatoNaoExisteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				voltarMenu();
			} catch (ContatoNaoExisteException | AgendaCheiaException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			break;
		case 2:
			try {
				agenda.adicionarContato();
			} catch (AgendaCheiaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				voltarMenu();
			} catch (ContatoNaoExisteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (AgendaCheiaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			String opc = "";
			boolean respValida = false;
			while(!respValida) {
				System.out.println("Tem certeza que deseja sair? S/s-Sim; N/n-Não");
				opc = scan.next();
				
				if(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")) {
					respValida = true;
				} else {
					System.out.println("Opção inválida. Tente novamente.");
				}
			}
			if(opc.equalsIgnoreCase("s")) {
				System.exit(0);
			} else {
				menu();
			}
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
			String opc = "";
			boolean respValida = false;
			while(!respValida) {
				System.out.println("Tem certeza que deseja sair? S/s-Sim; N/n-Não");
				opc = scan.next();
				
				if(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")) {
					respValida = true;
				} else {
					System.out.println("Opção inválida. Tente novamente.");
				}
			}
			if(opc.equalsIgnoreCase("s")) {
				System.exit(0);
			} else {
				menu();
			}
			
			
		}
	}

}
