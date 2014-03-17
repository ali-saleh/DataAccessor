package db.billingdb.dao;

import db.billingdb.model.ReportField;
import db.billingdb.model.ReportFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportFieldMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(ReportFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(ReportFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(ReportField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(ReportField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<ReportField> selectByExample(ReportFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    ReportField selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") ReportField record, @Param("example") ReportFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") ReportField record, @Param("example") ReportFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(ReportField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(ReportField record);
}