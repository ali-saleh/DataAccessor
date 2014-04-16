package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

import db.billingdb.dao.custom.impl.InvoiceReportDAO;
import db.billingdb.dao.custom.impl.ItemReportDAO;
import db.billingdb.dao.custom.impl.PaymentReportDAO;
import db.billingdb.dao.custom.impl.UserReportDAO;
import db.billingdb.model.custom.Customer;
import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.InvoiceReport;
import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.ItemReport;
import db.billingdb.model.custom.ItemReportCondition;
import db.billingdb.model.custom.OutstandingUser;
import db.billingdb.model.custom.OutstandingUserCondition;
import db.billingdb.model.custom.PaymentCondition;
import db.billingdb.model.custom.PaymentReport;
import db.billingdb.model.custom.SimpleUser;
import db.billingdb.model.custom.info.UserInfo;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		OutstandingUserCondition condition = new OutstandingUserCondition();
//		UserReportDAO dao = new UserReportDAO();
//		List<OutstandingUser> l = dao.getOutstandingUsers(condition);
//		
//		Map<Integer, OutstandingUser> m = new HashMap<Integer, OutstandingUser>();
//		for (OutstandingUser outstandingUser : l) {
//			m.put(outstandingUser.getId(), outstandingUser);
//		}
//		
//		List <Integer> lst = new ArrayList<Integer>();
//		lst.addAll(m.keySet());
//		List<UserInfo> infos = dao.getUserInfoByIDs( lst);
//		
//		for (UserInfo userInfo : infos) {
//			m.get(userInfo.getId()).setUserInfo(userInfo);
//		}
//		
//		System.out.println(l.size());
		//
		// System.out.println(String.format("%-12s-test", "Hiell"));
		//
//		 UserReportDAO dao = new UserReportDAO();
//		 List<Customer> x = dao.getAllCustomers();
//		
//		 System.out.println(x.size());

		// InvoiceReportDAO dao = new InvoiceReportDAO();
		// InvoiceCondition condition = new InvoiceCondition();
		// condition.setCity(1);
		// condition.setCurrencyId(12);
		// condition.setDeleted(false);
		// condition.setStartDate(Date.valueOf("2012-3-1"));
		// condition.setEndDate(Date.valueOf("2012-4-30"));

		// List<Integer> x = new ArrayList<Integer>();
		// x.add(8583);
		// x.add(18635);
		// x.add(18636);
		// x.add(18637);
		// x.add(18638);
		//
		// List<Integer> lis = dao.getInvoicesIDs(condition);
		// System.out.println(lis.size());

		// List<InvoiceReport> l =
		// dao.getInvoicesByIDs(dao.getInvoicesIDs(condition));
		// System.out.println("" + l.size());

		// ItemReportDAO dao = new ItemReportDAO();
		// ItemReportCondition condition = new ItemReportCondition();
		// // List<Integer> x = new ArrayList<Integer>();
		// // x.add(1344);
		// // x.add(1343);
		//
		// condition.setStartDate(Date.valueOf("2012-3-1"));
		// condition.setEndDate(Date.valueOf("2012-4-30"));
		// condition.setCurrencyId(12);
		// // condition.setDeleted(true);
		// // condition.setItemIds(x);
		//
		// List<ItemReport> l = dao.getItemReport(condition);
		//
		// System.out.println(l.size());

		// x.get(0);

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
		// condition.setDeleted(false);
		// condition.setCurrencyId(12);
		// condition.setPaymentMethod(10);
		// condition.setStartDate(Date.valueOf("2012-3-1"));
		// condition.setEndDate(Date.valueOf("2012-4-30"));
		//
		// PaymentReportDAO dao = new PaymentReportDAO();
		// List<PaymentReport> l = dao.getPayments(condition);
		//
		// System.out.println(l.get(0).getChequeInfo());
		//
		// TestClass t = new TestClass();
		// t.run_test();
		
		ItemReportDAO dao = new ItemReportDAO();
		
		List<Item> x = dao.listItems();
		
		System.out.println(x.size());
	}
}
