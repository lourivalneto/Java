package com.leandro.aula34.labs;

public class ConversaoDeUnidadesDeArea {
	private static double metroEmPes = 10.76;
	private static double peEmCentimetros = 929;
	private static double milhaEmAcres = 640;
	private static double acreEmPes = 43560;
	private static double conversaoMetrosEmPes;
	private static double conversaoPesEmCentimetros;
	private static double conversaoMilhasEmAcres;
	private static double conversaoAcresEmPes;
	
	public static double converterMP(double metros) {
		conversaoMetrosEmPes = metros * metroEmPes;
		return conversaoMetrosEmPes;
	}
	
	public static double converterPC(double pes) {
		conversaoPesEmCentimetros = pes * peEmCentimetros;
		return conversaoPesEmCentimetros;
	}
	
	public static double converterMA(double milhas) {
		conversaoMilhasEmAcres = milhas * milhaEmAcres;
		return conversaoMilhasEmAcres;
	}
	
	public static double converterAP(double acres) {
		conversaoAcresEmPes = acres * acreEmPes;
		return conversaoAcresEmPes;
	}
	
}
