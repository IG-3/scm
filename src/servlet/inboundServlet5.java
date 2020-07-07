package servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PomainDao;
import model.Poitem;

/**
 * Servlet implementation class inboundServlet5
 */
@WebServlet("/inboundServlet5")
public class inboundServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("sd");
		BigDecimal id2=new BigDecimal(id);
		PomainDao pomainDao=new PomainDao();
		try {
			Poitem poitem = pomainDao.sel(id2);
			request.setAttribute("poitem", poitem);
			request.getRequestDispatcher("gztm/info.jsp").forward(request, response);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
