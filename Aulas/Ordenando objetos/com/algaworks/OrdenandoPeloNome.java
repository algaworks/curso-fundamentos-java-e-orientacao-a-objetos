package com.algaworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 22);
		Pessoa p2 = new Pessoa("Adriana", 23);
		Pessoa p3 = new Pessoa("Bruno", 21);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		Collections.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	
}
