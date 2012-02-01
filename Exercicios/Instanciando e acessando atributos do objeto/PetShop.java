
public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();

		cachorro.nome = "Bidu";
		cachorro.idade = 1;
		cachorro.raca = "Boxer";
		cachorro.sexo = 'M';
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
	}
	
}
