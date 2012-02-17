/**
 * Representa um político do governo.
 * Um político é eleito pelo povo. Ele tem o poder de
 * influenciar a maneira como a sociedade é governada.
 * 
 * @author Thiago Faria
 *
 */
public class Politico {

	/**
	 * Nome completo do político.
	 * Não é indicado usar abreviações.
	 */
	private String nome;
	
	/**
	 * Referência para o cargo do político.
	 * Um cargo define o salário base do político e a
	 * função que ele deve exercer.
	 */
	private Cargo cargo;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cargo getCargo() {
		return this.cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}