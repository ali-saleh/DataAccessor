package db.billingdb.dao.custom;

import java.util.Hashtable;
import java.util.List;

import db.billingdb.model.custom.SimpleUser;

public interface UserReportMapper {
	List<SimpleUser> getSalesmenList();
	Hashtable<Integer, String> getDistibutorList();
}
