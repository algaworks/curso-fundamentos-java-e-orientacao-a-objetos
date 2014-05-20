package com.algaworks.modelo;

public class Fatura {

	private String emailDevedor;
	private double valor;
	private boolean emailEnviado;

	public Fatura(String emailDevedor, double valor) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
	}

	public String getEmailDevedor() {
		return emailDevedor;
	}

	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String resumo() {
		return "Valor devido: " + this.valor;
	}

	public boolean isEmailEnviado() {
		return emailEnviado;
	}

	public void setEmailEnviado(boolean emailEnviado) {
		this.emailEnviado = emailEnviado;
	}
	
}
