package com.leandro.aula27.labs;

public class Aluno {
    public String nome;
    public int matricula;
    public String cursoMatriculado;
    public String disciplina1;
    public String disciplina2;
    public String disciplina3;
    public double notaDisciplina1;
    public double notaDisciplina2;
    public double notaDisciplina3;
    
    public void verificarAprovacao(){
        if(notaDisciplina1 >= 7){
            System.out.println("O " + nome + " está APROVADO na disciplina " + disciplina1 + ".");
        } else {
            System.out.println("O " + nome + " está REPROVADO na disciplina " + disciplina1 + ".");
        }
        
        if(notaDisciplina2 >= 7){
            System.out.println("O " + nome + " está APROVADO na disciplina " + disciplina2 + ".");
        } else {
            System.out.println("O " + nome + " está REPROVADO na disciplina " + disciplina2 + ".");
        }
        
        if(notaDisciplina3 >= 7){
            System.out.println("O " + nome + " está APROVADO na disciplina " + disciplina3 + ".");
        } else {
            System.out.println("O " + nome + " está REPROVADO na disciplina " + disciplina3 + ".");
        }
    }
    
}
