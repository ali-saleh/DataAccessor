package db.billingdb.dao;

import db.billingdb.model.Language;
import db.billingdb.model.LanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int countByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insert(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int insertSelective(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    List<Language> selectByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    Language selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExampleSelective(@Param("record") Language record, @Param("example") LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByExample(@Param("record") Language record, @Param("example") LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKeySelective(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    int updateByPrimaryKey(Language record);
}