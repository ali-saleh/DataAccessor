package db.billingdb.dao;

import db.billingdb.model.JbillingSeqs;
import db.billingdb.model.JbillingSeqsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbillingSeqsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(JbillingSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(JbillingSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(JbillingSeqs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(JbillingSeqs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<JbillingSeqs> selectByExample(JbillingSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") JbillingSeqs record, @Param("example") JbillingSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbilling_seqs
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") JbillingSeqs record, @Param("example") JbillingSeqsExample example);
}