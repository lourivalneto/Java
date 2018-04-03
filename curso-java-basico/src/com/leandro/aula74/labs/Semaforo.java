package com.leandro.aula74.labs;

public class Semaforo implements Runnable {
	enum CoresSemaforos {
		Vermelho, Amarelo, Verde
	}

	private CoresSemaforos cor;
	private boolean estaSuspensa;
	private boolean foiTerminada;

	public Semaforo(CoresSemaforos cor) {
		this.estaSuspensa = false;
		this.cor = cor;
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			
			if (this.cor == CoresSemaforos.Amarelo) {
				System.out.println("Semáforo está: " + this.cor + "\n");
				for(int i = 0; i < 1000; i++) {
					System.out.println((i+1) + "º segundo no " + this.cor);
					Thread.sleep(1000);
					synchronized (this) {
						while(estaSuspensa) {
							wait();
						}
						if(foiTerminada) {
							break;
						}
					}
				}
				
				

			} else {
				System.out.println("Semáforo está: " + this.cor + "\n");
				for(int i = 0; i < 1000; i++) {
					System.out.println((i+1) + "º segundo no " + this.cor);
					Thread.sleep(1000);
					synchronized (this) {
						while(estaSuspensa) {
							wait();
						}
					}
				}

				
				

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void suspend() {
		this.estaSuspensa = true;
	}
	
	synchronized void resume() {
		this.estaSuspensa = false;
		notify();
	}
	
	synchronized void stop() {
		this.foiTerminada = true;
		notify();
	}

}
