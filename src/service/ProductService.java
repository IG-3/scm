package service;

import java.sql.SQLException;
import java.util.List;

import dao.ProductDao;
import model.Category;

public class ProductService {
	
	
	ProductDao pdo=new ProductDao();
	
	
	public List<Category> selname() throws SQLException{
		
		List<Category> list = pdo.selname();
		
		return list;
		
	}
	
	
	public void insert(String ProductCode,int CategoryID,String name,String UnitName,float Price,String Remark) throws SQLException {
		
		pdo.insert(ProductCode, CategoryID, name, UnitName, Price, Remark);
		
		
	}
	
	public int check(String ProductCode) throws SQLException {
		
		int a=pdo.check(ProductCode);
		return a;
	}
	public void update(String ProductCode,int CategoryID,String name,String UnitName,float Price,String Remark) throws SQLException {
		pdo.update(ProductCode, CategoryID, name, UnitName, Price, Remark);
	}

}
