package com.genlee.jdbc;

import com.genlee.dao.NumeroDao;
import com.genlee.models.Numeros;

public class TestaRemove {
	public static void main(String[] args) {
		
		Numeros numeros = new Numeros();
		numeros.setId(2L);
		
		NumeroDao dao = new NumeroDao();
		dao.remove(numeros);
		System.out.println("Apagado!");
	}

}
