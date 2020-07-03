package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.format.DecimalStyle;

public class pomain implements Serializable {
	
	private BigDecimal poid;
	private String venderCode;
	private String account;
	private String createTime;
	private float tipFee;
	private float productTotal;
	private float poTotal;
	private int payType;
	private float prePayFee;
	private int status;
	private String remark;
	private String stockTime;
	private String stockUser;
	private String payTime;
	private String payUser;
	private String prePayTime;
	private String prePayUser;
	private String endTime;
	private String endUser;
	private String vname;
	private String sname;
	
	public pomain(BigDecimal poid, String venderCode, String account, String createTime, float tipFee,
			float productTotal, float poTotal, int payType, float prePayFee, int status, String remark,
			String stockTime, String stockUser, String payTime, String payUser, String prePayTime, String prePayUser,
			String endTime, String endUser) {
		super();
		this.poid = poid;
		this.venderCode = venderCode;
		this.account = account;
		this.createTime = createTime;
		this.tipFee = tipFee;
		this.productTotal = productTotal;
		this.poTotal = poTotal;
		this.payType = payType;
		this.prePayFee = prePayFee;
		this.status = status;
		this.remark = remark;
		this.stockTime = stockTime;
		this.stockUser = stockUser;
		this.payTime = payTime;
		this.payUser = payUser;
		this.prePayTime = prePayTime;
		this.prePayUser = prePayUser;
		this.endTime = endTime;
		this.endUser = endUser;
	}
	

	public pomain(BigDecimal poid, String venderCode, String account, String createTime, float tipFee,
			float productTotal, float poTotal, int payType, float prePayFee, int status,String vname,String sname) {
		super();
		this.poid = poid;
		this.venderCode = venderCode;
		this.account = account;
		this.createTime = createTime;
		this.tipFee = tipFee;
		this.productTotal = productTotal;
		this.poTotal = poTotal;
		this.payType = payType;
		this.prePayFee = prePayFee;
		this.status = status;
		this.vname=vname;
		this.sname=sname;
	}


	public pomain() {
		super();
	}

	public BigDecimal getPoid() {
		return poid;
	}

	public void setPoid(BigDecimal poid) {
		this.poid = poid;
	}

	public String getVenderCode() {
		return venderCode;
	}

	public void setVenderCode(String venderCode) {
		this.venderCode = venderCode;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public float getTipFee() {
		return tipFee;
	}

	public void setTipFee(float tipFee) {
		this.tipFee = tipFee;
	}

	public float getProductTotal() {
		return productTotal;
	}

	public void setProductTotal(float productTotal) {
		this.productTotal = productTotal;
	}

	public float getPoTotal() {
		return poTotal;
	}

	public void setPoTotal(float poTotal) {
		this.poTotal = poTotal;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public float getPrePayFee() {
		return prePayFee;
	}

	public void setPrePayFee(float prePayFee) {
		this.prePayFee = prePayFee;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPayUser() {
		return payUser;
	}

	public void setPayUser(String payUser) {
		this.payUser = payUser;
	}

	public String getPrePayTime() {
		return prePayTime;
	}

	public void setPrePayTime(String prePayTime) {
		this.prePayTime = prePayTime;
	}

	public String getPrePayUser() {
		return prePayUser;
	}

	public void setPrePayUser(String prePayUser) {
		this.prePayUser = prePayUser;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndUser() {
		return endUser;
	}

	public void setEndUser(String endUser) {
		this.endUser = endUser;
	}


	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	

}
