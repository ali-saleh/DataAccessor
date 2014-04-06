package db.billingdb.dao.custom.impl;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import db.billingdb.dao.custom.UserReportMapper;
import db.billingdb.model.custom.Customer;
import db.billingdb.model.custom.OutstandingUser;
import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.UserInfo;

public class UserReportDAO extends BaseDAO implements UserReportMapper {

	@Override
	public List<SimpleUser> getSalesmenListByCity(int city) {
		SqlSession openSession = _session.openSession();
		List<SimpleUser> res = null;
		try {
			UserReportMapper map = openSession.getMapper(UserReportMapper.class);
			res = map.getSalesmenListByCity(city);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}

	@Override
	public List<SimpleUser> getDistibutorListByCity(int city) {
		SqlSession openSession = _session.openSession();
		List<SimpleUser> res = null;
		try {
			UserReportMapper map = openSession.getMapper(UserReportMapper.class);
			res = map.getDistibutorListByCity(city);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}
	
	@Override
	public List<OutstandingUser> getUsersByName(String name, int city) {
		
		SqlSession openSession = _session.openSession();
		List<OutstandingUser> res = null;
		try {
			UserReportMapper map = openSession.getMapper(UserReportMapper.class);
			res = map.getUsersByName(name, city);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		
		SqlSession openSession = _session.openSession();
		List<Customer> res = null;
		try {
			UserReportMapper map = openSession.getMapper(UserReportMapper.class);
			res = map.getAllCustomers();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}

	@Override
	public List<UserInfo> getActiveUsers(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	

//	public List<UserInfo> getOutstandingUsers(int city) {
//		
//		SqlSession openSession = _session.openSession();
//		List<UserInfo> res = null;
//		List<UserInfo> res2 = null;
//		try {
//			UserReportMapper map = openSession.getMapper(UserReportMapper.class);
//			res = map.getOutstandingInvoices(city);
//			res2 = map.getOutstandingPayments(city);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			openSession.close();
//		}
//		return res;
//	}
	
}
