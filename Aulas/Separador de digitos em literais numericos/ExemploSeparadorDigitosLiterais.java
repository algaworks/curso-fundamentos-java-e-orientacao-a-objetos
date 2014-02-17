
public class ExemploSeparadorDigitosLiterais {

	public static void main(String[] args) {
		long populacaoSaoPaulo = 11_000_000L;
		long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;
		
		System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("População da Grande São Paulo: %d\n", populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_1d;
		System.out.printf("Preço veículo: %.3f\n", precoVeiculo);
		
		// Evite usar assim
		int x = 1____2____3;
		int y = 1_2_3;
		System.out.printf("São iguais: %b\n", (x == y));
	}
	
}
