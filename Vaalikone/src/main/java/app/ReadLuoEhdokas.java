package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import data.Ehdokas;

/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/readluoehdokas")
public class ReadLuoEhdokas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "admin", "admin123");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadLuoEhdokas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Ehdokas ehdokas=null;
	
		request.setAttribute("ehdokas", ehdokas);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/LuoEhdokas.jsp");
		rd.forward(request, response);
	}
}