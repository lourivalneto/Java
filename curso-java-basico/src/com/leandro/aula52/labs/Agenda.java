package com.leandro.aula52.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda extends Contato {
	static Scanner scan = new Scanner(System.in);
	private int contContatos = 0;

	private int qtdContatos = 1;
	Contato[] contatos = new Contato[3];


	public void adicionarContato() throws AgendaCheiaException {
		this.contContatos++;
		this.setId(contContatos);
		/*//Contato[] contatos =  new Contato[this.contContatos];*/
		Contato contatoDaVez = new Contato();
		System.out.println("Digite o nome do novo contato.");
		
		contatoDaVez.setNome(scan.nextLine());
		System.out.println("Digite o telefone sem caracteres separadores, apenas números: " );
		contatoDaVez.setTelefone(scan.nextInt());
		scan.nextLine();
		contatoDaVez.setId(this.getId());
		System.out.println("Contato criado com sucesso\nNome: " 
		+ contatoDaVez.getNome() + ", Telefone: " + contatoDaVez.getTelefone()
		+ ", ID: " + contatoDaVez.getId() + ".");
		
		
		try {
			//this.setContatos(contatos);
			
			if(this.contContatos -1 > 2) {
				
				throw new AgendaCheiaException();
				
			} 
		} catch (InputMismatchException e) {
			System.out.println("Erro de tipo de dado inválido.");
			e.getStackTrace();
		} 
		
	}
	
	public Contato[] getContatos() {
		return contatos;
	}



	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}



	public void consultarContatos() throws ContatoNaoExisteException, AgendaCheiaException {
		for(Contato c : this.contatos) {
			System.out.println("Digite a id do contato para exibir suas informações.");
			int id = scan.nextInt();
			try {
				if(this.contatos[id - 1] == null) {
					throw new ContatoNaoExisteException(id - 1);
					
				}
				
				System.out.println("Nome: " + this.contatos[id - 1].getNome()
						+ "\tTelefone: " + this.contatos[id - 1].getTelefone() + ".");
					
				
			} catch (ArrayIndexOutOfBoundsException e) {
				e.getStackTrace();
				
				//e.getMessage();
				
			}
			
			break;
			
		}
		
	}


}
