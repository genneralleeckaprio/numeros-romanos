package com.genlee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.genlee.dao.NumeroDao;
import com.genlee.models.Numeros;

@WebServlet("/adicionaNumeroInteiro")
public class AdicionaNumeroInteiroServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		int numero = Integer.parseInt(req.getParameter("numeroInteiro"));
		
		Numeros numeros = new Numeros();
		
		numeros.setNumeroInteiro(numero);
		
		NumeroDao dao = new NumeroDao();
		dao.adiciona(numeros);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Numero " + numeros.getNumeroInteiro() + "adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}
	
}
