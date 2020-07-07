package servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CateGoryDao;
import model.Product;

/**
 * Servlet implementation class categoryDeleteServlet
 */
@WebServlet("/categoryDeleteServlet")
public class categoryDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		CateGoryDao cate = new CateGoryDao();
		
		try {
			boolean flag = cate.sel(Integer.parseInt(id));
			
			System.out.println(flag);
			if(flag==false) {
				cate.del(Integer.parseInt(id));
				
				
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
