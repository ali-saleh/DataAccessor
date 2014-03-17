package db.billingdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public ListEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
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
     * This method corresponds to the database table list_entity
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
     * This method corresponds to the database table list_entity
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table list_entity
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
     * This class corresponds to the database table list_entity
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

        public Criteria andList_idIsNull() {
            addCriterion("list_id is null");
            return (Criteria) this;
        }

        public Criteria andList_idIsNotNull() {
            addCriterion("list_id is not null");
            return (Criteria) this;
        }

        public Criteria andList_idEqualTo(Integer value) {
            addCriterion("list_id =", value, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idNotEqualTo(Integer value) {
            addCriterion("list_id <>", value, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idGreaterThan(Integer value) {
            addCriterion("list_id >", value, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_id >=", value, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idLessThan(Integer value) {
            addCriterion("list_id <", value, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idLessThanOrEqualTo(Integer value) {
            addCriterion("list_id <=", value, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idIn(List<Integer> values) {
            addCriterion("list_id in", values, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idNotIn(List<Integer> values) {
            addCriterion("list_id not in", values, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idBetween(Integer value1, Integer value2) {
            addCriterion("list_id between", value1, value2, "list_id");
            return (Criteria) this;
        }

        public Criteria andList_idNotBetween(Integer value1, Integer value2) {
            addCriterion("list_id not between", value1, value2, "list_id");
            return (Criteria) this;
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

        public Criteria andTotal_recordsIsNull() {
            addCriterion("total_records is null");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsIsNotNull() {
            addCriterion("total_records is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsEqualTo(Integer value) {
            addCriterion("total_records =", value, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsNotEqualTo(Integer value) {
            addCriterion("total_records <>", value, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsGreaterThan(Integer value) {
            addCriterion("total_records >", value, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_records >=", value, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsLessThan(Integer value) {
            addCriterion("total_records <", value, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsLessThanOrEqualTo(Integer value) {
            addCriterion("total_records <=", value, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsIn(List<Integer> values) {
            addCriterion("total_records in", values, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsNotIn(List<Integer> values) {
            addCriterion("total_records not in", values, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsBetween(Integer value1, Integer value2) {
            addCriterion("total_records between", value1, value2, "total_records");
            return (Criteria) this;
        }

        public Criteria andTotal_recordsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_records not between", value1, value2, "total_records");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLast_updateEqualTo(Date value) {
            addCriterion("last_update =", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThan(Date value) {
            addCriterion("last_update >", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThan(Date value) {
            addCriterion("last_update <", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateIn(List<Date> values) {
            addCriterion("last_update in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKIsNull() {
            addCriterion("OPTLOCK is null");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKIsNotNull() {
            addCriterion("OPTLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKEqualTo(Integer value) {
            addCriterion("OPTLOCK =", value, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKNotEqualTo(Integer value) {
            addCriterion("OPTLOCK <>", value, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKGreaterThan(Integer value) {
            addCriterion("OPTLOCK >", value, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPTLOCK >=", value, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKLessThan(Integer value) {
            addCriterion("OPTLOCK <", value, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKLessThanOrEqualTo(Integer value) {
            addCriterion("OPTLOCK <=", value, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKIn(List<Integer> values) {
            addCriterion("OPTLOCK in", values, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKNotIn(List<Integer> values) {
            addCriterion("OPTLOCK not in", values, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKBetween(Integer value1, Integer value2) {
            addCriterion("OPTLOCK between", value1, value2, "OPTLOCK");
            return (Criteria) this;
        }

        public Criteria andOPTLOCKNotBetween(Integer value1, Integer value2) {
            addCriterion("OPTLOCK not between", value1, value2, "OPTLOCK");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table list_entity
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
     * This class corresponds to the database table list_entity
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