package com.leandro.aula17.labs;
import java.util.Scanner;

public class Exerc17 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre como o número que deseja fatorar.");
        
        int num = scan.nextInt();
        int produto = 0;
        int trocaNum = 1;
        int soma = 0;
        System.out.print(num + "!=");
        
        for(int i = num; i>0; i--){
            System.out.print(num + ".");
            if(num==1){
               System.out.print("\b="+ trocaNum + "\n\n"); 
            }
            num--; // 4
            produto = trocaNum*(num+1); // 1*5=5 // 5*4=20
            trocaNum = produto; // de 1 passa a 5
            
        }
        //System.out.print("=" + fatorial + "\n");
    }
    
    
}
