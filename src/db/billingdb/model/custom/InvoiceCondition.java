package db.billingdb.model.custom;

import java.sql.Date;

import db.billingdb.model.custom.interfaces.HasDateLimit;

public class InvoiceCondition extends BaseCondition implements HasDateLimit {

	private int city = 0;
	private int userId = 0;
	private int currencyId;
	private int partnerId;
	private int salesmanId;
	private int invoiceState;
	private Date startDate = null;
	private Date endDate = null;
	private double vatRate = 0;
	private Boolean deleted = false;

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public int getInvoiceState() {
		return invoiceState;
	}

	public void setInvoiceState(int invoiceState) {
		this.invoiceState = invoiceState;
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

	public void setVatRate(double rate) {
		this.vatRate = rate;
	}

	public double getVatRate() {
		return this.vatRate;
	}

	@Override
	public InvoiceCondition clone() {
		InvoiceCondition c = new InvoiceCondition();
		c.city = city;
		c.userId = userId;
		c.currencyId = currencyId;
		c.partnerId = partnerId;
		c.salesmanId = salesmanId;
		c.deleted = deleted;
		c.invoiceState = invoiceState;
		c.startDate = startDate;
		c.endDate = endDate;
		c.vatRate = vatRate;

		return c;
	}
}
