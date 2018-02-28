package com.leandro.aula17.labs;
import java.util.Scanner;

public class Exerc18 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número para saber se é primo.");
        int num = scan.nextInt();
        int cont = 0;
        
        for (int i = 2; i <= num ; i++){
            if(num%i==0){
                cont++;
            }
        }
        if(cont==1){
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + "  não é primo.");
        }
    }
    
}
