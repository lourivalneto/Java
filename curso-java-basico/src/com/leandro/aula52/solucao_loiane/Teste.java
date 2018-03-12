package com.leandro.aula52.solucao_loiane;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao = 1;
		while(opcao != 3) {
			opcao = obterOpcaoMenu(scan);
			if(opcao == 1 ) { //Consultar contato
				consultarContato(scan, agenda);
			} else if(opcao == 2 ) { //Adicionar contato
				adicionarContato(scan, agenda);
			}
		}
		
		
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		try {
			System.out.println("Criando um contato, entre com as informações.");
			String nome = lerInformacao(scan, "Entre com o nome do contato");
			String telefone = lerInformacao(scan, "Entre com o telefone do contato");
			String email = lerInformacao(scan, "Entre com o e-mail do contato");
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);
			
			System.out.println("Contato a ser criado: ");
			System.out.println(contato);
		
		
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacao(scan, "Entre com o nome do contato a ser pesquisado.");
		try {
			if(agenda.consultarContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe.");
			}
		} catch (ContatoNaoExisteException e) {
			//System.out.println("Contato não existe.");
			System.out.println(e.getMessage());
		}
	}
	
	public static String lerInformacao(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {
		int opcao = 3;
		boolean entradaValida = false;
		while(!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao > 0 && opcao < 4) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inválida");
				}
			}
			catch(Exception e) {
				System.out.println("Entrada inválida, digite novamente.\n");
			}

		}


		return opcao;
	}

}
