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
public class Exer05 {
    
    public static void main(String[] args) {
        System.out.println("Digite a metragem que queira converter para centímetros.");
        Scanner scan = new Scanner(System.in);
        double cm = scan.nextDouble()*100;
        System.out.println("Essa metragem convertida para centímetros é: " + cm + " centímetros");
    }
}
