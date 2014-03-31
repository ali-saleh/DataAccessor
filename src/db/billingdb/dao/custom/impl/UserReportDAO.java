package db.billingdb.dao.custom.impl;

import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import db.billingdb.dao.custom.UserReportMapper;
import db.billingdb.model.custom.SimpleUser;

public class UserReportDAO extends BaseDAO implements UserReportMapper {

	@Override
	public List<SimpleUser> getSalesmenList() {
		SqlSession openSession = _session.openSession();
		List<SimpleUser> res = null;
		try {
			UserReportMapper map = openSession.getMapper(UserReportMapper.class);
			res = map.getSalesmenList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return res;
	}

	@Override
	public Hashtable<Integer, String> getDistibutorList() {
		// TODO Auto-generated method stub
		return null;
	}

}
