package com.genlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.genlee.jdbc.ConnectionFactory;
import com.genlee.models.Numeros;

public class NumeroDao {
	
	private Connection connection;
	
	public NumeroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Numeros numeros) {
		String sql = "insert into numerointeiro (numero) values (?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, numeros.getNumeroInteiro());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e ) {
			throw new RuntimeException(e);
		}
	}
}
