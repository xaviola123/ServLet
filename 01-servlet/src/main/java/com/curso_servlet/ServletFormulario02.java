package com.curso_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario02
 */
public class ServletFormulario02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<meta charset='UTF-8'>");
		out.println("<titule>Datos Formulario-02</title>");
		out.println("<head>");
		out.println("<body>");

		String yoga = request.getParameter("yoga");
		String pilates = request.getParameter("pilates");

		if (yoga != null) {
			out.println("Elegido yoga");
		}
		if (pilates != null) {
			out.println("Elegido pilates");
		}

		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.close();
	}

}
