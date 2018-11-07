package com.neo.entity;

import java.util.ArrayList;
import java.util.List;

public class TbagentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbagentCriteria() {
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

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsIsNull() {
            addCriterion("company_rankings is null");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsIsNotNull() {
            addCriterion("company_rankings is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsEqualTo(Integer value) {
            addCriterion("company_rankings =", value, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsNotEqualTo(Integer value) {
            addCriterion("company_rankings <>", value, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsGreaterThan(Integer value) {
            addCriterion("company_rankings >", value, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_rankings >=", value, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsLessThan(Integer value) {
            addCriterion("company_rankings <", value, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsLessThanOrEqualTo(Integer value) {
            addCriterion("company_rankings <=", value, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsIn(List<Integer> values) {
            addCriterion("company_rankings in", values, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsNotIn(List<Integer> values) {
            addCriterion("company_rankings not in", values, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsBetween(Integer value1, Integer value2) {
            addCriterion("company_rankings between", value1, value2, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andCompany_rankingsNotBetween(Integer value1, Integer value2) {
            addCriterion("company_rankings not between", value1, value2, "company_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsIsNull() {
            addCriterion("department_rankings is null");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsIsNotNull() {
            addCriterion("department_rankings is not null");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsEqualTo(Integer value) {
            addCriterion("department_rankings =", value, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsNotEqualTo(Integer value) {
            addCriterion("department_rankings <>", value, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsGreaterThan(Integer value) {
            addCriterion("department_rankings >", value, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_rankings >=", value, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsLessThan(Integer value) {
            addCriterion("department_rankings <", value, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsLessThanOrEqualTo(Integer value) {
            addCriterion("department_rankings <=", value, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsIn(List<Integer> values) {
            addCriterion("department_rankings in", values, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsNotIn(List<Integer> values) {
            addCriterion("department_rankings not in", values, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsBetween(Integer value1, Integer value2) {
            addCriterion("department_rankings between", value1, value2, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andDepartment_rankingsNotBetween(Integer value1, Integer value2) {
            addCriterion("department_rankings not between", value1, value2, "department_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsIsNull() {
            addCriterion("region_rankings is null");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsIsNotNull() {
            addCriterion("region_rankings is not null");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsEqualTo(Integer value) {
            addCriterion("region_rankings =", value, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsNotEqualTo(Integer value) {
            addCriterion("region_rankings <>", value, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsGreaterThan(Integer value) {
            addCriterion("region_rankings >", value, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_rankings >=", value, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsLessThan(Integer value) {
            addCriterion("region_rankings <", value, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsLessThanOrEqualTo(Integer value) {
            addCriterion("region_rankings <=", value, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsIn(List<Integer> values) {
            addCriterion("region_rankings in", values, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsNotIn(List<Integer> values) {
            addCriterion("region_rankings not in", values, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsBetween(Integer value1, Integer value2) {
            addCriterion("region_rankings between", value1, value2, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andRegion_rankingsNotBetween(Integer value1, Integer value2) {
            addCriterion("region_rankings not between", value1, value2, "region_rankings");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyIsNull() {
            addCriterion("distance_first_company is null");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyIsNotNull() {
            addCriterion("distance_first_company is not null");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyEqualTo(Long value) {
            addCriterion("distance_first_company =", value, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyNotEqualTo(Long value) {
            addCriterion("distance_first_company <>", value, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyGreaterThan(Long value) {
            addCriterion("distance_first_company >", value, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyGreaterThanOrEqualTo(Long value) {
            addCriterion("distance_first_company >=", value, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyLessThan(Long value) {
            addCriterion("distance_first_company <", value, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyLessThanOrEqualTo(Long value) {
            addCriterion("distance_first_company <=", value, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyIn(List<Long> values) {
            addCriterion("distance_first_company in", values, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyNotIn(List<Long> values) {
            addCriterion("distance_first_company not in", values, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyBetween(Long value1, Long value2) {
            addCriterion("distance_first_company between", value1, value2, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_companyNotBetween(Long value1, Long value2) {
            addCriterion("distance_first_company not between", value1, value2, "distance_first_company");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentIsNull() {
            addCriterion("distance_first_department is null");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentIsNotNull() {
            addCriterion("distance_first_department is not null");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentEqualTo(Long value) {
            addCriterion("distance_first_department =", value, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentNotEqualTo(Long value) {
            addCriterion("distance_first_department <>", value, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentGreaterThan(Long value) {
            addCriterion("distance_first_department >", value, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentGreaterThanOrEqualTo(Long value) {
            addCriterion("distance_first_department >=", value, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentLessThan(Long value) {
            addCriterion("distance_first_department <", value, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentLessThanOrEqualTo(Long value) {
            addCriterion("distance_first_department <=", value, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentIn(List<Long> values) {
            addCriterion("distance_first_department in", values, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentNotIn(List<Long> values) {
            addCriterion("distance_first_department not in", values, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentBetween(Long value1, Long value2) {
            addCriterion("distance_first_department between", value1, value2, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_departmentNotBetween(Long value1, Long value2) {
            addCriterion("distance_first_department not between", value1, value2, "distance_first_department");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionIsNull() {
            addCriterion("distance_first_region is null");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionIsNotNull() {
            addCriterion("distance_first_region is not null");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionEqualTo(Long value) {
            addCriterion("distance_first_region =", value, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionNotEqualTo(Long value) {
            addCriterion("distance_first_region <>", value, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionGreaterThan(Long value) {
            addCriterion("distance_first_region >", value, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionGreaterThanOrEqualTo(Long value) {
            addCriterion("distance_first_region >=", value, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionLessThan(Long value) {
            addCriterion("distance_first_region <", value, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionLessThanOrEqualTo(Long value) {
            addCriterion("distance_first_region <=", value, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionIn(List<Long> values) {
            addCriterion("distance_first_region in", values, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionNotIn(List<Long> values) {
            addCriterion("distance_first_region not in", values, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionBetween(Long value1, Long value2) {
            addCriterion("distance_first_region between", value1, value2, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andDistance_first_regionNotBetween(Long value1, Long value2) {
            addCriterion("distance_first_region not between", value1, value2, "distance_first_region");
            return (Criteria) this;
        }

        public Criteria andParticipateIsNull() {
            addCriterion("participate is null");
            return (Criteria) this;
        }

        public Criteria andParticipateIsNotNull() {
            addCriterion("participate is not null");
            return (Criteria) this;
        }

        public Criteria andParticipateEqualTo(Integer value) {
            addCriterion("participate =", value, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateNotEqualTo(Integer value) {
            addCriterion("participate <>", value, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateGreaterThan(Integer value) {
            addCriterion("participate >", value, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateGreaterThanOrEqualTo(Integer value) {
            addCriterion("participate >=", value, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateLessThan(Integer value) {
            addCriterion("participate <", value, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateLessThanOrEqualTo(Integer value) {
            addCriterion("participate <=", value, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateIn(List<Integer> values) {
            addCriterion("participate in", values, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateNotIn(List<Integer> values) {
            addCriterion("participate not in", values, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateBetween(Integer value1, Integer value2) {
            addCriterion("participate between", value1, value2, "participate");
            return (Criteria) this;
        }

        public Criteria andParticipateNotBetween(Integer value1, Integer value2) {
            addCriterion("participate not between", value1, value2, "participate");
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