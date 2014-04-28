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

					// Handling first search 
					// (should same start time of input condition)
					c.setStartDate(condition.getStartDate());
					c.setEndDate(parts.get(0).getEnd_date());
					c.setVatRate(parts.get(0).getVAT_Value());
					list.addAll(map.getItemReport(c));
					
					// Should handle all internal cases 
					// (Not first not last)
					int count = 1;
					while (count < parts.size() - 1) {
						c.setStartDate(parts.get(count).getStart_date());
						c.setEndDate(parts.get(count).getEnd_date());
						c.setVatRate(parts.get(count).getVAT_Value());
						list.addAll(map.getItemReport(c));
						count++;
					}
					
					// Handling last case 
					// (should set end date to same input end time)
					c.setStartDate(parts.get(count).getStart_date());
					c.setEndDate(condition.getEndDate());
					c.setVatRate(parts.get(count).getVAT_Value());
					list.addAll(map.getItemReport(c));
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
