package db.reportingdb.dao.impl;

import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import utils.UserEncryptionMngr;

import db.reportingdb.DBConnection_Reporting;
import db.reportingdb.ReportingDBException;
import db.reportingdb.dao.UserMapper;
import db.reportingdb.model.User;
import db.reportingdb.model.UserExample;

public class ReportingUserDAO {
	protected SqlSessionFactory _session;

	public ReportingUserDAO() {
		_session = DBConnection_Reporting.getSession();
	}

	/*
	 * General authentication method to validate a login attempt
	 */
	public User authenticateUser(String username, String password) throws ReportingDBException {

		User res = null;
		UserExample ex = new UserExample();
		ex.or().andUsernameEqualTo(username);

		SqlSession openSession = _session.openSession();
		UserMapper m = openSession.getMapper(UserMapper.class);
		List<User> result = m.selectByExample(ex);
		if (result.size() > 0) {
			res = result.get(0);
			if (res.getPasshash().equals(UserEncryptionMngr.getEncryption(password))) {
				res.setLast_login(Calendar.getInstance().getTime());
				updateUser(res);
			} else {
				// res.setFailAttempts = res.getFailedAttempts + 1;
				// Update the new record.
				throw new ReportingDBException();
			}
		}

		if (res == null) {
			throw new ReportingDBException();
		}

		openSession.close();
		return res;
	}

	public boolean addUser(String name, String password) {
		return addUser(name, password, 0);
	}

	public boolean addUser(String name, String password, int role) {

		if (name.isEmpty() || password.isEmpty()) {
			return false;
		}

		User newUser = new User();
		newUser.setUsername(name);
		newUser.setPasshash(UserEncryptionMngr.getEncryption(password));
		newUser.setRole_id(0);
		newUser.setState_id(0);

		return addUser(newUser);
	}

	public boolean addUser(User newUser) {
		SqlSession openSession = _session.openSession();
		UserMapper m = openSession.getMapper(UserMapper.class);

		try {
			m.insert(newUser);
			openSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			openSession.close();
		}
		return true;
	}

	public void updatePassword(User user, String newPassword) {
		user.setPasshash(UserEncryptionMngr.getEncryption(newPassword));
		updateUser(user);
	}

	private void updateUser(User user) {
		SqlSession openSession = _session.openSession();
		UserMapper m = openSession.getMapper(UserMapper.class);

		try {
			m.updateByPrimaryKey(user);
			openSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
	}
}
