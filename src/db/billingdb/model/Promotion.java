package db.billingdb.model;

import java.util.Date;

public class Promotion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.item_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer item_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.once
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short once;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.since
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date since;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotion.until
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date until;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.id
     *
     * @return the value of promotion.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.id
     *
     * @param id the value for promotion.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.item_id
     *
     * @return the value of promotion.item_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getItem_id() {
        return item_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.item_id
     *
     * @param item_id the value for promotion.item_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.code
     *
     * @return the value of promotion.code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.code
     *
     * @param code the value for promotion.code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.notes
     *
     * @return the value of promotion.notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.notes
     *
     * @param notes the value for promotion.notes
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.once
     *
     * @return the value of promotion.once
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getOnce() {
        return once;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.once
     *
     * @param once the value for promotion.once
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOnce(Short once) {
        this.once = once;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.since
     *
     * @return the value of promotion.since
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getSince() {
        return since;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.since
     *
     * @param since the value for promotion.since
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setSince(Date since) {
        this.since = since;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotion.until
     *
     * @return the value of promotion.until
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getUntil() {
        return until;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotion.until
     *
     * @param until the value for promotion.until
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUntil(Date until) {
        this.until = until;
    }
}