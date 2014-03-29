package db.billingdb.model;

public class MenuOption {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_option.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_option.link
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String link;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_option.level_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer level_field;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_option.parent_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer parent_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_option.id
     *
     * @return the value of menu_option.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_option.id
     *
     * @param id the value for menu_option.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_option.link
     *
     * @return the value of menu_option.link
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_option.link
     *
     * @param link the value for menu_option.link
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_option.level_field
     *
     * @return the value of menu_option.level_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getLevel_field() {
        return level_field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_option.level_field
     *
     * @param level_field the value for menu_option.level_field
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLevel_field(Integer level_field) {
        this.level_field = level_field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_option.parent_id
     *
     * @return the value of menu_option.parent_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getParent_id() {
        return parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_option.parent_id
     *
     * @param parent_id the value for menu_option.parent_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }
}