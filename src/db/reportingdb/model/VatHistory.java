package db.reportingdb.model;

import java.sql.Date;

public class VatHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vat_history.id
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vat_history.VAT_Value
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private Double VAT_Value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vat_history.start_date
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private Date start_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vat_history.end_date
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private Date end_date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vat_history.id
     *
     * @return the value of vat_history.id
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vat_history.id
     *
     * @param id the value for vat_history.id
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vat_history.VAT_Value
     *
     * @return the value of vat_history.VAT_Value
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public Double getVAT_Value() {
        return VAT_Value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vat_history.VAT_Value
     *
     * @param VAT_Value the value for vat_history.VAT_Value
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setVAT_Value(Double VAT_Value) {
        this.VAT_Value = VAT_Value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vat_history.start_date
     *
     * @return the value of vat_history.start_date
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public Date getStart_date() {
        return start_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vat_history.start_date
     *
     * @param start_date the value for vat_history.start_date
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vat_history.end_date
     *
     * @return the value of vat_history.end_date
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public Date getEnd_date() {
        return end_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vat_history.end_date
     *
     * @param end_date the value for vat_history.end_date
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}