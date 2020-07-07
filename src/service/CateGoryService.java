package service;

import java.sql.SQLException;
import java.util.List;

import dao.CateGoryDao;
import model.Category;

public class CateGoryService {
	
	
	public  List<Category> check() throws SQLException{
		
		CateGoryDao cateGoryDao=new CateGoryDao();
		
		List<Category> list = cateGoryDao.check();
		
		return list;
		
	}
	
	public void add(String name,String dric) throws SQLException {
		
		
		CateGoryDao cateGoryDao=new CateGoryDao();
		cateGoryDao.add( name, dric);
	}
	
	public void update(int id ,String name,String rek) throws SQLException {

		CateGoryDao cateGoryDao=new CateGoryDao();
		cateGoryDao.update(id, name, rek);
		
		
	}

}
