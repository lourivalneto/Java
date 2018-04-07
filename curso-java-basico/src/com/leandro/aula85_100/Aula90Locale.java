package com.leandro.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cód. do país: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());
			
			System.out.println("***************************************");
		}
		
		Locale br = new Locale("pt","BR");
		
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALIAN);
		System.out.println(nf2.format(5000000000000d));
		

	}

}
