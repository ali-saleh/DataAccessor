package db.billingdb.dao.custom.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import db.billingdb.dao.custom.ItemReportMapper;
import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.ItemReport;
import db.billingdb.model.custom.ItemReportCondition;
import db.billingdb.model.custom.UserTypeCondition;
import db.billingdb.model.custom.UserTypeReport;
import db.reportingdb.model.VatHistory;

public class ItemReportDAO extends BaseDAO implements ItemReportMapper {

	@Override
	public List<Item> listItems() {
		SqlSession openSession = _session.openSession();
		List<Item> list = null;
		try {
			ItemReportMapper map = openSession
					.getMapper(ItemReportMapper.class);
			
			list = map.listItems();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}

	@Override
	public List<ItemReport> getItemReport(ItemReportCondition condition) {
		SqlSession openSession = _session.openSession();
		List<ItemReport> list = null;
		try {
			ItemReportMapper map = openSession
					.getMapper(ItemReportMapper.class);

			if (condition != null && condition.getVatRate() != 0) {
				List<VatHistory> parts = getInternalSpans(condition);

				if (parts.size() == 1) {
					condition.setVatRate(parts.get(0).getVAT_Value());
					list = map.getItemReport(condition);
				} else {
					list = new ArrayList<ItemReport>();
					ItemReportCondition c = condition.clone();

					c.setStartDate(getMin(c.getStartDate(), parts.get(0).getStart_date()));
					c.setEndDate(parts.get(0).getEnd_date());
					c.setVatRate(parts.get(0).getVAT_Value());

					int count = 1;

					do {
						list.addAll(map.getItemReport(c));
						c.setStartDate(parts.get(count).getStart_date());
						c.setEndDate(getMax(condition.getEndDate(), parts.get(count).getEnd_date()));
						c.setVatRate(parts.get(count).getVAT_Value());
						count++;
					} while (count < parts.size());
				}
			} else { // If no vat calculation was needed
				list = map.getItemReport(condition);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}

	
	@Override
	public List<UserTypeReport> getUserTypeReport(UserTypeCondition condition) {
		SqlSession openSession = _session.openSession();
		List<UserTypeReport> list = null;
		try {
			ItemReportMapper map = openSession
					.getMapper(ItemReportMapper.class);
			
			list = map.getUserTypeReport(condition);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}
}
