package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CkQueryDao;
import model.Stockrecord;

/**
 * Servlet implementation class ckchangeServlet
 */
@WebServlet("/ckchangeServlet")
public class ckchangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		CkQueryDao ckQueryDao=new CkQueryDao();
		
		try {
			List<Stockrecord> list = ckQueryDao.sel(id, 1);
			request.setAttribute("list", list);
			List<Stockrecord> list2 = ckQueryDao.sel(id, 2);
			request.setAttribute("list2", list2);
			request.getRequestDispatcher("gztm/ck/rkinfo.jsp").forward(request, response);
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
