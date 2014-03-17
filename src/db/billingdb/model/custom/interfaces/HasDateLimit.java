package db.billingdb.model.custom.interfaces;

import java.sql.Date;

public interface HasDateLimit {
	public void setStartDate(Date date);
	public Date getStartDate();
	
	public void setEndDate(Date date);
	public Date getEndDate();
	
	public void setVatRate(double rate);
	public double getVatRate();
}
