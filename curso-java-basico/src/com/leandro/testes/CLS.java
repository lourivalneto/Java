package com.leandro.testes;

import java.io.IOException;

public class CLS {
	public static void main(String... arg) throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
		Runtime.getRuntime().exec("clear");
	}
}
