package com.algaworks.dao;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarTodasFaturas() {
	    // Obviamente você buscaria isso no banco de dados...
	    
	    List<Fatura> faturas = new ArrayList<>();
	    faturas.add(new Fatura("joao@joao.com", 350.0));
	    faturas.add(new Fatura("maria@maria.com", 150.0));
	    faturas.add(new Fatura("jose@jose.com", 290.0));
	    
	    return faturas;
	  }
	
}
