package com.genlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Numeros> getLista(){
	try{
		List<Numeros> numeros = new ArrayList<Numeros>();
		PreparedStatement stmt = this.connection.prepareStatement("select * from numerointeiro");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			Numeros numero = new Numeros();
			numero.setId(rs.getLong("id"));
			numero.setNumeroInteiro(rs.getInt("numero"));
			
			numeros.add(numero);
		}
		rs.close();
		stmt.close();
		connection.close();
		return numeros;
	} catch (SQLException e){
		throw new RuntimeException(e);
	}
	}
	
	public void remove (Numeros numeros) {
		try{
			PreparedStatement stmt = connection.prepareStatement("delete from numerointeiro where id=?");
			stmt.setLong(1, numeros.getId());
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
