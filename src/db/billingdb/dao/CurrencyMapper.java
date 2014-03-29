package db.billingdb.dao;

import db.billingdb.model.Currency;
import db.billingdb.model.CurrencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(CurrencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(CurrencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Currency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Currency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Currency> selectByExample(CurrencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Currency selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Currency record, @Param("example") CurrencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Currency record, @Param("example") CurrencyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Currency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table currency
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Currency record);
}