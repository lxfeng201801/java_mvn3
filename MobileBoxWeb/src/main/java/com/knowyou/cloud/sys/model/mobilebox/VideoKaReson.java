package com.knowyou.cloud.sys.model.mobilebox;

import java.util.Date;

public class VideoKaReson {
    private Integer id;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private Date date;

    private Integer netBandwidth;

    private Integer bandwidth;

    private Integer gatewayErr;

    private Integer serverErr;

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

    public Integer getNetBandwidth() {
        return netBandwidth;
    }

    public void setNetBandwidth(Integer netBandwidth) {
        this.netBandwidth = netBandwidth;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getGatewayErr() {
        return gatewayErr;
    }

    public void setGatewayErr(Integer gatewayErr) {
        this.gatewayErr = gatewayErr;
    }

    public Integer getServerErr() {
        return serverErr;
    }

    public void setServerErr(Integer serverErr) {
        this.serverErr = serverErr;
    }
}