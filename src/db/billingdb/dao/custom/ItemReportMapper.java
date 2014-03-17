package db.billingdb.dao.custom;

import java.util.List;

import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.ItemReport;
import db.billingdb.model.custom.ItemReportCondition;

public interface ItemReportMapper {
	public List<Item> listItems();
	public List<ItemReport> getItemReport(ItemReportCondition condition);
}
