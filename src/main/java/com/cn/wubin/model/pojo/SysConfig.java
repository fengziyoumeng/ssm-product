package com.cn.wubin.model.pojo;

import java.io.Serializable;

public class SysConfig implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 类型
     */
    private Byte type;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 编号
     */
    private String code;

    /**
     * 参数对应的值
     */
    private String value;

    /**
     * 状态  0不启用  1启用
     */
    private Boolean status;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * 创建者
     */
    private Integer creator;

    /**
     * arc_sys_config
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 类型
     * @return type 类型
     */
    public Byte getType() {
        return type;
    }

    /**
     * 类型
     * @param type 类型
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 参数名称
     * @return name 参数名称
     */
    public String getName() {
        return name;
    }

    /**
     * 参数名称
     * @param name 参数名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 编号
     * @return code 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 编号
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 参数对应的值
     * @return value 参数对应的值
     */
    public String getValue() {
        return value;
    }

    /**
     * 参数对应的值
     * @param value 参数对应的值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 状态  0不启用  1启用
     * @return status 状态  0不启用  1启用
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 状态  0不启用  1启用
     * @param status 状态  0不启用  1启用
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 备注说明
     * @return remark 备注说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注说明
     * @param remark 备注说明
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 创建者
     * @return creator 创建者
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 创建者
     * @param creator 创建者
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     *
     * @mbggenerated 2018-01-20
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
        SysConfig other = (SysConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()));
    }

    /**
     *
     * @mbggenerated 2018-01-20
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        return result;
    }

    /**
     *
     * @mbggenerated 2018-01-20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", value=").append(value);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", creator=").append(creator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}