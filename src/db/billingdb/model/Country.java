package db.billingdb.model;

public class Country {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.id
     *
     * @return the value of country.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.id
     *
     * @param id the value for country.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.code
     *
     * @return the value of country.code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.code
     *
     * @param code the value for country.code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}