package db.billingdb.model;

import java.util.Date;

public class EventLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer entity_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.affected_user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer affected_user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.table_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer table_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer foreign_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.level_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer level_field;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.module_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer module_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.message_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer message_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.old_num
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer old_num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.old_str
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String old_str;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.old_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date old_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_log.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.id
     *
     * @return the value of event_log.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.id
     *
     * @param id the value for event_log.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.entity_id
     *
     * @return the value of event_log.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getEntity_id() {
        return entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.entity_id
     *
     * @param entity_id the value for event_log.entity_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setEntity_id(Integer entity_id) {
        this.entity_id = entity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.user_id
     *
     * @return the value of event_log.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.user_id
     *
     * @param user_id the value for event_log.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.affected_user_id
     *
     * @return the value of event_log.affected_user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getAffected_user_id() {
        return affected_user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.affected_user_id
     *
     * @param affected_user_id the value for event_log.affected_user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setAffected_user_id(Integer affected_user_id) {
        this.affected_user_id = affected_user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.table_id
     *
     * @return the value of event_log.table_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getTable_id() {
        return table_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.table_id
     *
     * @param table_id the value for event_log.table_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTable_id(Integer table_id) {
        this.table_id = table_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.foreign_id
     *
     * @return the value of event_log.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getForeign_id() {
        return foreign_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.foreign_id
     *
     * @param foreign_id the value for event_log.foreign_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setForeign_id(Integer foreign_id) {
        this.foreign_id = foreign_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.create_datetime
     *
     * @return the value of event_log.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.create_datetime
     *
     * @param create_datetime the value for event_log.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.level_field
     *
     * @return the value of event_log.level_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getLevel_field() {
        return level_field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.level_field
     *
     * @param level_field the value for event_log.level_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLevel_field(Integer level_field) {
        this.level_field = level_field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.module_id
     *
     * @return the value of event_log.module_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getModule_id() {
        return module_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.module_id
     *
     * @param module_id the value for event_log.module_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setModule_id(Integer module_id) {
        this.module_id = module_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.message_id
     *
     * @return the value of event_log.message_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getMessage_id() {
        return message_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.message_id
     *
     * @param message_id the value for event_log.message_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.old_num
     *
     * @return the value of event_log.old_num
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOld_num() {
        return old_num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.old_num
     *
     * @param old_num the value for event_log.old_num
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOld_num(Integer old_num) {
        this.old_num = old_num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.old_str
     *
     * @return the value of event_log.old_str
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getOld_str() {
        return old_str;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.old_str
     *
     * @param old_str the value for event_log.old_str
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOld_str(String old_str) {
        this.old_str = old_str == null ? null : old_str.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.old_date
     *
     * @return the value of event_log.old_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getOld_date() {
        return old_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.old_date
     *
     * @param old_date the value for event_log.old_date
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOld_date(Date old_date) {
        this.old_date = old_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event_log.OPTLOCK
     *
     * @return the value of event_log.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event_log.OPTLOCK
     *
     * @param OPTLOCK the value for event_log.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}