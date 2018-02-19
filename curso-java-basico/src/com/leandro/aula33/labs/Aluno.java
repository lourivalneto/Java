package com.leandro.aula33.labs;

import java.util.Scanner;

public class Aluno {
	Scanner scan = new Scanner(System.in);
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double notas[][] = new double[3][4];
	private double somaNotas1 = 0;
	private double somaNotas2 = 0;
	private double somaNotas3 = 0;
	
	

	public Aluno(Scanner scan, String nome, String matricula, String curso, String[] disciplinas, double[][] notas,
			double somaNotas1, double somaNotas2, double somaNotas3) {
		super();
		this.scan = scan;
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
		this.somaNotas1 = somaNotas1;
		this.somaNotas2 = somaNotas2;
		this.somaNotas3 = somaNotas3;
	}
	
	public Aluno() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void colocarDisciplinas() {
		System.out.println("Entre com o nome das disciplinas. Enter após o nome" + " ou título de cada");
		for (int i = 0; i < disciplinas.length; i++) {
			this.disciplinas[i] = scan.nextLine();
		}
	}

	public void colocarNotas() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println((j + 1) + "ª nota de " + disciplinas[i] + ".");
				notas[i][j] = scan.nextDouble();
			}
		}
	}

	public void obterMedia() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (i == 0) {
					somaNotas1 += notas[i][j];
				} else if (i == 1) {
					somaNotas2 += notas[i][j];
				} else if (i == 2) {
					somaNotas3 += notas[i][j];
				}
			}
		}
		double mediaNotas1 = (somaNotas1 / 4);
		double mediaNotas2 = (somaNotas2 / 4);
		double mediaNotas3 = (somaNotas3 / 4);
		System.out.println("A média de " + disciplinas[0] + ": " + mediaNotas1 + ".");
		if (mediaNotas1 >= 7) {
			System.out.println(this.nome + ", em " + this.disciplinas[0] + ", está APROVADO.");
		} else {
			System.out.println(this.nome + ", em " + this.disciplinas[0] + ", está REPROVADO.");
		}
		
		System.out.println("A média de " + disciplinas[1] + ": " + mediaNotas2 + ".");
		if (mediaNotas2 >= 7) {
			System.out.println(this.nome + ", em " + this.disciplinas[1] + ", está APROVADO.");
		} else {
			System.out.println(this.nome + ", em " + this.disciplinas[1] + ", está REPROVADO.");
		}
		
		System.out.println("A média de " + disciplinas[2] + ": " + mediaNotas3 + ".");
		if (mediaNotas3 >= 7) {
			System.out.println(this.nome + ", em " + this.disciplinas[2] + ", está APROVADO.");
		} else {
			System.out.println(this.nome + ", em " + this.disciplinas[2] + ", está REPROVADO.");
		}

	}

}
