/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Exer08 {
    
    public static void main(String[] args) {
        System.out.println("Quanto você ganha por hora"
                + " e quantas horas vc trabalha ao mês? (ex: 00,00 192 ou Enter "
                + "entre valores)");
        Scanner scan = new Scanner(System.in);
        double ganhaPorHora = scan.nextDouble();
        double horasMes = scan.nextDouble();
        double salarioMes = ganhaPorHora*horasMes;
        System.out.println("Você ganha R$" + salarioMes + " por mês.");
        
    }
}
