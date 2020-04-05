package com.knowyou.cloud.sys.model.mobilebox;

import java.util.Date;

public class VideoQuality {
    private Integer id;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private Date date;

    private Integer fluentcount;

    private Integer standarddefinitioncount;

    private Integer highdefinitioncount;

    private Integer superdefinitioncount;

    private Integer fourkcount;

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

    public Integer getFluentcount() {
        return fluentcount;
    }

    public void setFluentcount(Integer fluentcount) {
        this.fluentcount = fluentcount;
    }

    public Integer getStandarddefinitioncount() {
        return standarddefinitioncount;
    }

    public void setStandarddefinitioncount(Integer standarddefinitioncount) {
        this.standarddefinitioncount = standarddefinitioncount;
    }

    public Integer getHighdefinitioncount() {
        return highdefinitioncount;
    }

    public void setHighdefinitioncount(Integer highdefinitioncount) {
        this.highdefinitioncount = highdefinitioncount;
    }

    public Integer getSuperdefinitioncount() {
        return superdefinitioncount;
    }

    public void setSuperdefinitioncount(Integer superdefinitioncount) {
        this.superdefinitioncount = superdefinitioncount;
    }

    public Integer getFourkcount() {
        return fourkcount;
    }

    public void setFourkcount(Integer fourkcount) {
        this.fourkcount = fourkcount;
    }
}