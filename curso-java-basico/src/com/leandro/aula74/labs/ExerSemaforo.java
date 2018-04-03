package com.leandro.aula74.labs;

import com.leandro.aula74.labs.Semaforo.CoresSemaforos;

public class ExerSemaforo {

	public static void main(String[] args) {

		


		while(true) {
			try {
				Semaforo semaCor1 = new Semaforo(CoresSemaforos.Vermelho);
				Thread.sleep(10000);
				semaCor1.suspend();
				System.out.println();
				Semaforo semaCor2 = new Semaforo(CoresSemaforos.Amarelo);
				Thread.sleep(2000);
				semaCor2.suspend();
				System.out.println();
				Semaforo semaCor3 = new Semaforo(CoresSemaforos.Verde);
				Thread.sleep(10000);
				semaCor3.suspend();
				System.out.println();
				semaCor1.stop();
				semaCor2.stop();
				semaCor3.stop();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}




	}

}
