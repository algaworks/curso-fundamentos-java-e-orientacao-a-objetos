import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class DesafioNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.println("Valor do produto:");
		double valor = entrada.nextDouble();
		
		BigDecimal valorBig = new BigDecimal(valor);
		BigDecimal resultado = valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		String valorFormatado = formatador.format(resultado.doubleValue());
		System.out.println("10% do valor é: " + valorFormatado);
	}

}