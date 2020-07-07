package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Poitem implements Serializable {
	
	
	private BigDecimal poid;
	private String productCode;
	private float unitPrice;
	private int num;
	private String unitName;
	private float itemPrice;
	private String pname;
	private String stockTime;
	private String stockUser;
	
	
	
	public Poitem(BigDecimal poid, String productCode, int num, String stockTime, String stockUser) {
		super();
		this.poid = poid;
		this.productCode = productCode;
		this.num = num;
		this.stockTime = stockTime;
		this.stockUser = stockUser;
	}
	public Poitem(BigDecimal poid, String productCode, float unitPrice, int num, String unitName, float itemPrice,
			String pname) {
		super();
		this.poid = poid;
		this.productCode = productCode;
		this.unitPrice = unitPrice;
		this.num = num;
		this.unitName = unitName;
		this.itemPrice = itemPrice;
		this.pname = pname;
	}
	public Poitem() {
		super();
	}
	public BigDecimal getPoid() {
		return poid;
	}
	public void setPoid(BigDecimal poid) {
		this.poid = poid;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getStockTime() {
		return stockTime;
	}
	public void setStockTime(String stockTime) {
		this.stockTime = stockTime;
	}
	public String getStockUser() {
		return stockUser;
	}
	public void setStockUser(String stockUser) {
		this.stockUser = stockUser;
	}
	
	
	
	

}
