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
import dao.SomainDao;
import model.Soitem;

/**
 * Servlet implementation class outboundServlet2
 */
@WebServlet("/outboundServlet2")
public class outboundServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name =request.getParameter("name");
		
		BigDecimal id2=new BigDecimal(id);
		
		SomainDao somainDao =new SomainDao();
		try {
		     somainDao.change(name, id2);
		     Soitem somain = somainDao.selrecode(id2);
		     somainDao.add(somain.getProductCode(), id, somain.getNum(), somain.getStockTime(), somain.getStockUser());
			request.getRequestDispatcher("gztm/outbound.jsp").forward(request, response);
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
