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
import data.Kysymykset;

/**
 * Servlet implementation class NaytaKysymykset
 */
@WebServlet("/naytakysymykset")
public class NaytaKysymykset extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao = null;

	@Override
	public void init() {
		dao = new Dao("jdbc:mysql://localhost:3306/vaalikone", "admin", "admin123");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NaytaKysymykset() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Kysymykset> list = null;
		if (dao.getConnection()) {
			list = dao.readAllKysymykset();
		} else {
			System.out.println("No connection to database");
		}
		request.setAttribute("Kysymykset", list);

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/KysymyksetShow.jsp");
		rd.forward(request, response);
	}
}