package db.billingdb.model.custom;

import java.sql.Date;

import db.billingdb.model.custom.interfaces.HasDateLimit;

public class InvoiceCondition extends BaseCondition implements HasDateLimit {
	private int userId = 0;
	private Date startDate = null;
	private Date endDate = null;
	private double vatRate = 0;
	private Boolean deleted = false;
	private int itemId = 0;
	private int city = 0;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public void setVatRate(double rate) {
		this.vatRate = rate;
	}

	public double getVatRate() {
		return this.vatRate;
	}
	
	@Override
	public InvoiceCondition clone() {
		InvoiceCondition c = new InvoiceCondition();
		c.userId = userId;
		c.city = city;
		c.deleted = deleted;
		c.itemId = itemId;
		c.startDate = startDate;
		c.endDate = endDate;
		c.vatRate = vatRate;
		
		return c;
	}
}
