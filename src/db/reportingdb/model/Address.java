package db.reportingdb.model;

public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.address_id
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private Integer address_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.city
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.street
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private String street;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.building
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private String building;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.near
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    private String near;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.address_id
     *
     * @return the value of address.address_id
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public Integer getAddress_id() {
        return address_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.address_id
     *
     * @param address_id the value for address.address_id
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.city
     *
     * @return the value of address.city
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.city
     *
     * @param city the value for address.city
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.street
     *
     * @return the value of address.street
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public String getStreet() {
        return street;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.street
     *
     * @param street the value for address.street
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.building
     *
     * @return the value of address.building
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public String getBuilding() {
        return building;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.building
     *
     * @param building the value for address.building
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.near
     *
     * @return the value of address.near
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public String getNear() {
        return near;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.near
     *
     * @param near the value for address.near
     *
     * @mbggenerated Wed Apr 23 22:50:30 IDT 2014
     */
    public void setNear(String near) {
        this.near = near == null ? null : near.trim();
    }
}