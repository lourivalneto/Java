package com.leandro.aula43.labs;

public class ContaEspecial extends ContaBancaria{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String string = "Nome do Cliente : " + this.getNomeCliente() + "\nConta           : " +
		this.getNumConta() + "\nSaldo           : R$" + this.getSaldo() + "\nLimite: R$"
				+  this.getLimite();
		return string;
	}

	public double sacar(double valorSaque) {
		if(this.getSaldo() + limite >= valorSaque && valorSaque > 0) {
			double diferencaSaldoDevedor = this.getSaldo() - valorSaque; // pode dar valor negativo
			if(this.getSaldo() == 0 && valorSaque > 0) {
				this.limite -= valorSaque;
			} else if(this.getSaldo() >= valorSaque && valorSaque > 0) {
				this.setSaldo(this.getSaldo() - valorSaque);
			} else if(this.getSaldo() < valorSaque &&  this.getSaldo() 
					+ this.getLimite() > valorSaque && valorSaque > 0) {
				this.setSaldo(0);
				this.setLimite(this.limite + diferencaSaldoDevedor);
				//tem 10 cliente pede saque de 100, então a diferencaSaldoPraZero = -90
				// this.getSaldo() recebe ele mesmo - 90
			}
		}
		System.out.println("Saldo insuficiente ou tentativa de enriquecimento ilícito.");
		return this.getSaldo();
	}
	
	public String obterInfo() {
		String string = "Conta: " + this.getNumConta() + "\nSaldo: " + this.getSaldo() + "\nLimite: "
				+  this.getLimite();
		return string;
	}
	
	

}
