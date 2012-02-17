import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

/**
 * Representa uma organização que possui um conjunto de políticos
 * que governam um estado, município, etc.
 * 
 * @author Thiago Faria
 *
 */
public class Governo {

	/**
	 * Mapa com uma lista de políticos por estado da federacão.
	 * A chave do mapa faz referência à sigla do partido e
	 * o valor à uma lista de políticos do partido.
	 */
	private Map<String, List<Politico>> partidosPoliticos;

	/**
	 * Construtor do governo.
	 * Instancia um mapa vazio de políticos.
	 */
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	/**
	 * Adiciona um político à relação de políticos.
	 * 
	 * @param partidoPolitico sigla do partido político
	 * @param politico político a ser adicionado para o partido
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);
		
		// adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	/**
	 * Consulta e calcula os gastos com salários de todos os políticos
	 * do partido informado.
	 * O valor retornado é em Reais.
	 * 
	 * @param partidoPolitico sigla do partido político a ser filtrado na consulta
	 * @return valor de gastos com salários, em reais
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				total = total.add(politico.getCargo().getSalario());
			}
		}
		
		return total;
	}
	
	/**
	 * Consulta e calcula os gastos com salários de todos os políticos
	 * do cargo e partido político informados.
	 * O valor retornado é em Reais.
	 * 
	 * @param cargo cargo dos políticos a ser filtrado na consulta
	 * @param partidoPolitico sigla do partido político a ser filtrado na consulta
	 * @return valor de gastos com salários, em reais
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				// verifica se cargo do político é igual ao cargo informado no parâmetro
				if (politico.getCargo().equals(cargo)) {
					total = total.add(politico.getCargo().getSalario());
				}
			}
		}
		
		return total;
	}

}