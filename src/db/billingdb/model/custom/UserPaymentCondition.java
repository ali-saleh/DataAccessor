package db.billingdb.model.custom;

import java.sql.Date;

import db.billingdb.model.custom.interfaces.HasDateLimit;

public class UserPaymentCondition extends BaseCondition implements HasDateLimit {
	private int city = 0;
	private int currencyId = 12; //Shekel
	private int partnerId = 0;
	private int salesmanId = 0;
	private Date startDate = null;
	private Date endDate = null;
	private double vatRate = 0;
	private boolean isDescending = false;

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getVatRate() {
		return vatRate;
	}

	public void setVatRate(double vatRate) {
		this.vatRate = vatRate;
	}

	public boolean isDescending() {
		return isDescending;
	}

	public void setDescending(boolean isDescending) {
		this.isDescending = isDescending;
	}
	
	@Override
	public UserPaymentCondition clone() {
		UserPaymentCondition c = new UserPaymentCondition();
		c.currencyId = currencyId;
		c.city = city;
		c.partnerId= partnerId;
		c.salesmanId = salesmanId;
		c.isDescending = isDescending;
		c.startDate = startDate;
		c.endDate = endDate;
		c.vatRate = vatRate;
		return c;
	}
	
	// <resultMap id="resultBlog" type="Blog">
	// 09.<id property="id" column="idBlog"/>
	// 10.<result property="name" column="blogName"/>
	// 11.<result property="url" column="url"/>
	// 12.<association property="author" column="idBlog" javaType="Author">
	// 13.<id property="id" column="idAuthor"/>
	// 14.<result property="name" column="authorName"/>
	// 15.<result property="email" column="email"/>
	// 16.</association>
}
