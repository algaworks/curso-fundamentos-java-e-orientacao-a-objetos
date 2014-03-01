package com.algaworks.curso;

import java.util.List;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class BuscaTodosClientes {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		for (Cliente cliente : clientes) {
			System.out.println("------ Cliente ------");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}
	}
	
}
