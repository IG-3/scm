package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import model.Poitem;
import model.pomain;
import util.DBUtil;

public class PomainDao {
	
	
	public List<pomain> check( int paytype) throws SQLException{
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "SELECT * ,v.name vname ,s.name sname from pomain p ,scmuser s,vender v where p.account=s.account and p.vendercode=v.vendercode and  paytype=?  and p.status!=3;";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, paytype);
			rs = ps.executeQuery();
			List<pomain> list = new ArrayList<pomain>();
			while (rs.next()) {

				BigDecimal poid = rs.getBigDecimal("poid");
				String createtime = rs.getString("createTime");
				String vandercode = rs.getString("vendercode");
				String account = rs.getString("account");
				float tipfee = rs.getFloat("tipfee");
				float producttotal = rs.getFloat("producttotal");
				float pototal = rs.getFloat("pototal");
				int paytypes = rs.getInt("paytype");
				float prepayfee = rs.getFloat("prepayfee");
				int status = rs.getInt("status");
				String vname=rs.getString("vname");
				String sname=rs.getString("sname");

     list.add(new pomain(poid, vandercode, account, createtime, tipfee, producttotal, pototal, paytypes,
						prepayfee, status,vname,sname));

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
			
			String sql="update pomain set status=3,  stocktime=now()  , stockuser=? where poid=? ";
			ps=conn.prepareStatement(sql);
		    
			
			ps.setString(1, name);
			ps.setBigDecimal(2, id);
			ps.execute();
		} finally {
			DBUtil.close(null, ps, conn);
		}
	}
	
	public  Poitem sel(BigDecimal id) throws SQLException {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
	
			try {
				conn = DBUtil.getCon();
				String sql = "SELECT  *,p2.`Name` pname FROM poitem p1 , product p2 where  p1.ProductCode=p2.ProductCode and poid =?";
				ps = conn.prepareStatement(sql);
				ps.setBigDecimal(1, id);
				rs=ps.executeQuery();
				
				Poitem poitem=null;
				if(rs.next()) {
					BigDecimal poid = rs.getBigDecimal("poid");
					String productcode = rs.getString("productcode");
					float unitprice = rs.getFloat("unitprice");
					int num = rs.getInt("num");
					String unitname = rs.getString("unitname");
					float itemprice = rs.getFloat("itemprice");
					String pname = rs.getString("pname");
					poitem=new Poitem(poid, productcode, unitprice, num, unitname, itemprice, pname);
					
				}
				return poitem;
				
			} finally {
				DBUtil.close(rs, ps, conn);
			}
		
		
		
	}
	
	public Poitem selrecode(BigDecimal id) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			conn = DBUtil.getCon();
			String sql="SELECT  p2.ProductCode,p1.POID ,p2.Num ,p1.StockTime,p1.StockUser from pomain p1,poitem p2 WHERE p1.POID= p2.poid  and p1.POID=?";
			ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, id);
			rs=ps.executeQuery();
			
			Poitem poitem=null;
			if(rs.next()) {
				BigDecimal poid = rs.getBigDecimal("poid");
				String productcode = rs.getString("productcode");
				
				int num = rs.getInt("num");
				String stockTime=rs.getString("stockTime");
				String stockUser=rs.getString("stockuser");
			
				poitem=new Poitem(poid, productcode, num, stockTime, stockUser);
				
			}
			return poitem;
			
		} finally {
		DBUtil.close(rs, ps, conn);
		}
		
		
	}
	
	public void add(String ProductCode,String poid ,int num,String stocktime,String createuser) throws SQLException {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn = DBUtil.getCon();
			String sql="insert into stockrecord (productcode,ordercode,stocknum,stocktype,stocktime,createuser) values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, ProductCode);
			ps.setString(2,poid );
			ps.setInt(3, num);
			ps.setInt(4, 1);
			ps.setString(5, stocktime);
			ps.setString(6, createuser);
			
			ps.execute();
			
		} finally {
			
		}
	}

}
