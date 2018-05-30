package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogIn
 */
@WebServlet("/ServletLogIn")
public class ServletLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	String[] usuarios = new String[10];
	String[] contraseñas = new String[10];;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		usuarios[0]="gabriel";
        contraseñas[0]="simone";		
		String usr, contr;
		int i,j;
		j = -1;
		
		usr = request.getParameter("txtUsuario");
		contr = request.getParameter("txtContraseña");
		
		for (i=0; i<usuarios.length;i++) {
			if(usuarios[i]!= null) {
				if (usuarios[i].equals(usr)) j = i;
			}
		};
		
		
		if (contraseñas[j].equals(contr)) {
		
			HttpSession httpSession = request.getSession();
		
			httpSession.setAttribute("sessionUsuario", request.getParameter("txtUsuario"));
		
			httpSession.setAttribute("sessionUsuario", request.getParameter("txtContraseña"));
			
			httpSession.setAttribute("sessionUsuario", request.getParameter("txtCodigoPostal"));
			
			httpSession.setAttribute("sessionUsuario", request.getParameter("txtNombre"));
			
			request.getRequestDispatcher("ServletProductos").forward(request, response );}

	
		else {
				request.getRequestDispatcher("login.html").forward(request, response );
							}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
