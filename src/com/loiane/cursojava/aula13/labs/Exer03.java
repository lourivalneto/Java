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
public class Exer03 {
    
    public static void main(String[] args) {
        System.out.println("Digite dois numero separados por espaço.");
        Scanner scan = new Scanner(System.in);
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        //double soma = numero1 + numero2;
        System.out.println("A soma dos números digitados é: " + (numero1+numero2));
        
    }
}
