package com.genlee.jdbc;

import com.genlee.dao.NumeroDao;
import com.genlee.models.Numeros;

public class TesteInsere {
	
	public static void main(String[] args) {
		
		Numeros numeros = new Numeros();
		numeros.setNumeroInteiro(57);
		
		NumeroDao dao = new NumeroDao();
		dao.adiciona(numeros);
		System.out.println("Gravado!");
	}


	
}
