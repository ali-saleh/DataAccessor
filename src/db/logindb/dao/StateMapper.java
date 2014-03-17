package db.logindb.dao;

import db.logindb.model.State;
import db.logindb.model.StateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int countByExample(StateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int deleteByExample(StateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int deleteByPrimaryKey(Integer state_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int insert(State record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int insertSelective(State record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    List<State> selectByExample(StateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    State selectByPrimaryKey(Integer state_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int updateByExampleSelective(@Param("record") State record, @Param("example") StateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int updateByExample(@Param("record") State record, @Param("example") StateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int updateByPrimaryKeySelective(State record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table state
     *
     * @mbggenerated Tue Feb 18 21:53:49 IST 2014
     */
    int updateByPrimaryKey(State record);
}