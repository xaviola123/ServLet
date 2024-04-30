package com.curso_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario03
 */
public class ServletFormulario03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        out.println("<!DOCTYPE html>");
	        out.println("<html lang='es'>");
	        out.println("<head>");
	        out.println("<meta charset='UTF-8'>");
	        out.println("<title>Datos Formulario-03</title>");
	        out.println("</head>");
	        out.println("<body>");

	        
	        String curso = request.getParameter("cursos");

	        if (curso != null && !curso.isEmpty()) {
	            out.println("Elegido: " + curso);
	        } else {
	            out.println("No se ha seleccionado ningún curso.");
	        }

	        out.println("</body>");
	        out.println("</html>");
	        out.close();
	    }

}
