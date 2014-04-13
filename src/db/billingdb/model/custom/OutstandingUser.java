package db.billingdb.model.custom;

import db.billingdb.model.custom.info.UserInfo;

public class OutstandingUser {
	private int id;
	private double balance;
	private UserInfo userInfo;

	public int getUserId() {
		return id;
	}

	public void setUserId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
}
