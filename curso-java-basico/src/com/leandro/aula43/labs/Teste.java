package com.leandro.aula43.labs;

import java.util.Scanner;

public class Teste {
	static ContaPoupanca contaPoupanca = new ContaPoupanca();
	static ContaEspecial contaEspecial = new ContaEspecial();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		telaPrincipal();
		
		
		

	}
	
	public static void telaPrincipal() {
		
		boolean menuValido = false;
		int op = 0;
		while(!menuValido) {
			System.out.println("1) Criar nova conta poupança;"
					+ "\n2) Criar nova conta especial;"
					+ "\n\t\tCaso já tenha criado uma das contas fictícias:"
					+ "\n3) Sacar um valor dessa conta poupança criada;"
					+ "\n4) Sacar um valor dessa conta especial criada;"
					+ "\n5) Depositar na conta poupança criada;"
					+ "\n6) Depositar na conta especial criada;"
					+ "\n7) Mostrar saldo atualizado dessa conta poupanca criada;"
					+ "\n8) Mostrar saldo dessa conta especial criada;"
					+ "\n9) Mostrar dados da conta poupança;"
					+ "\n10) Mostrar dados da conta especial;"
					+ "\n11) Sair.");
			op = scan.nextInt();
			if(op > 0 && op < 12) {
				menuValido = true;
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		switch(op) {
		case 1:
			System.out.println("Digite o nome do cliente.");	
			scan.next();
			contaPoupanca.setNomeCliente(scan.nextLine());
			System.out.println("Digite o número da nova nova conta Poupança.");
			contaPoupanca.setNumConta(scan.nextInt());
			System.out.println("Qual o saldo inicial com o qual você criará essa conta poupança?");
			contaPoupanca.setSaldo(scan.nextDouble());
			System.out.println("Digite o rendimento diário dessa conta poupança.");
			contaPoupanca.setDiaRendimento(scan.nextDouble());
			System.out.println("Conta Poupança criada com o número: " + contaPoupanca.getNumConta() + ".");
			menuVoltar();			
			break;
		case 2:
			
			System.out.println("Digite o nome do cliente.");
			scan.nextLine();
			contaEspecial.setNomeCliente(scan.nextLine());
			System.out.println("Digite o número da nova conta Especial.");
			contaEspecial.setNumConta(scan.nextInt());
			System.out.println("Qual o limite que essa conta terá?");
			contaEspecial.setLimite(scan.nextDouble());
			System.out.println("Qual o saldo inicial com o qual você criará essa conta especial?");
			contaEspecial.setSaldo(scan.nextDouble());
			System.out.println("Conta Especial criada como número: " + contaEspecial.getNumConta() + ".");
			menuVoltar();
			break;
		case 3:
			if(contaPoupanca != null) {
				System.out.println("Digite o valor que quer sacar dessa conta poupança fictícia.");
				contaPoupanca.sacar(scan.nextDouble());
				System.out.println("Novo saldo: " + contaPoupanca.getSaldo());	
			}
			menuVoltar();
			break;
		case 4:
			if(contaEspecial != null) {
				System.out.println("Digite o valor que quer sacar dessa conta especial fictícia.");
				contaEspecial.sacar(scan.nextDouble());
				System.out.println("Novo saldo: " + contaEspecial.getSaldo());
				System.out.println("Novo limite: " + contaEspecial.getLimite());
			}
			menuVoltar();
			break;
		case 5:
			if(contaEspecial != null) {
			System.out.println("Digite o valor que irá depositar na poupança fictícia.");
			contaPoupanca.depositar(scan.nextDouble());
			System.out.println("Novo saldo: " + contaPoupanca.getSaldo());
			}
			menuVoltar();
			break;
		case 6:
			if(contaEspecial != null) {
				System.out.println("Digite o valor que irá depositar na conta especial fictícia.");
				contaEspecial.depositar(scan.nextDouble());
				System.out.println("Novo saldo: " + contaEspecial.getSaldo());
				}
			menuVoltar();
			break;
		case 7:
			System.out.println("Digite a quantidade de dias do seu depósito para ver o saldo atualizado.");
			System.out.println("Seu saldo atualizado: " +
			contaPoupanca.calcularNovoSaldo(scan.nextDouble()));
			menuVoltar();
			break;
		case 8:
			System.out.println("Seu saldo: " + contaEspecial.getSaldo());
			System.out.println("Seu limite: " + contaEspecial.getLimite());
			menuVoltar();
			break;
		case 9:
			System.out.println(contaPoupanca.toString());
			menuVoltar();
			break;
		case 10:
			System.out.println(contaEspecial.toString());
			menuVoltar();
			break;
		case 11:
			System.exit(0);
			break;
		}
	}
	
	public static void menuVoltar() {
		
		int menuVoltar = 0;
		do {
			System.out.println("\n\n1 para voltar à tela principal ou 2 para sair.");
			menuVoltar = scan.nextInt();
			if(menuVoltar == 1) {
				for(int i = 0; i < 100; i++) {
					System.out.println("\n");
				}
				telaPrincipal();
			} else if(menuVoltar == 2) {
				System.exit(0);
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
			} while(menuVoltar < 1 || menuVoltar > 2);
	}

}
