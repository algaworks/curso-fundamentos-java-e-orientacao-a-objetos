
public class ReplaceString {

	public static void main(String[] args) {
		String texto = "O valor do produto é R$ @x@.";
		
		String novoTexto = texto.replaceAll("@x+@", "2,50");
		System.out.println(novoTexto);
	}
	
}
