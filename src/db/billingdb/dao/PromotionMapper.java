package db.billingdb.dao;

import db.billingdb.model.Promotion;
import db.billingdb.model.PromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(PromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(PromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Promotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Promotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Promotion> selectByExample(PromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Promotion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Promotion record, @Param("example") PromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Promotion record, @Param("example") PromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Promotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Promotion record);
}