package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PomainDao;
import model.pomain;

/**
 * Servlet implementation class InboundServlet3
 */
@WebServlet("/inboundServlet3")
public class inboundServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PomainDao pomainDao=new PomainDao();
		  try {
			List<pomain> list = pomainDao.check(3);
			
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("gztm/inbound.jsp").forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
