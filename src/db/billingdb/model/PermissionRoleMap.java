package db.billingdb.model;

public class PermissionRoleMap {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_role_map.permission_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer permission_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission_role_map.role_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_role_map.permission_id
     *
     * @return the value of permission_role_map.permission_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPermission_id() {
        return permission_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_role_map.permission_id
     *
     * @param permission_id the value for permission_role_map.permission_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission_role_map.role_id
     *
     * @return the value of permission_role_map.role_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission_role_map.role_id
     *
     * @param role_id the value for permission_role_map.role_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}