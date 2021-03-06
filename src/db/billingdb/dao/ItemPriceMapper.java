package db.billingdb.dao;

import db.billingdb.model.ItemPrice;
import db.billingdb.model.ItemPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(ItemPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(ItemPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(ItemPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(ItemPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<ItemPrice> selectByExample(ItemPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    ItemPrice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") ItemPrice record, @Param("example") ItemPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") ItemPrice record, @Param("example") ItemPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(ItemPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(ItemPrice record);
}