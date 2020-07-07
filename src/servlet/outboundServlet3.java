package servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Soitem;
import service.SoitemService;

/**
 * Servlet implementation class outboundServlet3
 */
@WebServlet("/outboundServlet3")
public class outboundServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SoitemService soitemService=new SoitemService();
		
		String id = request.getParameter("sd");
		BigDecimal id2=new BigDecimal(id);
		try {
			Soitem soitem = soitemService.sel(id2);
			
			request.setAttribute("soitem", soitem);
			request.getRequestDispatcher("gztm/info2.jsp").forward(request, response);
			
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
