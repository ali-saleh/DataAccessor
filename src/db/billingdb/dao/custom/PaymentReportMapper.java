package db.billingdb.dao.custom;

import java.util.List;

import db.billingdb.model.custom.PaymentCondition;
import db.billingdb.model.custom.PaymentReport;

public interface PaymentReportMapper {
	List<PaymentReport> getPayments(PaymentCondition condition);
}