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

        public Criteria andReportStatusEqualTo(Integer value) {
            addCriterion("report_status =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(Integer value) {
            addCriterion("report_status <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(Integer value) {
            addCriterion("report_status >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_status >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(Integer value) {
            addCriterion("report_status <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(Integer value) {
            addCriterion("report_status <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<Integer> values) {
            addCriterion("report_status in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<Integer> values) {
            addCriterion("report_status not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(Integer value1, Integer value2) {
            addCriterion("report_status between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(Integer value1, Integer value2) {
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
            addCriterion("main_student_qq is null");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqIsNotNull() {
            addCriterion("main_student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqEqualTo(String value) {
            addCriterion("main_student_qq =", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotEqualTo(String value) {
            addCriterion("main_student_qq <>", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqGreaterThan(String value) {
            addCriterion("main_student_qq >", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("main_student_qq >=", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqLessThan(String value) {
            addCriterion("main_student_qq <", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqLessThanOrEqualTo(String value) {
            addCriterion("main_student_qq <=", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqLike(String value) {
            addCriterion("main_student_qq like", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotLike(String value) {
            addCriterion("main_student_qq not like", value, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqIn(List<String> values) {
            addCriterion("main_student_qq in", values, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotIn(List<String> values) {
            addCriterion("main_student_qq not in", values, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqBetween(String value1, String value2) {
            addCriterion("main_student_qq between", value1, value2, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andMainStudentQqNotBetween(String value1, String value2) {
            addCriterion("main_student_qq not between", value1, value2, "mainStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoIsNull() {
            addCriterion("one_student_no is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoIsNotNull() {
            addCriterion("one_student_no is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoEqualTo(String value) {
            addCriterion("one_student_no =", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoNotEqualTo(String value) {
            addCriterion("one_student_no <>", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoGreaterThan(String value) {
            addCriterion("one_student_no >", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_no >=", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoLessThan(String value) {
            addCriterion("one_student_no <", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoLessThanOrEqualTo(String value) {
            addCriterion("one_student_no <=", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoLike(String value) {
            addCriterion("one_student_no like", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoNotLike(String value) {
            addCriterion("one_student_no not like", value, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoIn(List<String> values) {
            addCriterion("one_student_no in", values, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoNotIn(List<String> values) {
            addCriterion("one_student_no not in", values, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoBetween(String value1, String value2) {
            addCriterion("one_student_no between", value1, value2, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNoNotBetween(String value1, String value2) {
            addCriterion("one_student_no not between", value1, value2, "oneStudentNo");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameIsNull() {
            addCriterion("one_student_name is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameIsNotNull() {
            addCriterion("one_student_name is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameEqualTo(String value) {
            addCriterion("one_student_name =", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameNotEqualTo(String value) {
            addCriterion("one_student_name <>", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameGreaterThan(String value) {
            addCriterion("one_student_name >", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_name >=", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameLessThan(String value) {
            addCriterion("one_student_name <", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameLessThanOrEqualTo(String value) {
            addCriterion("one_student_name <=", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameLike(String value) {
            addCriterion("one_student_name like", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameNotLike(String value) {
            addCriterion("one_student_name not like", value, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameIn(List<String> values) {
            addCriterion("one_student_name in", values, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameNotIn(List<String> values) {
            addCriterion("one_student_name not in", values, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameBetween(String value1, String value2) {
            addCriterion("one_student_name between", value1, value2, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentNameNotBetween(String value1, String value2) {
            addCriterion("one_student_name not between", value1, value2, "oneStudentName");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyIsNull() {
            addCriterion("one_student_specialty is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyIsNotNull() {
            addCriterion("one_student_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyEqualTo(String value) {
            addCriterion("one_student_specialty =", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyNotEqualTo(String value) {
            addCriterion("one_student_specialty <>", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyGreaterThan(String value) {
            addCriterion("one_student_specialty >", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_specialty >=", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyLessThan(String value) {
            addCriterion("one_student_specialty <", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("one_student_specialty <=", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyLike(String value) {
            addCriterion("one_student_specialty like", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyNotLike(String value) {
            addCriterion("one_student_specialty not like", value, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyIn(List<String> values) {
            addCriterion("one_student_specialty in", values, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyNotIn(List<String> values) {
            addCriterion("one_student_specialty not in", values, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyBetween(String value1, String value2) {
            addCriterion("one_student_specialty between", value1, value2, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentSpecialtyNotBetween(String value1, String value2) {
            addCriterion("one_student_specialty not between", value1, value2, "oneStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneIsNull() {
            addCriterion("one_student_phone is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneIsNotNull() {
            addCriterion("one_student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneEqualTo(String value) {
            addCriterion("one_student_phone =", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneNotEqualTo(String value) {
            addCriterion("one_student_phone <>", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneGreaterThan(String value) {
            addCriterion("one_student_phone >", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_phone >=", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneLessThan(String value) {
            addCriterion("one_student_phone <", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("one_student_phone <=", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneLike(String value) {
            addCriterion("one_student_phone like", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneNotLike(String value) {
            addCriterion("one_student_phone not like", value, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneIn(List<String> values) {
            addCriterion("one_student_phone in", values, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneNotIn(List<String> values) {
            addCriterion("one_student_phone not in", values, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneBetween(String value1, String value2) {
            addCriterion("one_student_phone between", value1, value2, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("one_student_phone not between", value1, value2, "oneStudentPhone");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailIsNull() {
            addCriterion("one_student_email is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailIsNotNull() {
            addCriterion("one_student_email is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailEqualTo(String value) {
            addCriterion("one_student_email =", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailNotEqualTo(String value) {
            addCriterion("one_student_email <>", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailGreaterThan(String value) {
            addCriterion("one_student_email >", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_email >=", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailLessThan(String value) {
            addCriterion("one_student_email <", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("one_student_email <=", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailLike(String value) {
            addCriterion("one_student_email like", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailNotLike(String value) {
            addCriterion("one_student_email not like", value, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailIn(List<String> values) {
            addCriterion("one_student_email in", values, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailNotIn(List<String> values) {
            addCriterion("one_student_email not in", values, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailBetween(String value1, String value2) {
            addCriterion("one_student_email between", value1, value2, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentEmailNotBetween(String value1, String value2) {
            addCriterion("one_student_email not between", value1, value2, "oneStudentEmail");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentIsNull() {
            addCriterion("one_student_department is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentIsNotNull() {
            addCriterion("one_student_department is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentEqualTo(String value) {
            addCriterion("one_student_department =", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentNotEqualTo(String value) {
            addCriterion("one_student_department <>", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentGreaterThan(String value) {
            addCriterion("one_student_department >", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_department >=", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentLessThan(String value) {
            addCriterion("one_student_department <", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentLessThanOrEqualTo(String value) {
            addCriterion("one_student_department <=", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentLike(String value) {
            addCriterion("one_student_department like", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentNotLike(String value) {
            addCriterion("one_student_department not like", value, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentIn(List<String> values) {
            addCriterion("one_student_department in", values, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentNotIn(List<String> values) {
            addCriterion("one_student_department not in", values, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentBetween(String value1, String value2) {
            addCriterion("one_student_department between", value1, value2, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentDepartmentNotBetween(String value1, String value2) {
            addCriterion("one_student_department not between", value1, value2, "oneStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeIsNull() {
            addCriterion("one_student_grade is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeIsNotNull() {
            addCriterion("one_student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeEqualTo(String value) {
            addCriterion("one_student_grade =", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeNotEqualTo(String value) {
            addCriterion("one_student_grade <>", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeGreaterThan(String value) {
            addCriterion("one_student_grade >", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_grade >=", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeLessThan(String value) {
            addCriterion("one_student_grade <", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("one_student_grade <=", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeLike(String value) {
            addCriterion("one_student_grade like", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeNotLike(String value) {
            addCriterion("one_student_grade not like", value, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeIn(List<String> values) {
            addCriterion("one_student_grade in", values, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeNotIn(List<String> values) {
            addCriterion("one_student_grade not in", values, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeBetween(String value1, String value2) {
            addCriterion("one_student_grade between", value1, value2, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentGradeNotBetween(String value1, String value2) {
            addCriterion("one_student_grade not between", value1, value2, "oneStudentGrade");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqIsNull() {
            addCriterion("one_student_qq is null");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqIsNotNull() {
            addCriterion("one_student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqEqualTo(String value) {
            addCriterion("one_student_qq =", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqNotEqualTo(String value) {
            addCriterion("one_student_qq <>", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqGreaterThan(String value) {
            addCriterion("one_student_qq >", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("one_student_qq >=", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqLessThan(String value) {
            addCriterion("one_student_qq <", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqLessThanOrEqualTo(String value) {
            addCriterion("one_student_qq <=", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqLike(String value) {
            addCriterion("one_student_qq like", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqNotLike(String value) {
            addCriterion("one_student_qq not like", value, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqIn(List<String> values) {
            addCriterion("one_student_qq in", values, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqNotIn(List<String> values) {
            addCriterion("one_student_qq not in", values, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqBetween(String value1, String value2) {
            addCriterion("one_student_qq between", value1, value2, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andOneStudentQqNotBetween(String value1, String value2) {
            addCriterion("one_student_qq not between", value1, value2, "oneStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoIsNull() {
            addCriterion("two_student_no is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoIsNotNull() {
            addCriterion("two_student_no is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoEqualTo(String value) {
            addCriterion("two_student_no =", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoNotEqualTo(String value) {
            addCriterion("two_student_no <>", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoGreaterThan(String value) {
            addCriterion("two_student_no >", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_no >=", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoLessThan(String value) {
            addCriterion("two_student_no <", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoLessThanOrEqualTo(String value) {
            addCriterion("two_student_no <=", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoLike(String value) {
            addCriterion("two_student_no like", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoNotLike(String value) {
            addCriterion("two_student_no not like", value, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoIn(List<String> values) {
            addCriterion("two_student_no in", values, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoNotIn(List<String> values) {
            addCriterion("two_student_no not in", values, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoBetween(String value1, String value2) {
            addCriterion("two_student_no between", value1, value2, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNoNotBetween(String value1, String value2) {
            addCriterion("two_student_no not between", value1, value2, "twoStudentNo");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameIsNull() {
            addCriterion("two_student_name is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameIsNotNull() {
            addCriterion("two_student_name is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameEqualTo(String value) {
            addCriterion("two_student_name =", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameNotEqualTo(String value) {
            addCriterion("two_student_name <>", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameGreaterThan(String value) {
            addCriterion("two_student_name >", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_name >=", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameLessThan(String value) {
            addCriterion("two_student_name <", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameLessThanOrEqualTo(String value) {
            addCriterion("two_student_name <=", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameLike(String value) {
            addCriterion("two_student_name like", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameNotLike(String value) {
            addCriterion("two_student_name not like", value, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameIn(List<String> values) {
            addCriterion("two_student_name in", values, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameNotIn(List<String> values) {
            addCriterion("two_student_name not in", values, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameBetween(String value1, String value2) {
            addCriterion("two_student_name between", value1, value2, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentNameNotBetween(String value1, String value2) {
            addCriterion("two_student_name not between", value1, value2, "twoStudentName");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyIsNull() {
            addCriterion("two_student_specialty is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyIsNotNull() {
            addCriterion("two_student_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyEqualTo(String value) {
            addCriterion("two_student_specialty =", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyNotEqualTo(String value) {
            addCriterion("two_student_specialty <>", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyGreaterThan(String value) {
            addCriterion("two_student_specialty >", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_specialty >=", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyLessThan(String value) {
            addCriterion("two_student_specialty <", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("two_student_specialty <=", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyLike(String value) {
            addCriterion("two_student_specialty like", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyNotLike(String value) {
            addCriterion("two_student_specialty not like", value, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyIn(List<String> values) {
            addCriterion("two_student_specialty in", values, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyNotIn(List<String> values) {
            addCriterion("two_student_specialty not in", values, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyBetween(String value1, String value2) {
            addCriterion("two_student_specialty between", value1, value2, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentSpecialtyNotBetween(String value1, String value2) {
            addCriterion("two_student_specialty not between", value1, value2, "twoStudentSpecialty");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneIsNull() {
            addCriterion("two_student_phone is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneIsNotNull() {
            addCriterion("two_student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneEqualTo(String value) {
            addCriterion("two_student_phone =", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneNotEqualTo(String value) {
            addCriterion("two_student_phone <>", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneGreaterThan(String value) {
            addCriterion("two_student_phone >", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_phone >=", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneLessThan(String value) {
            addCriterion("two_student_phone <", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("two_student_phone <=", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneLike(String value) {
            addCriterion("two_student_phone like", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneNotLike(String value) {
            addCriterion("two_student_phone not like", value, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneIn(List<String> values) {
            addCriterion("two_student_phone in", values, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneNotIn(List<String> values) {
            addCriterion("two_student_phone not in", values, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneBetween(String value1, String value2) {
            addCriterion("two_student_phone between", value1, value2, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("two_student_phone not between", value1, value2, "twoStudentPhone");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailIsNull() {
            addCriterion("two_student_email is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailIsNotNull() {
            addCriterion("two_student_email is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailEqualTo(String value) {
            addCriterion("two_student_email =", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailNotEqualTo(String value) {
            addCriterion("two_student_email <>", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailGreaterThan(String value) {
            addCriterion("two_student_email >", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_email >=", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailLessThan(String value) {
            addCriterion("two_student_email <", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("two_student_email <=", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailLike(String value) {
            addCriterion("two_student_email like", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailNotLike(String value) {
            addCriterion("two_student_email not like", value, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailIn(List<String> values) {
            addCriterion("two_student_email in", values, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailNotIn(List<String> values) {
            addCriterion("two_student_email not in", values, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailBetween(String value1, String value2) {
            addCriterion("two_student_email between", value1, value2, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentEmailNotBetween(String value1, String value2) {
            addCriterion("two_student_email not between", value1, value2, "twoStudentEmail");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentIsNull() {
            addCriterion("two_student_department is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentIsNotNull() {
            addCriterion("two_student_department is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentEqualTo(String value) {
            addCriterion("two_student_department =", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentNotEqualTo(String value) {
            addCriterion("two_student_department <>", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentGreaterThan(String value) {
            addCriterion("two_student_department >", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_department >=", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentLessThan(String value) {
            addCriterion("two_student_department <", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentLessThanOrEqualTo(String value) {
            addCriterion("two_student_department <=", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentLike(String value) {
            addCriterion("two_student_department like", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentNotLike(String value) {
            addCriterion("two_student_department not like", value, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentIn(List<String> values) {
            addCriterion("two_student_department in", values, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentNotIn(List<String> values) {
            addCriterion("two_student_department not in", values, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentBetween(String value1, String value2) {
            addCriterion("two_student_department between", value1, value2, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentDepartmentNotBetween(String value1, String value2) {
            addCriterion("two_student_department not between", value1, value2, "twoStudentDepartment");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeIsNull() {
            addCriterion("two_student_grade is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeIsNotNull() {
            addCriterion("two_student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeEqualTo(String value) {
            addCriterion("two_student_grade =", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeNotEqualTo(String value) {
            addCriterion("two_student_grade <>", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeGreaterThan(String value) {
            addCriterion("two_student_grade >", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_grade >=", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeLessThan(String value) {
            addCriterion("two_student_grade <", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("two_student_grade <=", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeLike(String value) {
            addCriterion("two_student_grade like", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeNotLike(String value) {
            addCriterion("two_student_grade not like", value, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeIn(List<String> values) {
            addCriterion("two_student_grade in", values, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeNotIn(List<String> values) {
            addCriterion("two_student_grade not in", values, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeBetween(String value1, String value2) {
            addCriterion("two_student_grade between", value1, value2, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentGradeNotBetween(String value1, String value2) {
            addCriterion("two_student_grade not between", value1, value2, "twoStudentGrade");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqIsNull() {
            addCriterion("two_student_qq is null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqIsNotNull() {
            addCriterion("two_student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqEqualTo(String value) {
            addCriterion("two_student_qq =", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqNotEqualTo(String value) {
            addCriterion("two_student_qq <>", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqGreaterThan(String value) {
            addCriterion("two_student_qq >", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("two_student_qq >=", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqLessThan(String value) {
            addCriterion("two_student_qq <", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqLessThanOrEqualTo(String value) {
            addCriterion("two_student_qq <=", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqLike(String value) {
            addCriterion("two_student_qq like", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqNotLike(String value) {
            addCriterion("two_student_qq not like", value, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqIn(List<String> values) {
            addCriterion("two_student_qq in", values, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqNotIn(List<String> values) {
            addCriterion("two_student_qq not in", values, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqBetween(String value1, String value2) {
            addCriterion("two_student_qq between", value1, value2, "twoStudentQq");
            return (Criteria) this;
        }

        public Criteria andTwoStudentQqNotBetween(String value1, String value2) {
            addCriterion("two_student_qq not between", value1, value2, "twoStudentQq");
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
            addCriterion("teacher_qq is null");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIsNotNull() {
            addCriterion("teacher_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherQqEqualTo(String value) {
            addCriterion("teacher_qq =", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotEqualTo(String value) {
            addCriterion("teacher_qq <>", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqGreaterThan(String value) {
            addCriterion("teacher_qq >", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_qq >=", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLessThan(String value) {
            addCriterion("teacher_qq <", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLessThanOrEqualTo(String value) {
            addCriterion("teacher_qq <=", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLike(String value) {
            addCriterion("teacher_qq like", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotLike(String value) {
            addCriterion("teacher_qq not like", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIn(List<String> values) {
            addCriterion("teacher_qq in", values, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotIn(List<String> values) {
            addCriterion("teacher_qq not in", values, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqBetween(String value1, String value2) {
            addCriterion("teacher_qq between", value1, value2, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotBetween(String value1, String value2) {
            addCriterion("teacher_qq not between", value1, value2, "teacherQq");
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