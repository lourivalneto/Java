/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula36.labs;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class TesteCurso {

    static Scanner scan = new Scanner(System.in);
    static Aluno aluno1 = new Aluno();
    static Aluno aluno2 = new Aluno();
    static Aluno aluno3 = new Aluno();
    static Aluno aluno4 = new Aluno();
    static Aluno aluno5 = new Aluno();

    static Aluno[] alunos = new Aluno[5];

    static Curso curso = new Curso();

    //static double notas[] = new double[4];

    public static void main(String[] args) {
        System.out.println("Digite o nome do curso.");
        curso.setNome(scan.nextLine());
        System.out.println("Digite o horário do curso.");
        curso.setHorario(scan.nextLine());

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
        System.out.println("Curso: " + curso.getNome() + ";");
        System.out.println("Horário: " + curso.getHorario());

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno(a): " + alunos[i].getNome() + "\tMatrícula"
                    + ": " + alunos[i].getMatricula() + "\nNotas: ");
            
            for (int j = 0; j < alunos[i].getNotas().length; j++) {
                if (j == alunos[i].getNotas().length - 1) {
                    System.out.print(alunos[i].getNotas()[j] + "."
                            + "\n-----------------------------------------");
                    break;
                }
                System.out.print(alunos[i].getNotas()[j] + "; ");
            }
            System.out.println();
        }
    }

}
