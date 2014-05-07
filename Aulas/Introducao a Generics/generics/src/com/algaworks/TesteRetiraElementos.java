package com.algaworks;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {

	public static void main(String[] args) {
		List<Funcionario> nomes = new ArrayList<>();
		nomes.add(new Funcionario("Ricardo"));
		
		Funcionario f = RetiraElementos.recuperaPrimeiro(nomes);
		System.out.println(f.getNome());
	}
	
}
