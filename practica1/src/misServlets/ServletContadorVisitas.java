package misServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContadorVisitas
 */
@WebServlet("/ServletContadorVisitas")
public class ServletContadorVisitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int visitas = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContadorVisitas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		visitas ++;
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Servlet Contador De Visitas</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<h1> la cantidad de visitas es:");
		out.print(visitas);
		out.println("</h1>");
		;
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
		
		System.out.print(visitas);
		//request.getRequestDispatcher("index.html").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
