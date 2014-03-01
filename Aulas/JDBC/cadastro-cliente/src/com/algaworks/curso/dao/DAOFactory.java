package com.algaworks.curso.dao;

import com.algaworks.curso.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
	
}
