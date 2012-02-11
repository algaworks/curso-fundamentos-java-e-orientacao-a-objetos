package com.algaworks.curso.fjoo.excecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
//		int numero = 5 / 0; // Lança java.lang.ArithmeticException
/*		String s = null;
		String maiuscula = s.toUpperCase(); // lança java.lang.NullPointerException */
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
			// Várias linhas de código...
		} catch(IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
			
	}
	
}
