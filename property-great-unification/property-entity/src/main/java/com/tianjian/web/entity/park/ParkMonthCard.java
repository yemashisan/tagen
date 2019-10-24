package com.tianjian.web.entity.park;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @author liang
 */
public class ParkMonthCard {
    private Integer monthcardid;

    private Integer parkuserid;

    private Integer parkspaceid;

    private Integer parkresid;

    private String propertyid;

    private String orderno;

    private String ordernoord;

    private String ordernoout;

    private String serviceid;

    private String requesttype;

    private String parkcode;

    private String carno;

    private Integer month;

    private BigDecimal money;

    private String newbegindate;

    private String newenddate;

    private Date createtime;

    private Integer createstatus;

    private Integer paystatus;

    private String remark;

    private Integer receipttype;

    private Integer receiptcount;

    private Integer realstatus;

    private Date paytime;

    private Integer version;

    public Integer getMonthcardid() {
        return monthcardid;
    }

    public void setMonthcardid(Integer monthcardid) {
        this.monthcardid = monthcardid;
    }

    public Integer getParkuserid() {
        return parkuserid;
    }

    public void setParkuserid(Integer parkuserid) {
        this.parkuserid = parkuserid;
    }

    public Integer getParkspaceid() {
        return parkspaceid;
    }

    public void setParkspaceid(Integer parkspaceid) {
        this.parkspaceid = parkspaceid;
    }

    public Integer getParkresid() {
        return parkresid;
    }

    public void setParkresid(Integer parkresid) {
        this.parkresid = parkresid;
    }

    public String getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(String propertyid) {
        this.propertyid = propertyid == null ? null : propertyid.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getOrdernoord() {
        return ordernoord;
    }

    public void setOrdernoord(String ordernoord) {
        this.ordernoord = ordernoord == null ? null : ordernoord.trim();
    }

    public String getOrdernoout() {
        return ordernoout;
    }

    public void setOrdernoout(String ordernoout) {
        this.ordernoout = ordernoout == null ? null : ordernoout.trim();
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype == null ? null : requesttype.trim();
    }

    public String getParkcode() {
        return parkcode;
    }

    public void setParkcode(String parkcode) {
        this.parkcode = parkcode == null ? null : parkcode.trim();
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getNewbegindate() {
        return newbegindate;
    }

    public void setNewbegindate(String newbegindate) {
        this.newbegindate = newbegindate == null ? null : newbegindate.trim();
    }

    public String getNewenddate() {
        return newenddate;
    }

    public void setNewenddate(String newenddate) {
        this.newenddate = newenddate == null ? null : newenddate.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreatestatus() {
        return createstatus;
    }

    public void setCreatestatus(Integer createstatus) {
        this.createstatus = createstatus;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getReceipttype() {
        return receipttype;
    }

    public void setReceipttype(Integer receipttype) {
        this.receipttype = receipttype;
    }

    public Integer getReceiptcount() {
        return receiptcount;
    }

    public void setReceiptcount(Integer receiptcount) {
        this.receiptcount = receiptcount;
    }

    public Integer getRealstatus() {
        return realstatus;
    }

    public void setRealstatus(Integer realstatus) {
        this.realstatus = realstatus;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}