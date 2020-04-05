package com.knowyou.cloud.sys.model.mobilebox;

import java.util.Date;

public class UserInput {
    private Integer id;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private Date date;

    private Integer wired;

    private Integer wifi;

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

    public Integer getWired() {
        return wired;
    }

    public void setWired(Integer wired) {
        this.wired = wired;
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }
}