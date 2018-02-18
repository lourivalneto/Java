package com.leandro.aula33.labs;

import java.util.Scanner;

public class TestaAluno {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro");
		aluno.setMatricula("123456");
		aluno.setCurso("Análise de Sistemas");
		//aluno.setDisciplinas(new String[] {"Primeira", "Segunda", "Terceira"});

		aluno.colocarDisciplinas();
		aluno.colocarNotas();
		aluno.obterMedia();

	}

}
