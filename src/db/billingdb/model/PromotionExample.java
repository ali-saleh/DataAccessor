package db.billingdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromotionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public PromotionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
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
     * This method corresponds to the database table promotion
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
     * This method corresponds to the database table promotion
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion
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
     * This class corresponds to the database table promotion
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andItem_idIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItem_idIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItem_idEqualTo(Integer value) {
            addCriterion("item_id =", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idGreaterThan(Integer value) {
            addCriterion("item_id >", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idLessThan(Integer value) {
            addCriterion("item_id <", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idIn(List<Integer> values) {
            addCriterion("item_id in", values, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "item_id");
            return (Criteria) this;
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

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andOnceIsNull() {
            addCriterion("once is null");
            return (Criteria) this;
        }

        public Criteria andOnceIsNotNull() {
            addCriterion("once is not null");
            return (Criteria) this;
        }

        public Criteria andOnceEqualTo(Short value) {
            addCriterion("once =", value, "once");
            return (Criteria) this;
        }

        public Criteria andOnceNotEqualTo(Short value) {
            addCriterion("once <>", value, "once");
            return (Criteria) this;
        }

        public Criteria andOnceGreaterThan(Short value) {
            addCriterion("once >", value, "once");
            return (Criteria) this;
        }

        public Criteria andOnceGreaterThanOrEqualTo(Short value) {
            addCriterion("once >=", value, "once");
            return (Criteria) this;
        }

        public Criteria andOnceLessThan(Short value) {
            addCriterion("once <", value, "once");
            return (Criteria) this;
        }

        public Criteria andOnceLessThanOrEqualTo(Short value) {
            addCriterion("once <=", value, "once");
            return (Criteria) this;
        }

        public Criteria andOnceIn(List<Short> values) {
            addCriterion("once in", values, "once");
            return (Criteria) this;
        }

        public Criteria andOnceNotIn(List<Short> values) {
            addCriterion("once not in", values, "once");
            return (Criteria) this;
        }

        public Criteria andOnceBetween(Short value1, Short value2) {
            addCriterion("once between", value1, value2, "once");
            return (Criteria) this;
        }

        public Criteria andOnceNotBetween(Short value1, Short value2) {
            addCriterion("once not between", value1, value2, "once");
            return (Criteria) this;
        }

        public Criteria andSinceIsNull() {
            addCriterion("since is null");
            return (Criteria) this;
        }

        public Criteria andSinceIsNotNull() {
            addCriterion("since is not null");
            return (Criteria) this;
        }

        public Criteria andSinceEqualTo(Date value) {
            addCriterion("since =", value, "since");
            return (Criteria) this;
        }

        public Criteria andSinceNotEqualTo(Date value) {
            addCriterion("since <>", value, "since");
            return (Criteria) this;
        }

        public Criteria andSinceGreaterThan(Date value) {
            addCriterion("since >", value, "since");
            return (Criteria) this;
        }

        public Criteria andSinceGreaterThanOrEqualTo(Date value) {
            addCriterion("since >=", value, "since");
            return (Criteria) this;
        }

        public Criteria andSinceLessThan(Date value) {
            addCriterion("since <", value, "since");
            return (Criteria) this;
        }

        public Criteria andSinceLessThanOrEqualTo(Date value) {
            addCriterion("since <=", value, "since");
            return (Criteria) this;
        }

        public Criteria andSinceIn(List<Date> values) {
            addCriterion("since in", values, "since");
            return (Criteria) this;
        }

        public Criteria andSinceNotIn(List<Date> values) {
            addCriterion("since not in", values, "since");
            return (Criteria) this;
        }

        public Criteria andSinceBetween(Date value1, Date value2) {
            addCriterion("since between", value1, value2, "since");
            return (Criteria) this;
        }

        public Criteria andSinceNotBetween(Date value1, Date value2) {
            addCriterion("since not between", value1, value2, "since");
            return (Criteria) this;
        }

        public Criteria andUntilIsNull() {
            addCriterion("until is null");
            return (Criteria) this;
        }

        public Criteria andUntilIsNotNull() {
            addCriterion("until is not null");
            return (Criteria) this;
        }

        public Criteria andUntilEqualTo(Date value) {
            addCriterion("until =", value, "until");
            return (Criteria) this;
        }

        public Criteria andUntilNotEqualTo(Date value) {
            addCriterion("until <>", value, "until");
            return (Criteria) this;
        }

        public Criteria andUntilGreaterThan(Date value) {
            addCriterion("until >", value, "until");
            return (Criteria) this;
        }

        public Criteria andUntilGreaterThanOrEqualTo(Date value) {
            addCriterion("until >=", value, "until");
            return (Criteria) this;
        }

        public Criteria andUntilLessThan(Date value) {
            addCriterion("until <", value, "until");
            return (Criteria) this;
        }

        public Criteria andUntilLessThanOrEqualTo(Date value) {
            addCriterion("until <=", value, "until");
            return (Criteria) this;
        }

        public Criteria andUntilIn(List<Date> values) {
            addCriterion("until in", values, "until");
            return (Criteria) this;
        }

        public Criteria andUntilNotIn(List<Date> values) {
            addCriterion("until not in", values, "until");
            return (Criteria) this;
        }

        public Criteria andUntilBetween(Date value1, Date value2) {
            addCriterion("until between", value1, value2, "until");
            return (Criteria) this;
        }

        public Criteria andUntilNotBetween(Date value1, Date value2) {
            addCriterion("until not between", value1, value2, "until");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table promotion
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
     * This class corresponds to the database table promotion
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