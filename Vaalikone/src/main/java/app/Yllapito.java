package app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import data.Ehdokas;

/**
 * Servlet implementation class Yllapito
 */
@WebServlet("/yllapito")
public class Yllapito extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao=null;
	
	@Override
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "admin", "admin123");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Yllapito() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.readAllEhdokas();
		}
		else {
			System.out.println("No connection to database");
		}
		request.setAttribute("ehdokkaat", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/kirjaudu.jsp");
		rd.forward(request, response);
	}
}