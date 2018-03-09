package com.leandro.aula46.labs;

public class Teste {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		Cubo cubo = new Cubo();
		Cilindro cilindro = new Cilindro();
		Piramide piramide = new Piramide();
		
		FiguraGeometrica[] figGeo = new FiguraGeometrica[6];
		figGeo[0] = circulo;
		figGeo[1] = quadrado;
		figGeo[2] = triangulo;
		figGeo[3] = cubo;
		figGeo[4] = cilindro;
		figGeo[5] = piramide;
		
		circulo.setNome("Círculo");
		circulo.setCor("Branca");
		circulo.setRaio(30);
		
		quadrado.setNome("Quadrado");
		quadrado.setLado(10);
		
		triangulo.setNome("Triângulo");
		triangulo.setBase(12);
		triangulo.setAltura(15);
		
		cubo.setNome("Cubo");
		cubo.setLadoQuadrado(10);
		
		cilindro.setNome("Cilindro");
		cilindro.setAltura(20);
		cilindro.setRaio(5);
		cilindro.setAreaBase(52);
		
		piramide.setNome("Pirâmide");
		piramide.setArestaBase(18);
		piramide.setArestaBase(150);
		piramide.setAltura(500);
		
		for(FiguraGeometrica f: figGeo) {
			System.out.print("Figura Geométrica: " + f.getNome() + " => Área: ");
			f.calcularArea();
			
			if(f instanceof Figura3D) {
				System.out.print(" => Volume: ");
				f.calcularVolume();
			}
			System.out.print("\n");
		}
		
		
		
		
		

	}

}
