package practica7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGenerarPresupuesto
 */
@WebServlet("/ServletGenerarPresupuesto")
public class ServletGenerarPresupuesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGenerarPresupuesto() {
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

		out.println("<label for= \"txtApellido\"> email </label>\n");
		out.println("<input type= \"text\" id = \"txtApellido\" name= \"txtApellido\">\n");

		
		out.println("<input type= \"submit\" value = \"registrar Cliente\">\n");
		out.println("</form>");
		
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
		
		
		String nombre = request.getParameter("txtNombre"); 
		String apellido = request.getParameter("txtApellido"); 
		Cliente cliente = new Cliente(0,nombre, apellido);	
		
		ClienteDAO clienteDao = new ClienteDAO();
		
		clienteDao.agregarCliente(cliente);
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
