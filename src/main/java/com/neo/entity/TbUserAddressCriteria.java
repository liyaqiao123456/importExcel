package com.neo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserAddressCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserAddressCriteria() {
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

        public Criteria andAddress_idIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddress_idIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_idEqualTo(Integer value) {
            addCriterion("address_id =", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThan(Integer value) {
            addCriterion("address_id >", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThan(Integer value) {
            addCriterion("address_id <", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idIn(List<Integer> values) {
            addCriterion("address_id in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "address_id");
            return (Criteria) this;
        }

        public Criteria andJob_numberIsNull() {
            addCriterion("job_number is null");
            return (Criteria) this;
        }

        public Criteria andJob_numberIsNotNull() {
            addCriterion("job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJob_numberEqualTo(Integer value) {
            addCriterion("job_number =", value, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberNotEqualTo(Integer value) {
            addCriterion("job_number <>", value, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberGreaterThan(Integer value) {
            addCriterion("job_number >", value, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_number >=", value, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberLessThan(Integer value) {
            addCriterion("job_number <", value, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberLessThanOrEqualTo(Integer value) {
            addCriterion("job_number <=", value, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberIn(List<Integer> values) {
            addCriterion("job_number in", values, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberNotIn(List<Integer> values) {
            addCriterion("job_number not in", values, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberBetween(Integer value1, Integer value2) {
            addCriterion("job_number between", value1, value2, "job_number");
            return (Criteria) this;
        }

        public Criteria andJob_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("job_number not between", value1, value2, "job_number");
            return (Criteria) this;
        }

        public Criteria andAward_idIsNull() {
            addCriterion("award_id is null");
            return (Criteria) this;
        }

        public Criteria andAward_idIsNotNull() {
            addCriterion("award_id is not null");
            return (Criteria) this;
        }

        public Criteria andAward_idEqualTo(Integer value) {
            addCriterion("award_id =", value, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idNotEqualTo(Integer value) {
            addCriterion("award_id <>", value, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idGreaterThan(Integer value) {
            addCriterion("award_id >", value, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_id >=", value, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idLessThan(Integer value) {
            addCriterion("award_id <", value, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idLessThanOrEqualTo(Integer value) {
            addCriterion("award_id <=", value, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idIn(List<Integer> values) {
            addCriterion("award_id in", values, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idNotIn(List<Integer> values) {
            addCriterion("award_id not in", values, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idBetween(Integer value1, Integer value2) {
            addCriterion("award_id between", value1, value2, "award_id");
            return (Criteria) this;
        }

        public Criteria andAward_idNotBetween(Integer value1, Integer value2) {
            addCriterion("award_id not between", value1, value2, "award_id");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_addressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUser_addressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUser_addressEqualTo(String value) {
            addCriterion("user_address =", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressGreaterThan(String value) {
            addCriterion("user_address >", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLessThan(String value) {
            addCriterion("user_address <", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLike(String value) {
            addCriterion("user_address like", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotLike(String value) {
            addCriterion("user_address not like", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressIn(List<String> values) {
            addCriterion("user_address in", values, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneEqualTo(String value) {
            addCriterion("user_phone =", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThan(String value) {
            addCriterion("user_phone <", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLike(String value) {
            addCriterion("user_phone like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotLike(String value) {
            addCriterion("user_phone not like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIn(List<String> values) {
            addCriterion("user_phone in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
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