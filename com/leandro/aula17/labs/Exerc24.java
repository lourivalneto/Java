package com.leandro.aula17.labs;

public class Exerc24 {
    public static void main(String[] args) {
        System.out.println("Preço do pão: R$0,18"
                + "\nLoja Quase Dois - Tabela de preços");
        double soma = 0;
        double precoPao = 0.18;
        int item = 1;
        
        for (int i = 1; i <= 50; i++) {
            soma = i * precoPao;
            System.out.println(i + " - R$" + soma);
        }
    }
}
