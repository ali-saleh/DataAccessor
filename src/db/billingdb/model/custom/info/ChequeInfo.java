package db.billingdb.model.custom.info;

import java.sql.Date;

public class ChequeInfo {
	private int chequeId;
	private String bankName;
	private Date chequeDate;
	
	public int getChequeId() {
		return chequeId;
	}
	public void setChequeId(int chequeId) {
		this.chequeId = chequeId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Date getChecqueDate() {
		return chequeDate;
	}
	public void setChecqueDate(Date checqueDate) {
		this.chequeDate = checqueDate;
	}
}
