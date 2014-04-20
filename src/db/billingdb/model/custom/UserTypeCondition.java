package db.billingdb.model.custom;

import java.sql.Date;

public class UserTypeCondition extends BaseCondition {
	private int partnerId;
	private int salesmanId;
	private Date startDate = null;
	private Date endDate = null;
	private int city = 0;

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

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}
}
