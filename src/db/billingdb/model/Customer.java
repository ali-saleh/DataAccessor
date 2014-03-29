package db.billingdb.model;

public class Customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.partner_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer partner_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.referral_fee_paid
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short referral_fee_paid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.invoice_delivery_method_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer invoice_delivery_method_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.auto_payment_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer auto_payment_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.due_date_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer due_date_unit_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.due_date_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer due_date_value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.df_fm
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short df_fm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.parent_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer parent_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.is_parent
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short is_parent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.exclude_aging
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short exclude_aging;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.invoice_child
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short invoice_child;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.current_order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer current_order_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.balance_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer balance_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.dynamic_balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double dynamic_balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.credit_limit
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double credit_limit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.auto_recharge
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double auto_recharge;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.user_id
     *
     * @return the value of customer.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.user_id
     *
     * @param user_id the value for customer.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.partner_id
     *
     * @return the value of customer.partner_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPartner_id() {
        return partner_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.partner_id
     *
     * @param partner_id the value for customer.partner_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPartner_id(Integer partner_id) {
        this.partner_id = partner_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.referral_fee_paid
     *
     * @return the value of customer.referral_fee_paid
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getReferral_fee_paid() {
        return referral_fee_paid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.referral_fee_paid
     *
     * @param referral_fee_paid the value for customer.referral_fee_paid
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setReferral_fee_paid(Short referral_fee_paid) {
        this.referral_fee_paid = referral_fee_paid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.invoice_delivery_method_id
     *
     * @return the value of customer.invoice_delivery_method_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getInvoice_delivery_method_id() {
        return invoice_delivery_method_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.invoice_delivery_method_id
     *
     * @param invoice_delivery_method_id the value for customer.invoice_delivery_method_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInvoice_delivery_method_id(Integer invoice_delivery_method_id) {
        this.invoice_delivery_method_id = invoice_delivery_method_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.notes
     *
     * @return the value of customer.notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.notes
     *
     * @param notes the value for customer.notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.auto_payment_type
     *
     * @return the value of customer.auto_payment_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getAuto_payment_type() {
        return auto_payment_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.auto_payment_type
     *
     * @param auto_payment_type the value for customer.auto_payment_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAuto_payment_type(Integer auto_payment_type) {
        this.auto_payment_type = auto_payment_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.due_date_unit_id
     *
     * @return the value of customer.due_date_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDue_date_unit_id() {
        return due_date_unit_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.due_date_unit_id
     *
     * @param due_date_unit_id the value for customer.due_date_unit_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDue_date_unit_id(Integer due_date_unit_id) {
        this.due_date_unit_id = due_date_unit_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.due_date_value
     *
     * @return the value of customer.due_date_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getDue_date_value() {
        return due_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.due_date_value
     *
     * @param due_date_value the value for customer.due_date_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDue_date_value(Integer due_date_value) {
        this.due_date_value = due_date_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.df_fm
     *
     * @return the value of customer.df_fm
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getDf_fm() {
        return df_fm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.df_fm
     *
     * @param df_fm the value for customer.df_fm
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDf_fm(Short df_fm) {
        this.df_fm = df_fm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.parent_id
     *
     * @return the value of customer.parent_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getParent_id() {
        return parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.parent_id
     *
     * @param parent_id the value for customer.parent_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.is_parent
     *
     * @return the value of customer.is_parent
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getIs_parent() {
        return is_parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.is_parent
     *
     * @param is_parent the value for customer.is_parent
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setIs_parent(Short is_parent) {
        this.is_parent = is_parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.exclude_aging
     *
     * @return the value of customer.exclude_aging
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getExclude_aging() {
        return exclude_aging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.exclude_aging
     *
     * @param exclude_aging the value for customer.exclude_aging
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setExclude_aging(Short exclude_aging) {
        this.exclude_aging = exclude_aging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.invoice_child
     *
     * @return the value of customer.invoice_child
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getInvoice_child() {
        return invoice_child;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.invoice_child
     *
     * @param invoice_child the value for customer.invoice_child
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInvoice_child(Short invoice_child) {
        this.invoice_child = invoice_child;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.current_order_id
     *
     * @return the value of customer.current_order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getCurrent_order_id() {
        return current_order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.current_order_id
     *
     * @param current_order_id the value for customer.current_order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCurrent_order_id(Integer current_order_id) {
        this.current_order_id = current_order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.balance_type
     *
     * @return the value of customer.balance_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getBalance_type() {
        return balance_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.balance_type
     *
     * @param balance_type the value for customer.balance_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setBalance_type(Integer balance_type) {
        this.balance_type = balance_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.dynamic_balance
     *
     * @return the value of customer.dynamic_balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getDynamic_balance() {
        return dynamic_balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.dynamic_balance
     *
     * @param dynamic_balance the value for customer.dynamic_balance
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDynamic_balance(Double dynamic_balance) {
        this.dynamic_balance = dynamic_balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.credit_limit
     *
     * @return the value of customer.credit_limit
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getCredit_limit() {
        return credit_limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.credit_limit
     *
     * @param credit_limit the value for customer.credit_limit
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCredit_limit(Double credit_limit) {
        this.credit_limit = credit_limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.auto_recharge
     *
     * @return the value of customer.auto_recharge
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getAuto_recharge() {
        return auto_recharge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.auto_recharge
     *
     * @param auto_recharge the value for customer.auto_recharge
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAuto_recharge(Double auto_recharge) {
        this.auto_recharge = auto_recharge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.OPTLOCK
     *
     * @return the value of customer.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.OPTLOCK
     *
     * @param OPTLOCK the value for customer.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}