package db.billingdb.dao;

import db.billingdb.model.NotificationMessageArch;
import db.billingdb.model.NotificationMessageArchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationMessageArchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(NotificationMessageArchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(NotificationMessageArchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(NotificationMessageArch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(NotificationMessageArch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<NotificationMessageArch> selectByExample(NotificationMessageArchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    NotificationMessageArch selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") NotificationMessageArch record, @Param("example") NotificationMessageArchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") NotificationMessageArch record, @Param("example") NotificationMessageArchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(NotificationMessageArch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(NotificationMessageArch record);
}