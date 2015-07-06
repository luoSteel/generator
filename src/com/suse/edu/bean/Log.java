package com.suse.edu.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Log {
    private String logid;

    private String opreate;

    private BigDecimal logType;

    private Date recordTime;

    private String operUser;

    private String operContent;

    private BigDecimal result;

    private String param;

    private String requestIp;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getOpreate() {
        return opreate;
    }

    public void setOpreate(String opreate) {
        this.opreate = opreate == null ? null : opreate.trim();
    }

    public BigDecimal getLogType() {
        return logType;
    }

    public void setLogType(BigDecimal logType) {
        this.logType = logType;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser == null ? null : operUser.trim();
    }

    public String getOperContent() {
        return operContent;
    }

    public void setOperContent(String operContent) {
        this.operContent = operContent == null ? null : operContent.trim();
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }
}