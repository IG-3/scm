package service;

import java.math.BigDecimal;
import java.sql.SQLException;

import dao.SomainDao;
import model.Soitem;
import model.Somain;

public class SoitemService {
	
	
	SomainDao somainDao =new SomainDao();
	
	public Soitem sel(BigDecimal id) throws SQLException {
		
		Soitem soitem=somainDao.sel(id);
		
		return soitem;
	}

}
