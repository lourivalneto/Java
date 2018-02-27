package com.leandro.aula27.labs;


import java.util.Scanner;

public class ContaCorrente {
Scanner scan = new Scanner(System.in);
    double saldo;
    double limite;
    boolean especial;
    int cc;
    int ag;
    boolean respostaPedidoSaque;
    

    boolean estadoParaSaque(double pedidoSaque) { // no objeto tem que ter  uma variável pedidoSaque, 
         // tipo boolean
        if ((saldo == 0 && limite == 0) || saldo + limite < pedidoSaque) {
            respostaPedidoSaque = false;
            System.out.println("\tSaldo Inicial: R$" + saldo + "\n\tLimite Inicial: R$" + limite);
        } else {
            respostaPedidoSaque = true;
            System.out.println("\tSaldo Inicial: R$" + saldo + "\n\tLimite Inicial: R$" + limite);
        }
        return respostaPedidoSaque;
    }

    double sacarDinheiro(double quantia) {
        double total = 0;
        if(saldo == 0 && limite > quantia){
            limite -= quantia;
            total = limite;
            System.out.println("\tSaldo: R$" + saldo + "\n\tLimite: R$" + limite);
        } else if (saldo > quantia){
            saldo -= quantia;
            System.out.println("\tSaldo: R$" + saldo + "\n\tLimite: R$" + limite);
            total = saldo;
        } else if ( saldo <= quantia && saldo + limite >= quantia){
            double diferencaSaldoPraZero = 0;
            diferencaSaldoPraZero -= saldo; // 0 menos valor positivo, dá um valor negativo
            quantia += diferencaSaldoPraZero; // quantia + valor negativo (acaba subtraindo)
            limite -= quantia;
            saldo = 0;
            System.out.println("\tSaldo: R$" + saldo + "\n\tLimite: R$" + limite);
            
            total = saldo + limite;
        }
        
        return total;
    }
    
    void consultarSaldo(){
        System.out.println("Seu saldo atual: \tR$ " + saldo + ".");
        System.out.println("Seu limite atual: \tR$ " + limite + ".");
        //Exer02.main(args);
    }
    
    void depositarConta(){
        double valor = 0;
        System.out.println("Quanto vai depositar? ");
        valor = scan.nextDouble();
        saldo += valor;
        System.out.println("Seu saldo atual: \tR$ " + saldo + ".");
        System.out.println("Seu limite atual: \tR$ " + limite + ".");
    }
    
    void consultarChequeEspecial(){
        if(limite < 1000){
            System.out.println("Você já entrou no cheque especial.");
            System.out.println("Seu limite atual: \tR$ " + limite + ".");
        } else{
            System.out.println("Você ainda não entrou no cheque especial.");
        }
        
    }
}
