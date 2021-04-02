package com.chryl.sharding.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table goods
 */
public class Goods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.good_id
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    private String goodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.good_name
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    private String goodName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.good_id
     *
     * @return the value of goods.good_id
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.good_id
     *
     * @param goodId the value for goods.good_id
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.good_name
     *
     * @return the value of goods.good_name
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    public String getGoodName() {
        return goodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.good_name
     *
     * @param goodName the value for goods.good_name
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Fri Apr 02 11:06:25 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodId=").append(goodId);
        sb.append(", goodName=").append(goodName);
        sb.append("]");
        return sb.toString();
    }
}