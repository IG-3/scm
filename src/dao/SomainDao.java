package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Poitem;
import model.Soitem;
import model.Somain;
import util.DBUtil;








public class SomainDao {
	
	public List<Somain> check( int paytype) throws SQLException{
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			conn = DBUtil.getCon();
			String sql="SELECT * ,c.name cname ,s.name sname from somain p ,scmuser s,customer c where p.account=s.account and p.CustomerCode=c.CustomerCode and  paytype=?  and p.status!=3;";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, paytype);
			rs=ps.executeQuery();
			
			List<Somain> list = new ArrayList<Somain>();
			while(rs.next()) {
				
				BigDecimal soid = rs.getBigDecimal("soid");
				String customercode = rs.getString("customercode");
				String account = rs.getString("account");
				String createtime = rs.getString("createtime");
				float tipfee = rs.getFloat("tipfee");
				float producttotal = rs.getFloat("producttotal");
				float pototal = rs.getFloat("pototal");
				float prepayfee = rs.getFloat("prepayfee");
				int status = rs.getInt("status");
				String cname = rs.getString("cname");
				String sname = rs.getString("sname");
				
			list.add(new Somain(soid, createtime, tipfee, producttotal, pototal, paytype, prepayfee, status, cname, sname))	;
				
			}
			return list;
		} finally {
			DBUtil.close(rs, ps, conn);
		}
		
		
	}
	public void change(String name,BigDecimal id) throws SQLException {
		Connection conn=null;
		PreparedStatement ps=null;
		
		
		try {
			conn = DBUtil.getCon();
			
			String sql="update somain set status=3,  stocktime=now()  , stockuser=? where soid=? ";
			ps=conn.prepareStatement(sql);
		    
			
			ps.setString(1, name);
			ps.setBigDecimal(2, id);
			ps.execute();
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}
	
	public  Soitem sel(BigDecimal id) throws SQLException {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
	
			try {
				conn = DBUtil.getCon();
				String sql = "SELECT  *,p2.`Name` pname FROM soitem s1 , product p2 where  s1.ProductCode=p2.ProductCode and soid =?";
				ps = conn.prepareStatement(sql);
				ps.setBigDecimal(1, id);
				rs=ps.executeQuery();
				
				Soitem soitem=null;
				if(rs.next()) {
					BigDecimal soid=rs.getBigDecimal("soid");
					String productcode = rs.getString("productcode");
					String pname = rs.getString("pname");
					String unitname = rs.getString("unitname");
					int num = rs.getInt("num");
					float unitprice = rs.getFloat("unitprice");
					
					
					float itemprice = rs.getFloat("itemprice");
					
				soitem=new Soitem(productcode, unitprice, num, unitname, itemprice, pname,soid);
					
				}
				return soitem;
				
			} finally {
				DBUtil.close(rs, ps, conn);
			}
		
		
		
	}
	

	public Soitem selrecode(BigDecimal id) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			conn = DBUtil.getCon();
			String sql="SELECT  s2.ProductCode,s1.sOID ,s2.Num ,s1.StockTime,s1.StockUser from somain s1,soitem s2 WHERE s1.sOID= s2.soid  and s1.sOID=?";
			ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, id);
			rs=ps.executeQuery();
			
			Soitem soitem=null;
			if(rs.next()) {
				BigDecimal soid = rs.getBigDecimal("soid");
				String productcode = rs.getString("productcode");
				
				int num = rs.getInt("num");
				String stockTime=rs.getString("stockTime");
				String stockUser=rs.getString("stockuser");
			
		soitem=new Soitem(soid, productcode, num, stockTime, stockUser);
				
			}
			return soitem;
			
		} finally {
		DBUtil.close(rs, ps, conn);
		}
		
	

}
public void add(String ProductCode,String soid ,int num,String stocktime,String createuser) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn = DBUtil.getCon();
			String sql="insert into stockrecord (productcode,ordercode,stocknum,stocktype,stocktime,createuser) values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, ProductCode);
			ps.setString(2,soid );
			ps.setInt(3, num);
			ps.setInt(4, 2);
			ps.setString(5, stocktime);
			ps.setString(6, createuser);
			
			ps.execute();
			
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}
	
}
