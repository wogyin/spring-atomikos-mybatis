package com.oneapm.atomikos.b.domain;

public class TblB {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_b.b1
     *
     * @mbggenerated
     */
    private Integer b1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_b.b2
     *
     * @mbggenerated
     */
    private String b2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_b.b1
     *
     * @return the value of tbl_b.b1
     *
     * @mbggenerated
     */
    public Integer getB1() {
        return b1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_b.b1
     *
     * @param b1 the value for tbl_b.b1
     *
     * @mbggenerated
     */
    public void setB1(Integer b1) {
        this.b1 = b1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_b.b2
     *
     * @return the value of tbl_b.b2
     *
     * @mbggenerated
     */
    public String getB2() {
        return b2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_b.b2
     *
     * @param b2 the value for tbl_b.b2
     *
     * @mbggenerated
     */
    public void setB2(String b2) {
        this.b2 = b2 == null ? null : b2.trim();
    }
}