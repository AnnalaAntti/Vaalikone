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
    name = "LuoEhdokas",
    urlPatterns = {"/luoehdokas"}
)
public class LuoEhdokas extends HttpServlet {
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/vaalikone", "admin", "admin123");
	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		     throws IOException, ServletException {
			ArrayList<Ehdokas> list=null;
			if (dao.getConnection()) {
				
				dao.LuoEhdokas();
				dao.readAllEhdokas();
			}
			
			request.setAttribute("ehdokkaat", list);
			RequestDispatcher rd=request.getRequestDispatcher("/jsp/EhdokasYllapito.jsp");
			rd.forward(request, response);
		
	}
}