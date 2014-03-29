package db.billingdb.dao.custom.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import db.billingdb.DBConnection_Billing;
import db.billingdb.dao.custom.InvoiceReportMapper;
import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.InvoiceReport;
import db.logindb.model.VatHistory;

public class InvoiceReportDAO implements InvoiceReportMapper {

	protected SqlSessionFactory _session;
	
	public InvoiceReportDAO() {
		_session = DBConnection_Billing.getSession();
	}
	
	@Override
	public List<InvoiceReport> getInvoicesByCondition(InvoiceCondition condition) {
		SqlSession openSession = _session.openSession();
		List<InvoiceReport> list = null;
//		try {
//			InvoiceReportMapper map = openSession.getMapper(InvoiceReportMapper.class);
//
//			if (condition != null && condition.getVatRate() != 0) {
//
//				List<VatHistory> parts = getInternalSpans(condition);
//
//				if (parts.size() == 1) {
//					condition.setVatRate(parts.get(0).getVAT_Value());
//					list = map.getInvoicesByCondition(condition);
//				} else {
//					list = new ArrayList<InvoiceReport>();
//					InvoiceCondition c = condition.clone();
//
//					c.setStartDate(getMin(c.getStartDate(), parts.get(0).getStart_date()));
//					c.setEndDate(parts.get(0).getEnd_date());
//					c.setVatRate(parts.get(0).getVAT_Value());
//
//					int count = 1;
//
//					do {
//						list.addAll(map.getInvoicesByCondition(c));
//						c.setStartDate(parts.get(count).getStart_date());
//						c.setEndDate(getMax(condition.getEndDate(), parts.get(count).getEnd_date()));
//						c.setVatRate(parts.get(count).getVAT_Value());
//						count++;
//					} while (count < parts.size());
//				}
//			} else { // If no vat calculation was needed
//				list = map.getInvoicesByCondition(condition);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			openSession.close();
//		}
		return list;
	}

	@Override
	public List<InvoiceReport> getUnclosedInvoices(InvoiceCondition condition) {
		SqlSession openSession = _session.openSession();
		List<InvoiceReport> list = null;
		try {
			InvoiceReportMapper map = openSession.getMapper(InvoiceReportMapper.class);
			list = map.getUnclosedInvoices(condition);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}

	@Override
	public List<InvoiceReport> getInvoicesByIDs(List<Integer> invoiceIDs) {
		SqlSession openSession = _session.openSession();
		List<InvoiceReport> list = null;
		try {
			InvoiceReportMapper map = openSession.getMapper(InvoiceReportMapper.class);
			list = map.getInvoicesByIDs(invoiceIDs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return list;
	}
}
