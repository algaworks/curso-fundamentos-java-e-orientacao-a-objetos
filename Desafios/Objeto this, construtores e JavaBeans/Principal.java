public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
	}

}