package db.billingdb.model;

public class InternationalDescription extends InternationalDescriptionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column international_description.content
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column international_description.content
     *
     * @return the value of international_description.content
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column international_description.content
     *
     * @param content the value for international_description.content
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}