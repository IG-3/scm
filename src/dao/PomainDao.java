package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import model.pomain;
import util.DBUtil;

public class PomainDao {
	
	
	public List<pomain> check( int paytype) throws SQLException{
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			conn = DBUtil.getCon();
			String sql = "SELECT * ,v.name vname ,s.name sname from pomain p ,scmuser s,vender v where p.account=s.account and p.vendercode=v.vendercode and  paytype=?;";
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

}
