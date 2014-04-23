package db.reportingdb.dao;

import db.reportingdb.model.VatHistory;
import db.reportingdb.model.VatHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VatHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int countByExample(VatHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int deleteByExample(VatHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int insert(VatHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int insertSelective(VatHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    List<VatHistory> selectByExample(VatHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    VatHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int updateByExampleSelective(@Param("record") VatHistory record, @Param("example") VatHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int updateByExample(@Param("record") VatHistory record, @Param("example") VatHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int updateByPrimaryKeySelective(VatHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vat_history
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    int updateByPrimaryKey(VatHistory record);
}