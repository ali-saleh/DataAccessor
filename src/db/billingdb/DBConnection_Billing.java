package db.billingdb;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import db.billingdb.dao.custom.ItemReportMapper;

public class DBConnection_Billing {

	private static SqlSessionFactory sqlMapper;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("config_billing.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static SqlSessionFactory getSession() {
		return sqlMapper;
	}
}
