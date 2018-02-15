package com.leandro.aula27.labs;

import java.util.Scanner;

public class Exer02 {

    static ContaCorrente cliente1 = new ContaCorrente();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        cliente1.cc = 37244;
        cliente1.ag = 258;
        cliente1.saldo = 2000;
        cliente1.limite = 1000;
        cliente1.especial = true;
        //menuBanco();
        int opcao = menuBanco();

        if (opcao == 1) {
            double total = 0;
            System.out.println("Digite a quantia que quer sacar.");
            double quantiaPedidoSaque = scan.nextDouble();
            boolean pedidoSaque = cliente1.estadoParaSaque(quantiaPedidoSaque);
            if (pedidoSaque) {
                total = cliente1.sacarDinheiro(quantiaPedidoSaque);
                //System.out.println("Seu saldo: R$" + cliente1.saldo);
                //System.out.println("Seu limite: R$" + cliente1.limite);
            } else {
                System.out.println("Você não tem saldo e/ou limite suficiente"
                        + " para efetuar este saque.");
            }

            retornaAoMenu();
        }

        if (opcao == 2) {
            cliente1.consultarSaldo();
            retornaAoMenu();
            
        }

        if (opcao == 3) {
            cliente1.depositarConta();
            retornaAoMenu();
        }

        if (opcao == 4) {
            cliente1.consultarChequeEspecial();
            retornaAoMenu();
        }

        if (opcao == 5) {
            System.exit(0);
        }

    }

    static int menuBanco() {
        Scanner scan = new Scanner(System.in);
        boolean opcaoValida = false;
        int opcao = 0;
        while (!opcaoValida) {
            System.out.println("\t\tConta Corrente do Cliente 1"
                    + "\n\t\tDigite o número da opção desejada."
                    + "\n1) Saque;"
                    + "\n2) Consulta de saldo;"
                    + "\n3) Depósito;"
                    + "\n4) Verificar se já está no Cheque especial;"
                    + "\n5)Sair");
            opcao = scan.nextInt();
            if (opcao > 0 && opcao <= 5) {
                opcaoValida = true;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        return opcao;
    }

    static void retornaAoMenu() {
        Scanner scan = new Scanner(System.in);
        boolean opcaoValida = false;
        String[] args = new String[0];
        int op = 0;
        while (!opcaoValida) {
            System.out.println("1) Voltar ao menu principal."
                    + "\n2) Sair do programa.");
            op = scan.nextInt();
            if (op > 0 && op <= 2) {
                opcaoValida = true;
            } else {
                System.out.println("\t\tMenu Saque\n\t\tOpção inválida. Tente novamente.");
            }
            if (op == 1) {
                telaInicialSemAtribuicoes();
            } else if (op == 2) {
                System.exit(0);
            }
        }
    }

    static void telaInicialSemAtribuicoes() {
        Scanner scan = new Scanner(System.in);
        int opcao = menuBanco();

        if (opcao == 1) {
            double total = 0;
            System.out.println("Digite a quantia que quer sacar.");
            double quantiaPedidoSaque = scan.nextDouble();
            boolean pedidoSaque = cliente1.estadoParaSaque(quantiaPedidoSaque);
            if (pedidoSaque) {
                total = cliente1.sacarDinheiro(quantiaPedidoSaque);
                //System.out.println("Seu saldo: R$" + cliente1.saldo);
                //System.out.println("Seu limite: R$" + cliente1.limite);
            } else {
                System.out.println("Você não tem saldo e/ou limite suficiente"
                        + " para efetuar este saque.");
            }

            retornaAoMenu();
        }

        if (opcao == 2) {
            cliente1.consultarSaldo();
            retornaAoMenu();
        }

        if (opcao == 3) {
            cliente1.depositarConta();
            retornaAoMenu();
        }

        if (opcao == 4) {
            cliente1.consultarChequeEspecial();
            retornaAoMenu();
        }

        if (opcao == 5) {
            System.exit(0);
        }

    }

}
