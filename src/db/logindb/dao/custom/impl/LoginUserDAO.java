package db.logindb.dao.custom.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import utils.UserEncryptionMngr;

import db.logindb.DBConnection_Login;
import db.logindb.dao.UserMapper;
import db.logindb.model.User;
import db.logindb.model.UserExample;

public class LoginUserDAO {

	private SqlSessionFactory _sessionFactory = null;

	public LoginUserDAO() {
		_sessionFactory = DBConnection_Login.getSession();
	}

	/*
	 * 
	 */
	public User authenticateUser(String username, String password) {

		User res = null;
		UserExample ex = new UserExample();
		ex.or().andUsernameEqualTo(username);
		ex.or().andPasshashEqualTo(UserEncryptionMngr.getEncryption(password));

		SqlSession openSession = _sessionFactory.openSession();
		UserMapper m = openSession.getMapper(UserMapper.class);
		List<User> result = m.selectByExample(ex);
		if (result.size() > 0) {
			res = result.get(0);
		}

		openSession.close();
		return res;
	}

	public Boolean addUser(String name, String password) {
		return addUser(name, password, 0);
	}
	
	public Boolean addUser(String name, String password, int role) {

		if (name.isEmpty() || password.isEmpty()) {
			return false;
		}

		User newUser = new User();
		newUser.setUsername(name);
		newUser.setPasshash(UserEncryptionMngr.getEncryption(password));
		newUser.setRole_id(0);
		newUser.setState_id(0);

		SqlSession openSession = _sessionFactory.openSession();
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
}
