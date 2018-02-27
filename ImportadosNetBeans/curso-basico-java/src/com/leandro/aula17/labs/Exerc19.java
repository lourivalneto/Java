package com.leandro.aula17.labs;
import java.util.Scanner;

public class Exerc19 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        double nota = 0;
        double soma = 0;
        double media = 0;
        boolean continua = true;
        String op = "";
        
        
        System.out.println("Entre com uma nota e "
                + " tecle \" + \" para continuar adicionando notas "
                + "ou \" = \" para finalizar e ver a média dela(s).");
        
        while(continua){
            cont++;
            nota = scan.nextDouble();
            
            soma += nota;
            
            do {
                op = scan.next();
                if( !op.equals("=") & !op.equals("+")){
                System.out.println("Operação inválida. Digite uma das operações"
                        + " citadas.");
                }
            }while( !op.equals("=") & !op.equals("+"));
            
            if(op.equals("=")){
               continua = false;
            }
            
            
        }
        media = soma / cont;
        System.out.println("A média das notas é: " + media);
        
    }
    
}
