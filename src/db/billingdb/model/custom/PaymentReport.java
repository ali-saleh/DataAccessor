package db.billingdb.model.custom;

import java.sql.Date;

import db.billingdb.model.custom.info.ChequeInfo;

public class PaymentReport {
	private int paymentId;
	private String userNumber;
	private String userFullName;
	private Date paymentDate;
	private Integer[] invoices;
	private int amount;
	private ChequeInfo chequeInfo;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
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

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer[] getInvoiceIds() {
		return invoices;
	}

	public void setInvoices_string(String invoices_string) {
		if (invoices_string != null && !invoices_string.isEmpty()) {
			String[] invoiceIds = invoices_string.split(",");
			this.invoices = new Integer[invoiceIds.length];
			for (int i = 0; i < invoiceIds.length; i++) {
				this.invoices[i] = Integer.parseInt(invoiceIds[i]);
			}
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public ChequeInfo getChequeInfo() {
		return chequeInfo;
	}

	public void setChequeInfo(ChequeInfo chequeInfo) {
		this.chequeInfo = chequeInfo;
	}
}
