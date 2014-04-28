package db.billingdb.dao.custom.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import db.billingdb.dao.custom.PaymentReportMapper;
import db.billingdb.model.custom.PaymentCondition;
import db.billingdb.model.custom.PaymentReport;
import db.reportingdb.model.VatHistory;

public class PaymentReportDAO extends BaseDAO implements PaymentReportMapper {

	@Override
	public List<PaymentReport> getPayments(PaymentCondition condition) {
		SqlSession openSession = _session.openSession();
		List<PaymentReport> list = null;
		try {
			PaymentReportMapper map = openSession
					.getMapper(PaymentReportMapper.class);

			if (condition != null && condition.getVatRate() != 0) {
				List<VatHistory> parts = getInternalSpans(condition);

				if (parts.size() == 1) {
					condition.setVatRate(parts.get(0).getVAT_Value());
					list = map.getPayments(condition);
				} else {
					list = new ArrayList<PaymentReport>();
					PaymentCondition c = condition.clone();

					// Handling first search
					// (should same start time of input condition)
					c.setStartDate(condition.getStartDate());
					c.setEndDate(parts.get(0).getEnd_date());
					c.setVatRate(parts.get(0).getVAT_Value());
					list.addAll(map.getPayments(c));

					// Should handle all internal cases
					// (Not first not last)
					int count = 1;
					while (count < parts.size() - 1) {
						c.setStartDate(parts.get(count).getStart_date());
						c.setEndDate(parts.get(count).getEnd_date());
						c.setVatRate(parts.get(count).getVAT_Value());
						list.addAll(map.getPayments(c));
						count++;
					}

					// Handling last case
					// (should set end date to same input end time)
					c.setStartDate(parts.get(count).getStart_date());
					c.setEndDate(condition.getEndDate());
					c.setVatRate(parts.get(count).getVAT_Value());
					list.addAll(map.getPayments(c));
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
