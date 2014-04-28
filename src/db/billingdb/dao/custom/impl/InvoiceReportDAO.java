package db.billingdb.dao.custom.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import db.billingdb.dao.custom.InvoiceReportMapper;
import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.InvoiceReport;
import db.reportingdb.model.VatHistory;

public class InvoiceReportDAO extends BaseDAO implements InvoiceReportMapper {

	@Override
	public List<InvoiceReport> getInvoicesByCondition(InvoiceCondition condition) {
		SqlSession openSession = _session.openSession();
		List<InvoiceReport> list = null;
		try {
			InvoiceReportMapper map = openSession
					.getMapper(InvoiceReportMapper.class);

			if (condition != null && condition.getVatRate() != 0) {

				List<VatHistory> parts = getInternalSpans(condition);

				if (parts.size() == 1) {
					condition.setVatRate(parts.get(0).getVAT_Value());
					list = map.getInvoicesByCondition(condition);
				} else {
					list = new ArrayList<InvoiceReport>();
					InvoiceCondition c = condition.clone();
					
					// Handling first search 
					// (should same start time of input condition)
					c.setStartDate(condition.getStartDate());
					c.setEndDate(parts.get(0).getEnd_date());
					c.setVatRate(parts.get(0).getVAT_Value());
					list.addAll(map.getInvoicesByCondition(c));
					
					// Should handle all internal cases 
					// (Not first not last)
					int count = 1;
					while (count < parts.size() - 1) {
						c.setStartDate(parts.get(count).getStart_date());
						c.setEndDate(parts.get(count).getEnd_date());
						c.setVatRate(parts.get(count).getVAT_Value());
						list.addAll(map.getInvoicesByCondition(c));
						count++;
					}
					
					// Handling last case 
					// (should set end date to same input end time)
					c.setStartDate(parts.get(count).getStart_date());
					c.setEndDate(condition.getEndDate());
					c.setVatRate(parts.get(count).getVAT_Value());
					list.addAll(map.getInvoicesByCondition(c));
				}
			} else { // If no vat calculation was needed
				list = map.getInvoicesByCondition(condition);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}

	// @Override
	// public List<InvoiceReport> getUnclosedInvoices(InvoiceCondition
	// condition) {
	// SqlSession openSession = _session.openSession();
	// List<InvoiceReport> list = null;
	// try {
	// InvoiceReportMapper map =
	// openSession.getMapper(InvoiceReportMapper.class);
	// list = map.getUnclosedInvoices(condition);
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// openSession.close();
	// }
	// return list;
	// }

	@Override
	public List<InvoiceReport> getInvoicesByIDs(List<Integer> invoiceIDs) {

		if (invoiceIDs == null || invoiceIDs.size() == 0) {
			return null;
		}

		SqlSession openSession = _session.openSession();
		List<InvoiceReport> list = null;
		try {
			InvoiceReportMapper map = openSession
					.getMapper(InvoiceReportMapper.class);
			list = map.getInvoicesByIDs(invoiceIDs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}

	@Override
	public List<Integer> getInvoicesIDs(InvoiceCondition condition) {
		SqlSession openSession = _session.openSession();
		List<Integer> list = null;
		try {
			InvoiceReportMapper map = openSession
					.getMapper(InvoiceReportMapper.class);
			list = map.getInvoicesIDs(condition);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}
}
