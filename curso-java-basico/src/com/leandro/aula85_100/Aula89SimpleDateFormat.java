package com.leandro.aula85_100;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		
		Calendar data =  new GregorianCalendar(2010,5,4,14,32,25);
		
		System.out.println(sdf.format(data.getTime()));
		
		
		Date hoje = new Date(118,3,6);
		
		System.out.println(sdf.format(hoje));
		
		String d = sdf.format(hoje);
		// Incompatibilidade de versões e deprecated daqui pra baixo
		/*SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		try {
			java.util.Date minhaDataEmDate = sdf.parse(minhaData);
			System.out.println(minhaDataEmDate);
			
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		

	}

}
