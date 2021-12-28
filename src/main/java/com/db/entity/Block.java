package com.db.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Block)实体类
 *
 * @author makejava
 * @since 2021-12-25 13:04:14
 */
public class Block implements Serializable {
    private static final long serialVersionUID = -35771173712006907L;
    
    private Long id;
    /**
    * 社区id
    */
    private Long communityId;
    /**
    * 小区名称
    */
    private String name;
    /**
    * 街道id
    */
    private Long streetId;
    /**
    * 区县id
    */
    private Long districtId;
    /**
    * 市id
    */
    private Long cityId;
    /**
    * 楼栋数
    */
    private Integer buildingNum;
    /**
    * 房产数
    */
    private Integer roomNum;
    /**
    * 0、商品房 1、安置房
    */
    private Integer bdcFlag;
    /**
    * 0 业委会 1临管
    */
    private Integer cmtFlag;
    /**
    * 描述
    */
    private String remark;
    
    private Date updateTime;
    
    private Date createTime;
    /**
    * 地址表
    */
    private String address;
    /**
    * 总面积
    */
    private Double areaSum;
    /**
    * 单元数
    */
    private Integer unitSum;
    /**
    * 协议
    */
    private Object agreement;
    /**
    * 模板下载地址
    */
    private String templateUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStreetId() {
        return streetId;
    }

    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getBdcFlag() {
        return bdcFlag;
    }

    public void setBdcFlag(Integer bdcFlag) {
        this.bdcFlag = bdcFlag;
    }

    public Integer getCmtFlag() {
        return cmtFlag;
    }

    public void setCmtFlag(Integer cmtFlag) {
        this.cmtFlag = cmtFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAreaSum() {
        return areaSum;
    }

    public void setAreaSum(Double areaSum) {
        this.areaSum = areaSum;
    }

    public Integer getUnitSum() {
        return unitSum;
    }

    public void setUnitSum(Integer unitSum) {
        this.unitSum = unitSum;
    }

    public Object getAgreement() {
        return agreement;
    }

    public void setAgreement(Object agreement) {
        this.agreement = agreement;
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

}