package db.billingdb.model;

import java.util.Date;

public class NotificationMessageArch {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_arch.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_arch.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_arch.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_arch.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_arch.result_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String result_message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_arch.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_arch.id
     *
     * @return the value of notification_message_arch.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_arch.id
     *
     * @param id the value for notification_message_arch.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_arch.type_id
     *
     * @return the value of notification_message_arch.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_arch.type_id
     *
     * @param type_id the value for notification_message_arch.type_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_arch.create_datetime
     *
     * @return the value of notification_message_arch.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_arch.create_datetime
     *
     * @param create_datetime the value for notification_message_arch.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_arch.user_id
     *
     * @return the value of notification_message_arch.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_arch.user_id
     *
     * @param user_id the value for notification_message_arch.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_arch.result_message
     *
     * @return the value of notification_message_arch.result_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getResult_message() {
        return result_message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_arch.result_message
     *
     * @param result_message the value for notification_message_arch.result_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setResult_message(String result_message) {
        this.result_message = result_message == null ? null : result_message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_arch.OPTLOCK
     *
     * @return the value of notification_message_arch.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_arch.OPTLOCK
     *
     * @param OPTLOCK the value for notification_message_arch.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}