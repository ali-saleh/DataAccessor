package db.billingdb.model;

public class UserRoleMap {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_map.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_map.role_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_map.user_id
     *
     * @return the value of user_role_map.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_map.user_id
     *
     * @param user_id the value for user_role_map.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_map.role_id
     *
     * @return the value of user_role_map.role_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_map.role_id
     *
     * @param role_id the value for user_role_map.role_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}