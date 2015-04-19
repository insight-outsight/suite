package com.selffun.suite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BysecondExample {
    protected String pk_name = "id";

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BysecondExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setPk_name(String pk_name) {
        this.pk_name = pk_name;
    }

    public String getPk_name() {
        return pk_name;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCTime("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCTime("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCTime("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCallCountIsNull() {
            addCriterion("call_count is null");
            return (Criteria) this;
        }

        public Criteria andCallCountIsNotNull() {
            addCriterion("call_count is not null");
            return (Criteria) this;
        }

        public Criteria andCallCountEqualTo(Long value) {
            addCriterion("call_count =", value, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountNotEqualTo(Long value) {
            addCriterion("call_count <>", value, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountGreaterThan(Long value) {
            addCriterion("call_count >", value, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountGreaterThanOrEqualTo(Long value) {
            addCriterion("call_count >=", value, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountLessThan(Long value) {
            addCriterion("call_count <", value, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountLessThanOrEqualTo(Long value) {
            addCriterion("call_count <=", value, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountIn(List<Long> values) {
            addCriterion("call_count in", values, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountNotIn(List<Long> values) {
            addCriterion("call_count not in", values, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountBetween(Long value1, Long value2) {
            addCriterion("call_count between", value1, value2, "callCount");
            return (Criteria) this;
        }

        public Criteria andCallCountNotBetween(Long value1, Long value2) {
            addCriterion("call_count not between", value1, value2, "callCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountIsNull() {
            addCriterion("resp_sec_count is null");
            return (Criteria) this;
        }

        public Criteria andRespSecCountIsNotNull() {
            addCriterion("resp_sec_count is not null");
            return (Criteria) this;
        }

        public Criteria andRespSecCountEqualTo(Long value) {
            addCriterion("resp_sec_count =", value, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountNotEqualTo(Long value) {
            addCriterion("resp_sec_count <>", value, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountGreaterThan(Long value) {
            addCriterion("resp_sec_count >", value, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountGreaterThanOrEqualTo(Long value) {
            addCriterion("resp_sec_count >=", value, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountLessThan(Long value) {
            addCriterion("resp_sec_count <", value, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountLessThanOrEqualTo(Long value) {
            addCriterion("resp_sec_count <=", value, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountIn(List<Long> values) {
            addCriterion("resp_sec_count in", values, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountNotIn(List<Long> values) {
            addCriterion("resp_sec_count not in", values, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountBetween(Long value1, Long value2) {
            addCriterion("resp_sec_count between", value1, value2, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andRespSecCountNotBetween(Long value1, Long value2) {
            addCriterion("resp_sec_count not between", value1, value2, "respSecCount");
            return (Criteria) this;
        }

        public Criteria andDataInputIsNull() {
            addCriterion("data_input is null");
            return (Criteria) this;
        }

        public Criteria andDataInputIsNotNull() {
            addCriterion("data_input is not null");
            return (Criteria) this;
        }

        public Criteria andDataInputEqualTo(Long value) {
            addCriterion("data_input =", value, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputNotEqualTo(Long value) {
            addCriterion("data_input <>", value, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputGreaterThan(Long value) {
            addCriterion("data_input >", value, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputGreaterThanOrEqualTo(Long value) {
            addCriterion("data_input >=", value, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputLessThan(Long value) {
            addCriterion("data_input <", value, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputLessThanOrEqualTo(Long value) {
            addCriterion("data_input <=", value, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputIn(List<Long> values) {
            addCriterion("data_input in", values, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputNotIn(List<Long> values) {
            addCriterion("data_input not in", values, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputBetween(Long value1, Long value2) {
            addCriterion("data_input between", value1, value2, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataInputNotBetween(Long value1, Long value2) {
            addCriterion("data_input not between", value1, value2, "dataInput");
            return (Criteria) this;
        }

        public Criteria andDataOutputIsNull() {
            addCriterion("data_output is null");
            return (Criteria) this;
        }

        public Criteria andDataOutputIsNotNull() {
            addCriterion("data_output is not null");
            return (Criteria) this;
        }

        public Criteria andDataOutputEqualTo(Long value) {
            addCriterion("data_output =", value, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputNotEqualTo(Long value) {
            addCriterion("data_output <>", value, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputGreaterThan(Long value) {
            addCriterion("data_output >", value, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputGreaterThanOrEqualTo(Long value) {
            addCriterion("data_output >=", value, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputLessThan(Long value) {
            addCriterion("data_output <", value, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputLessThanOrEqualTo(Long value) {
            addCriterion("data_output <=", value, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputIn(List<Long> values) {
            addCriterion("data_output in", values, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputNotIn(List<Long> values) {
            addCriterion("data_output not in", values, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputBetween(Long value1, Long value2) {
            addCriterion("data_output between", value1, value2, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andDataOutputNotBetween(Long value1, Long value2) {
            addCriterion("data_output not between", value1, value2, "dataOutput");
            return (Criteria) this;
        }

        public Criteria andMaxRespIsNull() {
            addCriterion("max_resp is null");
            return (Criteria) this;
        }

        public Criteria andMaxRespIsNotNull() {
            addCriterion("max_resp is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRespEqualTo(Integer value) {
            addCriterion("max_resp =", value, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespNotEqualTo(Integer value) {
            addCriterion("max_resp <>", value, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespGreaterThan(Integer value) {
            addCriterion("max_resp >", value, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_resp >=", value, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespLessThan(Integer value) {
            addCriterion("max_resp <", value, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespLessThanOrEqualTo(Integer value) {
            addCriterion("max_resp <=", value, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespIn(List<Integer> values) {
            addCriterion("max_resp in", values, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespNotIn(List<Integer> values) {
            addCriterion("max_resp not in", values, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespBetween(Integer value1, Integer value2) {
            addCriterion("max_resp between", value1, value2, "maxResp");
            return (Criteria) this;
        }

        public Criteria andMaxRespNotBetween(Integer value1, Integer value2) {
            addCriterion("max_resp not between", value1, value2, "maxResp");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeIsNull() {
            addCriterion("cm_created_time is null");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeIsNotNull() {
            addCriterion("cm_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeEqualTo(Date value) {
            addCriterion("cm_created_time =", value, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeNotEqualTo(Date value) {
            addCriterion("cm_created_time <>", value, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeGreaterThan(Date value) {
            addCriterion("cm_created_time >", value, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cm_created_time >=", value, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeLessThan(Date value) {
            addCriterion("cm_created_time <", value, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("cm_created_time <=", value, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeIn(List<Date> values) {
            addCriterion("cm_created_time in", values, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeNotIn(List<Date> values) {
            addCriterion("cm_created_time not in", values, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("cm_created_time between", value1, value2, "cmCreatedTime");
            return (Criteria) this;
        }

        public Criteria andCmCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("cm_created_time not between", value1, value2, "cmCreatedTime");
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