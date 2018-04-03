package com.leandro.aula74.labs.loiane;

public class SimuladorSemaforo {

	public static void main(String[] args) {
		
		ThreadSemaforo semaforo = new ThreadSemaforo();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}
		
		semaforo.desligarSemaforo();

	}

}
