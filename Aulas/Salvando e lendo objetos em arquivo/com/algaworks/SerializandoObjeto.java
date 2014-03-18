package com.algaworks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.algaworks.model.Pessoa;

public class SerializandoObjeto {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("João Silva");
		p.setIdade(25);
		p.setProfissao("Motorista");
		
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
			out.writeObject(p);
			System.out.println("Objeto salvo com sucesso.");
			
		} catch (IOException e) {
			System.err.println("Erro salvando o objeto. " + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
