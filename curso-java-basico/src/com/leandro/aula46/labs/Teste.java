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
		
		circulo.setRaio(30);
		
		quadrado.setLado(10);
		
		triangulo.setBase(12);
		triangulo.setAltura(15);
		
		cubo.setLadoQuadrado(10);
		
		cilindro.setAltura(20);
		cilindro.setRaio(5);
		cilindro.setAreaBase(52);
		
		//piramide.set
		
		for(FiguraGeometrica f: figGeo) {
			System.out.print("Área: ");
			f.calcularArea();
			System.out.print(" |");
			if(f instanceof Figura3D) {
				System.out.print("Volume: ");
				f.calcularVolume();
				System.out.print(" |");
			}
		}
		
		
		
		
		

	}

}
