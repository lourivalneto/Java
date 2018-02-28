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
public class Professor {
    private String nome;
    private String departamento;
    private String email;

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
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String obterInfo(){
        String info = "Professor: " + this.getNome() + "\tDepartamento: "
                + this.getDepartamento() + "\tEmail: " + this.getEmail() + "";
        return info;
    }
    
}
