package com.genlee.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta");
		connection.close();
	}

}
