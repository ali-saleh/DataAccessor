package db.billingdb.model;

public class NotificationMessageLine {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_line.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_line.message_section_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer message_section_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_line.content
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification_message_line.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_line.id
     *
     * @return the value of notification_message_line.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_line.id
     *
     * @param id the value for notification_message_line.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_line.message_section_id
     *
     * @return the value of notification_message_line.message_section_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getMessage_section_id() {
        return message_section_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_line.message_section_id
     *
     * @param message_section_id the value for notification_message_line.message_section_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setMessage_section_id(Integer message_section_id) {
        this.message_section_id = message_section_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_line.content
     *
     * @return the value of notification_message_line.content
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_line.content
     *
     * @param content the value for notification_message_line.content
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification_message_line.OPTLOCK
     *
     * @return the value of notification_message_line.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification_message_line.OPTLOCK
     *
     * @param OPTLOCK the value for notification_message_line.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}