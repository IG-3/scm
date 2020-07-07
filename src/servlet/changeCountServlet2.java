package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CkQueryDao;

/**
 * Servlet implementation class changeCountServlet2
 */
@WebServlet("/changeCountServlet2")
public class changeCountServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num=request.getParameter("num");
		String type = request.getParameter("first");
		System.out.println(type);
		String yy = request.getParameter("yy");
		
		Object id = request.getSession().getAttribute("id");
		String id2 = String.valueOf(id);
		Object num2 = request.getSession().getAttribute("num");
		
		int flnum=0;
		int onum = Integer.parseInt(String.valueOf(num2));
		System.out.println(onum);
		System.out.println(num);
		if(type.equals("损耗")) {
			flnum=onum-Integer.valueOf(num);
		}else {
			flnum=onum+Integer.valueOf(num);
		}
		
		
		CkQueryDao cQueryDao=new CkQueryDao();
		try {
			System.out.println(flnum);
			System.out.println(id2);
			cQueryDao.update(onum, flnum, yy, type, id2);
			cQueryDao.changekc(flnum, id2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("ckCheckServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
