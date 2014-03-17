package db.billingdb.model;

import java.util.Date;

public class BillingProcessConfiguration {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer entity_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.next_run_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date next_run_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.generate_report
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short generate_report;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.retries
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer retries;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.days_for_retry
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer days_for_retry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.days_for_report
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer days_for_report;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.review_status
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer review_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.period_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer period_unit_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.period_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer period_value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.due_date_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer due_date_unit_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.due_date_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer due_date_value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.df_fm
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short df_fm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.only_recurring
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short only_recurring;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.invoice_date_process
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short invoice_date_process;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.auto_payment
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short auto_payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.maximum_periods
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer maximum_periods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing_process_configuration.auto_payment_application
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer auto_payment_application;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.id
     *
     * @return the value of billing_process_configuration.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.id
     *
     * @param id the value for billing_process_configuration.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.entity_id
     *
     * @return the value of billing_process_configuration.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getEntity_id() {
        return entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.entity_id
     *
     * @param entity_id the value for billing_process_configuration.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setEntity_id(Integer entity_id) {
        this.entity_id = entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.next_run_date
     *
     * @return the value of billing_process_configuration.next_run_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getNext_run_date() {
        return next_run_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.next_run_date
     *
     * @param next_run_date the value for billing_process_configuration.next_run_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setNext_run_date(Date next_run_date) {
        this.next_run_date = next_run_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.generate_report
     *
     * @return the value of billing_process_configuration.generate_report
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getGenerate_report() {
        return generate_report;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.generate_report
     *
     * @param generate_report the value for billing_process_configuration.generate_report
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setGenerate_report(Short generate_report) {
        this.generate_report = generate_report;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.retries
     *
     * @return the value of billing_process_configuration.retries
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.retries
     *
     * @param retries the value for billing_process_configuration.retries
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.days_for_retry
     *
     * @return the value of billing_process_configuration.days_for_retry
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDays_for_retry() {
        return days_for_retry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.days_for_retry
     *
     * @param days_for_retry the value for billing_process_configuration.days_for_retry
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDays_for_retry(Integer days_for_retry) {
        this.days_for_retry = days_for_retry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.days_for_report
     *
     * @return the value of billing_process_configuration.days_for_report
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDays_for_report() {
        return days_for_report;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.days_for_report
     *
     * @param days_for_report the value for billing_process_configuration.days_for_report
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDays_for_report(Integer days_for_report) {
        this.days_for_report = days_for_report;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.review_status
     *
     * @return the value of billing_process_configuration.review_status
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getReview_status() {
        return review_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.review_status
     *
     * @param review_status the value for billing_process_configuration.review_status
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setReview_status(Integer review_status) {
        this.review_status = review_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.period_unit_id
     *
     * @return the value of billing_process_configuration.period_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPeriod_unit_id() {
        return period_unit_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.period_unit_id
     *
     * @param period_unit_id the value for billing_process_configuration.period_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPeriod_unit_id(Integer period_unit_id) {
        this.period_unit_id = period_unit_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.period_value
     *
     * @return the value of billing_process_configuration.period_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPeriod_value() {
        return period_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.period_value
     *
     * @param period_value the value for billing_process_configuration.period_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPeriod_value(Integer period_value) {
        this.period_value = period_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.due_date_unit_id
     *
     * @return the value of billing_process_configuration.due_date_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDue_date_unit_id() {
        return due_date_unit_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.due_date_unit_id
     *
     * @param due_date_unit_id the value for billing_process_configuration.due_date_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDue_date_unit_id(Integer due_date_unit_id) {
        this.due_date_unit_id = due_date_unit_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.due_date_value
     *
     * @return the value of billing_process_configuration.due_date_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDue_date_value() {
        return due_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.due_date_value
     *
     * @param due_date_value the value for billing_process_configuration.due_date_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDue_date_value(Integer due_date_value) {
        this.due_date_value = due_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.df_fm
     *
     * @return the value of billing_process_configuration.df_fm
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getDf_fm() {
        return df_fm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.df_fm
     *
     * @param df_fm the value for billing_process_configuration.df_fm
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDf_fm(Short df_fm) {
        this.df_fm = df_fm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.only_recurring
     *
     * @return the value of billing_process_configuration.only_recurring
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getOnly_recurring() {
        return only_recurring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.only_recurring
     *
     * @param only_recurring the value for billing_process_configuration.only_recurring
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOnly_recurring(Short only_recurring) {
        this.only_recurring = only_recurring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.invoice_date_process
     *
     * @return the value of billing_process_configuration.invoice_date_process
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getInvoice_date_process() {
        return invoice_date_process;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.invoice_date_process
     *
     * @param invoice_date_process the value for billing_process_configuration.invoice_date_process
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInvoice_date_process(Short invoice_date_process) {
        this.invoice_date_process = invoice_date_process;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.OPTLOCK
     *
     * @return the value of billing_process_configuration.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.OPTLOCK
     *
     * @param OPTLOCK the value for billing_process_configuration.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.auto_payment
     *
     * @return the value of billing_process_configuration.auto_payment
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getAuto_payment() {
        return auto_payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.auto_payment
     *
     * @param auto_payment the value for billing_process_configuration.auto_payment
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAuto_payment(Short auto_payment) {
        this.auto_payment = auto_payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.maximum_periods
     *
     * @return the value of billing_process_configuration.maximum_periods
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getMaximum_periods() {
        return maximum_periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.maximum_periods
     *
     * @param maximum_periods the value for billing_process_configuration.maximum_periods
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setMaximum_periods(Integer maximum_periods) {
        this.maximum_periods = maximum_periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing_process_configuration.auto_payment_application
     *
     * @return the value of billing_process_configuration.auto_payment_application
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getAuto_payment_application() {
        return auto_payment_application;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing_process_configuration.auto_payment_application
     *
     * @param auto_payment_application the value for billing_process_configuration.auto_payment_application
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAuto_payment_application(Integer auto_payment_application) {
        this.auto_payment_application = auto_payment_application;
    }
}