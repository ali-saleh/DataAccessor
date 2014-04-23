package db.billingdb.dao.custom;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.billingdb.model.custom.Customer;
import db.billingdb.model.custom.OutstandingUser;
import db.billingdb.model.custom.OutstandingUserCondition;
import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.UserPaymentCondition;
import db.billingdb.model.custom.info.UserInfo;

public interface UserReportMapper {
	List<SimpleUser> getAllSalesmen();

	List<SimpleUser> getSalesmenByCity(int city);

	List<SimpleUser> getAllPartners();

	List<SimpleUser> getPartnersByCity(int city);

	List<Customer> getAllCustomers();

	List<Customer> getCustomersByCity(int city);

	// ////////////////////////////////////////
	// //Informative functions
	// ////////////////////////////////////////
	List<UserInfo> getUserInfoByIDs(List<Integer> userIDs);

	List<OutstandingUser> getUsersByName(@Param("name") String name,
			@Param("city") int city);

	List<UserInfo> getActiveUsers(Date date);

	// Note: not implemented on MyBatis XML configuration
	UserInfo getUserInfoByID(int userID);

	// ////////////////////////////////////////
	// //Reporting functions
	// ////////////////////////////////////////
	List<OutstandingUser> getUserPayments(UserPaymentCondition condition);

	List<OutstandingUser> getOutstandingUsers(OutstandingUserCondition condition);
}
