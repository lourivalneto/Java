/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula36.labs;

import java.util.Scanner;

/**
 * Ainda incompleto
 * @author leandro
 */
public class TesteCurso {

    static Scanner scan = new Scanner(System.in);
    static Aluno aluno1 = new Aluno();
    static Aluno aluno2 = new Aluno();
    static Aluno aluno3 = new Aluno();
    static Aluno aluno4 = new Aluno();
    static Aluno aluno5 = new Aluno();
    static Professor professor = new Professor();

    static Aluno[] alunos = new Aluno[5];

    static Curso curso = new Curso();

    //static double notas[] = new double[4];
    public static void main(String[] args) {
        curso.setProfessor(professor);
        System.out.println("Digite o nome do curso.");
        curso.setNome(scan.nextLine());
        System.out.println("Digite o horário do curso.");
        curso.setHorario(scan.nextLine());
        System.out.println("Digite o nome do professor.");
        professor.setNome(scan.nextLine());
        System.out.println("E-mail do professor: ");
        professor.setEmail(scan.nextLine());
        System.out.println("Departamento do profº: ");
        professor.setDepartamento(scan.nextLine());

        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;

        inserirDadosAluno();
        curso.setAlunos(alunos);

        imprimirDadosCurso();

    }

    public static void inserirDadosAluno() {

        for (int i = 0; i < alunos.length; i++) {
            double notas[] = new double[4];
            System.out.println("Digite o nome do " + (i + 1) + "º aluno.");
            alunos[i].setNome(scan.nextLine());
            System.out.println("Digite a matrícula do(a) " + alunos[i].getNome());
            alunos[i].setMatricula(scan.nextLine());
            for (int j = 0; j < notas.length; j++) {

                System.out.println("Digite a " + (j + 1) + "ª nota do(a) "
                        + alunos[i].getNome() + ".");
                notas[j] = Double.parseDouble(scan.nextLine());
            }

            alunos[i].setNotas(notas);
        }

    }

    public static void imprimirDadosCurso() {
        if (curso != null && curso.getNome() != null && curso.getHorario() != null
                && curso.getProfessor() != null && curso.getProfessor().getNome() != null
                && curso.getProfessor().getEmail() != null
                && curso.getProfessor().getDepartamento() != null) {
            System.out.println(curso.obterInfo());
            System.out.println(professor.obterInfo());
        }

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome() != null
                    && alunos[i].getMatricula() != null) {
                System.out.println(alunos[i].obterInfo());
            }

            
            System.out.println();
        }
    }

}
