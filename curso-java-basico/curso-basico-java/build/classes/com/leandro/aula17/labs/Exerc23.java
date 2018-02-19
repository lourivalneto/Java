package com.leandro.aula17.labs;

public class Exerc23 {
    public static void main(String[] args) {
        System.out.println("Loja Quase Dois - Tabela de preços");
        double soma = 0;
        double precoLoja = 1.99;
        
        for (int i = 1; i <= 50; i++) {
            soma = i * precoLoja;
            System.out.println(i + " - R$" + soma);
        }
    }
    
}
