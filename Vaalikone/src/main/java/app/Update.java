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
		String k1=request.getParameter("k1");
		String k2=request.getParameter("k2");
		String k3=request.getParameter("k3");
		String k4=request.getParameter("k4");
		String k5=request.getParameter("k5");
		String k6=request.getParameter("k6");
		String k7=request.getParameter("k7");
		String k8=request.getParameter("k8");
		String k9=request.getParameter("k9");
		String k10=request.getParameter("k10");
		
		Ehdokas f=new Ehdokas(id, etunimi, sukunimi, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10);
		
		ArrayList<Ehdokas> list=null;
		if (dao.getConnection()) {
			list=dao.updateEhdokas(f);
		}
		
		request.setAttribute("ehdokkaat", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/Testi.jsp");
		rd.forward(request, response);
	}
}