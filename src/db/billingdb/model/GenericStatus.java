package db.billingdb.model;

public class GenericStatus {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column generic_status.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column generic_status.dtype
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String dtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column generic_status.status_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer status_value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column generic_status.can_login
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short can_login;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column generic_status.id
     *
     * @return the value of generic_status.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column generic_status.id
     *
     * @param id the value for generic_status.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column generic_status.dtype
     *
     * @return the value of generic_status.dtype
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getDtype() {
        return dtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column generic_status.dtype
     *
     * @param dtype the value for generic_status.dtype
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDtype(String dtype) {
        this.dtype = dtype == null ? null : dtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column generic_status.status_value
     *
     * @return the value of generic_status.status_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getStatus_value() {
        return status_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column generic_status.status_value
     *
     * @param status_value the value for generic_status.status_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setStatus_value(Integer status_value) {
        this.status_value = status_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column generic_status.can_login
     *
     * @return the value of generic_status.can_login
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getCan_login() {
        return can_login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column generic_status.can_login
     *
     * @param can_login the value for generic_status.can_login
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCan_login(Short can_login) {
        this.can_login = can_login;
    }
}