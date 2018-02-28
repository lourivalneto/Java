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
public class Exer06 {
    
    public static void main(String[] args) {
        System.out.println("Digite um raio de círculo para que seja mostrada sua área.");
        Scanner scan = new Scanner(System.in);
        //A = π . r²
        //double area = Math.PI*Math.pow(scan.nextDouble(),2);
        double area = 3.14*Math.pow(scan.nextDouble(),2);
        System.out.println("A área do círculo com o raio digitado é de: " + area + "(unidade de medida)²"
                + " (cm², m², mm² ou outras AO QUADRADO.");
        
    }
}
