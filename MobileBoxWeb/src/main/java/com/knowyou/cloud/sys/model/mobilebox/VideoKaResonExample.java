package com.knowyou.cloud.sys.model.mobilebox;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoKaResonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoKaResonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthIsNull() {
            addCriterion("net_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthIsNotNull() {
            addCriterion("net_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthEqualTo(Integer value) {
            addCriterion("net_bandwidth =", value, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthNotEqualTo(Integer value) {
            addCriterion("net_bandwidth <>", value, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthGreaterThan(Integer value) {
            addCriterion("net_bandwidth >", value, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_bandwidth >=", value, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthLessThan(Integer value) {
            addCriterion("net_bandwidth <", value, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthLessThanOrEqualTo(Integer value) {
            addCriterion("net_bandwidth <=", value, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthIn(List<Integer> values) {
            addCriterion("net_bandwidth in", values, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthNotIn(List<Integer> values) {
            addCriterion("net_bandwidth not in", values, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthBetween(Integer value1, Integer value2) {
            addCriterion("net_bandwidth between", value1, value2, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andNetBandwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("net_bandwidth not between", value1, value2, "netBandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNull() {
            addCriterion("bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNotNull() {
            addCriterion("bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andBandwidthEqualTo(Integer value) {
            addCriterion("bandwidth =", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotEqualTo(Integer value) {
            addCriterion("bandwidth <>", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThan(Integer value) {
            addCriterion("bandwidth >", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandwidth >=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThan(Integer value) {
            addCriterion("bandwidth <", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThanOrEqualTo(Integer value) {
            addCriterion("bandwidth <=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthIn(List<Integer> values) {
            addCriterion("bandwidth in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotIn(List<Integer> values) {
            addCriterion("bandwidth not in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthBetween(Integer value1, Integer value2) {
            addCriterion("bandwidth between", value1, value2, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("bandwidth not between", value1, value2, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andGatewayErrIsNull() {
            addCriterion("gateway_err is null");
            return (Criteria) this;
        }

        public Criteria andGatewayErrIsNotNull() {
            addCriterion("gateway_err is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayErrEqualTo(Integer value) {
            addCriterion("gateway_err =", value, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrNotEqualTo(Integer value) {
            addCriterion("gateway_err <>", value, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrGreaterThan(Integer value) {
            addCriterion("gateway_err >", value, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrGreaterThanOrEqualTo(Integer value) {
            addCriterion("gateway_err >=", value, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrLessThan(Integer value) {
            addCriterion("gateway_err <", value, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrLessThanOrEqualTo(Integer value) {
            addCriterion("gateway_err <=", value, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrIn(List<Integer> values) {
            addCriterion("gateway_err in", values, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrNotIn(List<Integer> values) {
            addCriterion("gateway_err not in", values, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrBetween(Integer value1, Integer value2) {
            addCriterion("gateway_err between", value1, value2, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andGatewayErrNotBetween(Integer value1, Integer value2) {
            addCriterion("gateway_err not between", value1, value2, "gatewayErr");
            return (Criteria) this;
        }

        public Criteria andServerErrIsNull() {
            addCriterion("server_err is null");
            return (Criteria) this;
        }

        public Criteria andServerErrIsNotNull() {
            addCriterion("server_err is not null");
            return (Criteria) this;
        }

        public Criteria andServerErrEqualTo(Integer value) {
            addCriterion("server_err =", value, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrNotEqualTo(Integer value) {
            addCriterion("server_err <>", value, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrGreaterThan(Integer value) {
            addCriterion("server_err >", value, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_err >=", value, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrLessThan(Integer value) {
            addCriterion("server_err <", value, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrLessThanOrEqualTo(Integer value) {
            addCriterion("server_err <=", value, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrIn(List<Integer> values) {
            addCriterion("server_err in", values, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrNotIn(List<Integer> values) {
            addCriterion("server_err not in", values, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrBetween(Integer value1, Integer value2) {
            addCriterion("server_err between", value1, value2, "serverErr");
            return (Criteria) this;
        }

        public Criteria andServerErrNotBetween(Integer value1, Integer value2) {
            addCriterion("server_err not between", value1, value2, "serverErr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}