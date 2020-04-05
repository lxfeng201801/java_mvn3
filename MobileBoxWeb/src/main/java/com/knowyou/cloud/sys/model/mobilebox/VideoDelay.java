package com.knowyou.cloud.sys.model.mobilebox;

import java.util.Date;

public class VideoDelay {
    private Integer id;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private Date date;

    private Integer fristTime;

    private Integer fristCount;

    private Integer posterTime;

    private Integer posterCount;

    private Integer changeTime;

    private Integer changeCount;

    private Integer ffTime;

    private Integer ffCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFristTime() {
        return fristTime;
    }

    public void setFristTime(Integer fristTime) {
        this.fristTime = fristTime;
    }

    public Integer getFristCount() {
        return fristCount;
    }

    public void setFristCount(Integer fristCount) {
        this.fristCount = fristCount;
    }

    public Integer getPosterTime() {
        return posterTime;
    }

    public void setPosterTime(Integer posterTime) {
        this.posterTime = posterTime;
    }

    public Integer getPosterCount() {
        return posterCount;
    }

    public void setPosterCount(Integer posterCount) {
        this.posterCount = posterCount;
    }

    public Integer getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Integer changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public Integer getFfTime() {
        return ffTime;
    }

    public void setFfTime(Integer ffTime) {
        this.ffTime = ffTime;
    }

    public Integer getFfCount() {
        return ffCount;
    }

    public void setFfCount(Integer ffCount) {
        this.ffCount = ffCount;
    }
}