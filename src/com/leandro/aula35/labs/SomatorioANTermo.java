package com.leandro.aula35.labs;

public class SomatorioANTermo {
	public static double somarAteNTermo(double nTermo) {
		
		if(nTermo == 1) {
			return 1;
		}
		
		return nTermo + somarAteNTermo(nTermo  - 1);
	}
}
