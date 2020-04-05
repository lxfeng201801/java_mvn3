package com.knowyou.cloud.sys.model.mobilebox;

import java.util.Date;

public class VideoKa {
    private Integer id;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private Date date;

    private Integer kaTime;

    private Integer quitTime;

    private Integer jumpTime;

    private Integer ffTime;

    private Integer ffKaTime;

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

    public Integer getKaTime() {
        return kaTime;
    }

    public void setKaTime(Integer kaTime) {
        this.kaTime = kaTime;
    }

    public Integer getQuitTime() {
        return quitTime;
    }

    public void setQuitTime(Integer quitTime) {
        this.quitTime = quitTime;
    }

    public Integer getJumpTime() {
        return jumpTime;
    }

    public void setJumpTime(Integer jumpTime) {
        this.jumpTime = jumpTime;
    }

    public Integer getFfTime() {
        return ffTime;
    }

    public void setFfTime(Integer ffTime) {
        this.ffTime = ffTime;
    }

    public Integer getFfKaTime() {
        return ffKaTime;
    }

    public void setFfKaTime(Integer ffKaTime) {
        this.ffKaTime = ffKaTime;
    }
}