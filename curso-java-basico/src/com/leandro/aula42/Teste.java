package com.leandro.aula42;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        //exemplo 02
        System.out.println(Contantes.URL_BLOG);
        //Contantes.URL_BLOG = "adfasdfadsfads";
        System.out.println(Contantes.URL_BLOG);
        
        final int TOTAL = 1;
        //total += 1;
        System.out.println(TOTAL);
    }

}
