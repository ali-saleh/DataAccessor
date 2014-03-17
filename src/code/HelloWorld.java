package code;

import java.sql.Date;
import java.util.List;

import db.billingdb.dao.custom.impl.InvoiceReportDAO;
import db.billingdb.dao.custom.impl.ItemReportDAO;
import db.billingdb.dao.custom.impl.PaymentReportDAO;
import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.InvoiceReport;
import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.PaymentCondition;
import db.logindb.dao.custom.impl.LoginUserDAO;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InvoiceReportDAO dao = new InvoiceReportDAO();
		InvoiceCondition condition = new InvoiceCondition();
		
		condition.setVatRate(0.14);
		
		List<InvoiceReport> l = dao.getInvoicesByCondition(condition);
		System.out.println("" + l.size());
//		try {
//
//			// LoginUserDAO dao = new LoginUserDAO();
//			// Boolean res = dao.addUser("admin", "admin");
//			// InvoiceCondition c = new InvoiceCondition();
//			// // c.setItemId(500);
//			// // c.setStartDate(Date.valueOf("2011-9-1"));
//			// // c.setEndDate(Date.valueOf("2011-10-12"));
//			// c.setCity(0);
//
//			// InvoiceReportDAO dao = new InvoiceReportDAO();
//			// List<InvoiceReport> l = dao.getInvoicesByCondition(c);
//
//			// ItemReportDAO dao = new ItemReportDAO();
//			//
//			// List<ItemReport> l = dao.report();
//
//			// if (l.size() < 0) {
//			// System.out.println("err");
//			// }
//			// System.out.println(l.size());
//
//			PaymentCondition condition = new PaymentCondition();
//			condition.setDeleted(true);
//			condition.setCurrencyId(12);
//			condition.setStartDate(Date.valueOf("2012-3-1"));
//			condition.setEndDate(Date.valueOf("2012-4-30"));
//
//			PaymentReportDAO dao = new PaymentReportDAO();
//			List<PaymentReportCheque> l = dao.getChequePayments(condition);
//
//			System.out.println(l.get(0).getInvoiceId().size());
//
//		} catch (Exception e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		TestClass t = new TestClass();
//		t.run_test();
	}
}
