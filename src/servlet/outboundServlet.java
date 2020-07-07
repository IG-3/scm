package servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SomainDao;
import model.Somain;

/**
 * Servlet implementation class outboundServlet
 */
@WebServlet("/outboundServlet")
public class outboundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("x");
		System.out.println(id);
		
		
		SomainDao somainDao=new SomainDao();
		try {
			List<Somain> list = somainDao.check(Integer.parseInt(id));
			request.setAttribute("list", list);
			request.getRequestDispatcher("gztm/outbound.jsp").forward(request, response);
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
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
