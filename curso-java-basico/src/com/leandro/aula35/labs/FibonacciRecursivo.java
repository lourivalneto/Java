package com.leandro.aula35.labs;

public class FibonacciRecursivo {
	static int primeiroTermo = 0;
	static int segundoTermo = 1;
	static int valorTermo = 0;
	static int cont = 3;

	public static int fibonacciR(int nTermo) {

		if (nTermo == 2 || nTermo == 3) {
			return 1;
		}

		return fibonacciR(nTermo - 1) + fibonacciR(nTermo - 2);
							

	}

}
