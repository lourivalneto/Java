package com.leandro.aula17.labs;
 import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        String op = "";
        boolean repete = true;
        double soma = 0;
        double media = 0;
        int cont = 0;
        double menor = 0;
        double maior = 0;
        
        System.out.println("Entre com as temperaturas em graus Celsius e "
                    + "em seguida, tecle o sinal \" + \" \npara continuar somando "
                    + "ou \" = \" para exibir os resultados.");
        
        do {
                 
            double temp = scan.nextDouble(); // 55 // 1000 // 1 // 10
            
            soma += temp; // 0+55=55 // 55+1000=1055 // 1056 // 1066
            
            cont++; // 1 // 2 // 3 // 4
            
            if(cont==1){
                menor = temp; // 55 NÃO ENTRA MAIS
                maior = temp; // 55 NÃO ENTRA MAIS
            }
            
            if(temp < menor) { 
                menor = temp; // na terceira, menor = 1 // na quarta, 10 não é menor que 1, então continua sendo 1
            }else if(temp > maior) {
                maior = temp; // 1000 // na quarta, 10 não é maior que 1000
            }
            
            op = scan.next();
            
            if(op.equals("=")) {
                repete = false;
            }
            
            
        }while(repete);
        
        media = soma / cont;
        System.out.println("A menor temperatura registra foi: " + menor + "ºC.");
        System.out.println("A maior temperatura registra foi: " + maior + "ºC.");
        System.out.println("A média das temperaturas registradas foi: " + media + "ºC.");
    }
    
}
