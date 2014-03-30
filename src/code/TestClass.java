package code;

import java.sql.Date;
import java.util.List;

import db.billingdb.dao.custom.impl.InvoiceReportDAO;
import db.billingdb.dao.custom.impl.ItemReportDAO;
import db.billingdb.dao.custom.impl.PaymentReportDAO;
import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.Item;
import db.billingdb.model.custom.ItemReport;
import db.billingdb.model.custom.ItemReportCondition;
import db.billingdb.model.custom.PaymentCondition;
import db.billingdb.model.custom.PaymentReport;

public class TestClass {
	boolean res;
	private ItemReportDAO itemDAO;
	private InvoiceReportDAO invoiceDAO;
	private PaymentReportDAO paymentDAO;

	public TestClass() {
		itemDAO = new ItemReportDAO();
		invoiceDAO = new InvoiceReportDAO();
		paymentDAO = new PaymentReportDAO();
	}

	public void run_test() {
		System.out.println("====================Item Report==================");
		test_ItemReport();
		// System.out.println("===================Invoice Report================");
		// test_InvoiceReport();
		// System.out.println("===================Payment Report================");
		// test_PaymentReport();
	}

	public void test_ItemReport() {
		System.out.println("Test 1: Item list retrieval");
		res = item_report_simple_test();
		System.out.println("Test 1: " + ("Passed" != null ? res : "Failed"));

		// ////////////////////////////////
		ItemReportCondition con = null;
		System.out.println("Test 2: ItemReport with null condition");
		res = res & item_report_conditional(con);
		System.out.println("Test 2: " + ("Passed" != null ? res : "Failed"));

		// ////////////////////////////////
		con = new ItemReportCondition();
		System.out.println("Test 3: ItemReport with default condition");
		res = res & item_report_conditional(con);
		System.out.println("Test 3: " + ("Passed" != null ? res : "Failed"));

		// ////////////////////////////////
		con.setCurrencyId(1); // 1 for dollar
		System.out
				.println("Test 4: ItemReport with different currency (Dollar)");
		res = res & item_report_conditional(con);
		System.out.println("Test 4: " + (res ? "Passed" : "Failed"));

		con.setCurrencyId(12); // default shekel

		// ////////////////////////////////
		con.setCity(1); // 1 for Ramallah
		System.out.println("Test 5: ItemReport with specific city (1)");
		res = res & item_report_conditional(con);
		System.out.println("Test 5: " + (res ? "Passed" : "Failed"));

		con.setCity(0); // for all cities

		// ////////////////////////////////
		con.setStartDate(Date.valueOf("2012-3-1"));
		con.setEndDate(Date.valueOf("2012-4-30"));
		System.out.println("Test 6: ItemReport with specific start & end date");
		res = res & item_report_conditional(con);
		System.out.println("Test 6: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con.setDeleted(true);
		System.out.println("Test 7: ItemReport with deleted invoices");
		res = res & item_report_conditional(con);
		System.out.println("Test 7: " + (res ? "Passed" : "Failed"));

		con.setDeleted(false);

		con.setVatRate(0.4);
		res = res & item_report_conditional(con);

		System.out.println("ItemReport test finished");
		System.out.println("Over all result is " + (res ? "Passed" : "Failed"));
	}

	public void test_InvoiceReport() {
		InvoiceCondition con = null;

		// ////////////////////////////////
		System.out.println("Test 1: InvoiceReport with null condition");
		res = invoice_report_test_null(con);
		System.out.println("Test 1: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con = new InvoiceCondition();
		System.out.println("Test 2: InvoiceReport with default condition");
		res = res & invoice_report_test_default(con);
		System.out.println("Test 2: " + (res ? "Passed" : "Failed"));

		System.out.println("ItemReport test finished");
		System.out.println("Over all result is " + (res ? "Passed" : "Failed"));
	}

	public void test_PaymentReport() {
		PaymentCondition con = null;

		// ////////////////////////////////
		System.out.println("Test 1: PaymentReport with null condition (cash)");
		res = general_cash_test(con);
		System.out.println("Test 1: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con = new PaymentCondition();
		System.out
				.println("Test 2: PaymentReport with default condition (cash)");
		res = res & general_cash_test(con);
		System.out.println("Test 2: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con.setCurrencyId(1); // 1 for dollar
		System.out
				.println("Test 3: PaymentReport with different currency (cash)");
		res = res & general_cash_test(con);
		System.out.println("Test 3: " + (res ? "Passed" : "Failed"));

		con.setCurrencyId(12); // default shekel

		// ////////////////////////////////
		con.setCity(1); // 1 for Ramallah
		System.out.println("Test 4: PaymentReport with specific city (cash)");
		res = res & general_cash_test(con);
		System.out.println("Test 4: " + (res ? "Passed" : "Failed"));

		con.setCity(0); // for all cities

		// ////////////////////////////////
		con.setStartDate(Date.valueOf("2012-3-1"));
		con.setEndDate(Date.valueOf("2012-4-30"));
		System.out
				.println("Test 5: PaymentReport with specific start & end date (cash)");
		res = res & general_cash_test(con);
		System.out.println("Test 5: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con.setDeleted(true);
		System.out
				.println("Test 6: PaymentReport with deleted payments (cash)");
		res = res & general_cash_test(con);
		System.out.println("Test 6: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		// For Cheques
		// ////////////////////////////////

		System.out.println("======= Testing Cheque methods");

		System.out
				.println("Test 7: PaymentReport with null condition (Cheque)");
		res = general_cheque_test(con);
		System.out.println("Test 7: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con = new PaymentCondition();
		System.out
				.println("Test 8: PaymentReport with default condition (Cheque)");
		res = res & general_cheque_test(con);
		System.out.println("Test 8: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con.setCurrencyId(1); // 1 for dollar
		System.out
				.println("Test 9: PaymentReport with different currency (Cheque)");
		res = res & general_cheque_test(con);
		System.out.println("Test 9: " + (res ? "Passed" : "Failed"));

		con.setCurrencyId(12); // default shekel

		// ////////////////////////////////
		con.setCity(1); // 1 for Ramallah
		System.out
				.println("Test 10: PaymentReport with specific city (Cheque)");
		res = res & general_cheque_test(con);
		System.out.println("Test 10: " + (res ? "Passed" : "Failed"));

		con.setCity(0); // for all cities

		// ////////////////////////////////
		con.setStartDate(Date.valueOf("2012-3-1"));
		con.setEndDate(Date.valueOf("2012-4-30"));
		System.out
				.println("Test 11: PaymentReport with specific start & end date (Cheque)");
		res = res & general_cheque_test(con);
		System.out.println("Test 11: " + (res ? "Passed" : "Failed"));

		// ////////////////////////////////
		con.setDeleted(true);
		System.out
				.println("Test 12: PaymentReport with deleted payments (Cheque)");
		res = res & general_cheque_test(con);
		System.out.println("Test 12: " + (res ? "Passed" : "Failed"));

		System.out.println("PaymentReport test finished");
		System.out.println("Over all result is " + (res ? "Passed" : "Failed"));
	}

	private boolean item_report_simple_test() {
		try {
			List<Item> l = itemDAO.listItems();
			System.out.println("****Number of items found was" + l.size());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private boolean item_report_conditional(ItemReportCondition condition) {
		try {
			List<ItemReport> l = itemDAO.getItemReport(condition);
			System.out.println("****Number of items found was" + l.size());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private boolean invoice_report_test_null(InvoiceCondition con) {
		try {
			invoiceDAO.getInvoicesByCondition(con);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private boolean invoice_report_test_default(InvoiceCondition con) {
		try {
			invoiceDAO.getInvoicesByCondition(con);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private boolean invoice_report_test_with_userid(InvoiceCondition con) {

		return true;
	}

	private boolean invoice_report_test_with_(InvoiceCondition con) {

		return true;
	}

	private boolean general_cash_test(PaymentCondition con) {
		try {
			if (con != null)
				con.setPaymentMethod(10);
			List<PaymentReport> l = paymentDAO.getPayments(con);
			System.out.println("****Number of items found was " + l.size());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private boolean general_cheque_test(PaymentCondition con) {
		try {
			if (con != null)
				con.setPaymentMethod(1);
			List<PaymentReport> l = paymentDAO.getPayments(con);
			System.out.println("****Number of items found was " + l.size());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
