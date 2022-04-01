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

@WebServlet(
    name = "Update",
    urlPatterns = {"/update"}
)
public class Update extends HttpServlet {
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "admin", "admin123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException {
		response.sendRedirect("index.html");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String id=request.getParameter("id");
		String etunimi=request.getParameter("etunimi");
		String sukunimi=request.getParameter("sukunimi");
		
		Ehdokas f=new Ehdokas(id, etunimi, sukunimi);
		
		ArrayList<Ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.updateEhdokas(f);
		}
		
		request.setAttribute("ehdokkaat", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/ShowEhdokkaat.jsp");
		rd.forward(request, response);
	}
}