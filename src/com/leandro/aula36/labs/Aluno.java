/*
 * EXER 02 COMPLETO
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula36.labs;

/**
 *
 * @author leandro
 */
class Aluno {

    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String obterInfo() {
        String info = "Aluno(a): " + this.getNome() + "\tMatrícula"
                + ": " + this.getMatricula() + "\nNotas: ";
        double soma = 0;
        double media = 0;
        for (int j = 0; j < this.getNotas().length; j++) {

            if (this.getNotas()[j] != 0) {
                if (j == this.getNotas().length - 1) {
                    info += this.getNotas()[j] + "."
                            + "\nMédia: ";
                    soma += this.getNotas()[j];
                    break;
                }
                info += this.getNotas()[j] + "; ";
                soma += this.getNotas()[j];
            }
        }
        media = soma / 4;
        info += media + ".";
        if (media >= 7) {
            info += "\n\tAluno APROVADO.\n---------------------------------------------\n";
        } else {
            info += "\n\tAluno REPROVADO.\n---------------------------------------------\n";
        }

        return info;
    }

    public double media() {
        double media = 0;
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        media = soma / 4;
        return media;
    }

}
