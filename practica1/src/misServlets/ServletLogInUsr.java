package misServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogInUsr
 */
@WebServlet("/ServletLogInUsr")
public class ServletLogInUsr extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String[] usuarios = new String[10];
	String[] contraseñas = new String[10];;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogInUsr() {
        super();

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		usuarios[0]="gabriel";
        contraseñas[0]="simone";		
		String nom, contr;
		int i,j;
		j = -1;
		
		nom = request.getParameter("txtNombre");
		contr = request.getParameter("txtContraseña");
		
		for (i=0; i<usuarios.length;i++) {
			if(usuarios[i]!= null) {
				if (usuarios[i].equals(nom)) j = i;
			}
		};
		
		
		if (contraseñas[j].equals(contr)) {
			request.getRequestDispatcher("ServletBienvenida").forward(request, response );}
		else {
				request.getRequestDispatcher("error.html").forward(request, response );
							}
		
			
	}

}
