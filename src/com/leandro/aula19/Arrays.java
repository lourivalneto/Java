package com.leandro.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

		System.out.println("O tamanho do array: " + temperaturas.length);

		System.out.println("Valores do array: " + temperaturas);

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] == 0.0) {
				break;
			}
			System.out.println("O valor da temperatura do dia: " + (i + 1) + " é " + temperaturas[i] + ".");
		}

		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
