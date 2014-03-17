package db.billingdb.model;

import java.util.Date;

public class OrderLine {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer order_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.item_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer item_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.amount
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.quantity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short item_price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.description
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.provisioning_status
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer provisioning_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.provisioning_request_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String provisioning_request_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.id
     *
     * @return the value of order_line.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.id
     *
     * @param id the value for order_line.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.order_id
     *
     * @return the value of order_line.order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.order_id
     *
     * @param order_id the value for order_line.order_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.item_id
     *
     * @return the value of order_line.item_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getItem_id() {
        return item_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.item_id
     *
     * @param item_id the value for order_line.item_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.type_id
     *
     * @return the value of order_line.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.type_id
     *
     * @param type_id the value for order_line.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.amount
     *
     * @return the value of order_line.amount
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.amount
     *
     * @param amount the value for order_line.amount
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.quantity
     *
     * @return the value of order_line.quantity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.quantity
     *
     * @param quantity the value for order_line.quantity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.price
     *
     * @return the value of order_line.price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.price
     *
     * @param price the value for order_line.price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.item_price
     *
     * @return the value of order_line.item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getItem_price() {
        return item_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.item_price
     *
     * @param item_price the value for order_line.item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setItem_price(Short item_price) {
        this.item_price = item_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.create_datetime
     *
     * @return the value of order_line.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.create_datetime
     *
     * @param create_datetime the value for order_line.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.deleted
     *
     * @return the value of order_line.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.deleted
     *
     * @param deleted the value for order_line.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.description
     *
     * @return the value of order_line.description
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.description
     *
     * @param description the value for order_line.description
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.provisioning_status
     *
     * @return the value of order_line.provisioning_status
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getProvisioning_status() {
        return provisioning_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.provisioning_status
     *
     * @param provisioning_status the value for order_line.provisioning_status
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setProvisioning_status(Integer provisioning_status) {
        this.provisioning_status = provisioning_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.provisioning_request_id
     *
     * @return the value of order_line.provisioning_request_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getProvisioning_request_id() {
        return provisioning_request_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.provisioning_request_id
     *
     * @param provisioning_request_id the value for order_line.provisioning_request_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setProvisioning_request_id(String provisioning_request_id) {
        this.provisioning_request_id = provisioning_request_id == null ? null : provisioning_request_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.OPTLOCK
     *
     * @return the value of order_line.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.OPTLOCK
     *
     * @param OPTLOCK the value for order_line.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}