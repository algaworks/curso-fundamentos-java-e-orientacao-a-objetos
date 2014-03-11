import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class GravandoEmails {

	public static void main(String[] args) {
		String[] emails = {"joao2@joao.com", "maria2@maria.com", "ricardo2@ricardo.com"};
		
		
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) {
		try (PrintStream writer = new PrintStream("emails2.txt")) {	
			for (String email : emails) {
//				writer.write(email);
//				writer.newLine();
				writer.println(email);
			}
		} catch (IOException e) {
			System.err.println("Não conseguiu gravar o arquivo." + e.getMessage());
		} 
	}
	
}
