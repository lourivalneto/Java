/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula36;

/**
 *
 * @author leandro
 */
public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyrion");
        // contato.setEndereco("Kings Landing");
        contato.setTelefone("11 99999-9999");

        // criar objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

        contato.setEndereco(end);
        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

    }
}
