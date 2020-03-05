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
import dao.ILieudao;

import dao.Lieudao;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;


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
		ILieudao dao= new Lieudao();
		List<Lieu> list= dao.listlieu();
		request.setAttribute("liste", list);
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation f=new Formation();
		Lieu l=new Lieu();

		l.setIdlieu(Integer.parseInt(request.getParameter("idlieu")));
		f.setLieu(l);
		f.setIdformation(Integer.parseInt(request.getParameter("id")));
		f.setTheme(request.getParameter("theme"));
		IFormationdao dao= new Formationdao();
		int i=dao.ajoutformation(f);
		

		
		if (i==1) {
			request.setAttribute("message","Formation créée");
		}
		else request.setAttribute("message","Echec de la création de Formation");
		
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/formation.jsp").forward(request, response);

}}
