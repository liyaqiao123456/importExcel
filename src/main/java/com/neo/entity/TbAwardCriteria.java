package com.neo.entity;

import java.util.ArrayList;
import java.util.List;

public class TbAwardCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAwardCriteria() {
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

        public Criteria andAward_nameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAward_nameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAward_nameEqualTo(String value) {
            addCriterion("award_name =", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameGreaterThan(String value) {
            addCriterion("award_name >", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameLessThan(String value) {
            addCriterion("award_name <", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameLike(String value) {
            addCriterion("award_name like", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotLike(String value) {
            addCriterion("award_name not like", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameIn(List<String> values) {
            addCriterion("award_name in", values, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_weightIsNull() {
            addCriterion("award_weight is null");
            return (Criteria) this;
        }

        public Criteria andAward_weightIsNotNull() {
            addCriterion("award_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAward_weightEqualTo(Integer value) {
            addCriterion("award_weight =", value, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightNotEqualTo(Integer value) {
            addCriterion("award_weight <>", value, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightGreaterThan(Integer value) {
            addCriterion("award_weight >", value, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_weight >=", value, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightLessThan(Integer value) {
            addCriterion("award_weight <", value, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightLessThanOrEqualTo(Integer value) {
            addCriterion("award_weight <=", value, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightIn(List<Integer> values) {
            addCriterion("award_weight in", values, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightNotIn(List<Integer> values) {
            addCriterion("award_weight not in", values, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightBetween(Integer value1, Integer value2) {
            addCriterion("award_weight between", value1, value2, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_weightNotBetween(Integer value1, Integer value2) {
            addCriterion("award_weight not between", value1, value2, "award_weight");
            return (Criteria) this;
        }

        public Criteria andAward_mountIsNull() {
            addCriterion("award_mount is null");
            return (Criteria) this;
        }

        public Criteria andAward_mountIsNotNull() {
            addCriterion("award_mount is not null");
            return (Criteria) this;
        }

        public Criteria andAward_mountEqualTo(Integer value) {
            addCriterion("award_mount =", value, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountNotEqualTo(Integer value) {
            addCriterion("award_mount <>", value, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountGreaterThan(Integer value) {
            addCriterion("award_mount >", value, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_mount >=", value, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountLessThan(Integer value) {
            addCriterion("award_mount <", value, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountLessThanOrEqualTo(Integer value) {
            addCriterion("award_mount <=", value, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountIn(List<Integer> values) {
            addCriterion("award_mount in", values, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountNotIn(List<Integer> values) {
            addCriterion("award_mount not in", values, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountBetween(Integer value1, Integer value2) {
            addCriterion("award_mount between", value1, value2, "award_mount");
            return (Criteria) this;
        }

        public Criteria andAward_mountNotBetween(Integer value1, Integer value2) {
            addCriterion("award_mount not between", value1, value2, "award_mount");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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