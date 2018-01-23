package com.example.competition.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Verify_codeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Verify_codeExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(String value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(String value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(String value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(String value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(String value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLike(String value) {
            addCriterion("code_id like", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotLike(String value) {
            addCriterion("code_id not like", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<String> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<String> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(String value1, String value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(String value1, String value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeContentIsNull() {
            addCriterion("code_content is null");
            return (Criteria) this;
        }

        public Criteria andCodeContentIsNotNull() {
            addCriterion("code_content is not null");
            return (Criteria) this;
        }

        public Criteria andCodeContentEqualTo(String value) {
            addCriterion("code_content =", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentNotEqualTo(String value) {
            addCriterion("code_content <>", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentGreaterThan(String value) {
            addCriterion("code_content >", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentGreaterThanOrEqualTo(String value) {
            addCriterion("code_content >=", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentLessThan(String value) {
            addCriterion("code_content <", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentLessThanOrEqualTo(String value) {
            addCriterion("code_content <=", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentLike(String value) {
            addCriterion("code_content like", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentNotLike(String value) {
            addCriterion("code_content not like", value, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentIn(List<String> values) {
            addCriterion("code_content in", values, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentNotIn(List<String> values) {
            addCriterion("code_content not in", values, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentBetween(String value1, String value2) {
            addCriterion("code_content between", value1, value2, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeContentNotBetween(String value1, String value2) {
            addCriterion("code_content not between", value1, value2, "codeContent");
            return (Criteria) this;
        }

        public Criteria andCodeActionIsNull() {
            addCriterion("code_action is null");
            return (Criteria) this;
        }

        public Criteria andCodeActionIsNotNull() {
            addCriterion("code_action is not null");
            return (Criteria) this;
        }

        public Criteria andCodeActionEqualTo(Integer value) {
            addCriterion("code_action =", value, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionNotEqualTo(Integer value) {
            addCriterion("code_action <>", value, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionGreaterThan(Integer value) {
            addCriterion("code_action >", value, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_action >=", value, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionLessThan(Integer value) {
            addCriterion("code_action <", value, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionLessThanOrEqualTo(Integer value) {
            addCriterion("code_action <=", value, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionIn(List<Integer> values) {
            addCriterion("code_action in", values, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionNotIn(List<Integer> values) {
            addCriterion("code_action not in", values, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionBetween(Integer value1, Integer value2) {
            addCriterion("code_action between", value1, value2, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeActionNotBetween(Integer value1, Integer value2) {
            addCriterion("code_action not between", value1, value2, "codeAction");
            return (Criteria) this;
        }

        public Criteria andCodeStatusIsNull() {
            addCriterion("code_status is null");
            return (Criteria) this;
        }

        public Criteria andCodeStatusIsNotNull() {
            addCriterion("code_status is not null");
            return (Criteria) this;
        }

        public Criteria andCodeStatusEqualTo(Integer value) {
            addCriterion("code_status =", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotEqualTo(Integer value) {
            addCriterion("code_status <>", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusGreaterThan(Integer value) {
            addCriterion("code_status >", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_status >=", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusLessThan(Integer value) {
            addCriterion("code_status <", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("code_status <=", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusIn(List<Integer> values) {
            addCriterion("code_status in", values, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotIn(List<Integer> values) {
            addCriterion("code_status not in", values, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusBetween(Integer value1, Integer value2) {
            addCriterion("code_status between", value1, value2, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("code_status not between", value1, value2, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
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