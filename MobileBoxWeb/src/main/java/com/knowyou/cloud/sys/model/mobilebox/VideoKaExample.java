package com.knowyou.cloud.sys.model.mobilebox;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoKaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public VideoKaExample() {
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

        public Criteria andKaTimeIsNull() {
            addCriterion("ka_time is null");
            return (Criteria) this;
        }

        public Criteria andKaTimeIsNotNull() {
            addCriterion("ka_time is not null");
            return (Criteria) this;
        }

        public Criteria andKaTimeEqualTo(Integer value) {
            addCriterion("ka_time =", value, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeNotEqualTo(Integer value) {
            addCriterion("ka_time <>", value, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeGreaterThan(Integer value) {
            addCriterion("ka_time >", value, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ka_time >=", value, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeLessThan(Integer value) {
            addCriterion("ka_time <", value, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ka_time <=", value, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeIn(List<Integer> values) {
            addCriterion("ka_time in", values, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeNotIn(List<Integer> values) {
            addCriterion("ka_time not in", values, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeBetween(Integer value1, Integer value2) {
            addCriterion("ka_time between", value1, value2, "kaTime");
            return (Criteria) this;
        }

        public Criteria andKaTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ka_time not between", value1, value2, "kaTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIsNull() {
            addCriterion("quit_time is null");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIsNotNull() {
            addCriterion("quit_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuitTimeEqualTo(Integer value) {
            addCriterion("quit_time =", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotEqualTo(Integer value) {
            addCriterion("quit_time <>", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeGreaterThan(Integer value) {
            addCriterion("quit_time >", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit_time >=", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeLessThan(Integer value) {
            addCriterion("quit_time <", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("quit_time <=", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIn(List<Integer> values) {
            addCriterion("quit_time in", values, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotIn(List<Integer> values) {
            addCriterion("quit_time not in", values, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeBetween(Integer value1, Integer value2) {
            addCriterion("quit_time between", value1, value2, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("quit_time not between", value1, value2, "quitTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeIsNull() {
            addCriterion("jump_time is null");
            return (Criteria) this;
        }

        public Criteria andJumpTimeIsNotNull() {
            addCriterion("jump_time is not null");
            return (Criteria) this;
        }

        public Criteria andJumpTimeEqualTo(Integer value) {
            addCriterion("jump_time =", value, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeNotEqualTo(Integer value) {
            addCriterion("jump_time <>", value, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeGreaterThan(Integer value) {
            addCriterion("jump_time >", value, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jump_time >=", value, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeLessThan(Integer value) {
            addCriterion("jump_time <", value, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeLessThanOrEqualTo(Integer value) {
            addCriterion("jump_time <=", value, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeIn(List<Integer> values) {
            addCriterion("jump_time in", values, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeNotIn(List<Integer> values) {
            addCriterion("jump_time not in", values, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeBetween(Integer value1, Integer value2) {
            addCriterion("jump_time between", value1, value2, "jumpTime");
            return (Criteria) this;
        }

        public Criteria andJumpTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("jump_time not between", value1, value2, "jumpTime");
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

        public Criteria andFfKaTimeIsNull() {
            addCriterion("ff_ka_time is null");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeIsNotNull() {
            addCriterion("ff_ka_time is not null");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeEqualTo(Integer value) {
            addCriterion("ff_ka_time =", value, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeNotEqualTo(Integer value) {
            addCriterion("ff_ka_time <>", value, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeGreaterThan(Integer value) {
            addCriterion("ff_ka_time >", value, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ff_ka_time >=", value, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeLessThan(Integer value) {
            addCriterion("ff_ka_time <", value, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ff_ka_time <=", value, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeIn(List<Integer> values) {
            addCriterion("ff_ka_time in", values, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeNotIn(List<Integer> values) {
            addCriterion("ff_ka_time not in", values, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeBetween(Integer value1, Integer value2) {
            addCriterion("ff_ka_time between", value1, value2, "ffKaTime");
            return (Criteria) this;
        }

        public Criteria andFfKaTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ff_ka_time not between", value1, value2, "ffKaTime");
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