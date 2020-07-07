package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Product;
import model.Stockrecord;
import model.pomain;
import util.DBUtil;

public class CkQueryDao {
	
	
	
	public ArrayList<Product> selectArrayList (Map<String, Object>queryMap) throws SQLException{
		
		Connection conn=DBUtil.getCon();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			ArrayList<Product> products = new ArrayList<Product>();
			ArrayList<Object> params = new ArrayList<Object>();
			StringBuilder sql= new StringBuilder("SELECT * from product   where 1=1");
			
			Object id=queryMap.get("id");
			if(id!=null&& !id.equals("")) {
				sql.append(" and productcode =?");
				params.add(id);
				
			}
			Object name=queryMap.get("name");
			if(name !=null && !"".equals(name.toString().trim())) {
				sql.append(" and name like concat('%',?,'%')");
				params.add(name.toString().trim());
			}
			
			Object minNum=queryMap.get("minNum");
			if(minNum !=null) {
				
				sql.append(" and num>= ?");
				params.add(minNum);
			}
			
			Object maxNum=queryMap.get("maxNum");
			if(maxNum!=null) {
				sql.append(" and num<= ?");
				params.add(maxNum);
			}
			System.out.println(sql);
			ps=conn.prepareStatement(sql.toString());
			
			
			for(int i=0;i<params.size();i++) {
				System.out.println(params.get(i));
			    ps.setObject(i+1, params.get(i));
				
			}
			
			
			System.out.println(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				Product product=new Product();
				product.setProductCode(rs.getString("productcode"));
				product.setName(rs.getString("name"));
				product.setNum(rs.getInt("num"));
				product.setPoNum(rs.getInt("ponum"));
				product.setSoNum(rs.getInt("sonum"));
				
				products.add(product);
				
			}
			
			return products;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
		
	}
	
	
	public List<Stockrecord> sel(String productcode,int stocktype) throws SQLException{
		
		Connection conn=DBUtil.getCon();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			String sql = "select * from stockrecord where productcode=? and stocktype=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, productcode);
			ps.setInt(2, stocktype);
			rs = ps.executeQuery();
			List<Stockrecord> list = new ArrayList<Stockrecord>();
			while (rs.next()) {
						 
				
				String stocktime = rs.getString("stocktime");
				String ordercode = rs.getString("ordercode");
				String createuser = rs.getString("createuser");
				int stocknum = rs.getInt("stocknum");
				stocktype=rs.getInt("StockType");
				
			list.add(new Stockrecord(productcode, ordercode, stocknum, stocktime, createuser, stocktype));

    
			}
			return list;
			
			
			
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
	}
	
     public ArrayList<Product> check () throws SQLException{
		
		Connection conn=DBUtil.getCon();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			String sql = "select * from product ";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			ArrayList<Product> products = new ArrayList<Product>();
			
			while(rs.next()) {
				
				Product product=new Product();
				product.setProductCode(rs.getString("productcode"));
				product.setName(rs.getString("name"));
				product.setNum(rs.getInt("num"));
				product.setPoNum(rs.getInt("ponum"));
				product.setSoNum(rs.getInt("sonum"));
				
				products.add(product);
				
			}
			
			return products;
			
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
		

     }
     
     public void update(int originnum,int realnum,String description,String type,String productcode ) throws SQLException {
    	 
    	 Connection conn=DBUtil.getCon();
 		PreparedStatement ps=null;
 		
 		
 		String sql="INSERT into checkstock (OriginNum,realnum,description,type,ProductCode,stocktime) VALUES (?,?,?,?,?,now())";
    	 ps=conn.prepareStatement(sql);
    	 ps.setInt(1, originnum);
    	 ps.setInt(2, realnum);
    	 ps.setString(3, description);
    	 ps.setString(4, type);
    
    	 ps.setString(5, productcode);
    	
    	 ps.executeUpdate();
    	 
     }
     public void changekc(int num,String productcode) throws SQLException {
    	 
    	 Connection conn=DBUtil.getCon();
  		PreparedStatement ps=null;
  		
  		
  		String sql="update product set num=? where productcode=? ";
  		 ps=conn.prepareStatement(sql);
  		 ps.setInt(1, num);
  		 ps.setString(2, productcode);
  		 ps.execute();
    	 
     }
     
}
