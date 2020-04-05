package com.knowyou.cloud.sys.model.mobilebox;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoDelayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public VideoDelayExample() {
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

        public Criteria andFristTimeIsNull() {
            addCriterion("frist_time is null");
            return (Criteria) this;
        }

        public Criteria andFristTimeIsNotNull() {
            addCriterion("frist_time is not null");
            return (Criteria) this;
        }

        public Criteria andFristTimeEqualTo(Integer value) {
            addCriterion("frist_time =", value, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeNotEqualTo(Integer value) {
            addCriterion("frist_time <>", value, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeGreaterThan(Integer value) {
            addCriterion("frist_time >", value, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("frist_time >=", value, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeLessThan(Integer value) {
            addCriterion("frist_time <", value, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeLessThanOrEqualTo(Integer value) {
            addCriterion("frist_time <=", value, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeIn(List<Integer> values) {
            addCriterion("frist_time in", values, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeNotIn(List<Integer> values) {
            addCriterion("frist_time not in", values, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeBetween(Integer value1, Integer value2) {
            addCriterion("frist_time between", value1, value2, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("frist_time not between", value1, value2, "fristTime");
            return (Criteria) this;
        }

        public Criteria andFristCountIsNull() {
            addCriterion("frist_count is null");
            return (Criteria) this;
        }

        public Criteria andFristCountIsNotNull() {
            addCriterion("frist_count is not null");
            return (Criteria) this;
        }

        public Criteria andFristCountEqualTo(Integer value) {
            addCriterion("frist_count =", value, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountNotEqualTo(Integer value) {
            addCriterion("frist_count <>", value, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountGreaterThan(Integer value) {
            addCriterion("frist_count >", value, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("frist_count >=", value, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountLessThan(Integer value) {
            addCriterion("frist_count <", value, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountLessThanOrEqualTo(Integer value) {
            addCriterion("frist_count <=", value, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountIn(List<Integer> values) {
            addCriterion("frist_count in", values, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountNotIn(List<Integer> values) {
            addCriterion("frist_count not in", values, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountBetween(Integer value1, Integer value2) {
            addCriterion("frist_count between", value1, value2, "fristCount");
            return (Criteria) this;
        }

        public Criteria andFristCountNotBetween(Integer value1, Integer value2) {
            addCriterion("frist_count not between", value1, value2, "fristCount");
            return (Criteria) this;
        }

        public Criteria andPosterTimeIsNull() {
            addCriterion("poster_time is null");
            return (Criteria) this;
        }

        public Criteria andPosterTimeIsNotNull() {
            addCriterion("poster_time is not null");
            return (Criteria) this;
        }

        public Criteria andPosterTimeEqualTo(Integer value) {
            addCriterion("poster_time =", value, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeNotEqualTo(Integer value) {
            addCriterion("poster_time <>", value, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeGreaterThan(Integer value) {
            addCriterion("poster_time >", value, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("poster_time >=", value, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeLessThan(Integer value) {
            addCriterion("poster_time <", value, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeLessThanOrEqualTo(Integer value) {
            addCriterion("poster_time <=", value, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeIn(List<Integer> values) {
            addCriterion("poster_time in", values, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeNotIn(List<Integer> values) {
            addCriterion("poster_time not in", values, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeBetween(Integer value1, Integer value2) {
            addCriterion("poster_time between", value1, value2, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("poster_time not between", value1, value2, "posterTime");
            return (Criteria) this;
        }

        public Criteria andPosterCountIsNull() {
            addCriterion("poster_count is null");
            return (Criteria) this;
        }

        public Criteria andPosterCountIsNotNull() {
            addCriterion("poster_count is not null");
            return (Criteria) this;
        }

        public Criteria andPosterCountEqualTo(Integer value) {
            addCriterion("poster_count =", value, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountNotEqualTo(Integer value) {
            addCriterion("poster_count <>", value, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountGreaterThan(Integer value) {
            addCriterion("poster_count >", value, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("poster_count >=", value, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountLessThan(Integer value) {
            addCriterion("poster_count <", value, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountLessThanOrEqualTo(Integer value) {
            addCriterion("poster_count <=", value, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountIn(List<Integer> values) {
            addCriterion("poster_count in", values, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountNotIn(List<Integer> values) {
            addCriterion("poster_count not in", values, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountBetween(Integer value1, Integer value2) {
            addCriterion("poster_count between", value1, value2, "posterCount");
            return (Criteria) this;
        }

        public Criteria andPosterCountNotBetween(Integer value1, Integer value2) {
            addCriterion("poster_count not between", value1, value2, "posterCount");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Integer value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Integer value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Integer value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Integer value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Integer> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Integer> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Integer value1, Integer value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeCountIsNull() {
            addCriterion("change_count is null");
            return (Criteria) this;
        }

        public Criteria andChangeCountIsNotNull() {
            addCriterion("change_count is not null");
            return (Criteria) this;
        }

        public Criteria andChangeCountEqualTo(Integer value) {
            addCriterion("change_count =", value, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountNotEqualTo(Integer value) {
            addCriterion("change_count <>", value, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountGreaterThan(Integer value) {
            addCriterion("change_count >", value, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_count >=", value, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountLessThan(Integer value) {
            addCriterion("change_count <", value, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountLessThanOrEqualTo(Integer value) {
            addCriterion("change_count <=", value, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountIn(List<Integer> values) {
            addCriterion("change_count in", values, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountNotIn(List<Integer> values) {
            addCriterion("change_count not in", values, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountBetween(Integer value1, Integer value2) {
            addCriterion("change_count between", value1, value2, "changeCount");
            return (Criteria) this;
        }

        public Criteria andChangeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("change_count not between", value1, value2, "changeCount");
            return (Criteria) this;
        }

        public Criteria andFfTimeIsNull() {
            addCriterion("ff_time is null");
            return (Criteria) this;
        }

        public Criteria andFfTimeIsNotNull() {
            addCriterion("ff_time is not null");
            return (Criteria) this;
        }

        public Criteria andFfTimeEqualTo(Integer value) {
            addCriterion("ff_time =", value, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeNotEqualTo(Integer value) {
            addCriterion("ff_time <>", value, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeGreaterThan(Integer value) {
            addCriterion("ff_time >", value, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ff_time >=", value, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeLessThan(Integer value) {
            addCriterion("ff_time <", value, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ff_time <=", value, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeIn(List<Integer> values) {
            addCriterion("ff_time in", values, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeNotIn(List<Integer> values) {
            addCriterion("ff_time not in", values, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeBetween(Integer value1, Integer value2) {
            addCriterion("ff_time between", value1, value2, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ff_time not between", value1, value2, "ffTime");
            return (Criteria) this;
        }

        public Criteria andFfCountIsNull() {
            addCriterion("ff_count is null");
            return (Criteria) this;
        }

        public Criteria andFfCountIsNotNull() {
            addCriterion("ff_count is not null");
            return (Criteria) this;
        }

        public Criteria andFfCountEqualTo(Integer value) {
            addCriterion("ff_count =", value, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountNotEqualTo(Integer value) {
            addCriterion("ff_count <>", value, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountGreaterThan(Integer value) {
            addCriterion("ff_count >", value, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ff_count >=", value, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountLessThan(Integer value) {
            addCriterion("ff_count <", value, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountLessThanOrEqualTo(Integer value) {
            addCriterion("ff_count <=", value, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountIn(List<Integer> values) {
            addCriterion("ff_count in", values, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountNotIn(List<Integer> values) {
            addCriterion("ff_count not in", values, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountBetween(Integer value1, Integer value2) {
            addCriterion("ff_count between", value1, value2, "ffCount");
            return (Criteria) this;
        }

        public Criteria andFfCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ff_count not between", value1, value2, "ffCount");
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