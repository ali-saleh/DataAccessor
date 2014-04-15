package db.billingdb.model.custom;

import db.billingdb.model.custom.info.UserInfo;

public class OutstandingUser {
	private int id;
	private double balance;
	private UserInfo userInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
