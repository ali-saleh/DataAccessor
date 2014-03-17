package db.billingdb.model;

public class InternationalDescriptionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column international_description.table_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer table_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column international_description.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer foreign_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column international_description.psudo_column
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String psudo_column;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column international_description.language_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer language_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column international_description.table_id
     *
     * @return the value of international_description.table_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getTable_id() {
        return table_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column international_description.table_id
     *
     * @param table_id the value for international_description.table_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTable_id(Integer table_id) {
        this.table_id = table_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column international_description.foreign_id
     *
     * @return the value of international_description.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getForeign_id() {
        return foreign_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column international_description.foreign_id
     *
     * @param foreign_id the value for international_description.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setForeign_id(Integer foreign_id) {
        this.foreign_id = foreign_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column international_description.psudo_column
     *
     * @return the value of international_description.psudo_column
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getPsudo_column() {
        return psudo_column;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column international_description.psudo_column
     *
     * @param psudo_column the value for international_description.psudo_column
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPsudo_column(String psudo_column) {
        this.psudo_column = psudo_column == null ? null : psudo_column.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column international_description.language_id
     *
     * @return the value of international_description.language_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getLanguage_id() {
        return language_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column international_description.language_id
     *
     * @param language_id the value for international_description.language_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }
}