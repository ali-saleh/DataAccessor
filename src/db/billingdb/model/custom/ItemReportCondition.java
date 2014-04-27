package db.billingdb.model.custom;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import db.billingdb.model.custom.interfaces.HasDateLimit;

public class ItemReportCondition extends BaseCondition implements HasDateLimit {
	private List<Integer> itemIds;
	private int userId;
	private int partnerId;
	private int salesmanId;
	private Date startDate = null;
	private Date endDate = null;
	private double vatRate = 0;
	private Boolean deleted = false;
	private int currencyId = 12; // Referring to Shekel
	private int city = 0;

	public List<Integer> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<Integer> itemIds) {
		this.itemIds = itemIds;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	@Override
	public ItemReportCondition clone() {
		ItemReportCondition c = new ItemReportCondition();
		c.city = city;
		c.currencyId = currencyId;
		c.deleted = deleted;
		c.itemIds = new ArrayList<Integer>();
		for (Integer i : itemIds) {
			c.itemIds.add(i);
		}
		c.userId = userId;
		c.partnerId = partnerId;
		c.salesmanId = salesmanId;
		c.startDate = startDate;
		c.endDate = endDate;
		c.vatRate = vatRate;

		return c;
	}
}
