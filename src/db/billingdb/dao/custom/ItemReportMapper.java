package db.billingdb.dao.custom;

import java.util.List;

import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.ItemReport;
import db.billingdb.model.custom.ItemReportCondition;
import db.billingdb.model.custom.UserTypeCondition;
import db.billingdb.model.custom.UserTypeReport;

public interface ItemReportMapper {
	public List<Item> listItems();
	public List<ItemReport> getItemReport(ItemReportCondition condition);
	public List<UserTypeReport> getUserTypeReport(UserTypeCondition condition);
}
