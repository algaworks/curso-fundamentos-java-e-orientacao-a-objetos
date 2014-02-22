
public class ExemploStringBuffer {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer(); // thread-safe - use no contexto de concorrência
		StringBuilder sb = new StringBuilder(); // não-thread-safe - mais rápido
		
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar. ");
		
		System.out.println(sb.toString());
		
		sb.insert(26, " da AlgaWorks");
		
		System.out.println(sb);
	}
	
}
