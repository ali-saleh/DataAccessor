package db.billingdb.dao;

import db.billingdb.model.PaymentInfoCheque;
import db.billingdb.model.PaymentInfoChequeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentInfoChequeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(PaymentInfoChequeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(PaymentInfoChequeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(PaymentInfoCheque record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(PaymentInfoCheque record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<PaymentInfoCheque> selectByExample(PaymentInfoChequeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    PaymentInfoCheque selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") PaymentInfoCheque record, @Param("example") PaymentInfoChequeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") PaymentInfoCheque record, @Param("example") PaymentInfoChequeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(PaymentInfoCheque record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_info_cheque
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(PaymentInfoCheque record);
}