package com.algaworks.curso.modelo;

import java.util.List;

public class Cliente {

	private String nome;
	private int idade;
	private Endereco endereco;
	private List<Telefone> telefones;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idade, Endereco endereco,
			List<Telefone> telefones) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
