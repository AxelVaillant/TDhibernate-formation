package Servlet;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class GetFormationServlet
 */
@WebServlet("/GetF")
public class GetFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ILieudao daoL= new Lieudao();
		List<Lieu> list= daoL.listlieu();
		request.setAttribute("liste", list);
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/FormbyL.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lieu l=new Lieu();
		Formation f =new Formation();
		IFormationdao dao= new Formationdao();
		List<Formation> listf= new ArrayList<Formation>();
		l.setIdlieu(Integer.parseInt(request.getParameter("idlieu")));
		
		listf=dao.getformation(l);
		System.out.println("dopost"+listf);
		request.setAttribute("liste",listf);
		System.out.println("servlet"+listf);
		System.out.println("coucou servlet");
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/Affichage.jsp").forward(request, response);
	}

}
