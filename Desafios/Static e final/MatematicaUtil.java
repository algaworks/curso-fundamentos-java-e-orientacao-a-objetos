public class MatematicaUtil {

	public static final double PI = 3.14;

	// http://pt.wikipedia.org/wiki/Número_de_Fibonacci
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}

	public static double calcularAreaCirculo(double raio) {
		// area eh igual ao raio ao quadrado multiplicado por Pi
		double area = raio * raio * MatematicaUtil.PI;
		return area;
	}

}