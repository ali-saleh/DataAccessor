package db.billingdb.dao;

import db.billingdb.model.JbillingTable;
import db.billingdb.model.JbillingTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbillingTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(JbillingTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(JbillingTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(JbillingTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(JbillingTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<JbillingTable> selectByExample(JbillingTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    JbillingTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") JbillingTable record, @Param("example") JbillingTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") JbillingTable record, @Param("example") JbillingTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(JbillingTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_table
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(JbillingTable record);
}