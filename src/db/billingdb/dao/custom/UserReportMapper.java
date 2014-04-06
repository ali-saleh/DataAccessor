package db.billingdb.dao.custom;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.billingdb.model.custom.Customer;
import db.billingdb.model.custom.OutstandingUser;
import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.UserInfo;

public interface UserReportMapper {
	List<SimpleUser> getSalesmenListByCity(int city);
	List<SimpleUser> getDistibutorListByCity(int city);
	List<OutstandingUser> getUsersByName(@Param("name")String name, @Param("city")int city);
	List<Customer> getAllCustomers();
	List<UserInfo> getActiveUsers(Date date);
//	List<OutstandingUser> getOutStandingUsers
}
