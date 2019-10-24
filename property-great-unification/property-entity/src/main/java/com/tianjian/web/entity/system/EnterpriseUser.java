package com.tianjian.web.entity.system;

import com.tianjian.web.entity.common.Role;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @program: property-great-unification
 * @description: 企业用户
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:58
 */
@Entity
@Table(name = "t_EnterpriseUsers")
public class EnterpriseUser implements Serializable {
    private static final long serialVersionUID = -810800206116243592L;
    private Integer euserId;
    private String guId;
    private String userName;
    private String userType;
    private String userNo;
    private String orders;
    private String isAvailable;
    private String deptCode;
    private String posts;
    private String loginName;
    private String password;
    private String email;
    private String mobileNo;
    private Integer adminId;
    private Timestamp addTime;
    private  Integer  isClose;
    private String status;
    private List<Role> roles;
/**
 *与t_AuditJurisdiction表关联，的目标字段
 */
    @Transient
    private Timestamp auditStartTime;
    @Transient
    private Timestamp auditEndTime;
    @Transient
    private Integer userId;
   /**
    *与t_AuditPublic表关联，的目标字段
    */
    @Transient
    private Timestamp pubStartTime;
    @Transient
    private Timestamp pubEndTime;
    @Transient
    private String pubId;

    public Integer getEuserId() {
        return euserId;
    }

    public void setEuserId(Integer euserId) {
        this.euserId = euserId;
    }

    public String getGuId() {
        return guId;
    }

    public void setGuId(String guId) {
        this.guId = guId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Timestamp getAuditStartTime() {
        return auditStartTime;
    }

    public void setAuditStartTime(Timestamp auditStartTime) {
        this.auditStartTime = auditStartTime;
    }

    public Timestamp getAuditEndTime() {
        return auditEndTime;
    }

    public void setAuditEndTime(Timestamp auditEndTime) {
        this.auditEndTime = auditEndTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Timestamp getPubStartTime() {
        return pubStartTime;
    }

    public void setPubStartTime(Timestamp pubStartTime) {
        this.pubStartTime = pubStartTime;
    }

    public Timestamp getPubEndTime() {
        return pubEndTime;
    }

    public void setPubEndTime(Timestamp pubEndTime) {
        this.pubEndTime = pubEndTime;
    }

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public Integer getIsClose() {
        return isClose;
    }

    public void setIsClose(Integer isClose) {
        this.isClose = isClose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    public EnterpriseUser(){}

    public EnterpriseUser(Integer euserId, String userName, String password, String status) {
        this.euserId = euserId;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }
}
