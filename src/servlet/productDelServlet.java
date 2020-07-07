package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CateGoryDao;
import dao.ProductDao;

/**
 * Servlet implementation class productDelServlet
 */
@WebServlet("/productDelServlet")
public class productDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String id = request.getParameter("id");
	
	
	ProductDao pdo=new ProductDao();
	
	try {
		boolean flag = pdo.sel(id);
		
		System.out.println(flag);
		if(flag==false) {
		
			pdo.del(id);
			
		}
		
		request.getRequestDispatcher("productServlet").forward(request, response);
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
