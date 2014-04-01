package db.billingdb.dao.custom;

import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.UserInfo;

public interface UserReportMapper {
	List<SimpleUser> getSalesmenList();
	List<SimpleUser> getDistibutorList();
	List<UserInfo> getUsersByName(@Param("name")String name, @Param("city")int city);
}
