package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.financeiro.OperacaoContaException;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber() {
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void cancelar() throws OperacaoContaException {
		if (this.getValor() > 50000d) {
			throw new OperacaoContaException("Essa conta a receber não pode ser cancelada. " +
				"É muito dinheiro para deixar de receber: " + this.getDescricao());
		} else {
			super.cancelar();
		}
	}
	
	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente " + this.getCliente().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}