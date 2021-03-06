package db.billingdb.model;

import java.util.Date;

public class ReportUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report_user.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report_user.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report_user.report_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer report_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report_user.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report_user.title
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report_user.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_user.id
     *
     * @return the value of report_user.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_user.id
     *
     * @param id the value for report_user.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_user.user_id
     *
     * @return the value of report_user.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_user.user_id
     *
     * @param user_id the value for report_user.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_user.report_id
     *
     * @return the value of report_user.report_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getReport_id() {
        return report_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_user.report_id
     *
     * @param report_id the value for report_user.report_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setReport_id(Integer report_id) {
        this.report_id = report_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_user.create_datetime
     *
     * @return the value of report_user.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_user.create_datetime
     *
     * @param create_datetime the value for report_user.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_user.title
     *
     * @return the value of report_user.title
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_user.title
     *
     * @param title the value for report_user.title
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report_user.OPTLOCK
     *
     * @return the value of report_user.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report_user.OPTLOCK
     *
     * @param OPTLOCK the value for report_user.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}