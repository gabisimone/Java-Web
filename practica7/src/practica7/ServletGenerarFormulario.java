package practica7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGenerarFormulario
 */
@WebServlet("/ServletGenerarFormulario")
public class ServletGenerarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGenerarFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Servlet De Bienvenida</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		
		out.println("<form action=\"/practica7/formularioPresupuesto.jsp\" method= \"post\">\n"); 
		out.println("<label for= \"txtNombre\"> Nombre y apellido </label>\n");
		out.println("<input type= \"text\" id = \"txtNombre\" name= \"txtNombre\">\n");

		out.println("<label for= \"txtAsistentes\"> Cantidad de Asistentes </label>\n");
		out.println("<input type= \"text\" id = \"txtAsistente\" name= \"txtAsistente\">\n");

		
		out.println("<input type= \"submit\" value = \"Ya seleccione el presupuesto\">\n");
		out.println("</form>");
		
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();	}

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
