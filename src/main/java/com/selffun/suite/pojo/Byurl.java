package com.selffun.suite.pojo;

import java.io.Serializable;
import java.util.Date;

public class Byurl implements Serializable {
    private Long id;

    private Date date;

    private String url;

    private Long callCount;

    private Long successCount;

    private Long respSecCount;

    private Long dataInput;

    private Long dataOutput;

    private Integer maxResp;

    private Date maxRespTime;

    private String maxRespClient;

    private Integer minResp;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getMaxRespClient() {
        return maxRespClient;
    }

    public void setMaxRespClient(String maxRespClient) {
        this.maxRespClient = maxRespClient;
    }

    public Integer getMinResp() {
        return minResp;
    }

    public void setMinResp(Integer minResp) {
        this.minResp = minResp;
    }

    public Date getCmCreatedTime() {
        return cmCreatedTime;
    }

    public void setCmCreatedTime(Date cmCreatedTime) {
        this.cmCreatedTime = cmCreatedTime;
    }
}