package com.leandro.aula43.labs;

public class ContaPoupanca extends ContaBancaria{
	private double diaRendimento;
	
	
	
	public double getDiaRendimento() {
		return diaRendimento;
	}



	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public String toString() {
		String string = "Nome do Cliente : " + this.getNomeCliente() + "\nConta        : " + 
		this.getNumConta() + "\nSaldo        : R$" + this.getSaldo() + "\nRendimento "
				+ "diário: " + this.getDiaRendimento() + "%";
		return string;
				
	}
	
	public String obterInfo() {
		String string = "Conta: " + this.getNumConta() + "\nSaldo: " + this.getSaldo() + "\nRendimento "
				+ "diário: " + this.getDiaRendimento();
		return string;
	}



	public double calcularNovoSaldo(double qtdDias) {
		double saldoAtualizado = this.getSaldo() * this.getDiaRendimento() + this.getSaldo();
		
		return saldoAtualizado;
	}
}
