package db.billingdb.model;

import java.util.Date;

public class Invoice {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.billing_process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer billing_process_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.status_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer status_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.delegated_invoice_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer delegated_invoice_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.due_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date due_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.total
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.payment_attempts
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer payment_attempts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.carried_balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double carried_balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.in_process_payment
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short in_process_payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.is_review
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer is_review;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.currency_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer currency_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.paper_invoice_batch_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer paper_invoice_batch_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.customer_notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String customer_notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.public_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String public_number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.last_reminder
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date last_reminder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.overdue_step
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer overdue_step;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.create_timestamp
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_timestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.id
     *
     * @return the value of invoice.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.id
     *
     * @param id the value for invoice.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.create_datetime
     *
     * @return the value of invoice.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.create_datetime
     *
     * @param create_datetime the value for invoice.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.billing_process_id
     *
     * @return the value of invoice.billing_process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getBilling_process_id() {
        return billing_process_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.billing_process_id
     *
     * @param billing_process_id the value for invoice.billing_process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setBilling_process_id(Integer billing_process_id) {
        this.billing_process_id = billing_process_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.user_id
     *
     * @return the value of invoice.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.user_id
     *
     * @param user_id the value for invoice.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.status_id
     *
     * @return the value of invoice.status_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getStatus_id() {
        return status_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.status_id
     *
     * @param status_id the value for invoice.status_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.delegated_invoice_id
     *
     * @return the value of invoice.delegated_invoice_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDelegated_invoice_id() {
        return delegated_invoice_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.delegated_invoice_id
     *
     * @param delegated_invoice_id the value for invoice.delegated_invoice_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDelegated_invoice_id(Integer delegated_invoice_id) {
        this.delegated_invoice_id = delegated_invoice_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.due_date
     *
     * @return the value of invoice.due_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getDue_date() {
        return due_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.due_date
     *
     * @param due_date the value for invoice.due_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.total
     *
     * @return the value of invoice.total
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.total
     *
     * @param total the value for invoice.total
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.payment_attempts
     *
     * @return the value of invoice.payment_attempts
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPayment_attempts() {
        return payment_attempts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.payment_attempts
     *
     * @param payment_attempts the value for invoice.payment_attempts
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPayment_attempts(Integer payment_attempts) {
        this.payment_attempts = payment_attempts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.balance
     *
     * @return the value of invoice.balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.balance
     *
     * @param balance the value for invoice.balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.carried_balance
     *
     * @return the value of invoice.carried_balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getCarried_balance() {
        return carried_balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.carried_balance
     *
     * @param carried_balance the value for invoice.carried_balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCarried_balance(Double carried_balance) {
        this.carried_balance = carried_balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.in_process_payment
     *
     * @return the value of invoice.in_process_payment
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getIn_process_payment() {
        return in_process_payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.in_process_payment
     *
     * @param in_process_payment the value for invoice.in_process_payment
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setIn_process_payment(Short in_process_payment) {
        this.in_process_payment = in_process_payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.is_review
     *
     * @return the value of invoice.is_review
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getIs_review() {
        return is_review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.is_review
     *
     * @param is_review the value for invoice.is_review
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setIs_review(Integer is_review) {
        this.is_review = is_review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.currency_id
     *
     * @return the value of invoice.currency_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getCurrency_id() {
        return currency_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.currency_id
     *
     * @param currency_id the value for invoice.currency_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCurrency_id(Integer currency_id) {
        this.currency_id = currency_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.deleted
     *
     * @return the value of invoice.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.deleted
     *
     * @param deleted the value for invoice.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.paper_invoice_batch_id
     *
     * @return the value of invoice.paper_invoice_batch_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPaper_invoice_batch_id() {
        return paper_invoice_batch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.paper_invoice_batch_id
     *
     * @param paper_invoice_batch_id the value for invoice.paper_invoice_batch_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPaper_invoice_batch_id(Integer paper_invoice_batch_id) {
        this.paper_invoice_batch_id = paper_invoice_batch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.customer_notes
     *
     * @return the value of invoice.customer_notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCustomer_notes() {
        return customer_notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.customer_notes
     *
     * @param customer_notes the value for invoice.customer_notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCustomer_notes(String customer_notes) {
        this.customer_notes = customer_notes == null ? null : customer_notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.public_number
     *
     * @return the value of invoice.public_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getPublic_number() {
        return public_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.public_number
     *
     * @param public_number the value for invoice.public_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPublic_number(String public_number) {
        this.public_number = public_number == null ? null : public_number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.last_reminder
     *
     * @return the value of invoice.last_reminder
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getLast_reminder() {
        return last_reminder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.last_reminder
     *
     * @param last_reminder the value for invoice.last_reminder
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLast_reminder(Date last_reminder) {
        this.last_reminder = last_reminder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.overdue_step
     *
     * @return the value of invoice.overdue_step
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOverdue_step() {
        return overdue_step;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.overdue_step
     *
     * @param overdue_step the value for invoice.overdue_step
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOverdue_step(Integer overdue_step) {
        this.overdue_step = overdue_step;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.create_timestamp
     *
     * @return the value of invoice.create_timestamp
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_timestamp() {
        return create_timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.create_timestamp
     *
     * @param create_timestamp the value for invoice.create_timestamp
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_timestamp(Date create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.OPTLOCK
     *
     * @return the value of invoice.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.OPTLOCK
     *
     * @param OPTLOCK the value for invoice.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}