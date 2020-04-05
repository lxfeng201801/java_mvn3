package com.knowyou.cloud.sys.model.mobilebox;

import java.util.Date;

public class Terminal {
    private String id;

    private Boolean iscollectstatus;

    private String deviceId;

    private String sn;

    private String userName;

    private String address;

    private String apkVer;

    private String terminalVer;

    private String firmwareVer;

    private Byte inputType;

    private Byte netType;

    private String softVer;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIscollectstatus() {
        return iscollectstatus;
    }

    public void setIscollectstatus(Boolean iscollectstatus) {
        this.iscollectstatus = iscollectstatus;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApkVer() {
        return apkVer;
    }

    public void setApkVer(String apkVer) {
        this.apkVer = apkVer;
    }

    public String getTerminalVer() {
        return terminalVer;
    }

    public void setTerminalVer(String terminalVer) {
        this.terminalVer = terminalVer;
    }

    public String getFirmwareVer() {
        return firmwareVer;
    }

    public void setFirmwareVer(String firmwareVer) {
        this.firmwareVer = firmwareVer;
    }

    public Byte getInputType() {
        return inputType;
    }

    public void setInputType(Byte inputType) {
        this.inputType = inputType;
    }

    public Byte getNetType() {
        return netType;
    }

    public void setNetType(Byte netType) {
        this.netType = netType;
    }

    public String getSoftVer() {
        return softVer;
    }

    public void setSoftVer(String softVer) {
        this.softVer = softVer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}