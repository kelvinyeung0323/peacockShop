package com.peacock.shop.web.domain;

import java.util.ArrayList;
import java.util.List;

public class PluginsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PluginsExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andLibraryIsNull() {
            addCriterion("library is null");
            return (Criteria) this;
        }

        public Criteria andLibraryIsNotNull() {
            addCriterion("library is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryEqualTo(String value) {
            addCriterion("library =", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotEqualTo(String value) {
            addCriterion("library <>", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryGreaterThan(String value) {
            addCriterion("library >", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryGreaterThanOrEqualTo(String value) {
            addCriterion("library >=", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLessThan(String value) {
            addCriterion("library <", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLessThanOrEqualTo(String value) {
            addCriterion("library <=", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLike(String value) {
            addCriterion("library like", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotLike(String value) {
            addCriterion("library not like", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryIn(List<String> values) {
            addCriterion("library in", values, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotIn(List<String> values) {
            addCriterion("library not in", values, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryBetween(String value1, String value2) {
            addCriterion("library between", value1, value2, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotBetween(String value1, String value2) {
            addCriterion("library not between", value1, value2, "library");
            return (Criteria) this;
        }

        public Criteria andAssignIsNull() {
            addCriterion("assign is null");
            return (Criteria) this;
        }

        public Criteria andAssignIsNotNull() {
            addCriterion("assign is not null");
            return (Criteria) this;
        }

        public Criteria andAssignEqualTo(Boolean value) {
            addCriterion("assign =", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotEqualTo(Boolean value) {
            addCriterion("assign <>", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignGreaterThan(Boolean value) {
            addCriterion("assign >", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("assign >=", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignLessThan(Boolean value) {
            addCriterion("assign <", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignLessThanOrEqualTo(Boolean value) {
            addCriterion("assign <=", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignIn(List<Boolean> values) {
            addCriterion("assign in", values, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotIn(List<Boolean> values) {
            addCriterion("assign not in", values, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignBetween(Boolean value1, Boolean value2) {
            addCriterion("assign between", value1, value2, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("assign not between", value1, value2, "assign");
            return (Criteria) this;
        }

        public Criteria andInstallDateIsNull() {
            addCriterion("install_date is null");
            return (Criteria) this;
        }

        public Criteria andInstallDateIsNotNull() {
            addCriterion("install_date is not null");
            return (Criteria) this;
        }

        public Criteria andInstallDateEqualTo(Integer value) {
            addCriterion("install_date =", value, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateNotEqualTo(Integer value) {
            addCriterion("install_date <>", value, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateGreaterThan(Integer value) {
            addCriterion("install_date >", value, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("install_date >=", value, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateLessThan(Integer value) {
            addCriterion("install_date <", value, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateLessThanOrEqualTo(Integer value) {
            addCriterion("install_date <=", value, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateIn(List<Integer> values) {
            addCriterion("install_date in", values, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateNotIn(List<Integer> values) {
            addCriterion("install_date not in", values, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateBetween(Integer value1, Integer value2) {
            addCriterion("install_date between", value1, value2, "installDate");
            return (Criteria) this;
        }

        public Criteria andInstallDateNotBetween(Integer value1, Integer value2) {
            addCriterion("install_date not between", value1, value2, "installDate");
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