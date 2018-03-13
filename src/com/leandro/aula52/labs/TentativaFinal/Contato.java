/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula52.labs.TentativaFinal;

/**
 *
 * @author leandro
 */
public class Contato {
    
    private static int contador = 0;

    /**
     * @return the contador
     */
    public static int getContador() {
        return contador;
    }
    private int id;
    private String nome;
    private int telefone;

    public Contato() {
        this.contador++;
        this.id = contador;
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
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\tTelefone: " + this.getTelefone() 
                + "\tId: " + this.getId() + ".";
    }
    
    
    
}
