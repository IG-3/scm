package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import service.ProductService;

/**
 * Servlet implementation class productAddServlet2
 */
@WebServlet("/productAddServlet2")
public class productAddServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static Logger log=Logger.getLogger(productAddServlet2.class);
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cateid = request.getParameter("cateid");
		String name = request.getParameter("name");
		String unitname = request.getParameter("unitname");
		String cname = request.getParameter("first");
		String pric=request.getParameter("pric");
		String dric = request.getParameter("dric");
		
		System.out.println(cname);
		
		ProductService pse=new ProductService();
		
		try {
			
			int a=pse.check(cateid);
			if(a==0) {
				pse.insert(cateid, Integer.parseInt(cname), name, unitname, Float.parseFloat(pric), dric);
				log.info("产品添加成功日志");
			}else {
				log.info("产品添加失败日志");
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
