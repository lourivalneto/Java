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
public class Teste {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        
    }
    
    public static void menu() {
        int op = 0;
        Agenda agenda = new Agenda();
        boolean menuValido = false;
        while(!menuValido){
            System.out.println("1) Consultar contato;\n2) Adicionar contato;"
                    + "\n3) Sair.");
            String opc = scan.nextLine();
            try{
               op = Integer.parseInt(opc);
                if(op != 1 && op != 2 && op != 3){
                    throw new Exception();
                } else {
                    menuValido = true;
                }
            } catch(Exception e){
                System.out.println("\nErro: opção inválida. Tente novamente.\n");
            }
            
        }
        switch(op){
            case 1:
                System.out.println("Digite o nome para consultar na agenda.");
                agenda.consultarContatos(scan.nextLine());
                voltarAoMenu();
                break;
            case 2:
                agenda.adicionarContato();
                voltarAoMenu();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
    public static void voltarAoMenu() {
        String op = "";
        boolean menuValido = false;
        while(!menuValido){
            System.out.println("Voltar ao menu principal? (S/s = Sim  ou N/n = Não)");
            
            try{
               op = scan.nextLine();
                if(!op.equalsIgnoreCase("s") && !op.equalsIgnoreCase("n")){
                    throw new Exception();
                } else {
                    menuValido = true;
                }
            } catch(Exception e){
                System.out.println("\nErro: opção inválida. Tente novamente.\n");
            }
            
        }
        
        if(op.equalsIgnoreCase("s")){
            menu();
        } else if (op.equalsIgnoreCase("n")){
            System.exit(0);
        }
    }
}
