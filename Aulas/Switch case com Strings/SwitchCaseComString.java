
public class SwitchCaseComString {

	public static void main(String[] args) {
		String carro = args.length > 0 ? args[0] : "";
		
		/*if (carro.equals("Audi")) {
			System.out.println("Alemão");
		} else if (carro.equals("Ferrari")) {
			System.out.println("Italiano");
		}*/
		
		switch (carro) {
		case "Audi": 
			System.out.println("Alemão");
			break;
		case "Ferrari":
			System.out.println("Italiano");
			break;
		case "Honda": 
			System.out.println("Japonês");
			break;
		default:
			System.out.println("Não informou nenhum carro!");
				
		}
	}
	
}
