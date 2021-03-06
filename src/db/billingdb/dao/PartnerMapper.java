package db.billingdb.dao;

import db.billingdb.model.Partner;
import db.billingdb.model.PartnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(PartnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(PartnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Partner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Partner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Partner> selectByExample(PartnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Partner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Partner record, @Param("example") PartnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Partner record, @Param("example") PartnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Partner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Partner record);
}