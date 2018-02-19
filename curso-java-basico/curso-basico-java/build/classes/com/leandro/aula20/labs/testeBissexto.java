/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula20.labs;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class testeBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o ano que você quer usar para a agenda?");
        int ano = scan.nextInt();
        boolean bissexto = false;
        boolean validaRepeticao = true;
        int fevereiro = 0;

        int menu = 0;
        int mes = 0;
        int dia = 0;
        int hora = 0;
        String compromisso = "";

        String[][][] agendaAno = new String[12][][];

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            bissexto = true;
        }
        if (bissexto) {
            fevereiro = 29;
        } else {
            fevereiro = 28;
        }
        
        System.out.println(bissexto);
    }
    
}
