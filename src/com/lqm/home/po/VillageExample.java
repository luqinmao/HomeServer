package com.lqm.home.po;

import java.util.ArrayList;
import java.util.List;

public class VillageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VillageExample() {
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

        public Criteria andVillageIconIsNull() {
            addCriterion("village_icon is null");
            return (Criteria) this;
        }

        public Criteria andVillageIconIsNotNull() {
            addCriterion("village_icon is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIconEqualTo(String value) {
            addCriterion("village_icon =", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconNotEqualTo(String value) {
            addCriterion("village_icon <>", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconGreaterThan(String value) {
            addCriterion("village_icon >", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconGreaterThanOrEqualTo(String value) {
            addCriterion("village_icon >=", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconLessThan(String value) {
            addCriterion("village_icon <", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconLessThanOrEqualTo(String value) {
            addCriterion("village_icon <=", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconLike(String value) {
            addCriterion("village_icon like", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconNotLike(String value) {
            addCriterion("village_icon not like", value, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconIn(List<String> values) {
            addCriterion("village_icon in", values, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconNotIn(List<String> values) {
            addCriterion("village_icon not in", values, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconBetween(String value1, String value2) {
            addCriterion("village_icon between", value1, value2, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andVillageIconNotBetween(String value1, String value2) {
            addCriterion("village_icon not between", value1, value2, "villageIcon");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andVillageDescIsNull() {
            addCriterion("village_desc is null");
            return (Criteria) this;
        }

        public Criteria andVillageDescIsNotNull() {
            addCriterion("village_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVillageDescEqualTo(String value) {
            addCriterion("village_desc =", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescNotEqualTo(String value) {
            addCriterion("village_desc <>", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescGreaterThan(String value) {
            addCriterion("village_desc >", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescGreaterThanOrEqualTo(String value) {
            addCriterion("village_desc >=", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescLessThan(String value) {
            addCriterion("village_desc <", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescLessThanOrEqualTo(String value) {
            addCriterion("village_desc <=", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescLike(String value) {
            addCriterion("village_desc like", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescNotLike(String value) {
            addCriterion("village_desc not like", value, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescIn(List<String> values) {
            addCriterion("village_desc in", values, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescNotIn(List<String> values) {
            addCriterion("village_desc not in", values, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescBetween(String value1, String value2) {
            addCriterion("village_desc between", value1, value2, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andVillageDescNotBetween(String value1, String value2) {
            addCriterion("village_desc not between", value1, value2, "villageDesc");
            return (Criteria) this;
        }

        public Criteria andAttentionNumIsNull() {
            addCriterion("attention_num is null");
            return (Criteria) this;
        }

        public Criteria andAttentionNumIsNotNull() {
            addCriterion("attention_num is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionNumEqualTo(Integer value) {
            addCriterion("attention_num =", value, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumNotEqualTo(Integer value) {
            addCriterion("attention_num <>", value, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumGreaterThan(Integer value) {
            addCriterion("attention_num >", value, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention_num >=", value, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumLessThan(Integer value) {
            addCriterion("attention_num <", value, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumLessThanOrEqualTo(Integer value) {
            addCriterion("attention_num <=", value, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumIn(List<Integer> values) {
            addCriterion("attention_num in", values, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumNotIn(List<Integer> values) {
            addCriterion("attention_num not in", values, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumBetween(Integer value1, Integer value2) {
            addCriterion("attention_num between", value1, value2, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andAttentionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("attention_num not between", value1, value2, "attentionNum");
            return (Criteria) this;
        }

        public Criteria andPostNumIsNull() {
            addCriterion("post_num is null");
            return (Criteria) this;
        }

        public Criteria andPostNumIsNotNull() {
            addCriterion("post_num is not null");
            return (Criteria) this;
        }

        public Criteria andPostNumEqualTo(Integer value) {
            addCriterion("post_num =", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumNotEqualTo(Integer value) {
            addCriterion("post_num <>", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumGreaterThan(Integer value) {
            addCriterion("post_num >", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_num >=", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumLessThan(Integer value) {
            addCriterion("post_num <", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumLessThanOrEqualTo(Integer value) {
            addCriterion("post_num <=", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumIn(List<Integer> values) {
            addCriterion("post_num in", values, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumNotIn(List<Integer> values) {
            addCriterion("post_num not in", values, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumBetween(Integer value1, Integer value2) {
            addCriterion("post_num between", value1, value2, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_num not between", value1, value2, "postNum");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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