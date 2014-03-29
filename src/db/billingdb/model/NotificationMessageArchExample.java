package db.billingdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotificationMessageArchExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public NotificationMessageArchExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
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
     * This method corresponds to the database table notification_message_arch
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
     * This method corresponds to the database table notification_message_arch
     *
     * @mbggenerated Tue Feb 18 21:28:38 IST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification_message_arch
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
     * This class corresponds to the database table notification_message_arch
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

        public Criteria andType_idIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andType_idIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andType_idEqualTo(Integer value) {
            addCriterion("type_id =", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThan(Integer value) {
            addCriterion("type_id >", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThan(Integer value) {
            addCriterion("type_id <", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idIn(List<Integer> values) {
            addCriterion("type_id in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andCreate_datetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "create_datetime");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andResult_messageIsNull() {
            addCriterion("result_message is null");
            return (Criteria) this;
        }

        public Criteria andResult_messageIsNotNull() {
            addCriterion("result_message is not null");
            return (Criteria) this;
        }

        public Criteria andResult_messageEqualTo(String value) {
            addCriterion("result_message =", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageNotEqualTo(String value) {
            addCriterion("result_message <>", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageGreaterThan(String value) {
            addCriterion("result_message >", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageGreaterThanOrEqualTo(String value) {
            addCriterion("result_message >=", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageLessThan(String value) {
            addCriterion("result_message <", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageLessThanOrEqualTo(String value) {
            addCriterion("result_message <=", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageLike(String value) {
            addCriterion("result_message like", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageNotLike(String value) {
            addCriterion("result_message not like", value, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageIn(List<String> values) {
            addCriterion("result_message in", values, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageNotIn(List<String> values) {
            addCriterion("result_message not in", values, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageBetween(String value1, String value2) {
            addCriterion("result_message between", value1, value2, "result_message");
            return (Criteria) this;
        }

        public Criteria andResult_messageNotBetween(String value1, String value2) {
            addCriterion("result_message not between", value1, value2, "result_message");
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
     * This class corresponds to the database table notification_message_arch
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
     * This class corresponds to the database table notification_message_arch
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