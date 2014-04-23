package db.reportingdb;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConnection_Reporting {

	private static SqlSessionFactory sqlMapper;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("config_reporting.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlMapper;
	}
}
