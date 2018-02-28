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
public class Exer04 {
    
    public static void main(String[] args) {
        System.out.println("Digite as quatro notas bimestrais separadas por espaço.");
        Scanner scan = new Scanner(System.in);
        //double nota1 = scan.nextDouble();
        //double nota2 = scan.nextDouble();
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média das quatro notas bimestrais é: " + media);
    }
}
