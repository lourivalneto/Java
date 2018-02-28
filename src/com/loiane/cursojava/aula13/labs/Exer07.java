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
public class Exer07 {
    
     public static void main(String[] args) {
         
         System.out.println("Digite o tamanho de um dos lados do quadrado.");
         Scanner scan = new Scanner(System.in);
         double areaQuadrado = Math.pow(scan.nextDouble(),2)*2;
         System.out.println(" O dobro da área do quadrado que tem o lado digitado acima é de: " + areaQuadrado
         + "(unid. de medida)², ex. cm²");
     }
}
