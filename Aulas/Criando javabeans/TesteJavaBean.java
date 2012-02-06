
public class TesteJavaBean {

	public static void main(String[] args) {
		PessoaBean pessoa = new PessoaBean();
		pessoa.setNome("Maria");
		pessoa.setIdade(27);
		
		System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
	}
	
}
