package com.selffun.suite.pojo;

import java.io.Serializable;
import java.util.Date;

public class Byip implements Serializable {
    private Long id;

    private Date date;

    private String ip;

    private Long callCount;

    private Long successCount;

    private Long respSecCount;

    private Long dataInput;

    private Long dataOutput;

    private Integer maxResp;

    private Date maxRespTime;

    private String maxRespUrl;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getCallCount() {
        return callCount;
    }

    public void setCallCount(Long callCount) {
        this.callCount = callCount;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
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

    public Date getMaxRespTime() {
        return maxRespTime;
    }

    public void setMaxRespTime(Date maxRespTime) {
        this.maxRespTime = maxRespTime;
    }

    public String getMaxRespUrl() {
        return maxRespUrl;
    }

    public void setMaxRespUrl(String maxRespUrl) {
        this.maxRespUrl = maxRespUrl;
    }

    public Date getCmCreatedTime() {
        return cmCreatedTime;
    }

    public void setCmCreatedTime(Date cmCreatedTime) {
        this.cmCreatedTime = cmCreatedTime;
    }
}