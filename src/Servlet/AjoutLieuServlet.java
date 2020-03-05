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
@WebServlet("/addL")
public class AjoutLieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutLieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/formulaireL.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lieu l=new Lieu();
		
		l.setAdresse(request.getParameter("adresse"));
		l.setVille(request.getParameter("ville"));
		ILieudao daol= new Lieudao();
		int i=daol.createLieu(l);
		

		
		if (i==1) {
			request.setAttribute("message","Nouveau Lieu créé");
		}
		else request.setAttribute("message","Echec de la création de Lieu");
		
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/Lieu.jsp").forward(request, response);

}}
