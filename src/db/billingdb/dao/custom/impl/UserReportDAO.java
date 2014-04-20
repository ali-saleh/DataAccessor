package db.billingdb.dao.custom.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import db.billingdb.dao.custom.UserReportMapper;
import db.billingdb.model.custom.Customer;
import db.billingdb.model.custom.OutstandingUser;
import db.billingdb.model.custom.OutstandingUserCondition;
import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.UserPaymentCondition;
import db.billingdb.model.custom.info.UserInfo;

public class UserReportDAO extends BaseDAO implements UserReportMapper {

	@Override
	public List<SimpleUser> getSalesmenListByCity(int city) {
		SqlSession openSession = _session.openSession();
		List<SimpleUser> res = null;
		try {
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
			res = map.getSalesmenListByCity(city);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}

	@Override
	public List<SimpleUser> getPartnerListByCity(int city) {
		SqlSession openSession = _session.openSession();
		List<SimpleUser> res = null;
		try {
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
			res = map.getPartnerListByCity(city);
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
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
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
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
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

	@Override
	public List<OutstandingUser> getOutstandingUsers(
			OutstandingUserCondition condition) {

		SqlSession openSession = _session.openSession();
		List<OutstandingUser> res = null;
		try {
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
			res = map.getOutstandingUsers(condition);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}

	@Override
	public List<UserInfo> getUserInfoByIDs(List<Integer> userIDs) {
		if (userIDs == null || userIDs.size() == 0) {
			return null;
		}

		SqlSession openSession = _session.openSession();
		List<UserInfo> res = null;
		try {
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
			res = map.getUserInfoByIDs(userIDs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}

	@Override
	public UserInfo getUserInfoByID(int userID) {
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(userID);
		
		List<UserInfo> infos = this.getUserInfoByIDs(lst);
		
		if(infos == null || infos.size() < 1) {
			// Some error 
			return null;
		}
		
		// Always returning first element. (There shouldn't be more)
		return infos.get(0);
	}

	@Override
	public List<OutstandingUser> getUserPayments(UserPaymentCondition condition) {
		SqlSession openSession = _session.openSession();
		List<OutstandingUser> res = null;
		try {
			UserReportMapper map = openSession
					.getMapper(UserReportMapper.class);
			res = map.getUserPayments(condition);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}
}
