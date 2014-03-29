package db.billingdb.dao;

import db.billingdb.model.InvoiceLineType;
import db.billingdb.model.InvoiceLineTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceLineTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(InvoiceLineTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(InvoiceLineTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(InvoiceLineType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(InvoiceLineType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<InvoiceLineType> selectByExample(InvoiceLineTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    InvoiceLineType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") InvoiceLineType record, @Param("example") InvoiceLineTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") InvoiceLineType record, @Param("example") InvoiceLineTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(InvoiceLineType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice_line_type
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(InvoiceLineType record);
}