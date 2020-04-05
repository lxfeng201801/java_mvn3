package com.knowyou.cloud.sys.model.mobilebox;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TerminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TerminalExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusIsNull() {
            addCriterion("isCollectStatus is null");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusIsNotNull() {
            addCriterion("isCollectStatus is not null");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusEqualTo(Boolean value) {
            addCriterion("isCollectStatus =", value, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusNotEqualTo(Boolean value) {
            addCriterion("isCollectStatus <>", value, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusGreaterThan(Boolean value) {
            addCriterion("isCollectStatus >", value, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCollectStatus >=", value, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusLessThan(Boolean value) {
            addCriterion("isCollectStatus <", value, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("isCollectStatus <=", value, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusIn(List<Boolean> values) {
            addCriterion("isCollectStatus in", values, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusNotIn(List<Boolean> values) {
            addCriterion("isCollectStatus not in", values, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("isCollectStatus between", value1, value2, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andIscollectstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCollectStatus not between", value1, value2, "iscollectstatus");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andApkVerIsNull() {
            addCriterion("apk_ver is null");
            return (Criteria) this;
        }

        public Criteria andApkVerIsNotNull() {
            addCriterion("apk_ver is not null");
            return (Criteria) this;
        }

        public Criteria andApkVerEqualTo(String value) {
            addCriterion("apk_ver =", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotEqualTo(String value) {
            addCriterion("apk_ver <>", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerGreaterThan(String value) {
            addCriterion("apk_ver >", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerGreaterThanOrEqualTo(String value) {
            addCriterion("apk_ver >=", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerLessThan(String value) {
            addCriterion("apk_ver <", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerLessThanOrEqualTo(String value) {
            addCriterion("apk_ver <=", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerLike(String value) {
            addCriterion("apk_ver like", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotLike(String value) {
            addCriterion("apk_ver not like", value, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerIn(List<String> values) {
            addCriterion("apk_ver in", values, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotIn(List<String> values) {
            addCriterion("apk_ver not in", values, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerBetween(String value1, String value2) {
            addCriterion("apk_ver between", value1, value2, "apkVer");
            return (Criteria) this;
        }

        public Criteria andApkVerNotBetween(String value1, String value2) {
            addCriterion("apk_ver not between", value1, value2, "apkVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerIsNull() {
            addCriterion("terminal_ver is null");
            return (Criteria) this;
        }

        public Criteria andTerminalVerIsNotNull() {
            addCriterion("terminal_ver is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalVerEqualTo(String value) {
            addCriterion("terminal_ver =", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerNotEqualTo(String value) {
            addCriterion("terminal_ver <>", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerGreaterThan(String value) {
            addCriterion("terminal_ver >", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_ver >=", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerLessThan(String value) {
            addCriterion("terminal_ver <", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerLessThanOrEqualTo(String value) {
            addCriterion("terminal_ver <=", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerLike(String value) {
            addCriterion("terminal_ver like", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerNotLike(String value) {
            addCriterion("terminal_ver not like", value, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerIn(List<String> values) {
            addCriterion("terminal_ver in", values, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerNotIn(List<String> values) {
            addCriterion("terminal_ver not in", values, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerBetween(String value1, String value2) {
            addCriterion("terminal_ver between", value1, value2, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andTerminalVerNotBetween(String value1, String value2) {
            addCriterion("terminal_ver not between", value1, value2, "terminalVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerIsNull() {
            addCriterion("firmware_ver is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerIsNotNull() {
            addCriterion("firmware_ver is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerEqualTo(String value) {
            addCriterion("firmware_ver =", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerNotEqualTo(String value) {
            addCriterion("firmware_ver <>", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerGreaterThan(String value) {
            addCriterion("firmware_ver >", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_ver >=", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerLessThan(String value) {
            addCriterion("firmware_ver <", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerLessThanOrEqualTo(String value) {
            addCriterion("firmware_ver <=", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerLike(String value) {
            addCriterion("firmware_ver like", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerNotLike(String value) {
            addCriterion("firmware_ver not like", value, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerIn(List<String> values) {
            addCriterion("firmware_ver in", values, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerNotIn(List<String> values) {
            addCriterion("firmware_ver not in", values, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerBetween(String value1, String value2) {
            addCriterion("firmware_ver between", value1, value2, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andFirmwareVerNotBetween(String value1, String value2) {
            addCriterion("firmware_ver not between", value1, value2, "firmwareVer");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNull() {
            addCriterion("input_type is null");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNotNull() {
            addCriterion("input_type is not null");
            return (Criteria) this;
        }

        public Criteria andInputTypeEqualTo(Byte value) {
            addCriterion("input_type =", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotEqualTo(Byte value) {
            addCriterion("input_type <>", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThan(Byte value) {
            addCriterion("input_type >", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("input_type >=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThan(Byte value) {
            addCriterion("input_type <", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThanOrEqualTo(Byte value) {
            addCriterion("input_type <=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIn(List<Byte> values) {
            addCriterion("input_type in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotIn(List<Byte> values) {
            addCriterion("input_type not in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeBetween(Byte value1, Byte value2) {
            addCriterion("input_type between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("input_type not between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andNetTypeIsNull() {
            addCriterion("net_type is null");
            return (Criteria) this;
        }

        public Criteria andNetTypeIsNotNull() {
            addCriterion("net_type is not null");
            return (Criteria) this;
        }

        public Criteria andNetTypeEqualTo(Byte value) {
            addCriterion("net_type =", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotEqualTo(Byte value) {
            addCriterion("net_type <>", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeGreaterThan(Byte value) {
            addCriterion("net_type >", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("net_type >=", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLessThan(Byte value) {
            addCriterion("net_type <", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLessThanOrEqualTo(Byte value) {
            addCriterion("net_type <=", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeIn(List<Byte> values) {
            addCriterion("net_type in", values, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotIn(List<Byte> values) {
            addCriterion("net_type not in", values, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeBetween(Byte value1, Byte value2) {
            addCriterion("net_type between", value1, value2, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("net_type not between", value1, value2, "netType");
            return (Criteria) this;
        }

        public Criteria andSoftVerIsNull() {
            addCriterion("soft_ver is null");
            return (Criteria) this;
        }

        public Criteria andSoftVerIsNotNull() {
            addCriterion("soft_ver is not null");
            return (Criteria) this;
        }

        public Criteria andSoftVerEqualTo(String value) {
            addCriterion("soft_ver =", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerNotEqualTo(String value) {
            addCriterion("soft_ver <>", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerGreaterThan(String value) {
            addCriterion("soft_ver >", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerGreaterThanOrEqualTo(String value) {
            addCriterion("soft_ver >=", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerLessThan(String value) {
            addCriterion("soft_ver <", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerLessThanOrEqualTo(String value) {
            addCriterion("soft_ver <=", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerLike(String value) {
            addCriterion("soft_ver like", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerNotLike(String value) {
            addCriterion("soft_ver not like", value, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerIn(List<String> values) {
            addCriterion("soft_ver in", values, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerNotIn(List<String> values) {
            addCriterion("soft_ver not in", values, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerBetween(String value1, String value2) {
            addCriterion("soft_ver between", value1, value2, "softVer");
            return (Criteria) this;
        }

        public Criteria andSoftVerNotBetween(String value1, String value2) {
            addCriterion("soft_ver not between", value1, value2, "softVer");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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