package db.billingdb.model;

import java.util.Date;

public class OrderProcess {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer order_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.invoice_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer invoice_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.billing_process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer billing_process_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.periods_included
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer periods_included;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.period_start
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date period_start;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.period_end
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date period_end;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.is_review
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer is_review;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.origin
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer origin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_process.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.id
     *
     * @return the value of order_process.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.id
     *
     * @param id the value for order_process.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.order_id
     *
     * @return the value of order_process.order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.order_id
     *
     * @param order_id the value for order_process.order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.invoice_id
     *
     * @return the value of order_process.invoice_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getInvoice_id() {
        return invoice_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.invoice_id
     *
     * @param invoice_id the value for order_process.invoice_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.billing_process_id
     *
     * @return the value of order_process.billing_process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getBilling_process_id() {
        return billing_process_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.billing_process_id
     *
     * @param billing_process_id the value for order_process.billing_process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setBilling_process_id(Integer billing_process_id) {
        this.billing_process_id = billing_process_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.periods_included
     *
     * @return the value of order_process.periods_included
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPeriods_included() {
        return periods_included;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.periods_included
     *
     * @param periods_included the value for order_process.periods_included
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPeriods_included(Integer periods_included) {
        this.periods_included = periods_included;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.period_start
     *
     * @return the value of order_process.period_start
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getPeriod_start() {
        return period_start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.period_start
     *
     * @param period_start the value for order_process.period_start
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPeriod_start(Date period_start) {
        this.period_start = period_start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.period_end
     *
     * @return the value of order_process.period_end
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getPeriod_end() {
        return period_end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.period_end
     *
     * @param period_end the value for order_process.period_end
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPeriod_end(Date period_end) {
        this.period_end = period_end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.is_review
     *
     * @return the value of order_process.is_review
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getIs_review() {
        return is_review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.is_review
     *
     * @param is_review the value for order_process.is_review
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setIs_review(Integer is_review) {
        this.is_review = is_review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.origin
     *
     * @return the value of order_process.origin
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOrigin() {
        return origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.origin
     *
     * @param origin the value for order_process.origin
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_process.OPTLOCK
     *
     * @return the value of order_process.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_process.OPTLOCK
     *
     * @param OPTLOCK the value for order_process.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}