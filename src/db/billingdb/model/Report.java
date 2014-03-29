package db.billingdb.model;

public class Report {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.titlekey
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String titlekey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.instructionskey
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String instructionskey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.tables_list
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String tables_list;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.where_str
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String where_str;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.id_column
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short id_column;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.link
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String link;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.id
     *
     * @return the value of report.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.id
     *
     * @param id the value for report.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.titlekey
     *
     * @return the value of report.titlekey
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getTitlekey() {
        return titlekey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.titlekey
     *
     * @param titlekey the value for report.titlekey
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTitlekey(String titlekey) {
        this.titlekey = titlekey == null ? null : titlekey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.instructionskey
     *
     * @return the value of report.instructionskey
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getInstructionskey() {
        return instructionskey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.instructionskey
     *
     * @param instructionskey the value for report.instructionskey
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setInstructionskey(String instructionskey) {
        this.instructionskey = instructionskey == null ? null : instructionskey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.tables_list
     *
     * @return the value of report.tables_list
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getTables_list() {
        return tables_list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.tables_list
     *
     * @param tables_list the value for report.tables_list
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setTables_list(String tables_list) {
        this.tables_list = tables_list == null ? null : tables_list.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.where_str
     *
     * @return the value of report.where_str
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getWhere_str() {
        return where_str;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.where_str
     *
     * @param where_str the value for report.where_str
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setWhere_str(String where_str) {
        this.where_str = where_str == null ? null : where_str.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.id_column
     *
     * @return the value of report.id_column
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getId_column() {
        return id_column;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.id_column
     *
     * @param id_column the value for report.id_column
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId_column(Short id_column) {
        this.id_column = id_column;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.link
     *
     * @return the value of report.link
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.link
     *
     * @param link the value for report.link
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.OPTLOCK
     *
     * @return the value of report.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.OPTLOCK
     *
     * @param OPTLOCK the value for report.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}