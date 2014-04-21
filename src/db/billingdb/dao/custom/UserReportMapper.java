package db.billingdb.dao.custom;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;

import db.billingdb.model.custom.Customer;
import db.billingdb.model.custom.OutstandingUser;
import db.billingdb.model.custom.OutstandingUserCondition;
import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.UserPaymentCondition;
import db.billingdb.model.custom.info.UserInfo;

public interface UserReportMapper {
	List<SimpleUser> getSalesmenListByCity(@Param("city")int city);
	List<SimpleUser> getPartnersListByCity(@Param("city")int city);
	List<OutstandingUser> getUsersByName(@Param("name")String name, @Param("city")int city);
	List<Customer> getAllCustomers();
	List<UserInfo> getActiveUsers(Date date);
	List<OutstandingUser> getOutstandingUsers(OutstandingUserCondition condition);
	List<UserInfo> getUserInfoByIDs(List<Integer> userIDs);
	
	//Note: not implemented on MyBatis XML configuration
	UserInfo getUserInfoByID(int userID);
	List<OutstandingUser> getUserPayments(UserPaymentCondition condition);
}
