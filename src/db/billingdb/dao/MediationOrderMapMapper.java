package db.billingdb.dao;

import db.billingdb.model.MediationOrderMap;
import db.billingdb.model.MediationOrderMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediationOrderMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(MediationOrderMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(MediationOrderMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(MediationOrderMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(MediationOrderMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<MediationOrderMap> selectByExample(MediationOrderMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") MediationOrderMap record, @Param("example") MediationOrderMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mediation_order_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") MediationOrderMap record, @Param("example") MediationOrderMapExample example);
}