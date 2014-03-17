package db.billingdb.model;

import java.util.Date;

public class ProcessRun {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer process_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.run_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date run_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.started
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date started;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.finished
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date finished;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.payment_finished
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date payment_finished;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.invoices_generated
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer invoices_generated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_run.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.id
     *
     * @return the value of process_run.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.id
     *
     * @param id the value for process_run.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.process_id
     *
     * @return the value of process_run.process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getProcess_id() {
        return process_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.process_id
     *
     * @param process_id the value for process_run.process_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setProcess_id(Integer process_id) {
        this.process_id = process_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.run_date
     *
     * @return the value of process_run.run_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getRun_date() {
        return run_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.run_date
     *
     * @param run_date the value for process_run.run_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setRun_date(Date run_date) {
        this.run_date = run_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.started
     *
     * @return the value of process_run.started
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getStarted() {
        return started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.started
     *
     * @param started the value for process_run.started
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setStarted(Date started) {
        this.started = started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.finished
     *
     * @return the value of process_run.finished
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getFinished() {
        return finished;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.finished
     *
     * @param finished the value for process_run.finished
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setFinished(Date finished) {
        this.finished = finished;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.payment_finished
     *
     * @return the value of process_run.payment_finished
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getPayment_finished() {
        return payment_finished;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.payment_finished
     *
     * @param payment_finished the value for process_run.payment_finished
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPayment_finished(Date payment_finished) {
        this.payment_finished = payment_finished;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.invoices_generated
     *
     * @return the value of process_run.invoices_generated
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getInvoices_generated() {
        return invoices_generated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.invoices_generated
     *
     * @param invoices_generated the value for process_run.invoices_generated
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInvoices_generated(Integer invoices_generated) {
        this.invoices_generated = invoices_generated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_run.OPTLOCK
     *
     * @return the value of process_run.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_run.OPTLOCK
     *
     * @param OPTLOCK the value for process_run.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}