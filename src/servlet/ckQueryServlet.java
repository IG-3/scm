package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CkQueryDao;
import model.Product;

/**
 * Servlet implementation class ckQueryServlet
 */
@WebServlet("/ckQueryServlet")
public class ckQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 Map<String, Object> queryMap = new HashMap<String, Object>();
		 String idstr=request.getParameter("id");
		 String name=request.getParameter("name");
		 String minNum=request.getParameter("minNum");
		 String maxNum=request.getParameter("maxNum");
		 
		 System.out.println(idstr);
		 System.out.println(name);
		 System.out.println(minNum);
		 System.out.println(maxNum);
		 
		 if(idstr != null && !idstr.equals("") && idstr.matches("\\d*")) {
				queryMap.put("id", idstr);
			} 
			if(name != null && !name.matches("\\s+")) {
				queryMap.put("name", name);
			}
			if(minNum != null &&!minNum.equals("") && (minNum.matches("\\d*") )) {
				queryMap.put("minNum", minNum);
			}
			
			if(maxNum != null && !maxNum.equals("")&& (maxNum.matches("\\d*") )) {
				queryMap.put("maxNum", maxNum);
			}
			
		CkQueryDao ckQueryDao=new CkQueryDao();
		
		
		try {
			ArrayList<Product> products = ckQueryDao.selectArrayList(queryMap);
			System.out.println(products.toString());
			
			request.setAttribute("products", products);
			
			request.getRequestDispatcher("gztm/ck/ckquery.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
