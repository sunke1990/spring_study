package com.db.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BlockUser)实体类
 *
 * @author makejava
 * @since 2021-12-25 13:02:56
 */
public class BlockUser implements Serializable {
    private static final long serialVersionUID = -61169973021369477L;
    
    private Long id;
    
    private String openId;
    /**
    * 电话号码
    */
    private String phone;
    /**
    * 密码
    */
    private String password;
    
    private String remark;
    /**
    * 微信sessionkey
    */
    private String wxSessionKey;
    /**
    * 微信头像链接
    */
    private String wxFaceUrl;
    /**
    * 微信昵称
    */
    private String wxName;
    /**
    * 性别（0：空,1：男，2：女））
    */
    private Integer gender;
    /**
    * 真实姓名
    */
    private String realName;
    /**
    * 身份证号
    */
    private String idNumber;
    
    private Date createTime;
    
    private Date updateTime;
    /**
    * 是否第一次投票 0：否 1：是
    */
    private Integer isFirstVote;
    /**
    * 邀请人id
    */
    private String invitedUser;
    /**
    * unionid from wechat
    */
    private String unionId;
    /**
    * 手机号2
    */
    private String phone2;
    /**
    * 添加人
    */
    private Long addUserId;
    /**
    * 0表示不是第一次绑定 1表示第一次绑定
    */
    private Integer firstBindFlag;
    /**
    * 0姓名+身份证+人脸;1姓名+身份证+手机号;2姓名+手机号
    */
    private Integer authType;
    
    private String addressDetail;
    
    private String facepicId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWxSessionKey() {
        return wxSessionKey;
    }

    public void setWxSessionKey(String wxSessionKey) {
        this.wxSessionKey = wxSessionKey;
    }

    public String getWxFaceUrl() {
        return wxFaceUrl;
    }

    public void setWxFaceUrl(String wxFaceUrl) {
        this.wxFaceUrl = wxFaceUrl;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public Integer getIsFirstVote() {
        return isFirstVote;
    }

    public void setIsFirstVote(Integer isFirstVote) {
        this.isFirstVote = isFirstVote;
    }

    public String getInvitedUser() {
        return invitedUser;
    }

    public void setInvitedUser(String invitedUser) {
        this.invitedUser = invitedUser;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Long getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Long addUserId) {
        this.addUserId = addUserId;
    }

    public Integer getFirstBindFlag() {
        return firstBindFlag;
    }

    public void setFirstBindFlag(Integer firstBindFlag) {
        this.firstBindFlag = firstBindFlag;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getFacepicId() {
        return facepicId;
    }

    public void setFacepicId(String facepicId) {
        this.facepicId = facepicId;
    }

}