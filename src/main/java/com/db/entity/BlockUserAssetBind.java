package com.db.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BlockUserAssetBind)实体类
 *
 * @author makejava
 * @since 2021-12-25 13:03:11
 */
public class BlockUserAssetBind implements Serializable {
    private static final long serialVersionUID = 516513589366681583L;
    
    private Long id;
    
    private Long userId;
    /**
    * 绑定资产的类型
    */
    private Integer bindType;
    /**
    * 绑定资产的ID
    */
    private Long bindId;
    
    private Date createTime;
    
    private Date updateTime;
    /**
    * 0:业主 1：家庭成员
    */
    private Integer ownership;
    /**
    * 与参考人的关系
    */
    private Integer relation;
    /**
    * 添加人id
    */
    private Long addUserId;
    /**
    * 参考人id
    */
    private Long anchorUserId;
    /**
    * 备注
    */
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getBindType() {
        return bindType;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public Long getBindId() {
        return bindId;
    }

    public void setBindId(Long bindId) {
        this.bindId = bindId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOwnership() {
        return ownership;
    }

    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public Long getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Long addUserId) {
        this.addUserId = addUserId;
    }

    public Long getAnchorUserId() {
        return anchorUserId;
    }

    public void setAnchorUserId(Long anchorUserId) {
        this.anchorUserId = anchorUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}