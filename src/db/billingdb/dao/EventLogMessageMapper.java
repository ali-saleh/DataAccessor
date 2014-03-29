package db.billingdb.dao;

import db.billingdb.model.EventLogMessage;
import db.billingdb.model.EventLogMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventLogMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(EventLogMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(EventLogMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(EventLogMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(EventLogMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<EventLogMessage> selectByExample(EventLogMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") EventLogMessage record, @Param("example") EventLogMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_log_message
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") EventLogMessage record, @Param("example") EventLogMessageExample example);
}