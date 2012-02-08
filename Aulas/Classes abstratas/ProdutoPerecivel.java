package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {

	String dataValidade; //Por enquanto, até aprendermos a classe Date
	
	public void imprimirDescricao() {
		//Digitar a lógica...
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
	}

}
