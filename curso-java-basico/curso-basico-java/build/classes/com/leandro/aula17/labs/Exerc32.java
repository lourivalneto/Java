package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String op = "";
        int codigo = 0;
        int cod100 = 0;
        int cod101 = 0;
        int cod102 = 0;
        int cod103 = 0;
        int cod104 = 0;
        int cod105 = 0;
        double soma = 0;
        double total = 0;
        String cupom = "";

        String cardapio = "  Lanchonete Pão com Ovo\n"
                + "Especificação\tCódigo\tPreço\n"
                + "Cachorro quente\t100\tR$1,20\n"
                + "Bauru simples\t101\tR$1,30\n"
                + "Bauru com ovo\t102\tR$1,50\n"
                + "Hambúrguer\t103\tR$1,20\n"
                + "Cheesburguer\t104\tR$1,30\n"
                + "Refrigerante\t105\tR$1,00";
        System.out.println(cardapio);
        System.out.println("Entre com o código do pedido.");

        do {
            codigo = scan.nextInt();
            do {
                if (codigo == 100) {
                    cod100++;
                    System.out.println("Código 100 com " + cod100 + " pedido(s).");
                } else if (codigo == 101) {
                    cod101++;
                    System.out.println("Código 101 com " + cod101 + " pedido(s).");
                } else if (codigo == 102) {
                    cod102++;
                    System.out.println("Código 102 com " + cod102 + " pedido(s).");
                } else if (codigo == 103) {
                    cod103++;
                    System.out.println("Código 103 com " + cod103 + " pedido(s).");
                } else if (codigo == 104) {
                    cod104++;
                    System.out.println("Código 104 com " + cod104 + " pedido(s).");
                } else if (codigo == 105) {
                    cod105++;
                    System.out.println("Código 105 com " + cod105 + " pedido(s).");
                } else {
                    do {
                        System.out.println("Código inválido. Tente novamente.");
                    } while (codigo != 100 & codigo != 101
                            & codigo != 102 & codigo != 103
                            & codigo != 104 & codigo != 105);
                }
            } while (codigo != 100 & codigo != 101
                    & codigo != 102 & codigo != 103
                    & codigo != 104 & codigo != 105);

            System.out.println("Tecle \" + \" para adicionar mais lanches / refri"
                    + " ou \" = \" para finalizar.");
            op = scan.next();

            while (!op.equals("+") & !op.equals("=")) {
                System.out.println("Operação inválida. Tente novamente.");
                op = scan.next();
            }

        } while (op.equals("+"));

        if (cod100 > 0) {
            soma = cod100 * 1.2;
            total += soma;
            cupom = "Código 100: " + cod100 + " pedidos: R$" + soma + "\n";
            //System.out.println(cupom);
        }

        if (cod101 > 0) {
            soma = 0;
            soma = cod101 * 1.3;
            total += soma;
            cupom += "Código 101: " + cod101 + " pedidos: R$" + soma + "\n";
            //System.out.println(cupom);
        }

        if (cod102 > 0) {
            soma = 0;
            soma = cod102 * 1.5;
            total += soma;
            cupom += "Código 102: " + cod102 + " pedidos: R$" + soma + "\n";
            //System.out.println(cupom);
        }

        if (cod103 > 0) {
            soma = 0;
            soma = cod103 * 1.2;
            total += soma;
            cupom += "Código 103: " + cod103 + " pedidos: R$" + soma + "\n";
            //System.out.println(cupom);
        }

        if (cod104 > 0) {
            soma = 0;
            soma = cod104 * 1.3;
            total += soma;
            cupom += "Código 104: " + cod104 + " pedidos: R$" + soma + "\n";
            //System.out.println(cupom);
        }

        if (cod105 > 0) {
            soma = 0;
            soma = cod105 * 1;
            total += soma;
            cupom += "Código 105: " + cod105 + " pedidos: R$" + soma + "\n";
            //System.out.println(cupom);
        }
        
        System.out.println(cupom);
        System.out.println("Total: R$" + total);
    }

}

/*
100
101
102
103
104
105

 */
