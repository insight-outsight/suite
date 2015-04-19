package com.selffun.suite.pojo;

import java.io.Serializable;
import java.util.Date;

public class Bysecond implements Serializable {
    private Long id;

    private Date date;

    private Date time;

    private Byte type;

    private Short status;

    private Long callCount;

    private Long respSecCount;

    private Long dataInput;

    private Long dataOutput;

    private Integer maxResp;

    private Date cmCreatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getCallCount() {
        return callCount;
    }

    public void setCallCount(Long callCount) {
        this.callCount = callCount;
    }

    public Long getRespSecCount() {
        return respSecCount;
    }

    public void setRespSecCount(Long respSecCount) {
        this.respSecCount = respSecCount;
    }

    public Long getDataInput() {
        return dataInput;
    }

    public void setDataInput(Long dataInput) {
        this.dataInput = dataInput;
    }

    public Long getDataOutput() {
        return dataOutput;
    }

    public void setDataOutput(Long dataOutput) {
        this.dataOutput = dataOutput;
    }

    public Integer getMaxResp() {
        return maxResp;
    }

    public void setMaxResp(Integer maxResp) {
        this.maxResp = maxResp;
    }

    public Date getCmCreatedTime() {
        return cmCreatedTime;
    }

    public void setCmCreatedTime(Date cmCreatedTime) {
        this.cmCreatedTime = cmCreatedTime;
    }
}