package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Formationdao;
import dao.IFormationdao;
import fr.adaming.model.Formation;

/**
 * Servlet implementation class AjoutFormationServlet
 */
@WebServlet("/add")
public class AjoutFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation f=new Formation();
		
		f.setId(Integer.parseInt(request.getParameter("id")));
		f.setTheme(request.getParameter("theme"));
		IFormationdao dao= new Formationdao();
		int i=dao.ajoutformation(f);
		

		
		if (i==1) {
			request.setAttribute("message","Formation créée");
		}
		else request.setAttribute("message","Echec de la création de Foration");
		
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/formation.jsp").forward(request, response);

}}
