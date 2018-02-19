package com.leandro.aula27.labs;

public class Exer03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "José";
        aluno.matricula = 12345699;
        aluno.cursoMatriculado = "Ciências da Computação";
        aluno.disciplina1 = "Lógica de Programação";
        aluno.disciplina2 = "Matemática Discreta";
        aluno.disciplina3 = "Linguagens e Técnicas de Programação";
        aluno.notaDisciplina1 = 9.5;
        aluno.notaDisciplina2 = 6;
        aluno.notaDisciplina3 = 7;
        
        aluno.verificarAprovacao();
    }
    
}
