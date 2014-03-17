package db.billingdb.model;

import java.util.ArrayList;
import java.util.List;

public class ReportEntityMapExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public ReportEntityMapExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
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

        public Criteria andEntity_idIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntity_idIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntity_idEqualTo(Integer value) {
            addCriterion("entity_id =", value, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idNotEqualTo(Integer value) {
            addCriterion("entity_id <>", value, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idGreaterThan(Integer value) {
            addCriterion("entity_id >", value, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_id >=", value, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idLessThan(Integer value) {
            addCriterion("entity_id <", value, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idLessThanOrEqualTo(Integer value) {
            addCriterion("entity_id <=", value, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idIn(List<Integer> values) {
            addCriterion("entity_id in", values, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idNotIn(List<Integer> values) {
            addCriterion("entity_id not in", values, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idBetween(Integer value1, Integer value2) {
            addCriterion("entity_id between", value1, value2, "entity_id");
            return (Criteria) this;
        }

        public Criteria andEntity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_id not between", value1, value2, "entity_id");
            return (Criteria) this;
        }

        public Criteria andReport_idIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReport_idIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReport_idEqualTo(Integer value) {
            addCriterion("report_id =", value, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idNotEqualTo(Integer value) {
            addCriterion("report_id <>", value, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idGreaterThan(Integer value) {
            addCriterion("report_id >", value, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_id >=", value, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idLessThan(Integer value) {
            addCriterion("report_id <", value, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idLessThanOrEqualTo(Integer value) {
            addCriterion("report_id <=", value, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idIn(List<Integer> values) {
            addCriterion("report_id in", values, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idNotIn(List<Integer> values) {
            addCriterion("report_id not in", values, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idBetween(Integer value1, Integer value2) {
            addCriterion("report_id between", value1, value2, "report_id");
            return (Criteria) this;
        }

        public Criteria andReport_idNotBetween(Integer value1, Integer value2) {
            addCriterion("report_id not between", value1, value2, "report_id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report_entity_map
     *
     * @mbggenerated do_not_delete_during_merge Tue Feb 18 21:28:38 IST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report_entity_map
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
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