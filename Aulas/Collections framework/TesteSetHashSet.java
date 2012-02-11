package com.algaworks.curso.fjoo.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}
	
}
