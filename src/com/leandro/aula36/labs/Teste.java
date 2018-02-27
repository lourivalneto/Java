/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula36.labs;

import java.util.Scanner;

/**
 *COMPLETO
 * @author leandro
 */
public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("Digite o nome da Agenda.");
        agenda.setNome(scan.nextLine());
        
        
        Contato[] contatos = new Contato[3];
        
        
        
        for(int i = 0; i < contatos.length; i++){
            Contato c = new Contato();
            System.out.println("Digite o nome do " + (i+1) + "º contato.");
            String nome = scan.nextLine();
            c.setNome(nome);
            System.out.println("Digite o telefone do(a) " + c.getNome());
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            System.out.println("Digite o e-mail do(a) " + c.getNome());
            String email = scan.nextLine();
            c.setEmail(email);
            
            
            
            contatos[i] = c;
            
        }
        
        agenda.setContatos(contatos);
        
        if (agenda != null && agenda.getContatos() != null) {
            System.out.println(agenda.obterInfo());
        }
    }

}
