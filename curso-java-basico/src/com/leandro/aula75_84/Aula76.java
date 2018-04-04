package com.leandro.aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = "Curso ";
		String java = "Java";

		String cursoJava = curso + java;
		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado 2+2 = " + (2 + 2);
		System.out.println(resultado2Com2);

		String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2;
		System.out.println(resultado2Com2_);

		String um = String.valueOf(1);
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras interdum tempor purus sed elementum. "
				+ "Nullam placerat augue nibh, id varius nisl porttitor at. Interdum et malesuada fames ac ante ipsum primis in faucibus. "
				+ "Fusce tristique massa volutpat, consequat erat eu, elementum ex. Cras tempus felis at quam tincidunt, vitae tincidunt risus "
				+ "vehicula. Sed pharetra leo quis ornare iaculis. Quisque ut felis eget erat iaculis ultricies vel eget nulla. Cras sollicitudin orci"
				+ " non sem venenatis porttitor. Sed fringilla sagittis tellus, sed sagittis lorem egestas non. Aliquam mattis a sem nec bibendum. "
				+ "Vivamus diam erat, cursus ut ultricies condimentum, tempor sed erat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Nulla lacinia vulputate velit, at pretium est placerat sed. Maecenas vel felis purus. Curabitur aliquam quam ut ipsum faucibus "
				+ "molestie.";
		
		System.out.println(concatenacao);
		
		String concatenacao2 = "\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Cras interdum tempor purus sed elementum. ";
		concatenacao2 += "Nullam placerat augue nibh, id varius nisl porttitor at. Interdum et malesuada fames ac ante ipsum primis in faucibus. ";
		concatenacao2 += "Fusce tristique massa volutpat, consequat erat eu, elementum ex. Cras tempus felis at quam tincidunt, vitae tincidunt risus ";
		concatenacao2 += "vehicula. Sed pharetra leo quis ornare iaculis. Quisque ut felis eget erat iaculis ultricies vel eget nulla. Cras sollicitudin orci";
		concatenacao2 += " non sem venenatis porttitor. Sed fringilla sagittis tellus, sed sagittis lorem egestas non. Aliquam mattis a sem nec bibendum. ";
		concatenacao2 += "Vivamus diam erat, cursus ut ultricies condimentum, tempor sed erat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";
		concatenacao2 += "Nulla lacinia vulputate velit, at pretium est placerat sed. Maecenas vel felis purus. Curabitur aliquam quam ut ipsum faucibus ";
		concatenacao2 += "molestie.";
		
		System.out.println(concatenacao2);

	}

}
