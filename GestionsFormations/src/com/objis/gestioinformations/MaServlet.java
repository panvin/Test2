package com.objis.gestioinformations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MaServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Liste des formations du catalogue</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<CENTER>Liste des formations: JAVA, WEBSERVICES</CENTER>");
		out.println("<br>"+request.getMethod() + "<br>");
		out.println(request.getRequestURL() + "<br>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
        request.setAttribute("nom", nom);
        
        response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Merci!!!!</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<CENTER><img src=\"http://img2.wikia.nocookie.net/__cb20141111174826/r2d/images/d/dc/Troll_face.png\" alt=\"Troll\" ></CENTER>");
		out.println("<CENTER>Merci pour ton numero de carte bleue, " + nom + " "+ prenom +" il est entre de bonne mains</CENTER>");
		out.println("</BODY>");
		out.println("</HTML>");
		
		//this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
