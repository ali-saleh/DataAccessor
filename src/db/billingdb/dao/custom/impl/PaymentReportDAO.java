package db.billingdb.dao.custom.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import db.billingdb.dao.custom.PaymentReportMapper;
import db.billingdb.model.custom.ItemReport;
import db.billingdb.model.custom.ItemReportCondition;
import db.billingdb.model.custom.PaymentCondition;
import db.billingdb.model.custom.PaymentReport;
import db.logindb.model.VatHistory;

public class PaymentReportDAO extends BaseDAO implements PaymentReportMapper{

	@Override
	public List<PaymentReport> getPayments(PaymentCondition condition) {
		SqlSession openSession = _session.openSession();
		List<PaymentReport> list = null;
		try {
			PaymentReportMapper map = openSession.getMapper(PaymentReportMapper.class);
			list = map.getPayments(condition);
			
			if (condition != null && condition.getVatRate() != 0) {
				List<VatHistory> parts = getInternalSpans(condition);

				if (parts.size() == 1) {
					condition.setVatRate(parts.get(0).getVAT_Value());
					list = map.getPayments(condition);
				} else {
					list = new ArrayList<PaymentReport>();
					PaymentCondition c = condition.clone();

					c.setStartDate(getMin(c.getStartDate(), parts.get(0).getStart_date()));
					c.setEndDate(parts.get(0).getEnd_date());
					c.setVatRate(parts.get(0).getVAT_Value());

					int count = 1;

					do {
						list.addAll(map.getPayments(c));
						c.setStartDate(parts.get(count).getStart_date());
						c.setEndDate(getMax(condition.getEndDate(), parts.get(count).getEnd_date()));
						c.setVatRate(parts.get(count).getVAT_Value());
						count++;
					} while (count < parts.size());
				}
			} else { // If no vat calculation was needed
				list = map.getPayments(condition);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}
}
