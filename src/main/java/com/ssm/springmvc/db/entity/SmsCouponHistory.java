package com.ssm.springmvc.db.entity;

import java.util.Date;

public class SmsCouponHistory {
    private Long id;

    private Long couponId;

    private Long memberId;

    private String couponCode;

    private String memberNickname;

    private Integer getType;

    private Date createTime;

    private Integer useStatus;

    private Date useTime;

    private Long orderId;

    private String orderSn;

    public SmsCouponHistory(Long id, Long couponId, Long memberId, String couponCode, String memberNickname, Integer getType, Date createTime, Integer useStatus, Date useTime, Long orderId, String orderSn) {
        this.id = id;
        this.couponId = couponId;
        this.memberId = memberId;
        this.couponCode = couponCode;
        this.memberNickname = memberNickname;
        this.getType = getType;
        this.createTime = createTime;
        this.useStatus = useStatus;
        this.useTime = useTime;
        this.orderId = orderId;
        this.orderSn = orderSn;
    }

    public SmsCouponHistory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname == null ? null : memberNickname.trim();
    }

    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }
}