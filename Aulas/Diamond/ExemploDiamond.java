import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploDiamond {

	public static void main(String[] args) {
		List<String> nomesClientes = new ArrayList<>();
		nomesClientes.add("João");
		nomesClientes.add("Maria");
		
		Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
		carrosPorMontadora.put("Chevrolet", new HashSet<String>());
		carrosPorMontadora.get("Chevrolet").add("Cruze");
		
		Set<String> carrosDaVolks;
		carrosPorMontadora.put("Volks", carrosDaVolks = new HashSet<>());
		carrosPorMontadora.get("Volks").add("Gol");
	}
	
}
