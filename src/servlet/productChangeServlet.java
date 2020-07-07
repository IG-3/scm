package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Category;
import service.ProductService;

/**
 * Servlet implementation class productChangeServlet
 */
@WebServlet("/productChangeServlet")
public class productChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String rek = request.getParameter("rek");
		String date=request.getParameter("date");
		String unitname=request.getParameter("unitname");
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("rek", rek);
		request.setAttribute("date", date);
		request.setAttribute("unitname", unitname);
		request.setAttribute("pric", 0);
		ProductService pse=new ProductService();
		
		try {
			List<Category> list = pse.selname();
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("gztm/ck/changeproduct.jsp").forward(request, response);
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
