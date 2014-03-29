package db.billingdb.dao;

import db.billingdb.model.Preference;
import db.billingdb.model.PreferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreferenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(PreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(PreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Preference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Preference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Preference> selectByExample(PreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Preference selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Preference record, @Param("example") PreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Preference record, @Param("example") PreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Preference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table preference
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Preference record);
}