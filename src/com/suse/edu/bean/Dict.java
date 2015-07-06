package com.suse.edu.bean;

import java.util.Date;

public class Dict {
    private String valId;

    private String dictCode;

    private String dictValue;

    private Date addTime;

    private String dictValName;

    private String dictName;

    private Long dictType;

    private Short dictStatus;

    public String getValId() {
        return valId;
    }

    public void setValId(String valId) {
        this.valId = valId == null ? null : valId.trim();
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getDictValName() {
        return dictValName;
    }

    public void setDictValName(String dictValName) {
        this.dictValName = dictValName == null ? null : dictValName.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public Long getDictType() {
        return dictType;
    }

    public void setDictType(Long dictType) {
        this.dictType = dictType;
    }

    public Short getDictStatus() {
        return dictStatus;
    }

    public void setDictStatus(Short dictStatus) {
        this.dictStatus = dictStatus;
    }
}