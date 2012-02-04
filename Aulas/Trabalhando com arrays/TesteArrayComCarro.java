
public class TesteArrayComCarro {

	public static void main(String[] args) {
		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano fabricacao: " + carros[0].anoDeFabricacao);
	}

}
