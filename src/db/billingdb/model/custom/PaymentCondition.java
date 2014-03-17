package db.billingdb.model.custom;

import java.sql.Date;

import db.billingdb.model.custom.interfaces.HasDateLimit;

public class PaymentCondition extends BaseCondition implements HasDateLimit {
	private int userId = 0;
	private Date startDate = null;
	private Date endDate = null;
	private double vatRate = 0;
	private Boolean deleted = false;
	private int paymentMethod = 10; // Cash <1 for Cheque>
	private int currencyId = 12; // Referring to Shekel
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

	public double getVatRate() {
		return vatRate;
	}

	public void setVatRate(double vatRate) {
		this.vatRate = vatRate;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
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
	
	@Override
	public PaymentCondition clone() {
		PaymentCondition c = new PaymentCondition();
		c.userId = userId;
		c.currencyId = currencyId;
		c.city = city;
		c.deleted = deleted;
		c.paymentMethod = paymentMethod;
		c.startDate = startDate;
		c.endDate = endDate;
		c.vatRate = vatRate;
		c.itemId = itemId;
		
		return c;
	}
}
