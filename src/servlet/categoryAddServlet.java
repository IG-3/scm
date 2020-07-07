package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CateGoryService;

/**
 * Servlet implementation class categoryAddServlet
 */
@WebServlet("/categoryAddServlet")
public class categoryAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cateid = request.getParameter("cateid");
		String name = request.getParameter("name");
		String dric=request.getParameter("dric");
		
		CateGoryService cate = new CateGoryService();
		try {
			cate.add( name, dric);
			request.getRequestDispatcher("categoryServlet").forward(request, response);
		} catch (NumberFormatException | SQLException e) {
			
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
