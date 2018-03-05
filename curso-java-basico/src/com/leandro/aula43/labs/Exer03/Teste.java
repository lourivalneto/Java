package com.leandro.aula43.labs.Exer03;

public class Teste {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero();
		Peixe tubarao = new Peixe();
		Mamifero ursoDoCanada = new Mamifero();
				
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setNumPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setNumPatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatanas e cauda");
		
		ursoDoCanada.setNome("Urso-do-canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setNumPatas(4);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setAmbiente("Terra");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		System.out.println("Zoo:\n--------------------------");
		System.out.println(camelo.toString());
		System.out.println(tubarao.toString());
		System.out.println(ursoDoCanada.toString());
		
		
	}

}
