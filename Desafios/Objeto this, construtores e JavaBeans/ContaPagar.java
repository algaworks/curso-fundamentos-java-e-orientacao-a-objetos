public class ContaPagar {

	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;

	public ContaPagar() {
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public void pagar() {
		System.out.println("Pagando conta " + this.getDescricao() + " no valor de " 
			+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
			+ " do fornecedor " + this.getFornecedor().getNome() + ".");
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return this.valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getDataVencimento() {
		return this.dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}