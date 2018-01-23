package com.example.competition.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Integer value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Integer value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Integer value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Integer value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Integer> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Integer> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Integer value1, Integer value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("report_status is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("report_status is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(Byte value) {
            addCriterion("report_status =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(Byte value) {
            addCriterion("report_status <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(Byte value) {
            addCriterion("report_status >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("report_status >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(Byte value) {
            addCriterion("report_status <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(Byte value) {
            addCriterion("report_status <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<Byte> values) {
            addCriterion("report_status in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<Byte> values) {
            addCriterion("report_status not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(Byte value1, Byte value2) {
            addCriterion("report_status between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("report_status not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoIsNull() {
            addCriterion("main_student_no is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoIsNotNull() {
            addCriterion("main_student_no is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoEqualTo(String value) {
            addCriterion("main_student_no =", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoNotEqualTo(String value) {
            addCriterion("main_student_no <>", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoGreaterThan(String value) {
            addCriterion("main_student_no >", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_no >=", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoLessThan(String value) {
            addCriterion("main_student_no <", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoLessThanOrEqualTo(String value) {
            addCriterion("main_student_no <=", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoLike(String value) {
            addCriterion("main_student_no like", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoNotLike(String value) {
            addCriterion("main_student_no not like", value, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoIn(List<String> values) {
            addCriterion("main_student_no in", values, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoNotIn(List<String> values) {
            addCriterion("main_student_no not in", values, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoBetween(String value1, String value2) {
            addCriterion("main_student_no between", value1, value2, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNoNotBetween(String value1, String value2) {
            addCriterion("main_student_no not between", value1, value2, "mainStudentNo");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameIsNull() {
            addCriterion("main_student_name is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameIsNotNull() {
            addCriterion("main_student_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameEqualTo(String value) {
            addCriterion("main_student_name =", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameNotEqualTo(String value) {
            addCriterion("main_student_name <>", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameGreaterThan(String value) {
            addCriterion("main_student_name >", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_name >=", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameLessThan(String value) {
            addCriterion("main_student_name <", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameLessThanOrEqualTo(String value) {
            addCriterion("main_student_name <=", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameLike(String value) {
            addCriterion("main_student_name like", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameNotLike(String value) {
            addCriterion("main_student_name not like", value, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameIn(List<String> values) {
            addCriterion("main_student_name in", values, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameNotIn(List<String> values) {
            addCriterion("main_student_name not in", values, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameBetween(String value1, String value2) {
            addCriterion("main_student_name between", value1, value2, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentNameNotBetween(String value1, String value2) {
            addCriterion("main_student_name not between", value1, value2, "mainStudentName");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyIsNull() {
            addCriterion("main_student_specialty is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyIsNotNull() {
            addCriterion("main_student_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyEqualTo(String value) {
            addCriterion("main_student_specialty =", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyNotEqualTo(String value) {
            addCriterion("main_student_specialty <>", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyGreaterThan(String value) {
            addCriterion("main_student_specialty >", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_specialty >=", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyLessThan(String value) {
            addCriterion("main_student_specialty <", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("main_student_specialty <=", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyLike(String value) {
            addCriterion("main_student_specialty like", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyNotLike(String value) {
            addCriterion("main_student_specialty not like", value, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyIn(List<String> values) {
            addCriterion("main_student_specialty in", values, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyNotIn(List<String> values) {
            addCriterion("main_student_specialty not in", values, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyBetween(String value1, String value2) {
            addCriterion("main_student_specialty between", value1, value2, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentSpecialtyNotBetween(String value1, String value2) {
            addCriterion("main_student_specialty not between", value1, value2, "mainStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneIsNull() {
            addCriterion("main_student_phone is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneIsNotNull() {
            addCriterion("main_student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneEqualTo(String value) {
            addCriterion("main_student_phone =", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneNotEqualTo(String value) {
            addCriterion("main_student_phone <>", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneGreaterThan(String value) {
            addCriterion("main_student_phone >", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_phone >=", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneLessThan(String value) {
            addCriterion("main_student_phone <", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("main_student_phone <=", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneLike(String value) {
            addCriterion("main_student_phone like", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneNotLike(String value) {
            addCriterion("main_student_phone not like", value, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneIn(List<String> values) {
            addCriterion("main_student_phone in", values, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneNotIn(List<String> values) {
            addCriterion("main_student_phone not in", values, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneBetween(String value1, String value2) {
            addCriterion("main_student_phone between", value1, value2, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("main_student_phone not between", value1, value2, "mainStudentPhone");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailIsNull() {
            addCriterion("main_student_email is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailIsNotNull() {
            addCriterion("main_student_email is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailEqualTo(String value) {
            addCriterion("main_student_email =", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailNotEqualTo(String value) {
            addCriterion("main_student_email <>", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailGreaterThan(String value) {
            addCriterion("main_student_email >", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_email >=", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailLessThan(String value) {
            addCriterion("main_student_email <", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("main_student_email <=", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailLike(String value) {
            addCriterion("main_student_email like", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailNotLike(String value) {
            addCriterion("main_student_email not like", value, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailIn(List<String> values) {
            addCriterion("main_student_email in", values, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailNotIn(List<String> values) {
            addCriterion("main_student_email not in", values, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailBetween(String value1, String value2) {
            addCriterion("main_student_email between", value1, value2, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentEmailNotBetween(String value1, String value2) {
            addCriterion("main_student_email not between", value1, value2, "mainStudentEmail");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentIsNull() {
            addCriterion("main_student_department is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentIsNotNull() {
            addCriterion("main_student_department is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentEqualTo(String value) {
            addCriterion("main_student_department =", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentNotEqualTo(String value) {
            addCriterion("main_student_department <>", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentGreaterThan(String value) {
            addCriterion("main_student_department >", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_department >=", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentLessThan(String value) {
            addCriterion("main_student_department <", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentLessThanOrEqualTo(String value) {
            addCriterion("main_student_department <=", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentLike(String value) {
            addCriterion("main_student_department like", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentNotLike(String value) {
            addCriterion("main_student_department not like", value, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentIn(List<String> values) {
            addCriterion("main_student_department in", values, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentNotIn(List<String> values) {
            addCriterion("main_student_department not in", values, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentBetween(String value1, String value2) {
            addCriterion("main_student_department between", value1, value2, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentDepartmentNotBetween(String value1, String value2) {
            addCriterion("main_student_department not between", value1, value2, "mainStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeIsNull() {
            addCriterion("main_student_grade is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeIsNotNull() {
            addCriterion("main_student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeEqualTo(String value) {
            addCriterion("main_student_grade =", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeNotEqualTo(String value) {
            addCriterion("main_student_grade <>", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeGreaterThan(String value) {
            addCriterion("main_student_grade >", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_grade >=", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeLessThan(String value) {
            addCriterion("main_student_grade <", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("main_student_grade <=", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeLike(String value) {
            addCriterion("main_student_grade like", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeNotLike(String value) {
            addCriterion("main_student_grade not like", value, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeIn(List<String> values) {
            addCriterion("main_student_grade in", values, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeNotIn(List<String> values) {
            addCriterion("main_student_grade not in", values, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeBetween(String value1, String value2) {
            addCriterion("main_student_grade between", value1, value2, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentGradeNotBetween(String value1, String value2) {
            addCriterion("main_student_grade not between", value1, value2, "mainStudentGrade");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqIsNull() {
            addCriterion("main_student_QQ is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqIsNotNull() {
            addCriterion("main_student_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqEqualTo(String value) {
            addCriterion("main_student_QQ =", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotEqualTo(String value) {
            addCriterion("main_student_QQ <>", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqGreaterThan(String value) {
            addCriterion("main_student_QQ >", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_QQ >=", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqLessThan(String value) {
            addCriterion("main_student_QQ <", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqLessThanOrEqualTo(String value) {
            addCriterion("main_student_QQ <=", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqLike(String value) {
            addCriterion("main_student_QQ like", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotLike(String value) {
            addCriterion("main_student_QQ not like", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqIn(List<String> values) {
            addCriterion("main_student_QQ in", values, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotIn(List<String> values) {
            addCriterion("main_student_QQ not in", values, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqBetween(String value1, String value2) {
            addCriterion("main_student_QQ between", value1, value2, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotBetween(String value1, String value2) {
            addCriterion("main_student_QQ not between", value1, value2, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andStudent1NoIsNull() {
            addCriterion("student1_no is null");
            return (Criteria) this;
        }

        public Criteria andStudent1NoIsNotNull() {
            addCriterion("student1_no is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1NoEqualTo(String value) {
            addCriterion("student1_no =", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoNotEqualTo(String value) {
            addCriterion("student1_no <>", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoGreaterThan(String value) {
            addCriterion("student1_no >", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoGreaterThanOrEqualTo(String value) {
            addCriterion("student1_no >=", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoLessThan(String value) {
            addCriterion("student1_no <", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoLessThanOrEqualTo(String value) {
            addCriterion("student1_no <=", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoLike(String value) {
            addCriterion("student1_no like", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoNotLike(String value) {
            addCriterion("student1_no not like", value, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoIn(List<String> values) {
            addCriterion("student1_no in", values, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoNotIn(List<String> values) {
            addCriterion("student1_no not in", values, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoBetween(String value1, String value2) {
            addCriterion("student1_no between", value1, value2, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NoNotBetween(String value1, String value2) {
            addCriterion("student1_no not between", value1, value2, "student1No");
            return (Criteria) this;
        }

        public Criteria andStudent1NameIsNull() {
            addCriterion("student1_name is null");
            return (Criteria) this;
        }

        public Criteria andStudent1NameIsNotNull() {
            addCriterion("student1_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1NameEqualTo(String value) {
            addCriterion("student1_name =", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameNotEqualTo(String value) {
            addCriterion("student1_name <>", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameGreaterThan(String value) {
            addCriterion("student1_name >", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameGreaterThanOrEqualTo(String value) {
            addCriterion("student1_name >=", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameLessThan(String value) {
            addCriterion("student1_name <", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameLessThanOrEqualTo(String value) {
            addCriterion("student1_name <=", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameLike(String value) {
            addCriterion("student1_name like", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameNotLike(String value) {
            addCriterion("student1_name not like", value, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameIn(List<String> values) {
            addCriterion("student1_name in", values, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameNotIn(List<String> values) {
            addCriterion("student1_name not in", values, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameBetween(String value1, String value2) {
            addCriterion("student1_name between", value1, value2, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1NameNotBetween(String value1, String value2) {
            addCriterion("student1_name not between", value1, value2, "student1Name");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyIsNull() {
            addCriterion("student1_specialty is null");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyIsNotNull() {
            addCriterion("student1_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyEqualTo(String value) {
            addCriterion("student1_specialty =", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyNotEqualTo(String value) {
            addCriterion("student1_specialty <>", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyGreaterThan(String value) {
            addCriterion("student1_specialty >", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("student1_specialty >=", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyLessThan(String value) {
            addCriterion("student1_specialty <", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyLessThanOrEqualTo(String value) {
            addCriterion("student1_specialty <=", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyLike(String value) {
            addCriterion("student1_specialty like", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyNotLike(String value) {
            addCriterion("student1_specialty not like", value, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyIn(List<String> values) {
            addCriterion("student1_specialty in", values, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyNotIn(List<String> values) {
            addCriterion("student1_specialty not in", values, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyBetween(String value1, String value2) {
            addCriterion("student1_specialty between", value1, value2, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1SpecialtyNotBetween(String value1, String value2) {
            addCriterion("student1_specialty not between", value1, value2, "student1Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneIsNull() {
            addCriterion("student1_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneIsNotNull() {
            addCriterion("student1_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneEqualTo(String value) {
            addCriterion("student1_phone =", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneNotEqualTo(String value) {
            addCriterion("student1_phone <>", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneGreaterThan(String value) {
            addCriterion("student1_phone >", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student1_phone >=", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneLessThan(String value) {
            addCriterion("student1_phone <", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneLessThanOrEqualTo(String value) {
            addCriterion("student1_phone <=", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneLike(String value) {
            addCriterion("student1_phone like", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneNotLike(String value) {
            addCriterion("student1_phone not like", value, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneIn(List<String> values) {
            addCriterion("student1_phone in", values, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneNotIn(List<String> values) {
            addCriterion("student1_phone not in", values, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneBetween(String value1, String value2) {
            addCriterion("student1_phone between", value1, value2, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1PhoneNotBetween(String value1, String value2) {
            addCriterion("student1_phone not between", value1, value2, "student1Phone");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailIsNull() {
            addCriterion("student1_email is null");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailIsNotNull() {
            addCriterion("student1_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailEqualTo(String value) {
            addCriterion("student1_email =", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailNotEqualTo(String value) {
            addCriterion("student1_email <>", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailGreaterThan(String value) {
            addCriterion("student1_email >", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailGreaterThanOrEqualTo(String value) {
            addCriterion("student1_email >=", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailLessThan(String value) {
            addCriterion("student1_email <", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailLessThanOrEqualTo(String value) {
            addCriterion("student1_email <=", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailLike(String value) {
            addCriterion("student1_email like", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailNotLike(String value) {
            addCriterion("student1_email not like", value, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailIn(List<String> values) {
            addCriterion("student1_email in", values, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailNotIn(List<String> values) {
            addCriterion("student1_email not in", values, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailBetween(String value1, String value2) {
            addCriterion("student1_email between", value1, value2, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1EmailNotBetween(String value1, String value2) {
            addCriterion("student1_email not between", value1, value2, "student1Email");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentIsNull() {
            addCriterion("student1_department is null");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentIsNotNull() {
            addCriterion("student1_department is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentEqualTo(String value) {
            addCriterion("student1_department =", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentNotEqualTo(String value) {
            addCriterion("student1_department <>", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentGreaterThan(String value) {
            addCriterion("student1_department >", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("student1_department >=", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentLessThan(String value) {
            addCriterion("student1_department <", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentLessThanOrEqualTo(String value) {
            addCriterion("student1_department <=", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentLike(String value) {
            addCriterion("student1_department like", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentNotLike(String value) {
            addCriterion("student1_department not like", value, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentIn(List<String> values) {
            addCriterion("student1_department in", values, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentNotIn(List<String> values) {
            addCriterion("student1_department not in", values, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentBetween(String value1, String value2) {
            addCriterion("student1_department between", value1, value2, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1DepartmentNotBetween(String value1, String value2) {
            addCriterion("student1_department not between", value1, value2, "student1Department");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeIsNull() {
            addCriterion("student1_grade is null");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeIsNotNull() {
            addCriterion("student1_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeEqualTo(String value) {
            addCriterion("student1_grade =", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeNotEqualTo(String value) {
            addCriterion("student1_grade <>", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeGreaterThan(String value) {
            addCriterion("student1_grade >", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeGreaterThanOrEqualTo(String value) {
            addCriterion("student1_grade >=", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeLessThan(String value) {
            addCriterion("student1_grade <", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeLessThanOrEqualTo(String value) {
            addCriterion("student1_grade <=", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeLike(String value) {
            addCriterion("student1_grade like", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeNotLike(String value) {
            addCriterion("student1_grade not like", value, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeIn(List<String> values) {
            addCriterion("student1_grade in", values, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeNotIn(List<String> values) {
            addCriterion("student1_grade not in", values, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeBetween(String value1, String value2) {
            addCriterion("student1_grade between", value1, value2, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1GradeNotBetween(String value1, String value2) {
            addCriterion("student1_grade not between", value1, value2, "student1Grade");
            return (Criteria) this;
        }

        public Criteria andStudent1QqIsNull() {
            addCriterion("student1_QQ is null");
            return (Criteria) this;
        }

        public Criteria andStudent1QqIsNotNull() {
            addCriterion("student1_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andStudent1QqEqualTo(String value) {
            addCriterion("student1_QQ =", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqNotEqualTo(String value) {
            addCriterion("student1_QQ <>", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqGreaterThan(String value) {
            addCriterion("student1_QQ >", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqGreaterThanOrEqualTo(String value) {
            addCriterion("student1_QQ >=", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqLessThan(String value) {
            addCriterion("student1_QQ <", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqLessThanOrEqualTo(String value) {
            addCriterion("student1_QQ <=", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqLike(String value) {
            addCriterion("student1_QQ like", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqNotLike(String value) {
            addCriterion("student1_QQ not like", value, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqIn(List<String> values) {
            addCriterion("student1_QQ in", values, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqNotIn(List<String> values) {
            addCriterion("student1_QQ not in", values, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqBetween(String value1, String value2) {
            addCriterion("student1_QQ between", value1, value2, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent1QqNotBetween(String value1, String value2) {
            addCriterion("student1_QQ not between", value1, value2, "student1Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2NoIsNull() {
            addCriterion("student2_no is null");
            return (Criteria) this;
        }

        public Criteria andStudent2NoIsNotNull() {
            addCriterion("student2_no is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2NoEqualTo(String value) {
            addCriterion("student2_no =", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoNotEqualTo(String value) {
            addCriterion("student2_no <>", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoGreaterThan(String value) {
            addCriterion("student2_no >", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoGreaterThanOrEqualTo(String value) {
            addCriterion("student2_no >=", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoLessThan(String value) {
            addCriterion("student2_no <", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoLessThanOrEqualTo(String value) {
            addCriterion("student2_no <=", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoLike(String value) {
            addCriterion("student2_no like", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoNotLike(String value) {
            addCriterion("student2_no not like", value, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoIn(List<String> values) {
            addCriterion("student2_no in", values, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoNotIn(List<String> values) {
            addCriterion("student2_no not in", values, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoBetween(String value1, String value2) {
            addCriterion("student2_no between", value1, value2, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NoNotBetween(String value1, String value2) {
            addCriterion("student2_no not between", value1, value2, "student2No");
            return (Criteria) this;
        }

        public Criteria andStudent2NameIsNull() {
            addCriterion("student2_name is null");
            return (Criteria) this;
        }

        public Criteria andStudent2NameIsNotNull() {
            addCriterion("student2_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2NameEqualTo(String value) {
            addCriterion("student2_name =", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameNotEqualTo(String value) {
            addCriterion("student2_name <>", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameGreaterThan(String value) {
            addCriterion("student2_name >", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameGreaterThanOrEqualTo(String value) {
            addCriterion("student2_name >=", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameLessThan(String value) {
            addCriterion("student2_name <", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameLessThanOrEqualTo(String value) {
            addCriterion("student2_name <=", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameLike(String value) {
            addCriterion("student2_name like", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameNotLike(String value) {
            addCriterion("student2_name not like", value, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameIn(List<String> values) {
            addCriterion("student2_name in", values, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameNotIn(List<String> values) {
            addCriterion("student2_name not in", values, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameBetween(String value1, String value2) {
            addCriterion("student2_name between", value1, value2, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2NameNotBetween(String value1, String value2) {
            addCriterion("student2_name not between", value1, value2, "student2Name");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyIsNull() {
            addCriterion("student2_specialty is null");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyIsNotNull() {
            addCriterion("student2_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyEqualTo(String value) {
            addCriterion("student2_specialty =", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyNotEqualTo(String value) {
            addCriterion("student2_specialty <>", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyGreaterThan(String value) {
            addCriterion("student2_specialty >", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("student2_specialty >=", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyLessThan(String value) {
            addCriterion("student2_specialty <", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyLessThanOrEqualTo(String value) {
            addCriterion("student2_specialty <=", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyLike(String value) {
            addCriterion("student2_specialty like", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyNotLike(String value) {
            addCriterion("student2_specialty not like", value, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyIn(List<String> values) {
            addCriterion("student2_specialty in", values, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyNotIn(List<String> values) {
            addCriterion("student2_specialty not in", values, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyBetween(String value1, String value2) {
            addCriterion("student2_specialty between", value1, value2, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2SpecialtyNotBetween(String value1, String value2) {
            addCriterion("student2_specialty not between", value1, value2, "student2Specialty");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneIsNull() {
            addCriterion("student2_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneIsNotNull() {
            addCriterion("student2_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneEqualTo(String value) {
            addCriterion("student2_phone =", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneNotEqualTo(String value) {
            addCriterion("student2_phone <>", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneGreaterThan(String value) {
            addCriterion("student2_phone >", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student2_phone >=", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneLessThan(String value) {
            addCriterion("student2_phone <", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneLessThanOrEqualTo(String value) {
            addCriterion("student2_phone <=", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneLike(String value) {
            addCriterion("student2_phone like", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneNotLike(String value) {
            addCriterion("student2_phone not like", value, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneIn(List<String> values) {
            addCriterion("student2_phone in", values, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneNotIn(List<String> values) {
            addCriterion("student2_phone not in", values, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneBetween(String value1, String value2) {
            addCriterion("student2_phone between", value1, value2, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2PhoneNotBetween(String value1, String value2) {
            addCriterion("student2_phone not between", value1, value2, "student2Phone");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailIsNull() {
            addCriterion("student2_email is null");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailIsNotNull() {
            addCriterion("student2_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailEqualTo(String value) {
            addCriterion("student2_email =", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailNotEqualTo(String value) {
            addCriterion("student2_email <>", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailGreaterThan(String value) {
            addCriterion("student2_email >", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailGreaterThanOrEqualTo(String value) {
            addCriterion("student2_email >=", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailLessThan(String value) {
            addCriterion("student2_email <", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailLessThanOrEqualTo(String value) {
            addCriterion("student2_email <=", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailLike(String value) {
            addCriterion("student2_email like", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailNotLike(String value) {
            addCriterion("student2_email not like", value, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailIn(List<String> values) {
            addCriterion("student2_email in", values, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailNotIn(List<String> values) {
            addCriterion("student2_email not in", values, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailBetween(String value1, String value2) {
            addCriterion("student2_email between", value1, value2, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2EmailNotBetween(String value1, String value2) {
            addCriterion("student2_email not between", value1, value2, "student2Email");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentIsNull() {
            addCriterion("student2_department is null");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentIsNotNull() {
            addCriterion("student2_department is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentEqualTo(String value) {
            addCriterion("student2_department =", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentNotEqualTo(String value) {
            addCriterion("student2_department <>", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentGreaterThan(String value) {
            addCriterion("student2_department >", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("student2_department >=", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentLessThan(String value) {
            addCriterion("student2_department <", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentLessThanOrEqualTo(String value) {
            addCriterion("student2_department <=", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentLike(String value) {
            addCriterion("student2_department like", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentNotLike(String value) {
            addCriterion("student2_department not like", value, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentIn(List<String> values) {
            addCriterion("student2_department in", values, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentNotIn(List<String> values) {
            addCriterion("student2_department not in", values, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentBetween(String value1, String value2) {
            addCriterion("student2_department between", value1, value2, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2DepartmentNotBetween(String value1, String value2) {
            addCriterion("student2_department not between", value1, value2, "student2Department");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeIsNull() {
            addCriterion("student2_grade is null");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeIsNotNull() {
            addCriterion("student2_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeEqualTo(String value) {
            addCriterion("student2_grade =", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeNotEqualTo(String value) {
            addCriterion("student2_grade <>", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeGreaterThan(String value) {
            addCriterion("student2_grade >", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeGreaterThanOrEqualTo(String value) {
            addCriterion("student2_grade >=", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeLessThan(String value) {
            addCriterion("student2_grade <", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeLessThanOrEqualTo(String value) {
            addCriterion("student2_grade <=", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeLike(String value) {
            addCriterion("student2_grade like", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeNotLike(String value) {
            addCriterion("student2_grade not like", value, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeIn(List<String> values) {
            addCriterion("student2_grade in", values, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeNotIn(List<String> values) {
            addCriterion("student2_grade not in", values, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeBetween(String value1, String value2) {
            addCriterion("student2_grade between", value1, value2, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2GradeNotBetween(String value1, String value2) {
            addCriterion("student2_grade not between", value1, value2, "student2Grade");
            return (Criteria) this;
        }

        public Criteria andStudent2QqIsNull() {
            addCriterion("student2_QQ is null");
            return (Criteria) this;
        }

        public Criteria andStudent2QqIsNotNull() {
            addCriterion("student2_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andStudent2QqEqualTo(String value) {
            addCriterion("student2_QQ =", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqNotEqualTo(String value) {
            addCriterion("student2_QQ <>", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqGreaterThan(String value) {
            addCriterion("student2_QQ >", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqGreaterThanOrEqualTo(String value) {
            addCriterion("student2_QQ >=", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqLessThan(String value) {
            addCriterion("student2_QQ <", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqLessThanOrEqualTo(String value) {
            addCriterion("student2_QQ <=", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqLike(String value) {
            addCriterion("student2_QQ like", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqNotLike(String value) {
            addCriterion("student2_QQ not like", value, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqIn(List<String> values) {
            addCriterion("student2_QQ in", values, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqNotIn(List<String> values) {
            addCriterion("student2_QQ not in", values, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqBetween(String value1, String value2) {
            addCriterion("student2_QQ between", value1, value2, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andStudent2QqNotBetween(String value1, String value2) {
            addCriterion("student2_QQ not between", value1, value2, "student2Qq");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("teacher_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("teacher_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("teacher_phone =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("teacher_phone <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("teacher_phone >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_phone >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("teacher_phone <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("teacher_phone <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("teacher_phone like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("teacher_phone not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("teacher_phone in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("teacher_phone not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("teacher_phone between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("teacher_phone not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNull() {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNotNull() {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailEqualTo(String value) {
            addCriterion("teacher_email =", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotEqualTo(String value) {
            addCriterion("teacher_email <>", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThan(String value) {
            addCriterion("teacher_email >", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_email >=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThan(String value) {
            addCriterion("teacher_email <", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThanOrEqualTo(String value) {
            addCriterion("teacher_email <=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLike(String value) {
            addCriterion("teacher_email like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotLike(String value) {
            addCriterion("teacher_email not like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIn(List<String> values) {
            addCriterion("teacher_email in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotIn(List<String> values) {
            addCriterion("teacher_email not in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailBetween(String value1, String value2) {
            addCriterion("teacher_email between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotBetween(String value1, String value2) {
            addCriterion("teacher_email not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIsNull() {
            addCriterion("teacher_department is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIsNotNull() {
            addCriterion("teacher_department is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentEqualTo(String value) {
            addCriterion("teacher_department =", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotEqualTo(String value) {
            addCriterion("teacher_department <>", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentGreaterThan(String value) {
            addCriterion("teacher_department >", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_department >=", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLessThan(String value) {
            addCriterion("teacher_department <", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLessThanOrEqualTo(String value) {
            addCriterion("teacher_department <=", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLike(String value) {
            addCriterion("teacher_department like", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotLike(String value) {
            addCriterion("teacher_department not like", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIn(List<String> values) {
            addCriterion("teacher_department in", values, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotIn(List<String> values) {
            addCriterion("teacher_department not in", values, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentBetween(String value1, String value2) {
            addCriterion("teacher_department between", value1, value2, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotBetween(String value1, String value2) {
            addCriterion("teacher_department not between", value1, value2, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIsNull() {
            addCriterion("teacher_QQ is null");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIsNotNull() {
            addCriterion("teacher_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherQqEqualTo(String value) {
            addCriterion("teacher_QQ =", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotEqualTo(String value) {
            addCriterion("teacher_QQ <>", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqGreaterThan(String value) {
            addCriterion("teacher_QQ >", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_QQ >=", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLessThan(String value) {
            addCriterion("teacher_QQ <", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLessThanOrEqualTo(String value) {
            addCriterion("teacher_QQ <=", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLike(String value) {
            addCriterion("teacher_QQ like", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotLike(String value) {
            addCriterion("teacher_QQ not like", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIn(List<String> values) {
            addCriterion("teacher_QQ in", values, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotIn(List<String> values) {
            addCriterion("teacher_QQ not in", values, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqBetween(String value1, String value2) {
            addCriterion("teacher_QQ between", value1, value2, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotBetween(String value1, String value2) {
            addCriterion("teacher_QQ not between", value1, value2, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andWorksNoIsNull() {
            addCriterion("works_no is null");
            return (Criteria) this;
        }

        public Criteria andWorksNoIsNotNull() {
            addCriterion("works_no is not null");
            return (Criteria) this;
        }

        public Criteria andWorksNoEqualTo(String value) {
            addCriterion("works_no =", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoNotEqualTo(String value) {
            addCriterion("works_no <>", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoGreaterThan(String value) {
            addCriterion("works_no >", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoGreaterThanOrEqualTo(String value) {
            addCriterion("works_no >=", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoLessThan(String value) {
            addCriterion("works_no <", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoLessThanOrEqualTo(String value) {
            addCriterion("works_no <=", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoLike(String value) {
            addCriterion("works_no like", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoNotLike(String value) {
            addCriterion("works_no not like", value, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoIn(List<String> values) {
            addCriterion("works_no in", values, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoNotIn(List<String> values) {
            addCriterion("works_no not in", values, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoBetween(String value1, String value2) {
            addCriterion("works_no between", value1, value2, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNoNotBetween(String value1, String value2) {
            addCriterion("works_no not between", value1, value2, "worksNo");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNull() {
            addCriterion("works_name is null");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNotNull() {
            addCriterion("works_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorksNameEqualTo(String value) {
            addCriterion("works_name =", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotEqualTo(String value) {
            addCriterion("works_name <>", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThan(String value) {
            addCriterion("works_name >", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThanOrEqualTo(String value) {
            addCriterion("works_name >=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThan(String value) {
            addCriterion("works_name <", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThanOrEqualTo(String value) {
            addCriterion("works_name <=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLike(String value) {
            addCriterion("works_name like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotLike(String value) {
            addCriterion("works_name not like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameIn(List<String> values) {
            addCriterion("works_name in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotIn(List<String> values) {
            addCriterion("works_name not in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameBetween(String value1, String value2) {
            addCriterion("works_name between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotBetween(String value1, String value2) {
            addCriterion("works_name not between", value1, value2, "worksName");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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