package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ProductService;

/**
 * Servlet implementation class productChangeServlet2
 */
@WebServlet("/productChangeServlet2")
public class productChangeServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String rek = request.getParameter("rek");
		String pric = request.getParameter("pric");
		String unitname = request.getParameter("unitname");
		
		
		String cname = request.getParameter("first");
	
		ProductService pse=new ProductService();
		try {
			pse.update(id, Integer.parseInt(cname), name, unitname,Float.parseFloat(pric), rek);
			
			request.getRequestDispatcher("productServlet").forward(request, response);
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
