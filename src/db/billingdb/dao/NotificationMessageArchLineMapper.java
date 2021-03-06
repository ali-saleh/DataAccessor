package db.billingdb.dao;

import db.billingdb.model.NotificationMessageArchLine;
import db.billingdb.model.NotificationMessageArchLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationMessageArchLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(NotificationMessageArchLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(NotificationMessageArchLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(NotificationMessageArchLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(NotificationMessageArchLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<NotificationMessageArchLine> selectByExample(NotificationMessageArchLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    NotificationMessageArchLine selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") NotificationMessageArchLine record, @Param("example") NotificationMessageArchLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") NotificationMessageArchLine record, @Param("example") NotificationMessageArchLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(NotificationMessageArchLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch_line
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(NotificationMessageArchLine record);
}