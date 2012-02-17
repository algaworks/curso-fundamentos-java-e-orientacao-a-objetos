import java.math.BigDecimal;

/**
 * Representa o cargo de um político.
 * Um cargo possui um salário fixo, o qual é pago sem contar com as
 * verbas e auxílios extraordinários. 
 * 
 * @author Thiago Faria
 *
 */
public class Cargo {

	/**
	 * Descrição do cargo. Um nome que define a função do político,
	 * como por exemplo: vereador, deputado estadual, etc.
	 */
	private String descricao;
	
	/**
	 * O valor do salário dos políticos que possuem o cargo.
	 * Não inclui verbas e auxílios extraordinários.
	 */
	private BigDecimal salario;
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}