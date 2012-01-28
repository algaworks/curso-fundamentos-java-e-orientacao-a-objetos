public class CalculadoraProfessor {

	public static void main(String[] args) {
		// indica se detalhamento do calculo deve ser apresentado na tela
		boolean calculoDetalhado = true;
		
		// constante do Pi - http://pt.wikipedia.org/wiki/Pi
		float pi = 3.14f;
		
		// raio - informado pelo professor
		float raio = 5.3f;
		
		// area eh igual ao raio ao quadrado multiplicado por Pi
		float area = raio * raio * pi;
		int areaSemCasasDecimais = (int) area;
		
		if (calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
	}

}