package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;
import model.Product;
import model.pomain;
import sun.nio.ch.SelChImpl;
import util.DBUtil;

public class CateGoryDao {
	
	
	
	public  List<Category> check() throws SQLException{
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "select * from category";
			ps = conn.prepareStatement(sql);
		
			rs = ps.executeQuery();
			List<Category> list = new ArrayList<Category>();
			while (rs.next()) {
				
				int CategoryID = rs.getInt("CategoryID");
				String Name=rs.getString("name");
				String Remark=rs.getString("Remark");
				
				list.add(new Category(CategoryID, Name, Remark));

				


			}
			return list;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
	}
	
	public void add(String name,String dric) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		
		
		try {
			conn = DBUtil.getCon();
			
			String sql="insert into category (name,remark) values(?,?)";
			ps=conn.prepareStatement(sql);
		
			ps.setString(1, name);
			ps.setString(2, dric);
			ps.execute();
		} finally {
		
		}
		
	}
	
	
	public void update(int id,String name,String rek) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn = DBUtil.getCon();
			
			
			String sql="update category set name=? , remark=? where categoryid=?  ";
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, rek);
			ps.setInt(3, id);
			ps.execute();
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}
	
      public boolean sel(int id) throws SQLException {
    	  
    	  Connection conn=null;
  		PreparedStatement ps=null;
  		ResultSet rs=null;
  	    boolean flag = false;
  		try {
			conn = DBUtil.getCon();
			String sql="SELECT * from category ,product WHERE category.CategoryID=product.CategoryID and category.CategoryID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			rs=ps.executeQuery();
			
			
			if(rs.next()) {
				
				flag=true;
				
			}
			
			return flag;
		} finally {
			DBUtil.close(null, ps, conn);
		}
    	  
      }
      
      public void del(int id) throws SQLException {
    	  
    	  Connection conn=null;
    		PreparedStatement ps=null;
    		
    		
    		try {
				conn = DBUtil.getCon();
				String sql="delete from category where categoryid=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, id);
				ps.execute();
						
				
			} finally {
				DBUtil.close(null, ps, conn);
			}
    	  
      }

}
