package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;
import model.Product;
import util.DBUtil;

public class ProductDao {
	
	
	public List<Product> select(int currpage,int pagesize) throws SQLException{
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "SELECT * ,c.name cname from product p,category c where p.CategoryID=c.CategoryID limit ?,?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (currpage-1)*pagesize);
			ps.setInt(2, pagesize);
		
			rs = ps.executeQuery();
			List<Product> list = new ArrayList<Product>();
			while (rs.next()) {
				
				Product product=new Product();
				product.setProductCode(rs.getString("ProductCode"));
				product.setName(rs.getString("name"));
				product.setUnitName(rs.getString("unitname"));
				product.setCname(rs.getString("cname"));
				product.setCreateDate(rs.getString("createdate"));
				product.setPrice(rs.getFloat("price"));
				product.setRemark(rs.getString("remark"));
				
				list.add(product);

				


			}
			return list;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
	}
	
	public List<Category> selname() throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "SELECT c.name cname ,categoryid from category c  ";
			ps = conn.prepareStatement(sql);
		
			rs = ps.executeQuery();
			List<Category> list = new ArrayList<Category>();
			while (rs.next()) {
				
				Category cate= new Category();
				cate.setName(rs.getString("cname"));
				cate.setCateGoryID(rs.getInt("categoryid"));
				list.add(cate);

				


			}
			return list;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
		
	}
	public void insert(String ProductCode,int CategoryID,String name,String UnitName,float Price,String Remark) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "insert into product (productcode,CategoryID,name,unitname,price,remark,createDate) values(?,?,?,?,?,?,now())";
			ps = conn.prepareStatement(sql);
			ps.setString(1, ProductCode);
			ps.setInt(2, CategoryID);
			ps.setString(3, name);
			ps.setString(4, UnitName);
			ps.setFloat(5, Price);
			ps.setString(6, Remark);
			
			ps.execute();
			
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}

	
	public int check(String ProductCode) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			conn = DBUtil.getCon();
			String sql="select * from product where ProductCode=? ";
			ps=conn.prepareStatement(sql);
			ps.setString(1, ProductCode);
			rs=ps.executeQuery();
			
			int a =0;
			if(rs.next()) {
				
				a=1;
			}
			
			return a;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
	}
	public void update(String ProductCode,int CategoryID,String name,String UnitName,float Price,String Remark) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = DBUtil.getCon();
			String sql="update product set name=? ,categoryid=?,unitname=?,price=?,remark=?,createdate=now() where productcode=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, CategoryID);
			ps.setString(3, UnitName);
			ps.setFloat(4, Price);
			ps.setString(5, Remark);
			ps.setString(6, ProductCode);
			ps.executeUpdate();
		} finally {
			DBUtil.close(null, ps, conn);
		}
		
	}
	
	public void del(String productcode) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = DBUtil.getCon();
			String sql="delete from  product where productcode=?" ;
			ps=conn.prepareStatement(sql);
			ps.setString(1, productcode);
			
			ps.executeUpdate();
		} finally {
			DBUtil.close(null, ps, conn);
		}
		
		
	}
	
  public boolean sel(String id) throws SQLException {
    	  
    	  Connection conn=null;
  		PreparedStatement ps=null;
  		ResultSet rs=null;
  	    boolean flag = false;
  		try {
			conn = DBUtil.getCon();
			String sql="SELECT * from product p1 INNER JOIN (poitem p2,soitem s)on (p1.ProductCode=p2.ProductCode or p1.ProductCode=s.ProductCode) WHERE p1.ProductCode=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			
			rs=ps.executeQuery();
			
			
			if(rs.next()) {
				
				flag=true;
				
			}
			
			return flag;
		} finally {
			DBUtil.close(null, ps, conn);
		}
    	  
      }
  
  public int selectTotal() throws SQLException {
	  
	  Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "select ceil(count(*)/5) total from product";
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				
				int total =rs.getInt("total");
				return total;
				
			}
			return 0;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
  }

	
}