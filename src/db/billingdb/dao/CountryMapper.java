package db.billingdb.dao;

import db.billingdb.model.Country;
import db.billingdb.model.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Country> selectByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Country selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Country record);
}