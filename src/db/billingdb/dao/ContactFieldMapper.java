package db.billingdb.dao;

import db.billingdb.model.ContactField;
import db.billingdb.model.ContactFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactFieldMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(ContactFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(ContactFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(ContactField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(ContactField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<ContactField> selectByExample(ContactFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    ContactField selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") ContactField record, @Param("example") ContactFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") ContactField record, @Param("example") ContactFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(ContactField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(ContactField record);
}