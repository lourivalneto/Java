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
public class Teste {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.setNome("Mensal");

        Contato contato1 = new Contato();
        contato1.setNome("Roberval");
        contato1.setTelefone("67 97060-6070");
        contato1.setEmail("nao@tem.com.br");

        Contato contato2 = new Contato();
        contato2.setNome("Andreia");
        contato2.setTelefone("11 917160-0171");
        contato2.setEmail("caradepau@invos.com.br");

        Contato[] contatos = new Contato[2];
        contatos[0] = contato1;
        contatos[1] = contato2;

        agenda.setContatos(contatos);

        if (agenda != null && agenda.getContatos() != null) {
            for(Contato c : agenda.getContatos()){
                System.out.println("Nome: " + c.getNome() + "; Telefone: " 
                        + c.getTelefone() + "; E-mail: " + c.getEmail() + ".");
            }
        }
    }

}
