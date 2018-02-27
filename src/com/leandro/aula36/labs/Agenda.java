/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula36.labs;

/**
 *
 * @author leandro
 */
public class Agenda {
    private Contato[] contatos;
    private String nome;

    /**
     * @return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
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
    
    public String obterInfo(){
        String info = "Nome do curso: " + this.nome + ";\t\n";
        if(contatos != null){
            info += "-----Alunos-----\n";
            for(Contato c : contatos){
                info += c.obeterInfo();
            }
        }
        
        return info;
    }
}
