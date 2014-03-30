package db.billingdb.dao.custom;

import java.util.List;

import db.billingdb.model.custom.InvoiceCondition;
import db.billingdb.model.custom.InvoiceReport;

public interface InvoiceReportMapper {
	List<InvoiceReport> getInvoicesByCondition(InvoiceCondition condition);
	//List<InvoiceReport> getUnclosedInvoices(InvoiceCondition condition);
	List<InvoiceReport> getInvoicesByIDs(List<Integer> invoiceIDs);
	List<Integer> getInvoicesIDs(InvoiceCondition condition);
}
