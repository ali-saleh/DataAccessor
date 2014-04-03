package db.billingdb.dao.custom.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import db.billingdb.dao.custom.UserReportMapper;
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
	
	public List<UserInfo> getUsersByName(String name, int city) {
		
		SqlSession openSession = _session.openSession();
		List<UserInfo> res = null;
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
}
