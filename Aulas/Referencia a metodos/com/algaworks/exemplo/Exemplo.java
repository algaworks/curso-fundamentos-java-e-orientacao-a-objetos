package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;

public class Exemplo {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		/*for (Fatura f : faturasVencidas) {
			f.atualizarStatus();
		}*/
		
		//faturasVencidas.forEach(f -> f.atualizarStatus());
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
		
	}
	
}
