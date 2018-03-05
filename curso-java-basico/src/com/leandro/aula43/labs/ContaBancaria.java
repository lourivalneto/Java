package com.leandro.aula43.labs;

public abstract class ContaBancaria {
	private String nomeCliente;
    private int numConta;
    private double saldo;
    
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo
				+ ", getNomeCliente()=" + getNomeCliente() + ", getNumConta()=" + getNumConta() + ", getSaldo()="
				+ getSaldo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public double sacar(double valorSaque) {
		if(saldo > 0 && saldo >= valorSaque && valorSaque > 0) {
			this.saldo -= valorSaque;
		}
		System.out.println("Saldo insuficiente ou tentativa de obter 100 anos de perdão.");
		return this.getSaldo();
	}
	
	public double depositar(double valorDeposito) {
		this.saldo += valorDeposito;
		return this.getSaldo();
	}
    
    
}
