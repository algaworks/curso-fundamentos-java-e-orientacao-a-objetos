package com.algaworks.caixa;

import com.algaworks.impressao.Imprimivel;
import com.algaworks.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;

	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}
	
	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

}
