package com.ssm.springmvc.db.entity;

import java.util.Date;

public class OmsOrderOperateHistory {
    private Long id;

    private Long orderId;

    private String operateMan;

    private Date createTime;

    private Integer orderStatus;

    private String note;

    public OmsOrderOperateHistory(Long id, Long orderId, String operateMan, Date createTime, Integer orderStatus, String note) {
        this.id = id;
        this.orderId = orderId;
        this.operateMan = operateMan;
        this.createTime = createTime;
        this.orderStatus = orderStatus;
        this.note = note;
    }

    public OmsOrderOperateHistory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}