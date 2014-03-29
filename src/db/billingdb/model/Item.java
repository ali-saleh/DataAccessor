package db.billingdb.model;

public class Item {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.internal_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String internal_number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer entity_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.percentage
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double percentage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.price_manual
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short price_manual;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.has_decimals
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short has_decimals;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.id
     *
     * @return the value of item.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.id
     *
     * @param id the value for item.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.internal_number
     *
     * @return the value of item.internal_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getInternal_number() {
        return internal_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.internal_number
     *
     * @param internal_number the value for item.internal_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInternal_number(String internal_number) {
        this.internal_number = internal_number == null ? null : internal_number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.entity_id
     *
     * @return the value of item.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getEntity_id() {
        return entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.entity_id
     *
     * @param entity_id the value for item.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setEntity_id(Integer entity_id) {
        this.entity_id = entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.percentage
     *
     * @return the value of item.percentage
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.percentage
     *
     * @param percentage the value for item.percentage
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.price_manual
     *
     * @return the value of item.price_manual
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getPrice_manual() {
        return price_manual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.price_manual
     *
     * @param price_manual the value for item.price_manual
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPrice_manual(Short price_manual) {
        this.price_manual = price_manual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.deleted
     *
     * @return the value of item.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.deleted
     *
     * @param deleted the value for item.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.has_decimals
     *
     * @return the value of item.has_decimals
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getHas_decimals() {
        return has_decimals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.has_decimals
     *
     * @param has_decimals the value for item.has_decimals
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setHas_decimals(Short has_decimals) {
        this.has_decimals = has_decimals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.OPTLOCK
     *
     * @return the value of item.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.OPTLOCK
     *
     * @param OPTLOCK the value for item.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}