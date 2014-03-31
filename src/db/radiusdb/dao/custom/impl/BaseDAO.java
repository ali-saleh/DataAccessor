package db.radiusdb.dao.custom.impl;

import org.apache.ibatis.session.SqlSessionFactory;

import db.billingdb.DBConnection_Billing;

public class BaseDAO {
	protected SqlSessionFactory _session;
	
	public BaseDAO() {
		_session = DBConnection_Billing.getSession();
	}
}
