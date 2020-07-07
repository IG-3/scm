package model;

import java.io.Serializable;

public class Product implements Serializable {
	private String productCode;
	private int cateGoryID;
	private String name;
	private String unitName;
	private float price;
	private String createDate;
	private String remark;
	private int num;
	private int poNum;
	private int soNum;
	private String cname;
	public Product(String productCode, int cateGoryID, String name, String unitName, float price, String createDate,
			String remark, int num, int poNum, int soNum) {
		super();
		this.productCode = productCode;
		this.cateGoryID = cateGoryID;
		this.name = name;
		this.unitName = unitName;
		this.price = price;
		this.createDate = createDate;
		this.remark = remark;
		this.num = num;
		this.poNum = poNum;
		this.soNum = soNum;
	}
	public Product(String productCode, String name, int num, int poNum, int soNum) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.num = num;
		this.poNum = poNum;
		this.soNum = soNum;
	}
	public Product() {
		super();
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getCateGoryID() {
		return cateGoryID;
	}
	public void setCateGoryID(int cateGoryID) {
		this.cateGoryID = cateGoryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPoNum() {
		return poNum;
	}
	public void setPoNum(int poNum) {
		this.poNum = poNum;
	}
	public int getSoNum() {
		return soNum;
	}
	public void setSoNum(int soNum) {
		this.soNum = soNum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	

}
