package db.billingdb.dao;

import db.billingdb.model.Customer;
import db.billingdb.model.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Customer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Customer record);
}