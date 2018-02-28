package com.leandro.aula34.labs;

import java.text.DecimalFormat;

public class ConversaoDeUnidadesDeVolume {
	private static DecimalFormat formato = new DecimalFormat("###,###,###.##");
	private static double litroEmCentimetrosCubicos = 1000;
	private static double metroCubicoEmLitros = 1000;
	private static double metroCubicoEmPesCubicos = 35.32;
	private static double galaoAmericanoEmPolegadasCubicas = 231;
	private static double galaoAmericanoEmLitros = 3875;
	
	private static double conversaoLitrosEmCentimetrosCubicos;
	private static double conversaoMetrosCubicosEmLitros;
	private static double conversaoMetrosCubicosEmPesCubicos;
	private static double conversaoGalaoAmericanoEmPolCubicas;
	private static double conversaoGalaoAmericanoEmLitros;
	
	 static String converterLC(double litros) {
		 conversaoLitrosEmCentimetrosCubicos = litros * litroEmCentimetrosCubicos;
		 String LC = formato.format(conversaoLitrosEmCentimetrosCubicos);
		 return LC;
	}
	 
	 static String converterML(double metros) {
		 conversaoMetrosCubicosEmLitros = metros * metroCubicoEmLitros;
		 String ML = formato.format(conversaoMetrosCubicosEmLitros);
		 return ML;
	 }
	 
	 static String converterMP(double metros) {
		 conversaoMetrosCubicosEmPesCubicos = metros * metroCubicoEmPesCubicos;
		 String MP = formato.format(conversaoMetrosCubicosEmPesCubicos);
		 return MP;
	 }
	 
	 static String converterGP(double galao) {
		 conversaoGalaoAmericanoEmPolCubicas = galao * galaoAmericanoEmPolegadasCubicas;
		 String GP = formato.format(conversaoGalaoAmericanoEmPolCubicas);
		 return GP;
	 }
	 
	 static String converterGL(double galao) {
		 conversaoGalaoAmericanoEmLitros = galao * galaoAmericanoEmLitros;
		 String GL = formato.format(conversaoGalaoAmericanoEmLitros);
		 return GL;
	 }
	

}
