package db.billingdb.model;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer foreign_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.id
     *
     * @return the value of permission.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.id
     *
     * @param id the value for permission.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.type_id
     *
     * @return the value of permission.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.type_id
     *
     * @param type_id the value for permission.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.foreign_id
     *
     * @return the value of permission.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getForeign_id() {
        return foreign_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.foreign_id
     *
     * @param foreign_id the value for permission.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setForeign_id(Integer foreign_id) {
        this.foreign_id = foreign_id;
    }
}