package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletProductos
 */
@WebServlet("/ServletProductos")
public class ServletProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String nombre = request.getParameter("txtNombre");

		int cantAlf = 0;
		int cantChup = 0;
		int cantChoc = 0;

		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Servlet De Bienvenida</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<h1> Bienvenido:");
		out.print(nombre);
		out.println("</h1>");
		
		out.println("<table style=\"width:100%\">");
		out.println("<tr>");
			out.println("<th>Golosina</th>");
			out.println("<th>Valor</th>");
			out.println("<th>Cantida</th>");
		out.println("</tr>");

		out.println("<tr>");
			out.println("<td>Chupetin</td>");
			out.println("<td>$2</td>");
			out.println("<td>");
			out.print(cantAlf);
			out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		
		
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
			    

	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
