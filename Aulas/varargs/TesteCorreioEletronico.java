
public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();
		
//		correio.enviarEmails(new String[] {"joao@joao.com", "maria@maria.com"});
		
		correio.enviarEmails("joao@joao.com", "maria@maria.com", "pedro@pedro.com");
	}
	
}
