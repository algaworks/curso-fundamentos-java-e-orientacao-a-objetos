import java.util.Scanner;

public class ClassificaProduto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codigoProduto = 0;
		do {
			System.out.print("Digite o codigo do produto: ");
			codigoProduto = entrada.nextInt();
			
			if (codigoProduto != 0) {
				String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";
				
				for (int i = 8; i >= 1; i--) {
					if (codigoProduto % i == 0) {
						System.out.println("O produto de codigo: " + codigoProduto + 
								" ficara no corredor da " + corredor + " e na gaveta " + i);
								
						break;
					}
				}
			}
		} while (codigoProduto != 0);
	}
}