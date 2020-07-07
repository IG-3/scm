package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/productServlet")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String page=request.getParameter("page");
		int currpage=1;
		if(page!=null) currpage=Integer.parseInt(page);
		
		ProductDao pd= new ProductDao();
		try {
		int total = pd.selectTotal();
		int pagesize=5;
			List<Product> list = pd.select(currpage,pagesize);
			request.setAttribute("list", list);
			request.setAttribute("total", total);
			request.setAttribute("pagesize", pagesize);
			request.setAttribute("currpage", currpage);
			request.getRequestDispatcher("gztm/ck/product.jsp").forward(request, response);
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
