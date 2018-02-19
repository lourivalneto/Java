package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String op = "";
        boolean finaliza = true;
        double valor = 0;
        double soma = 0;
        int produto = 1;
        double dinheiro = 0;
        String cupom = "Lojas Tabajara\n";
        
        while (finaliza) {
            System.out.println("Digite o valor do produto.");
            valor = scan.nextDouble();
            soma += valor;
            
            
            
            //System.out.println("Produto " + produto + ": R$" + valor);
            cupom += "Produto " + produto + ": R$" + valor + "\n";
            produto++;
            
            if(valor == 0){
                finaliza = false;
                //System.out.println("Lojas Tabajara");
                System.out.println("Total: R$" + soma);
                //cupom += "Lojas Tabajara\n";
                cupom += "Total: R$" + soma + "\n";
                System.out.println("Com qual valor pagará pra eu fazero troco?");
                dinheiro = scan.nextDouble();
                cupom +=  "Dinheiro: R$ " + dinheiro + "\n";
                
                //System.out.println("Dinheiro: R$" + dinheiro);
                cupom += "Troco: R$ " + (dinheiro-soma);
                System.out.println(cupom);
                break;
            }
            
            do {
                
                System.out.println("Tecle o operador \" + \", para continuar "
                        + "somando ou tecle 0 no valor de um produto para "
                        + "finalizar.");
                op = scan.next();
                
                if ( !op.equals("+")) {
                    System.out.println("Opção inválida. Tente novamente.");
                }
                
            } while ( !op.equals("+"));
        }
        // sai do while
        
    }

}
