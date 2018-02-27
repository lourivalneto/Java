
package com.leandro.aula17.labs;
import java.util.Scanner;

public class Exerc12 {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("\t\tTabuada do 1 ao 10.");
       int produto = 0;
       int num = 0;
       
       do {
       System.out.println("\t\tDigite o número da tabuada.");
       num = scan.nextInt();
       
       if(num<=0 | num>10){
           System.out.println("Tabuada não pode ser menor ou igual a zero, nem maior que 10.");
       }
       
       }while(num<=0 | num>10);
       
       for ( int i=1; i<11; i++) {
           
           produto = num * i;
           
           System.out.println("\t\t" + num + " x " + i + " = " + produto);
           
       }
    }
    
}
