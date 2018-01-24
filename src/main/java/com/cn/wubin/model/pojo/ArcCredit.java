package com.cn.wubin.model.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ArcCredit implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户标识
     */
    private String consumer_no;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 额度类型
     */
    private Long credit_type;

    /**
     * 评分
     */
    private String grade;

    /**
     * 已使用额度
     */
    private BigDecimal used;

    /**
     * 可使用额度
     */
    private BigDecimal unuse;

    /**
     * 状态 10 -正常 20-冻结
     */
    private String state;

    /**
     * 扩展字段
     */
    private String req_ext;

    /**
     * 
     */
    private Long user_id;

    /**
     * arc_credit_0
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户标识
     * @return consumer_no 用户标识
     */
    public String getConsumer_no() {
        return consumer_no;
    }

    /**
     * 用户标识
     * @param consumer_no 用户标识
     */
    public void setConsumer_no(String consumer_no) {
        this.consumer_no = consumer_no == null ? null : consumer_no.trim();
    }

    /**
     * 总额度
     * @return total 总额度
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 总额度
     * @param total 总额度
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * 额度类型
     * @return credit_type 额度类型
     */
    public Long getCredit_type() {
        return credit_type;
    }

    /**
     * 额度类型
     * @param credit_type 额度类型
     */
    public void setCredit_type(Long credit_type) {
        this.credit_type = credit_type;
    }

    /**
     * 评分
     * @return grade 评分
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 评分
     * @param grade 评分
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * 已使用额度
     * @return used 已使用额度
     */
    public BigDecimal getUsed() {
        return used;
    }

    /**
     * 已使用额度
     * @param used 已使用额度
     */
    public void setUsed(BigDecimal used) {
        this.used = used;
    }

    /**
     * 可使用额度
     * @return unuse 可使用额度
     */
    public BigDecimal getUnuse() {
        return unuse;
    }

    /**
     * 可使用额度
     * @param unuse 可使用额度
     */
    public void setUnuse(BigDecimal unuse) {
        this.unuse = unuse;
    }

    /**
     * 状态 10 -正常 20-冻结
     * @return state 状态 10 -正常 20-冻结
     */
    public String getState() {
        return state;
    }

    /**
     * 状态 10 -正常 20-冻结
     * @param state 状态 10 -正常 20-冻结
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 扩展字段
     * @return req_ext 扩展字段
     */
    public String getReq_ext() {
        return req_ext;
    }

    /**
     * 扩展字段
     * @param req_ext 扩展字段
     */
    public void setReq_ext(String req_ext) {
        this.req_ext = req_ext == null ? null : req_ext.trim();
    }

    /**
     * 
     * @return user_id 
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * 
     * @param user_id 
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     *
     * @mbggenerated 2018-01-24
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ArcCredit other = (ArcCredit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConsumer_no() == null ? other.getConsumer_no() == null : this.getConsumer_no().equals(other.getConsumer_no()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getCredit_type() == null ? other.getCredit_type() == null : this.getCredit_type().equals(other.getCredit_type()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getUsed() == null ? other.getUsed() == null : this.getUsed().equals(other.getUsed()))
            && (this.getUnuse() == null ? other.getUnuse() == null : this.getUnuse().equals(other.getUnuse()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getReq_ext() == null ? other.getReq_ext() == null : this.getReq_ext().equals(other.getReq_ext()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()));
    }

    /**
     *
     * @mbggenerated 2018-01-24
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConsumer_no() == null) ? 0 : getConsumer_no().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getCredit_type() == null) ? 0 : getCredit_type().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getUsed() == null) ? 0 : getUsed().hashCode());
        result = prime * result + ((getUnuse() == null) ? 0 : getUnuse().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getReq_ext() == null) ? 0 : getReq_ext().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        return result;
    }

    /**
     *
     * @mbggenerated 2018-01-24
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", consumer_no=").append(consumer_no);
        sb.append(", total=").append(total);
        sb.append(", credit_type=").append(credit_type);
        sb.append(", grade=").append(grade);
        sb.append(", used=").append(used);
        sb.append(", unuse=").append(unuse);
        sb.append(", state=").append(state);
        sb.append(", req_ext=").append(req_ext);
        sb.append(", user_id=").append(user_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}