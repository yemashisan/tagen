package com.tianjian.web.entity.system;


/*import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;*/

import com.tianjian.web.entity.common.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: property-great-unification
 * @description: 普通用户
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:58
 */
@Entity
@Table(name = "t_User")
public class OrdinaryUser implements //UserDetails,
        Serializable {
    private static final long serialVersionUID = -810800206116243592L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "LoginName")
    private String loginName;
    @Column(name = "Password")
    private String password;
    @Column(name = "RealName")
    private String realName;
    @Column(name = "Sex")
    private String sex;
    @Column(name = "Email")
    private String email;
    @Column(name = "QQ")
    private String qq;
    @Column(name = "Wechat")
    private String wechat;
    @Column(name = "HeadPhoto")
    private String headPhoto;
    @Column(name = "Nickname")
    private String nickName;
    @Column(name = "Signature")
    private String signature;
    @Column(name = "UserTypeId")
    private Integer userTypeId;
    @Column(name = "AddTime")
    private Timestamp addTime;
    @Column(name = "IsClose")
    private Integer isClose;
    @Column(name = "IDCard")
    private String idCard;
    @Column(name = "phone")
    private String phone;
    @Column(name = "Status")
    private String status;
    @Column(name = "ParentUserId")
    private Integer parentUserId;
    @Column(name = "PropertyId")
    private String propertyId;
    @Column(name = "Points")
    private Integer points;
    @Column(name = "QualifyingPoints")
    private Integer qualifyingPoints;
    @Column(name = "PointsGradeId")
    private Integer pointsGradeId;
    @Column(name = "BuildingId")
    private String buildingId;
    @Column(name = "RoomId")
    private String roomId;
    @Column(name = "OpenId")
    private String openId;


    private String propertyName;

    private String buildingNo;

    private String buildingName;

    private String floorNo;

    private String cityId;

    private String areaId;

    private String verifyCode;
    private String propertyAddress;
    private String roomNo;
    private String parkCode;
    private  String  remark;
    private String invite;

    private List<Role> roles;
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
/*
    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }*/

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  /*  private Collection<GrantedAuthority> authorities = new ArrayList<>();*/

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
  /*  @Override
    public String getPassword() {
        return password;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }


    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getIsClose() {
        return isClose;
    }

    public void setIsClose(Integer isClose) {
        this.isClose = isClose;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone == null ? this.loginName : phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

  /*  @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return authorities;
    }*/

  /*  @Override
    public String getUsername() {
        return loginName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }*/

    public String getInvite() {
        return invite;
    }

    public void setInvite(String invite) {
        this.invite = invite;
    }

    public Integer getParentUserId() {
        return parentUserId;
    }

    public void setParentUserId(Integer parentUserId) {
        this.parentUserId = parentUserId;
    }

    public String getAddressDetail() {
        String pa = isBlank(this.propertyAddress) ? "" : this.propertyAddress;
        String pn = isBlank(this.propertyName) ? "" : this.propertyName;
        String bno = isBlank(this.buildingNo) ? "" : this.buildingNo;
        String bn = isBlank(this.buildingName) ? "" : this.buildingName;
        String fn = isBlank(this.floorNo) ? "" : this.floorNo;
        String rn = isBlank(this.roomNo) ? "" : this.roomNo;
        return pa + " " + pn + " " + bno + " " + bn + " " + fn + " " + rn;
    }

    private boolean isBlank(String value) {
        return value == null || value == "";
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }


    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }



    public Integer getQualifyingPoints() {
        return qualifyingPoints;
    }

    public void setQualifyingPoints(Integer qualifyingPoints) {
        this.qualifyingPoints = qualifyingPoints;
    }

    public Integer getPointsGradeId() {
        return pointsGradeId;
    }

    public void setPointsGradeId(Integer pointsGradeId) {
        this.pointsGradeId = pointsGradeId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public OrdinaryUser() {
    }

    public OrdinaryUser(Integer userid, String name, String password, String status) {
        this.userId= userid;
        this.loginName = name;
        this.password = password;
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
