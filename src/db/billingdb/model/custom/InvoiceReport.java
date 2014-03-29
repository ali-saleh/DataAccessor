package db.billingdb.model.custom;

import java.util.Date;

public class InvoiceReport {
	private int userId;
	private int invoiceId;
	private String userFullName;
	private String userNumber;
	private Date createDate;
	private int currency;
	private double carriedBalance;
	private double balance;
	private int status;
	private double total;
	private Integer[] payments;

	public void setPaymentString(String paymentString) {
		if (paymentString != null && !paymentString.isEmpty()) {
			String[] payments = paymentString.split(",");
			this.payments = new Integer[payments.length];
			for (int i = 0; i < payments.length; i++) {
				this.payments[i] = Integer.parseInt(payments[i]);
			}
		}
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getCurrency() {
		return currency;
	}

	public void setCurrency(int currency) {
		this.currency = currency;
	}

	public double getCarriedBalance() {
		return carriedBalance;
	}

	public void setCarriedBalance(double carriedBalance) {
		this.carriedBalance = carriedBalance;
	}

	public double getBalance() {
		return balance;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Integer[] getPayments() {
		return this.payments;
	}
}
