package com.curso_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Servlet implementation class ServletEjecicio_01
 */
public class ServletEjecicio_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Datos Formulario-02</title><br>");
        out.println("<link rel=\"stylesheet\" href=\"css.css/estilos2.css\">");
        out.println("<head>");
        out.println("<body>");

        List<String> listaDatos = new ArrayList<>();

        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String apellidos = request.getParameter("apellidos");

        listaDatos.add(nombre);
        listaDatos.add(apellidos);
        
        // Imprimir hora de envio de formulario
        LocalDateTime fecha = LocalDateTime.now();
        out.println("<h4>Hora de envío de formulario: " + fecha + "</h4>");

        

        // Imprimir nombre y apellidos
        for (String datos : listaDatos) {
            if (!datos.isEmpty()) {
                if (datos.equals(nombre)) {
                  
                    out.println("<p>Nombre: " + datos + "</p>");
                } else {
                	  out.println("<p>Apellidos: " + datos + "</p>");
                }
            } else {
                out.println("<p>Nombre no introducido...</p>");
            }
        }

        // Imprimir edad
        if (!edad.isEmpty()) {
            int edadInt = Integer.parseInt(edad);
            if (edadInt >= 18) {
                out.println("<p>Edad: " + edadInt + "</p>");
            } else {
            	 out.println("<body hidden></body>");
                 
                out.println("<script>");
                out.println("alert('menor de edad Ocultado formulario')");
                out.println("</script>");
                
               
            }
        } else {
            out.println("<p>Edad no introducida...</p>");
        }

      
        // Imprimir comida favorita
        String comidaFavorita = request.getParameter("comidas");
        if (comidaFavorita != null && !comidaFavorita.isEmpty()) {
            out.println("<p>Comida favorita: " + comidaFavorita + "</p>");
        } else {
            out.println("<p>Comida favorita no seleccionada...</p>");
        }

        // Imprimir hobbies favoritos
        List<String> hobbies = new ArrayList<>();
       
       hobbies.add(request.getParameter("correr"));
       hobbies.add(request.getParameter("cantar"));
       hobbies.add(request.getParameter("bailar"));
       hobbies.add(request.getParameter("nadar"));

       out.println("<p>Hobbies favoritos:</p> ");
        
       for (String hobby : hobbies) {
            if (hobby != null && !hobby.isEmpty()) {
                out.println("<p>"+hobby.toString()+ "</p>");
            }
        }
       
       //Imprimir ciudades donde naciste
       
       String ciudades = request.getParameter("ciudades");
       if (ciudades != null && !ciudades.isEmpty()) {
           out.println("<p>Ciudad " + ciudades + "</p>");
       } else {
           out.println("<p>Ciudad  no seleccionada...</p>");
       }
       
       // Creamos una lista para almacenar las propiedades seleccionadas
       List<String> propiedadesList = new ArrayList<>();
       String[] propiedadesArray = request.getParameterValues("propiedades[]");

       
       if (propiedadesArray != null) {
           propiedadesList.addAll(Arrays.asList(propiedadesArray));
       }

     
       // Iteramos a traves de la lista de propiedades y las imprimimos
       out.println("<h2>Propiedades en posesion:</h2>");
       out.println("<ul>");
       
       for (String propiedad : propiedadesList) {
           out.println("<li>" + propiedad + "</li>");
       }
        out.println("</ul>");
    //comentario del formulario
        String area= request.getParameter("area");
        out.println("<h5>Comentarios del formulario</h5");
        
        out.println("<p>" + area + "</p>");
        
        out.println("</body>");
        out.println("</html>");
	        	
	        	
	}

}
