package db.billingdb.dao;

import db.billingdb.model.PermissionType;
import db.billingdb.model.PermissionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(PermissionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(PermissionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(PermissionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(PermissionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<PermissionType> selectByExample(PermissionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    PermissionType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") PermissionType record, @Param("example") PermissionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") PermissionType record, @Param("example") PermissionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(PermissionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(PermissionType record);
}