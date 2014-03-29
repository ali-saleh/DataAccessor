package db.billingdb.model;

public class InvoiceLineType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice_line_type.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice_line_type.description
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice_line_type.order_position
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer order_position;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice_line_type.id
     *
     * @return the value of invoice_line_type.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice_line_type.id
     *
     * @param id the value for invoice_line_type.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice_line_type.description
     *
     * @return the value of invoice_line_type.description
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice_line_type.description
     *
     * @param description the value for invoice_line_type.description
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice_line_type.order_position
     *
     * @return the value of invoice_line_type.order_position
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOrder_position() {
        return order_position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice_line_type.order_position
     *
     * @param order_position the value for invoice_line_type.order_position
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrder_position(Integer order_position) {
        this.order_position = order_position;
    }
}