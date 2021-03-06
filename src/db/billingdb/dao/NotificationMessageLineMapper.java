package db.billingdb.dao;

import db.billingdb.model.NotificationMessageLine;
import db.billingdb.model.NotificationMessageLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationMessageLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(NotificationMessageLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(NotificationMessageLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(NotificationMessageLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(NotificationMessageLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<NotificationMessageLine> selectByExample(NotificationMessageLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    NotificationMessageLine selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") NotificationMessageLine record, @Param("example") NotificationMessageLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") NotificationMessageLine record, @Param("example") NotificationMessageLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(NotificationMessageLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(NotificationMessageLine record);
}