package code;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import db.billingdb.dao.custom.impl.InvoiceReportDAO;
import db.billingdb.dao.custom.impl.ItemReportDAO;
import db.billingdb.dao.custom.impl.UserReportDAO;
import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.InvoiceReport;
import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.SimpleUser;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		InvoiceReportDAO dao = new InvoiceReportDAO();
//		InvoiceCondition condition = new InvoiceCondition();
//		condition.setCity(1);
//		condition.setCurrencyId(12);
//		condition.setDeleted(false);
//		condition.setStartDate(Date.valueOf("2012-3-1"));
//		condition.setEndDate(Date.valueOf("2012-4-30"));
		
//		List<Integer> x = new ArrayList<Integer>();
//		x.add(8583);
//		x.add(18635);
//		x.add(18636);
//		x.add(18637);
//		x.add(18638);
//		
//		List<Integer> lis = dao.getInvoicesIDs(condition);
//		System.out.println(lis.size());
		
//		List<InvoiceReport> l = dao.getInvoicesByIDs(dao.getInvoicesIDs(condition));
//		System.out.println("" + l.size());

//		 ItemReportDAO dao = new ItemReportDAO();
//		
//		 List<Item> x = dao.listItems();
//		
//		 x.get(0);

		UserReportDAO dao = new UserReportDAO();
		List<SimpleUser> lis =  dao.getSalesmenList();
		
		// try {
		//
		// // LoginUserDAO dao = new LoginUserDAO();
		// // Boolean res = dao.addUser("admin", "admin");
		// // InvoiceCondition c = new InvoiceCondition();
		// // // c.setItemId(500);
		// // // c.setStartDate(Date.valueOf("2011-9-1"));
		// // // c.setEndDate(Date.valueOf("2011-10-12"));
		// // c.setCity(0);
		//
		// // InvoiceReportDAO dao = new InvoiceReportDAO();
		// // List<InvoiceReport> l = dao.getInvoicesByCondition(c);
		//
		// // ItemReportDAO dao = new ItemReportDAO();
		// //
		// // List<ItemReport> l = dao.report();
		//
		// // if (l.size() < 0) {
		// // System.out.println("err");
		// // }
		// // System.out.println(l.size());
		//
		// PaymentCondition condition = new PaymentCondition();
		// condition.setDeleted(true);
		// condition.setCurrencyId(12);
		// condition.setStartDate(Date.valueOf("2012-3-1"));
		// condition.setEndDate(Date.valueOf("2012-4-30"));
		//
		// PaymentReportDAO dao = new PaymentReportDAO();
		// List<PaymentReportCheque> l = dao.getChequePayments(condition);
		//
		// System.out.println(l.get(0).getInvoiceId().size());
		//
		// } catch (Exception e) {
		// System.out.println("Error: " + e.getMessage());
		// }
		// TestClass t = new TestClass();
		// t.run_test();
	}
}
