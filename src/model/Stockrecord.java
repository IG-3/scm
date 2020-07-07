package model;

import java.io.Serializable;

public class Stockrecord implements Serializable{
	
	private int stockID;
	private String productCode;
	private String orderCode;
	private int stockNum;
	private String stockTime;
	private String createUser;
	private int stockType;
	
	public Stockrecord(int stockID, String productCode, String orderCode, int stockNum, String stockTime,
			String createUser) {
		super();
		this.stockID = stockID;
		this.productCode = productCode;
		this.orderCode = orderCode;
		this.stockNum = stockNum;
		this.stockTime = stockTime;
		this.createUser = createUser;
	}
	
	
	public Stockrecord(String productCode, String orderCode, int stockNum, String stockTime, String createUser,
			int stockType) {
		super();
		this.productCode = productCode;
		this.orderCode = orderCode;
		this.stockNum = stockNum;
		this.stockTime = stockTime;
		this.createUser = createUser;
		this.stockType = stockType;
	}


	public Stockrecord() {
		super();
	}
	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	public String getStockTime() {
		return stockTime;
	}
	public void setStockTime(String stockTime) {
		this.stockTime = stockTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public int getStockType() {
		return stockType;
	}


	public void setStockType(int stockType) {
		this.stockType = stockType;
	}
	
	
	

}
