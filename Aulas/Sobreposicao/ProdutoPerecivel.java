package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;
	
	public void identificar() {
		super.identificar();
		System.out.println("Minha data de validade é: " + dataValidade);
	}
}
