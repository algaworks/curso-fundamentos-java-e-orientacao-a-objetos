package com.algaworks.impressao;

import com.algaworks.compra.Compra;

@FunctionalInterface
public interface Impressora {

	public void imprimir(Compra c);
	
}
