package db.billingdb.model;

public class PaymentCash {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_cash.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_cash.payment_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer payment_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_cash.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_cash.id
     *
     * @return the value of payment_cash.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_cash.id
     *
     * @param id the value for payment_cash.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_cash.payment_id
     *
     * @return the value of payment_cash.payment_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPayment_id() {
        return payment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_cash.payment_id
     *
     * @param payment_id the value for payment_cash.payment_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_cash.OPTLOCK
     *
     * @return the value of payment_cash.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_cash.OPTLOCK
     *
     * @param OPTLOCK the value for payment_cash.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}