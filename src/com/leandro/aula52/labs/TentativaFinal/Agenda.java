/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula52.labs.TentativaFinal;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Agenda {

    private static Contato contatos[] = new Contato[3];
    private Scanner scan = new Scanner(System.in);
    Contato contatoDaVez = new Contato();
    private static int contadorContatos = 0;
    private static int contInocorrencia = 0;

    public void adicionarContato() {
        contadorContatos++;
        System.out.println("Digite o nome do novo contato.");
        contatoDaVez.setNome(scan.nextLine());
        do {
            try {
                System.out.println("Digite o telefone do novo contato, com"
                        + " apenas 8 dígitos.");
                String telefone = scan.nextLine();
                contatoDaVez.setTelefone(Integer.parseInt(telefone));
                if (contatoDaVez.getTelefone() > 99999999 || contatoDaVez.getTelefone() < 11111111) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nERRO: Telefone não pode ter mais do que 9"
                        + " dígitos, não pode ter menos do que 8 dígitos e não pode ser texto.\n");
            }

        } while (contatoDaVez.getTelefone() == 0 || contatoDaVez.getTelefone() < 11111111);

        try {
            if (contadorContatos - 1 > 2) {
                throw new AgendaCheiaException();
            } else {
                this.contatos[contadorContatos - 1] = contatoDaVez;
                System.out.println("Contato criado com sucesso\nNome: "
                        + contatoDaVez.getNome()
                        + "\tTelefone: " + contatoDaVez.getTelefone() + "\tId: "
                        + contatoDaVez.getId() + ".");
            }
        } catch (AgendaCheiaException e1) {
            System.out.println(e1.getMessage());
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }

    }

    public void consultarContatos(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            try {
                if (contatos == null) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Agenda está vazia.");
                break;
            }

            try {
                if (contatos[i] == null) {
                    
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nAinda não há contantos a serem exibidos.\n");
                Teste.menu();
            }

            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + contatos[i].getNome()
                        + "\tTelefone: " + contatos[i].getTelefone() + "\tId: "
                        + contatos[i].getId() + ".");
            } else {
                contInocorrencia++;
            }

        }

        try {
            if (contInocorrencia == 3) {
                throw new ContatoNaoExisteException();
            }
        } catch (ContatoNaoExisteException e2) {
            System.out.println(e2.getMessage());
        }

    }

}
