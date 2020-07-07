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
 * Servlet implementation class inboundServlet4
 */
@WebServlet("/inboundServlet4")
public class inboundServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String name =request.getParameter("name");
		
		BigDecimal id2=new BigDecimal(id);
		
		PomainDao dao = new PomainDao();
		try {
			dao.change(name, id2);
			
			Poitem poitem = dao.selrecode(id2);
			dao.add(poitem.getProductCode(), id, poitem.getNum(), poitem.getStockTime(), poitem.getStockUser());
			
			request.getRequestDispatcher("gztm/inbound.jsp").forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
