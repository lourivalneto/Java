package com.leandro.aula56.labs;

public enum Operacoes {
	POTENCIA('^'){
		public double executarOperacao(double x, double y) {
			double produto = x;
			for(int i = 1; i < y; i++) { // 2 elevado a 3
				produto *= x;
			}
			return produto;
		}
	},
	SOMA('+') {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},SUBTRACAO('-') {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	},MULTIPLICACAO('*') {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	},DIVISAO('/') {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};
	
	private char operacao;
	
	Operacoes(char operacao){
		this.operacao = operacao;
	}
	
	public char getOperacao() {
		return this.operacao;
	}
	
	public abstract double executarOperacao(double x, double y);
}
