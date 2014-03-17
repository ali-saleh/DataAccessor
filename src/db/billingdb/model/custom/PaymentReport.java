package db.billingdb.model.custom;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import db.billingdb.model.custom.info.ChequeInfo;
import db.billingdb.model.custom.info.PaymentInvoiceItem;

public class PaymentReport {
	private int paymentId;
	private String userId;
	private String userFullname;
	private Date paymentDate;
	private List<Integer> invoiceIds = new ArrayList<Integer>();
	private int amount;
	private ChequeInfo chequeInfo;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserFullname() {
		return userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public List<Integer> getInvoiceIds() {
		return invoiceIds;
	}

	public void setInvoices_string(String invoices_string) {
		String[]invoices = invoices_string.split(",");
		for (String i : invoices) {
			invoiceIds.add(Integer.parseInt(i));
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
