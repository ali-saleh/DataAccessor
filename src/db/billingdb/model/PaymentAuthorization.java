package db.billingdb.model;

import java.util.Date;

public class PaymentAuthorization {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.payment_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer payment_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.processor
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String processor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.code1
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String code1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.code2
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String code2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.code3
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String code3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.approval_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String approval_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.avs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String avs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.transaction_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String transaction_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.md5
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String md5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.card_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String card_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.response_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String response_message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_authorization.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.id
     *
     * @return the value of payment_authorization.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.id
     *
     * @param id the value for payment_authorization.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.payment_id
     *
     * @return the value of payment_authorization.payment_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPayment_id() {
        return payment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.payment_id
     *
     * @param payment_id the value for payment_authorization.payment_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.processor
     *
     * @return the value of payment_authorization.processor
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.processor
     *
     * @param processor the value for payment_authorization.processor
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.code1
     *
     * @return the value of payment_authorization.code1
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCode1() {
        return code1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.code1
     *
     * @param code1 the value for payment_authorization.code1
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCode1(String code1) {
        this.code1 = code1 == null ? null : code1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.code2
     *
     * @return the value of payment_authorization.code2
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCode2() {
        return code2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.code2
     *
     * @param code2 the value for payment_authorization.code2
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCode2(String code2) {
        this.code2 = code2 == null ? null : code2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.code3
     *
     * @return the value of payment_authorization.code3
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCode3() {
        return code3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.code3
     *
     * @param code3 the value for payment_authorization.code3
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCode3(String code3) {
        this.code3 = code3 == null ? null : code3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.approval_code
     *
     * @return the value of payment_authorization.approval_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getApproval_code() {
        return approval_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.approval_code
     *
     * @param approval_code the value for payment_authorization.approval_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setApproval_code(String approval_code) {
        this.approval_code = approval_code == null ? null : approval_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.avs
     *
     * @return the value of payment_authorization.avs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getAvs() {
        return avs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.avs
     *
     * @param avs the value for payment_authorization.avs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAvs(String avs) {
        this.avs = avs == null ? null : avs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.transaction_id
     *
     * @return the value of payment_authorization.transaction_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getTransaction_id() {
        return transaction_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.transaction_id
     *
     * @param transaction_id the value for payment_authorization.transaction_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id == null ? null : transaction_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.md5
     *
     * @return the value of payment_authorization.md5
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getMd5() {
        return md5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.md5
     *
     * @param md5 the value for payment_authorization.md5
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.card_code
     *
     * @return the value of payment_authorization.card_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCard_code() {
        return card_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.card_code
     *
     * @param card_code the value for payment_authorization.card_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCard_code(String card_code) {
        this.card_code = card_code == null ? null : card_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.create_datetime
     *
     * @return the value of payment_authorization.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.create_datetime
     *
     * @param create_datetime the value for payment_authorization.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.response_message
     *
     * @return the value of payment_authorization.response_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getResponse_message() {
        return response_message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.response_message
     *
     * @param response_message the value for payment_authorization.response_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setResponse_message(String response_message) {
        this.response_message = response_message == null ? null : response_message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_authorization.OPTLOCK
     *
     * @return the value of payment_authorization.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_authorization.OPTLOCK
     *
     * @param OPTLOCK the value for payment_authorization.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}