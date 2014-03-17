package db.billingdb.model.custom;

import java.util.Date;

public class InvoiceReport {
	private int user_id;
	private int invoice_id;
	private String disply_name;
	private Date create_datetime;
	private int quantity;
	private double balance;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getDisply_name() {
		return disply_name;
	}
	public void setDisply_name(String disply_name) {
		this.disply_name = disply_name;
	}
	public Date getCreate_datetime() {
		return create_datetime;
	}
	public void setCreate_datetime(Date create_datetime) {
		this.create_datetime = create_datetime;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
