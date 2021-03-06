package db.billingdb.dao;

import db.billingdb.model.NotificationMessageType;
import db.billingdb.model.NotificationMessageTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationMessageTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(NotificationMessageTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(NotificationMessageTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(NotificationMessageType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(NotificationMessageType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<NotificationMessageType> selectByExample(NotificationMessageTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    NotificationMessageType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") NotificationMessageType record, @Param("example") NotificationMessageTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") NotificationMessageType record, @Param("example") NotificationMessageTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(NotificationMessageType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(NotificationMessageType record);
}