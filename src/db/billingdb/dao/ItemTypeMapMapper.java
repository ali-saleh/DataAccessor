package db.billingdb.dao;

import db.billingdb.model.ItemTypeMap;
import db.billingdb.model.ItemTypeMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemTypeMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(ItemTypeMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(ItemTypeMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(ItemTypeMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(ItemTypeMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<ItemTypeMap> selectByExample(ItemTypeMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") ItemTypeMap record, @Param("example") ItemTypeMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_type_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") ItemTypeMap record, @Param("example") ItemTypeMapExample example);
}