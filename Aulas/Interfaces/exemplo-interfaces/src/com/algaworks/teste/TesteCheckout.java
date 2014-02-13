package com.algaworks.teste;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.impressoras.ImpressoraEpson;
import com.algaworks.impressao.impressoras.ImpressoraHP;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadoras.Cielo;
import com.algaworks.pagamento.operadoras.Redecard;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Redecard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(500);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
