package com.curso_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario01
 */
public class ServletFormulario01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<meta charset='UTF-8'>");
		out.println("<titule>Datos Formulario-01</title>");
		out.println("<head>");
		out.println("<body>");
			String nombre = request.getParameter("nombre");
			String edad =request.getParameter("edad");
		out.println("<p style='color:blue'> Nombre:<span style='color:green'>"+nombre+"</span></p>");
		out.println("<p style='color:blue'> Edad:<span style='color:orange'>"+edad+"</span></p>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.close();
		}

}
