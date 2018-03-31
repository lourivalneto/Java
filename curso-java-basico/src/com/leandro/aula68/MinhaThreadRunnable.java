package com.leandro.aula68;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(tempo);

			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);

			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execução");

	}

}
