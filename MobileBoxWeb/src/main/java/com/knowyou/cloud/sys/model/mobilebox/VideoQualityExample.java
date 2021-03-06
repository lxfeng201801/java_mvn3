package com.knowyou.cloud.sys.model.mobilebox;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoQualityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public VideoQualityExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andFluentcountIsNull() {
            addCriterion("fluentCount is null");
            return (Criteria) this;
        }

        public Criteria andFluentcountIsNotNull() {
            addCriterion("fluentCount is not null");
            return (Criteria) this;
        }

        public Criteria andFluentcountEqualTo(Integer value) {
            addCriterion("fluentCount =", value, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountNotEqualTo(Integer value) {
            addCriterion("fluentCount <>", value, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountGreaterThan(Integer value) {
            addCriterion("fluentCount >", value, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fluentCount >=", value, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountLessThan(Integer value) {
            addCriterion("fluentCount <", value, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountLessThanOrEqualTo(Integer value) {
            addCriterion("fluentCount <=", value, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountIn(List<Integer> values) {
            addCriterion("fluentCount in", values, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountNotIn(List<Integer> values) {
            addCriterion("fluentCount not in", values, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountBetween(Integer value1, Integer value2) {
            addCriterion("fluentCount between", value1, value2, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andFluentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("fluentCount not between", value1, value2, "fluentcount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountIsNull() {
            addCriterion("standardDefinitionCount is null");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountIsNotNull() {
            addCriterion("standardDefinitionCount is not null");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountEqualTo(Integer value) {
            addCriterion("standardDefinitionCount =", value, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountNotEqualTo(Integer value) {
            addCriterion("standardDefinitionCount <>", value, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountGreaterThan(Integer value) {
            addCriterion("standardDefinitionCount >", value, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("standardDefinitionCount >=", value, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountLessThan(Integer value) {
            addCriterion("standardDefinitionCount <", value, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountLessThanOrEqualTo(Integer value) {
            addCriterion("standardDefinitionCount <=", value, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountIn(List<Integer> values) {
            addCriterion("standardDefinitionCount in", values, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountNotIn(List<Integer> values) {
            addCriterion("standardDefinitionCount not in", values, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountBetween(Integer value1, Integer value2) {
            addCriterion("standardDefinitionCount between", value1, value2, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andStandarddefinitioncountNotBetween(Integer value1, Integer value2) {
            addCriterion("standardDefinitionCount not between", value1, value2, "standarddefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountIsNull() {
            addCriterion("highDefinitionCount is null");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountIsNotNull() {
            addCriterion("highDefinitionCount is not null");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountEqualTo(Integer value) {
            addCriterion("highDefinitionCount =", value, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountNotEqualTo(Integer value) {
            addCriterion("highDefinitionCount <>", value, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountGreaterThan(Integer value) {
            addCriterion("highDefinitionCount >", value, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("highDefinitionCount >=", value, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountLessThan(Integer value) {
            addCriterion("highDefinitionCount <", value, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountLessThanOrEqualTo(Integer value) {
            addCriterion("highDefinitionCount <=", value, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountIn(List<Integer> values) {
            addCriterion("highDefinitionCount in", values, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountNotIn(List<Integer> values) {
            addCriterion("highDefinitionCount not in", values, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountBetween(Integer value1, Integer value2) {
            addCriterion("highDefinitionCount between", value1, value2, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andHighdefinitioncountNotBetween(Integer value1, Integer value2) {
            addCriterion("highDefinitionCount not between", value1, value2, "highdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountIsNull() {
            addCriterion("superDefinitionCount is null");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountIsNotNull() {
            addCriterion("superDefinitionCount is not null");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountEqualTo(Integer value) {
            addCriterion("superDefinitionCount =", value, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountNotEqualTo(Integer value) {
            addCriterion("superDefinitionCount <>", value, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountGreaterThan(Integer value) {
            addCriterion("superDefinitionCount >", value, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("superDefinitionCount >=", value, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountLessThan(Integer value) {
            addCriterion("superDefinitionCount <", value, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountLessThanOrEqualTo(Integer value) {
            addCriterion("superDefinitionCount <=", value, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountIn(List<Integer> values) {
            addCriterion("superDefinitionCount in", values, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountNotIn(List<Integer> values) {
            addCriterion("superDefinitionCount not in", values, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountBetween(Integer value1, Integer value2) {
            addCriterion("superDefinitionCount between", value1, value2, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andSuperdefinitioncountNotBetween(Integer value1, Integer value2) {
            addCriterion("superDefinitionCount not between", value1, value2, "superdefinitioncount");
            return (Criteria) this;
        }

        public Criteria andFourkcountIsNull() {
            addCriterion("fourKCount is null");
            return (Criteria) this;
        }

        public Criteria andFourkcountIsNotNull() {
            addCriterion("fourKCount is not null");
            return (Criteria) this;
        }

        public Criteria andFourkcountEqualTo(Integer value) {
            addCriterion("fourKCount =", value, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountNotEqualTo(Integer value) {
            addCriterion("fourKCount <>", value, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountGreaterThan(Integer value) {
            addCriterion("fourKCount >", value, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourKCount >=", value, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountLessThan(Integer value) {
            addCriterion("fourKCount <", value, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountLessThanOrEqualTo(Integer value) {
            addCriterion("fourKCount <=", value, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountIn(List<Integer> values) {
            addCriterion("fourKCount in", values, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountNotIn(List<Integer> values) {
            addCriterion("fourKCount not in", values, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountBetween(Integer value1, Integer value2) {
            addCriterion("fourKCount between", value1, value2, "fourkcount");
            return (Criteria) this;
        }

        public Criteria andFourkcountNotBetween(Integer value1, Integer value2) {
            addCriterion("fourKCount not between", value1, value2, "fourkcount");
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