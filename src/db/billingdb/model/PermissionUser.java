package db.billingdb.model;

public class PermissionUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_user.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_user.permission_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer permission_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_user.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_user.is_grant
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short is_grant;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_user.id
     *
     * @return the value of permission_user.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_user.id
     *
     * @param id the value for permission_user.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_user.permission_id
     *
     * @return the value of permission_user.permission_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPermission_id() {
        return permission_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_user.permission_id
     *
     * @param permission_id the value for permission_user.permission_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_user.user_id
     *
     * @return the value of permission_user.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_user.user_id
     *
     * @param user_id the value for permission_user.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_user.is_grant
     *
     * @return the value of permission_user.is_grant
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getIs_grant() {
        return is_grant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_user.is_grant
     *
     * @param is_grant the value for permission_user.is_grant
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setIs_grant(Short is_grant) {
        this.is_grant = is_grant;
    }
}