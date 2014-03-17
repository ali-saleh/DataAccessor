package db.billingdb.dao;

import db.billingdb.model.PreferenceType;
import db.billingdb.model.PreferenceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreferenceTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(PreferenceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(PreferenceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(PreferenceType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(PreferenceType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<PreferenceType> selectByExample(PreferenceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    PreferenceType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") PreferenceType record, @Param("example") PreferenceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") PreferenceType record, @Param("example") PreferenceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(PreferenceType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(PreferenceType record);
}