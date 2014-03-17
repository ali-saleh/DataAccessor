package db.billingdb.model;

import java.util.Date;

public class Contact {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.organization_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String organization_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.street_addres1
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String street_addres1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.street_addres2
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String street_addres2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.city
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.state_province
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String state_province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.postal_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String postal_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String country_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.last_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String last_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.first_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String first_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.person_initial
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String person_initial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.person_title
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String person_title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.phone_country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer phone_country_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.phone_area_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer phone_area_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.phone_phone_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String phone_phone_number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.fax_country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer fax_country_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.fax_area_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer fax_area_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.fax_phone_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String fax_phone_number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.email
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Date create_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.notification_include
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Short notification_include;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    private Integer OPTLOCK;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.id
     *
     * @return the value of contact.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.id
     *
     * @param id the value for contact.id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.organization_name
     *
     * @return the value of contact.organization_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getOrganization_name() {
        return organization_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.organization_name
     *
     * @param organization_name the value for contact.organization_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name == null ? null : organization_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.street_addres1
     *
     * @return the value of contact.street_addres1
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getStreet_addres1() {
        return street_addres1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.street_addres1
     *
     * @param street_addres1 the value for contact.street_addres1
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setStreet_addres1(String street_addres1) {
        this.street_addres1 = street_addres1 == null ? null : street_addres1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.street_addres2
     *
     * @return the value of contact.street_addres2
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getStreet_addres2() {
        return street_addres2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.street_addres2
     *
     * @param street_addres2 the value for contact.street_addres2
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setStreet_addres2(String street_addres2) {
        this.street_addres2 = street_addres2 == null ? null : street_addres2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.city
     *
     * @return the value of contact.city
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.city
     *
     * @param city the value for contact.city
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.state_province
     *
     * @return the value of contact.state_province
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getState_province() {
        return state_province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.state_province
     *
     * @param state_province the value for contact.state_province
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setState_province(String state_province) {
        this.state_province = state_province == null ? null : state_province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.postal_code
     *
     * @return the value of contact.postal_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getPostal_code() {
        return postal_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.postal_code
     *
     * @param postal_code the value for contact.postal_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code == null ? null : postal_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.country_code
     *
     * @return the value of contact.country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.country_code
     *
     * @param country_code the value for contact.country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCountry_code(String country_code) {
        this.country_code = country_code == null ? null : country_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.last_name
     *
     * @return the value of contact.last_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.last_name
     *
     * @param last_name the value for contact.last_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name == null ? null : last_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.first_name
     *
     * @return the value of contact.first_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.first_name
     *
     * @param first_name the value for contact.first_name
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name == null ? null : first_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.person_initial
     *
     * @return the value of contact.person_initial
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getPerson_initial() {
        return person_initial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.person_initial
     *
     * @param person_initial the value for contact.person_initial
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPerson_initial(String person_initial) {
        this.person_initial = person_initial == null ? null : person_initial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.person_title
     *
     * @return the value of contact.person_title
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getPerson_title() {
        return person_title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.person_title
     *
     * @param person_title the value for contact.person_title
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPerson_title(String person_title) {
        this.person_title = person_title == null ? null : person_title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.phone_country_code
     *
     * @return the value of contact.phone_country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPhone_country_code() {
        return phone_country_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.phone_country_code
     *
     * @param phone_country_code the value for contact.phone_country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPhone_country_code(Integer phone_country_code) {
        this.phone_country_code = phone_country_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.phone_area_code
     *
     * @return the value of contact.phone_area_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getPhone_area_code() {
        return phone_area_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.phone_area_code
     *
     * @param phone_area_code the value for contact.phone_area_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPhone_area_code(Integer phone_area_code) {
        this.phone_area_code = phone_area_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.phone_phone_number
     *
     * @return the value of contact.phone_phone_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getPhone_phone_number() {
        return phone_phone_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.phone_phone_number
     *
     * @param phone_phone_number the value for contact.phone_phone_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setPhone_phone_number(String phone_phone_number) {
        this.phone_phone_number = phone_phone_number == null ? null : phone_phone_number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.fax_country_code
     *
     * @return the value of contact.fax_country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getFax_country_code() {
        return fax_country_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.fax_country_code
     *
     * @param fax_country_code the value for contact.fax_country_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setFax_country_code(Integer fax_country_code) {
        this.fax_country_code = fax_country_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.fax_area_code
     *
     * @return the value of contact.fax_area_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getFax_area_code() {
        return fax_area_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.fax_area_code
     *
     * @param fax_area_code the value for contact.fax_area_code
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setFax_area_code(Integer fax_area_code) {
        this.fax_area_code = fax_area_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.fax_phone_number
     *
     * @return the value of contact.fax_phone_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getFax_phone_number() {
        return fax_phone_number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.fax_phone_number
     *
     * @param fax_phone_number the value for contact.fax_phone_number
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setFax_phone_number(String fax_phone_number) {
        this.fax_phone_number = fax_phone_number == null ? null : fax_phone_number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.email
     *
     * @return the value of contact.email
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.email
     *
     * @param email the value for contact.email
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.create_datetime
     *
     * @return the value of contact.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Date getCreate_datetime() {
        return create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.create_datetime
     *
     * @param create_datetime the value for contact.create_datetime
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.deleted
     *
     * @return the value of contact.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.deleted
     *
     * @param deleted the value for contact.deleted
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.notification_include
     *
     * @return the value of contact.notification_include
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Short getNotification_include() {
        return notification_include;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.notification_include
     *
     * @param notification_include the value for contact.notification_include
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setNotification_include(Short notification_include) {
        this.notification_include = notification_include;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.user_id
     *
     * @return the value of contact.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.user_id
     *
     * @param user_id the value for contact.user_id
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.OPTLOCK
     *
     * @return the value of contact.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Integer getOPTLOCK() {
        return OPTLOCK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.OPTLOCK
     *
     * @param OPTLOCK the value for contact.OPTLOCK
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOPTLOCK(Integer OPTLOCK) {
        this.OPTLOCK = OPTLOCK;
    }
}