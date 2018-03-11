package com.leandro.aula52.labs;

public class Contato {
	private String nome;
	private int telefone;
	private int id;
	
	
	
	

	public Contato() {
		super();
		this.id++;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}




}
