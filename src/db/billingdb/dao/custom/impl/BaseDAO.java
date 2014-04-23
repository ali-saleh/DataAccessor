package db.billingdb.dao.custom.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import db.billingdb.DBConnection_Billing;
import db.billingdb.model.custom.interfaces.HasDateLimit;
import db.reportingdb.DBConnection_Reporting;
import db.reportingdb.dao.VatHistoryMapper;
import db.reportingdb.model.VatHistory;
import db.reportingdb.model.VatHistoryExample;

/*
 * Base Database Access Object for all report classes
 */
public class BaseDAO {

	protected SqlSessionFactory _session;
	private static List<VatHistory> allVatRecords;

	/*
	 * Static Initializer that retrieves all VAT records
	 */
	static {
		getVatRecords();
	}

	/*
	 * Generic constructor that initiate SQL session object for billingDB
	 */
	public BaseDAO() {
		_session = DBConnection_Billing.getSession();
	}

	/*
	 * Returns list of ordered VAT history objects covering all the time
	 * included inside a given condition
	 * 
	 * @param condition The condition that need to be split
	 * 
	 * @return list of all VAT records covering condition
	 */
	protected List<VatHistory> getInternalSpans(HasDateLimit condition) {
		Date s;
		Date e;
		List<VatHistory> parts = new ArrayList<VatHistory>();

		s = condition.getStartDate();
		if (s == null)
			s = Date.valueOf("1970-01-01");
		e = condition.getEndDate();
		if (e == null) {
			Calendar cal = Calendar.getInstance();

			e = Date.valueOf(String.format("%d-%d-%d", cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DATE)));
		}

		int count = 0;
		while (s.after(allVatRecords.get(count).getEnd_date()))
			count++;
		parts.add(allVatRecords.get(count));
		while (e.after(allVatRecords.get(count).getEnd_date())) {
			count++;
			parts.add(allVatRecords.get(count));
		}
		return parts;
	}

	protected VatHistory getVatValue(Date date) {
		for (VatHistory vh : allVatRecords) {
			if (date.after(vh.getStart_date()) && date.before(vh.getEnd_date()))
				return vh;
		}

		return allVatRecords.get(allVatRecords.size() - 1);
	}

	protected Date getMin(Date date1, Date date2) {
		if(date1 == null)
			return date2;
		if(date2 == null)
			return date1;
		
		if (date1.before(date2))
			return date1;
		return date2;
	}

	protected Date getMax(Date date1, Date date2) {
		if(date1 == null)
			return date2;
		if(date2 == null)
			return date1;
		
		if (date1.after(date2))
			return date1;
		return date2;
	}

	private static void getVatRecords() {
		SqlSession openSession = DBConnection_Reporting.getSession().openSession();
		try {
			VatHistoryMapper map = openSession
					.getMapper(VatHistoryMapper.class);
			VatHistoryExample example = new VatHistoryExample();
			example.setOrderByClause("start_date");

			allVatRecords = map.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
	}
}