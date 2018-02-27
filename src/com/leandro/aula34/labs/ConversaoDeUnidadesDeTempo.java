package com.leandro.aula34.labs;

import java.text.DecimalFormat;

public class ConversaoDeUnidadesDeTempo {
	//private static DecimalFormat formato = new DecimalFormat("###,###,###.##");
	private static DecimalFormat formato = new DecimalFormat("################################.##################################");
	private static double minutoEmSegundos = 60;
	private static double horaEmMinutos = 60;
	private static double diaEmHoras = 24;
	private static double semanaEmDias = 7;
	private static double mesEmDias = 30;
	private static double anoEmDias = 365.25;
	
	private static double conversaoMinutosEmSegundos;
	private static double conversaoHorasEmMinutos;
	private static double conversaoDiasEmHoras;
	private static double conversaoSemanasEmDias;
	private static double conversaoMesesEmDias;
	private static double conversaoAnosEmDias;
	
	public static String converterMS(double minutos) {
		conversaoMinutosEmSegundos = minutos * minutoEmSegundos;
		String mS = formato.format(conversaoMinutosEmSegundos);
		return mS;
	}
	
	public static String converterHM(double horas) {
		conversaoHorasEmMinutos = horas * horaEmMinutos;
		String hM = formato.format(conversaoHorasEmMinutos);
		return hM;
	}
	
	public static String converterDH(double dias) {
		conversaoDiasEmHoras = dias * diaEmHoras;
		String dH = formato.format(conversaoDiasEmHoras);
		return dH;
	}
	
	public static String converterSD(double semanas) {
		conversaoSemanasEmDias = semanas * semanaEmDias;
		String sD =  formato.format(conversaoSemanasEmDias);
		return sD;
	}
	
	public static String converterMD(double meses) {
		conversaoMesesEmDias = meses * mesEmDias;
		String mD = formato.format(conversaoMesesEmDias);
		return mD;
	}
	
	public static String converterAD(double anos) {
		conversaoAnosEmDias = anos * anoEmDias;
		String aD = formato.format(conversaoAnosEmDias);
		return aD;
	}
	

}
