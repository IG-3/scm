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
 * Servlet implementation class categoryChangeServlet2
 */
@WebServlet("/categoryChangeServlet2")
public class categoryChangeServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String rek = request.getParameter("dric");
		System.out.println(id);
		System.out.println(name);
		CateGoryService cs=new CateGoryService();
		try {
			cs.update(Integer.parseInt(id), name, rek);
		} catch (NumberFormatException | SQLException e) {
		
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("categoryServlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
