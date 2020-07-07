package model;

import java.io.Serializable;

public class Category implements Serializable{
	
	private int cateGoryID;
	private String name;
	private String remark;
	
	public Category(int cateGoryID, String name, String remark) {
		super();
		this.cateGoryID = cateGoryID;
		this.name = name;
		this.remark = remark;
	}
	public Category() {
		super();
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	

}
