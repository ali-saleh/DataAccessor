package db.billingdb.model;

public class PreferenceType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column preference_type.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column preference_type.int_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer int_def_value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column preference_type.str_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String str_def_value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column preference_type.float_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Double float_def_value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_type.id
     *
     * @return the value of preference_type.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_type.id
     *
     * @param id the value for preference_type.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_type.int_def_value
     *
     * @return the value of preference_type.int_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getInt_def_value() {
        return int_def_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_type.int_def_value
     *
     * @param int_def_value the value for preference_type.int_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInt_def_value(Integer int_def_value) {
        this.int_def_value = int_def_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_type.str_def_value
     *
     * @return the value of preference_type.str_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getStr_def_value() {
        return str_def_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_type.str_def_value
     *
     * @param str_def_value the value for preference_type.str_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setStr_def_value(String str_def_value) {
        this.str_def_value = str_def_value == null ? null : str_def_value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference_type.float_def_value
     *
     * @return the value of preference_type.float_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Double getFloat_def_value() {
        return float_def_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference_type.float_def_value
     *
     * @param float_def_value the value for preference_type.float_def_value
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setFloat_def_value(Double float_def_value) {
        this.float_def_value = float_def_value;
    }
}