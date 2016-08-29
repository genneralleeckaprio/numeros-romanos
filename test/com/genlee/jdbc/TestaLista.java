package com.genlee.jdbc;

import java.util.List;

import com.genlee.dao.NumeroDao;
import com.genlee.models.Numeros;

public class TestaLista {
	
	public static void main(String[] args) {
		NumeroDao dao = new NumeroDao();
		
		List<Numeros> numeros = dao.getLista();
		
		for (Numeros numero : numeros) {
			System.out.println("Numero: " +numero.getNumeroInteiro());
		}
	}

}
