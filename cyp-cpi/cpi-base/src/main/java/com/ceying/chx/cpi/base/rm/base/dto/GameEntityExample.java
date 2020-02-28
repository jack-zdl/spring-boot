package com.ceying.chx.cpi.base.rm.base.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameEntityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andApkIsNull() {
            addCriterion("apk is null");
            return (Criteria) this;
        }

        public Criteria andApkIsNotNull() {
            addCriterion("apk is not null");
            return (Criteria) this;
        }

        public Criteria andApkEqualTo(String value) {
            addCriterion("apk =", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkNotEqualTo(String value) {
            addCriterion("apk <>", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkGreaterThan(String value) {
            addCriterion("apk >", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkGreaterThanOrEqualTo(String value) {
            addCriterion("apk >=", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkLessThan(String value) {
            addCriterion("apk <", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkLessThanOrEqualTo(String value) {
            addCriterion("apk <=", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkLike(String value) {
            addCriterion("apk like", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkNotLike(String value) {
            addCriterion("apk not like", value, "apk");
            return (Criteria) this;
        }

        public Criteria andApkIn(List<String> values) {
            addCriterion("apk in", values, "apk");
            return (Criteria) this;
        }

        public Criteria andApkNotIn(List<String> values) {
            addCriterion("apk not in", values, "apk");
            return (Criteria) this;
        }

        public Criteria andApkBetween(String value1, String value2) {
            addCriterion("apk between", value1, value2, "apk");
            return (Criteria) this;
        }

        public Criteria andApkNotBetween(String value1, String value2) {
            addCriterion("apk not between", value1, value2, "apk");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNull() {
            addCriterion("download_num is null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNotNull() {
            addCriterion("download_num is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumEqualTo(Integer value) {
            addCriterion("download_num =", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotEqualTo(Integer value) {
            addCriterion("download_num <>", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThan(Integer value) {
            addCriterion("download_num >", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_num >=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThan(Integer value) {
            addCriterion("download_num <", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("download_num <=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIn(List<Integer> values) {
            addCriterion("download_num in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotIn(List<Integer> values) {
            addCriterion("download_num not in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumBetween(Integer value1, Integer value2) {
            addCriterion("download_num between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("download_num not between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andItunesIdIsNull() {
            addCriterion("itunes_id is null");
            return (Criteria) this;
        }

        public Criteria andItunesIdIsNotNull() {
            addCriterion("itunes_id is not null");
            return (Criteria) this;
        }

        public Criteria andItunesIdEqualTo(String value) {
            addCriterion("itunes_id =", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdNotEqualTo(String value) {
            addCriterion("itunes_id <>", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdGreaterThan(String value) {
            addCriterion("itunes_id >", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdGreaterThanOrEqualTo(String value) {
            addCriterion("itunes_id >=", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdLessThan(String value) {
            addCriterion("itunes_id <", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdLessThanOrEqualTo(String value) {
            addCriterion("itunes_id <=", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdLike(String value) {
            addCriterion("itunes_id like", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdNotLike(String value) {
            addCriterion("itunes_id not like", value, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdIn(List<String> values) {
            addCriterion("itunes_id in", values, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdNotIn(List<String> values) {
            addCriterion("itunes_id not in", values, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdBetween(String value1, String value2) {
            addCriterion("itunes_id between", value1, value2, "itunesId");
            return (Criteria) this;
        }

        public Criteria andItunesIdNotBetween(String value1, String value2) {
            addCriterion("itunes_id not between", value1, value2, "itunesId");
            return (Criteria) this;
        }

        public Criteria andCompatibilityIsNull() {
            addCriterion("compatibility is null");
            return (Criteria) this;
        }

        public Criteria andCompatibilityIsNotNull() {
            addCriterion("compatibility is not null");
            return (Criteria) this;
        }

        public Criteria andCompatibilityEqualTo(String value) {
            addCriterion("compatibility =", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityNotEqualTo(String value) {
            addCriterion("compatibility <>", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityGreaterThan(String value) {
            addCriterion("compatibility >", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityGreaterThanOrEqualTo(String value) {
            addCriterion("compatibility >=", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityLessThan(String value) {
            addCriterion("compatibility <", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityLessThanOrEqualTo(String value) {
            addCriterion("compatibility <=", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityLike(String value) {
            addCriterion("compatibility like", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityNotLike(String value) {
            addCriterion("compatibility not like", value, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityIn(List<String> values) {
            addCriterion("compatibility in", values, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityNotIn(List<String> values) {
            addCriterion("compatibility not in", values, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityBetween(String value1, String value2) {
            addCriterion("compatibility between", value1, value2, "compatibility");
            return (Criteria) this;
        }

        public Criteria andCompatibilityNotBetween(String value1, String value2) {
            addCriterion("compatibility not between", value1, value2, "compatibility");
            return (Criteria) this;
        }

        public Criteria andVersionChildIsNull() {
            addCriterion("version_child is null");
            return (Criteria) this;
        }

        public Criteria andVersionChildIsNotNull() {
            addCriterion("version_child is not null");
            return (Criteria) this;
        }

        public Criteria andVersionChildEqualTo(String value) {
            addCriterion("version_child =", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildNotEqualTo(String value) {
            addCriterion("version_child <>", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildGreaterThan(String value) {
            addCriterion("version_child >", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildGreaterThanOrEqualTo(String value) {
            addCriterion("version_child >=", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildLessThan(String value) {
            addCriterion("version_child <", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildLessThanOrEqualTo(String value) {
            addCriterion("version_child <=", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildLike(String value) {
            addCriterion("version_child like", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildNotLike(String value) {
            addCriterion("version_child not like", value, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildIn(List<String> values) {
            addCriterion("version_child in", values, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildNotIn(List<String> values) {
            addCriterion("version_child not in", values, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildBetween(String value1, String value2) {
            addCriterion("version_child between", value1, value2, "versionChild");
            return (Criteria) this;
        }

        public Criteria andVersionChildNotBetween(String value1, String value2) {
            addCriterion("version_child not between", value1, value2, "versionChild");
            return (Criteria) this;
        }

        public Criteria andGameSizeIsNull() {
            addCriterion("game_size is null");
            return (Criteria) this;
        }

        public Criteria andGameSizeIsNotNull() {
            addCriterion("game_size is not null");
            return (Criteria) this;
        }

        public Criteria andGameSizeEqualTo(Long value) {
            addCriterion("game_size =", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotEqualTo(Long value) {
            addCriterion("game_size <>", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeGreaterThan(Long value) {
            addCriterion("game_size >", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("game_size >=", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLessThan(Long value) {
            addCriterion("game_size <", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeLessThanOrEqualTo(Long value) {
            addCriterion("game_size <=", value, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeIn(List<Long> values) {
            addCriterion("game_size in", values, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotIn(List<Long> values) {
            addCriterion("game_size not in", values, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeBetween(Long value1, Long value2) {
            addCriterion("game_size between", value1, value2, "gameSize");
            return (Criteria) this;
        }

        public Criteria andGameSizeNotBetween(Long value1, Long value2) {
            addCriterion("game_size not between", value1, value2, "gameSize");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIsNull() {
            addCriterion("release_image is null");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIsNotNull() {
            addCriterion("release_image is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseImageEqualTo(String value) {
            addCriterion("release_image =", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageNotEqualTo(String value) {
            addCriterion("release_image <>", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageGreaterThan(String value) {
            addCriterion("release_image >", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageGreaterThanOrEqualTo(String value) {
            addCriterion("release_image >=", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageLessThan(String value) {
            addCriterion("release_image <", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageLessThanOrEqualTo(String value) {
            addCriterion("release_image <=", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageLike(String value) {
            addCriterion("release_image like", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageNotLike(String value) {
            addCriterion("release_image not like", value, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageIn(List<String> values) {
            addCriterion("release_image in", values, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageNotIn(List<String> values) {
            addCriterion("release_image not in", values, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageBetween(String value1, String value2) {
            addCriterion("release_image between", value1, value2, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andReleaseImageNotBetween(String value1, String value2) {
            addCriterion("release_image not between", value1, value2, "releaseImage");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNull() {
            addCriterion("cover_image is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNotNull() {
            addCriterion("cover_image is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageEqualTo(String value) {
            addCriterion("cover_image =", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotEqualTo(String value) {
            addCriterion("cover_image <>", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThan(String value) {
            addCriterion("cover_image >", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThanOrEqualTo(String value) {
            addCriterion("cover_image >=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThan(String value) {
            addCriterion("cover_image <", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThanOrEqualTo(String value) {
            addCriterion("cover_image <=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLike(String value) {
            addCriterion("cover_image like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotLike(String value) {
            addCriterion("cover_image not like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageIn(List<String> values) {
            addCriterion("cover_image in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotIn(List<String> values) {
            addCriterion("cover_image not in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageBetween(String value1, String value2) {
            addCriterion("cover_image between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotBetween(String value1, String value2) {
            addCriterion("cover_image not between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andImageRatioIsNull() {
            addCriterion("image_ratio is null");
            return (Criteria) this;
        }

        public Criteria andImageRatioIsNotNull() {
            addCriterion("image_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andImageRatioEqualTo(Integer value) {
            addCriterion("image_ratio =", value, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioNotEqualTo(Integer value) {
            addCriterion("image_ratio <>", value, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioGreaterThan(Integer value) {
            addCriterion("image_ratio >", value, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_ratio >=", value, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioLessThan(Integer value) {
            addCriterion("image_ratio <", value, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioLessThanOrEqualTo(Integer value) {
            addCriterion("image_ratio <=", value, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioIn(List<Integer> values) {
            addCriterion("image_ratio in", values, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioNotIn(List<Integer> values) {
            addCriterion("image_ratio not in", values, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioBetween(Integer value1, Integer value2) {
            addCriterion("image_ratio between", value1, value2, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andImageRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("image_ratio not between", value1, value2, "imageRatio");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andEditedAtIsNull() {
            addCriterion("edited_at is null");
            return (Criteria) this;
        }

        public Criteria andEditedAtIsNotNull() {
            addCriterion("edited_at is not null");
            return (Criteria) this;
        }

        public Criteria andEditedAtEqualTo(Date value) {
            addCriterion("edited_at =", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtNotEqualTo(Date value) {
            addCriterion("edited_at <>", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtGreaterThan(Date value) {
            addCriterion("edited_at >", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("edited_at >=", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtLessThan(Date value) {
            addCriterion("edited_at <", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtLessThanOrEqualTo(Date value) {
            addCriterion("edited_at <=", value, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtIn(List<Date> values) {
            addCriterion("edited_at in", values, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtNotIn(List<Date> values) {
            addCriterion("edited_at not in", values, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtBetween(Date value1, Date value2) {
            addCriterion("edited_at between", value1, value2, "editedAt");
            return (Criteria) this;
        }

        public Criteria andEditedAtNotBetween(Date value1, Date value2) {
            addCriterion("edited_at not between", value1, value2, "editedAt");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(String value) {
            addCriterion("community_id =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(String value) {
            addCriterion("community_id <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(String value) {
            addCriterion("community_id >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(String value) {
            addCriterion("community_id >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(String value) {
            addCriterion("community_id <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(String value) {
            addCriterion("community_id <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLike(String value) {
            addCriterion("community_id like", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotLike(String value) {
            addCriterion("community_id not like", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<String> values) {
            addCriterion("community_id in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<String> values) {
            addCriterion("community_id not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(String value1, String value2) {
            addCriterion("community_id between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(String value1, String value2) {
            addCriterion("community_id not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andRecommendNumIsNull() {
            addCriterion("recommend_num is null");
            return (Criteria) this;
        }

        public Criteria andRecommendNumIsNotNull() {
            addCriterion("recommend_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendNumEqualTo(Integer value) {
            addCriterion("recommend_num =", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumNotEqualTo(Integer value) {
            addCriterion("recommend_num <>", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumGreaterThan(Integer value) {
            addCriterion("recommend_num >", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_num >=", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumLessThan(Integer value) {
            addCriterion("recommend_num <", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_num <=", value, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumIn(List<Integer> values) {
            addCriterion("recommend_num in", values, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumNotIn(List<Integer> values) {
            addCriterion("recommend_num not in", values, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumBetween(Integer value1, Integer value2) {
            addCriterion("recommend_num between", value1, value2, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andRecommendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_num not between", value1, value2, "recommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumIsNull() {
            addCriterion("unrecommend_num is null");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumIsNotNull() {
            addCriterion("unrecommend_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumEqualTo(Integer value) {
            addCriterion("unrecommend_num =", value, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumNotEqualTo(Integer value) {
            addCriterion("unrecommend_num <>", value, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumGreaterThan(Integer value) {
            addCriterion("unrecommend_num >", value, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unrecommend_num >=", value, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumLessThan(Integer value) {
            addCriterion("unrecommend_num <", value, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumLessThanOrEqualTo(Integer value) {
            addCriterion("unrecommend_num <=", value, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumIn(List<Integer> values) {
            addCriterion("unrecommend_num in", values, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumNotIn(List<Integer> values) {
            addCriterion("unrecommend_num not in", values, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumBetween(Integer value1, Integer value2) {
            addCriterion("unrecommend_num between", value1, value2, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andUnrecommendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("unrecommend_num not between", value1, value2, "unrecommendNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andVersionMainIsNull() {
            addCriterion("version_main is null");
            return (Criteria) this;
        }

        public Criteria andVersionMainIsNotNull() {
            addCriterion("version_main is not null");
            return (Criteria) this;
        }

        public Criteria andVersionMainEqualTo(String value) {
            addCriterion("version_main =", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainNotEqualTo(String value) {
            addCriterion("version_main <>", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainGreaterThan(String value) {
            addCriterion("version_main >", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainGreaterThanOrEqualTo(String value) {
            addCriterion("version_main >=", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainLessThan(String value) {
            addCriterion("version_main <", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainLessThanOrEqualTo(String value) {
            addCriterion("version_main <=", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainLike(String value) {
            addCriterion("version_main like", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainNotLike(String value) {
            addCriterion("version_main not like", value, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainIn(List<String> values) {
            addCriterion("version_main in", values, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainNotIn(List<String> values) {
            addCriterion("version_main not in", values, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainBetween(String value1, String value2) {
            addCriterion("version_main between", value1, value2, "versionMain");
            return (Criteria) this;
        }

        public Criteria andVersionMainNotBetween(String value1, String value2) {
            addCriterion("version_main not between", value1, value2, "versionMain");
            return (Criteria) this;
        }

        public Criteria andIsbnIdIsNull() {
            addCriterion("isbn_id is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIdIsNotNull() {
            addCriterion("isbn_id is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnIdEqualTo(String value) {
            addCriterion("isbn_id =", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotEqualTo(String value) {
            addCriterion("isbn_id <>", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdGreaterThan(String value) {
            addCriterion("isbn_id >", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdGreaterThanOrEqualTo(String value) {
            addCriterion("isbn_id >=", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdLessThan(String value) {
            addCriterion("isbn_id <", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdLessThanOrEqualTo(String value) {
            addCriterion("isbn_id <=", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdLike(String value) {
            addCriterion("isbn_id like", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotLike(String value) {
            addCriterion("isbn_id not like", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdIn(List<String> values) {
            addCriterion("isbn_id in", values, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotIn(List<String> values) {
            addCriterion("isbn_id not in", values, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdBetween(String value1, String value2) {
            addCriterion("isbn_id between", value1, value2, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotBetween(String value1, String value2) {
            addCriterion("isbn_id not between", value1, value2, "isbnId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andIosStateIsNull() {
            addCriterion("ios_state is null");
            return (Criteria) this;
        }

        public Criteria andIosStateIsNotNull() {
            addCriterion("ios_state is not null");
            return (Criteria) this;
        }

        public Criteria andIosStateEqualTo(Integer value) {
            addCriterion("ios_state =", value, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateNotEqualTo(Integer value) {
            addCriterion("ios_state <>", value, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateGreaterThan(Integer value) {
            addCriterion("ios_state >", value, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ios_state >=", value, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateLessThan(Integer value) {
            addCriterion("ios_state <", value, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateLessThanOrEqualTo(Integer value) {
            addCriterion("ios_state <=", value, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateIn(List<Integer> values) {
            addCriterion("ios_state in", values, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateNotIn(List<Integer> values) {
            addCriterion("ios_state not in", values, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateBetween(Integer value1, Integer value2) {
            addCriterion("ios_state between", value1, value2, "iosState");
            return (Criteria) this;
        }

        public Criteria andIosStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ios_state not between", value1, value2, "iosState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateIsNull() {
            addCriterion("android_state is null");
            return (Criteria) this;
        }

        public Criteria andAndroidStateIsNotNull() {
            addCriterion("android_state is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidStateEqualTo(Integer value) {
            addCriterion("android_state =", value, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateNotEqualTo(Integer value) {
            addCriterion("android_state <>", value, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateGreaterThan(Integer value) {
            addCriterion("android_state >", value, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("android_state >=", value, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateLessThan(Integer value) {
            addCriterion("android_state <", value, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateLessThanOrEqualTo(Integer value) {
            addCriterion("android_state <=", value, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateIn(List<Integer> values) {
            addCriterion("android_state in", values, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateNotIn(List<Integer> values) {
            addCriterion("android_state not in", values, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateBetween(Integer value1, Integer value2) {
            addCriterion("android_state between", value1, value2, "androidState");
            return (Criteria) this;
        }

        public Criteria andAndroidStateNotBetween(Integer value1, Integer value2) {
            addCriterion("android_state not between", value1, value2, "androidState");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(String value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(String value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(String value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(String value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(String value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(String value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLike(String value) {
            addCriterion("developer_id like", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotLike(String value) {
            addCriterion("developer_id not like", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<String> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<String> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(String value1, String value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(String value1, String value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andTestNumberIsNull() {
            addCriterion("test_number is null");
            return (Criteria) this;
        }

        public Criteria andTestNumberIsNotNull() {
            addCriterion("test_number is not null");
            return (Criteria) this;
        }

        public Criteria andTestNumberEqualTo(Integer value) {
            addCriterion("test_number =", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotEqualTo(Integer value) {
            addCriterion("test_number <>", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberGreaterThan(Integer value) {
            addCriterion("test_number >", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_number >=", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberLessThan(Integer value) {
            addCriterion("test_number <", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberLessThanOrEqualTo(Integer value) {
            addCriterion("test_number <=", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberIn(List<Integer> values) {
            addCriterion("test_number in", values, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotIn(List<Integer> values) {
            addCriterion("test_number not in", values, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberBetween(Integer value1, Integer value2) {
            addCriterion("test_number between", value1, value2, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("test_number not between", value1, value2, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTsetDateIsNull() {
            addCriterion("tset_date is null");
            return (Criteria) this;
        }

        public Criteria andTsetDateIsNotNull() {
            addCriterion("tset_date is not null");
            return (Criteria) this;
        }

        public Criteria andTsetDateEqualTo(Date value) {
            addCriterion("tset_date =", value, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateNotEqualTo(Date value) {
            addCriterion("tset_date <>", value, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateGreaterThan(Date value) {
            addCriterion("tset_date >", value, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tset_date >=", value, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateLessThan(Date value) {
            addCriterion("tset_date <", value, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateLessThanOrEqualTo(Date value) {
            addCriterion("tset_date <=", value, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateIn(List<Date> values) {
            addCriterion("tset_date in", values, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateNotIn(List<Date> values) {
            addCriterion("tset_date not in", values, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateBetween(Date value1, Date value2) {
            addCriterion("tset_date between", value1, value2, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andTsetDateNotBetween(Date value1, Date value2) {
            addCriterion("tset_date not between", value1, value2, "tsetDate");
            return (Criteria) this;
        }

        public Criteria andIsbnImageIsNull() {
            addCriterion("isbn_image is null");
            return (Criteria) this;
        }

        public Criteria andIsbnImageIsNotNull() {
            addCriterion("isbn_image is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnImageEqualTo(String value) {
            addCriterion("isbn_image =", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageNotEqualTo(String value) {
            addCriterion("isbn_image <>", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageGreaterThan(String value) {
            addCriterion("isbn_image >", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageGreaterThanOrEqualTo(String value) {
            addCriterion("isbn_image >=", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageLessThan(String value) {
            addCriterion("isbn_image <", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageLessThanOrEqualTo(String value) {
            addCriterion("isbn_image <=", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageLike(String value) {
            addCriterion("isbn_image like", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageNotLike(String value) {
            addCriterion("isbn_image not like", value, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageIn(List<String> values) {
            addCriterion("isbn_image in", values, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageNotIn(List<String> values) {
            addCriterion("isbn_image not in", values, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageBetween(String value1, String value2) {
            addCriterion("isbn_image between", value1, value2, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andIsbnImageNotBetween(String value1, String value2) {
            addCriterion("isbn_image not between", value1, value2, "isbnImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdIsNull() {
            addCriterion("copyright_id is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdIsNotNull() {
            addCriterion("copyright_id is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdEqualTo(String value) {
            addCriterion("copyright_id =", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdNotEqualTo(String value) {
            addCriterion("copyright_id <>", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdGreaterThan(String value) {
            addCriterion("copyright_id >", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdGreaterThanOrEqualTo(String value) {
            addCriterion("copyright_id >=", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdLessThan(String value) {
            addCriterion("copyright_id <", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdLessThanOrEqualTo(String value) {
            addCriterion("copyright_id <=", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdLike(String value) {
            addCriterion("copyright_id like", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdNotLike(String value) {
            addCriterion("copyright_id not like", value, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdIn(List<String> values) {
            addCriterion("copyright_id in", values, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdNotIn(List<String> values) {
            addCriterion("copyright_id not in", values, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdBetween(String value1, String value2) {
            addCriterion("copyright_id between", value1, value2, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightIdNotBetween(String value1, String value2) {
            addCriterion("copyright_id not between", value1, value2, "copyrightId");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageIsNull() {
            addCriterion("copyright_image is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageIsNotNull() {
            addCriterion("copyright_image is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageEqualTo(String value) {
            addCriterion("copyright_image =", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageNotEqualTo(String value) {
            addCriterion("copyright_image <>", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageGreaterThan(String value) {
            addCriterion("copyright_image >", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageGreaterThanOrEqualTo(String value) {
            addCriterion("copyright_image >=", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageLessThan(String value) {
            addCriterion("copyright_image <", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageLessThanOrEqualTo(String value) {
            addCriterion("copyright_image <=", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageLike(String value) {
            addCriterion("copyright_image like", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageNotLike(String value) {
            addCriterion("copyright_image not like", value, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageIn(List<String> values) {
            addCriterion("copyright_image in", values, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageNotIn(List<String> values) {
            addCriterion("copyright_image not in", values, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageBetween(String value1, String value2) {
            addCriterion("copyright_image between", value1, value2, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCopyrightImageNotBetween(String value1, String value2) {
            addCriterion("copyright_image not between", value1, value2, "copyrightImage");
            return (Criteria) this;
        }

        public Criteria andCredentialsIsNull() {
            addCriterion("credentials is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsIsNotNull() {
            addCriterion("credentials is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsEqualTo(String value) {
            addCriterion("credentials =", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotEqualTo(String value) {
            addCriterion("credentials <>", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsGreaterThan(String value) {
            addCriterion("credentials >", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsGreaterThanOrEqualTo(String value) {
            addCriterion("credentials >=", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLessThan(String value) {
            addCriterion("credentials <", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLessThanOrEqualTo(String value) {
            addCriterion("credentials <=", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsLike(String value) {
            addCriterion("credentials like", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotLike(String value) {
            addCriterion("credentials not like", value, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsIn(List<String> values) {
            addCriterion("credentials in", values, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotIn(List<String> values) {
            addCriterion("credentials not in", values, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsBetween(String value1, String value2) {
            addCriterion("credentials between", value1, value2, "credentials");
            return (Criteria) this;
        }

        public Criteria andCredentialsNotBetween(String value1, String value2) {
            addCriterion("credentials not between", value1, value2, "credentials");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNull() {
            addCriterion("issue_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNotNull() {
            addCriterion("issue_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueIdEqualTo(String value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(String value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(String value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(String value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(String value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLike(String value) {
            addCriterion("issue_id like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotLike(String value) {
            addCriterion("issue_id not like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<String> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<String> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(String value1, String value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(String value1, String value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameIsNull() {
            addCriterion("android_package_name is null");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameIsNotNull() {
            addCriterion("android_package_name is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameEqualTo(String value) {
            addCriterion("android_package_name =", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameNotEqualTo(String value) {
            addCriterion("android_package_name <>", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameGreaterThan(String value) {
            addCriterion("android_package_name >", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("android_package_name >=", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameLessThan(String value) {
            addCriterion("android_package_name <", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameLessThanOrEqualTo(String value) {
            addCriterion("android_package_name <=", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameLike(String value) {
            addCriterion("android_package_name like", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameNotLike(String value) {
            addCriterion("android_package_name not like", value, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameIn(List<String> values) {
            addCriterion("android_package_name in", values, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameNotIn(List<String> values) {
            addCriterion("android_package_name not in", values, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameBetween(String value1, String value2) {
            addCriterion("android_package_name between", value1, value2, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andAndroidPackageNameNotBetween(String value1, String value2) {
            addCriterion("android_package_name not between", value1, value2, "androidPackageName");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumIsNull() {
            addCriterion("boom_download_num is null");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumIsNotNull() {
            addCriterion("boom_download_num is not null");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumEqualTo(Long value) {
            addCriterion("boom_download_num =", value, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumNotEqualTo(Long value) {
            addCriterion("boom_download_num <>", value, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumGreaterThan(Long value) {
            addCriterion("boom_download_num >", value, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumGreaterThanOrEqualTo(Long value) {
            addCriterion("boom_download_num >=", value, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumLessThan(Long value) {
            addCriterion("boom_download_num <", value, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumLessThanOrEqualTo(Long value) {
            addCriterion("boom_download_num <=", value, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumIn(List<Long> values) {
            addCriterion("boom_download_num in", values, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumNotIn(List<Long> values) {
            addCriterion("boom_download_num not in", values, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumBetween(Long value1, Long value2) {
            addCriterion("boom_download_num between", value1, value2, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andBoomDownloadNumNotBetween(Long value1, Long value2) {
            addCriterion("boom_download_num not between", value1, value2, "boomDownloadNum");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnIsNull() {
            addCriterion("game_idt_sn is null");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnIsNotNull() {
            addCriterion("game_idt_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnEqualTo(Long value) {
            addCriterion("game_idt_sn =", value, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnNotEqualTo(Long value) {
            addCriterion("game_idt_sn <>", value, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnGreaterThan(Long value) {
            addCriterion("game_idt_sn >", value, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnGreaterThanOrEqualTo(Long value) {
            addCriterion("game_idt_sn >=", value, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnLessThan(Long value) {
            addCriterion("game_idt_sn <", value, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnLessThanOrEqualTo(Long value) {
            addCriterion("game_idt_sn <=", value, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnIn(List<Long> values) {
            addCriterion("game_idt_sn in", values, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnNotIn(List<Long> values) {
            addCriterion("game_idt_sn not in", values, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnBetween(Long value1, Long value2) {
            addCriterion("game_idt_sn between", value1, value2, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andGameIdtSnNotBetween(Long value1, Long value2) {
            addCriterion("game_idt_sn not between", value1, value2, "gameIdtSn");
            return (Criteria) this;
        }

        public Criteria andTabGameIdIsNull() {
            addCriterion("tab_game_id is null");
            return (Criteria) this;
        }

        public Criteria andTabGameIdIsNotNull() {
            addCriterion("tab_game_id is not null");
            return (Criteria) this;
        }

        public Criteria andTabGameIdEqualTo(String value) {
            addCriterion("tab_game_id =", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdNotEqualTo(String value) {
            addCriterion("tab_game_id <>", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdGreaterThan(String value) {
            addCriterion("tab_game_id >", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdGreaterThanOrEqualTo(String value) {
            addCriterion("tab_game_id >=", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdLessThan(String value) {
            addCriterion("tab_game_id <", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdLessThanOrEqualTo(String value) {
            addCriterion("tab_game_id <=", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdLike(String value) {
            addCriterion("tab_game_id like", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdNotLike(String value) {
            addCriterion("tab_game_id not like", value, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdIn(List<String> values) {
            addCriterion("tab_game_id in", values, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdNotIn(List<String> values) {
            addCriterion("tab_game_id not in", values, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdBetween(String value1, String value2) {
            addCriterion("tab_game_id between", value1, value2, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andTabGameIdNotBetween(String value1, String value2) {
            addCriterion("tab_game_id not between", value1, value2, "tabGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdIsNull() {
            addCriterion("google_game_id is null");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdIsNotNull() {
            addCriterion("google_game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdEqualTo(String value) {
            addCriterion("google_game_id =", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdNotEqualTo(String value) {
            addCriterion("google_game_id <>", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdGreaterThan(String value) {
            addCriterion("google_game_id >", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdGreaterThanOrEqualTo(String value) {
            addCriterion("google_game_id >=", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdLessThan(String value) {
            addCriterion("google_game_id <", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdLessThanOrEqualTo(String value) {
            addCriterion("google_game_id <=", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdLike(String value) {
            addCriterion("google_game_id like", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdNotLike(String value) {
            addCriterion("google_game_id not like", value, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdIn(List<String> values) {
            addCriterion("google_game_id in", values, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdNotIn(List<String> values) {
            addCriterion("google_game_id not in", values, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdBetween(String value1, String value2) {
            addCriterion("google_game_id between", value1, value2, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andGoogleGameIdNotBetween(String value1, String value2) {
            addCriterion("google_game_id not between", value1, value2, "googleGameId");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestIsNull() {
            addCriterion("video_url_latest is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestIsNotNull() {
            addCriterion("video_url_latest is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestEqualTo(Boolean value) {
            addCriterion("video_url_latest =", value, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestNotEqualTo(Boolean value) {
            addCriterion("video_url_latest <>", value, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestGreaterThan(Boolean value) {
            addCriterion("video_url_latest >", value, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("video_url_latest >=", value, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestLessThan(Boolean value) {
            addCriterion("video_url_latest <", value, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestLessThanOrEqualTo(Boolean value) {
            addCriterion("video_url_latest <=", value, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestIn(List<Boolean> values) {
            addCriterion("video_url_latest in", values, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestNotIn(List<Boolean> values) {
            addCriterion("video_url_latest not in", values, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestBetween(Boolean value1, Boolean value2) {
            addCriterion("video_url_latest between", value1, value2, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLatestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("video_url_latest not between", value1, value2, "videoUrlLatest");
            return (Criteria) this;
        }

        public Criteria andCostFreeIsNull() {
            addCriterion("cost_free is null");
            return (Criteria) this;
        }

        public Criteria andCostFreeIsNotNull() {
            addCriterion("cost_free is not null");
            return (Criteria) this;
        }

        public Criteria andCostFreeEqualTo(Boolean value) {
            addCriterion("cost_free =", value, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeNotEqualTo(Boolean value) {
            addCriterion("cost_free <>", value, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeGreaterThan(Boolean value) {
            addCriterion("cost_free >", value, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cost_free >=", value, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeLessThan(Boolean value) {
            addCriterion("cost_free <", value, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("cost_free <=", value, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeIn(List<Boolean> values) {
            addCriterion("cost_free in", values, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeNotIn(List<Boolean> values) {
            addCriterion("cost_free not in", values, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("cost_free between", value1, value2, "costFree");
            return (Criteria) this;
        }

        public Criteria andCostFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cost_free not between", value1, value2, "costFree");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescIsNull() {
            addCriterion("android_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescIsNotNull() {
            addCriterion("android_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescEqualTo(String value) {
            addCriterion("android_status_desc =", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescNotEqualTo(String value) {
            addCriterion("android_status_desc <>", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescGreaterThan(String value) {
            addCriterion("android_status_desc >", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("android_status_desc >=", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescLessThan(String value) {
            addCriterion("android_status_desc <", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescLessThanOrEqualTo(String value) {
            addCriterion("android_status_desc <=", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescLike(String value) {
            addCriterion("android_status_desc like", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescNotLike(String value) {
            addCriterion("android_status_desc not like", value, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescIn(List<String> values) {
            addCriterion("android_status_desc in", values, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescNotIn(List<String> values) {
            addCriterion("android_status_desc not in", values, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescBetween(String value1, String value2) {
            addCriterion("android_status_desc between", value1, value2, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andAndroidStatusDescNotBetween(String value1, String value2) {
            addCriterion("android_status_desc not between", value1, value2, "androidStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescIsNull() {
            addCriterion("ios_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescIsNotNull() {
            addCriterion("ios_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescEqualTo(String value) {
            addCriterion("ios_status_desc =", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescNotEqualTo(String value) {
            addCriterion("ios_status_desc <>", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescGreaterThan(String value) {
            addCriterion("ios_status_desc >", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("ios_status_desc >=", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescLessThan(String value) {
            addCriterion("ios_status_desc <", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescLessThanOrEqualTo(String value) {
            addCriterion("ios_status_desc <=", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescLike(String value) {
            addCriterion("ios_status_desc like", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescNotLike(String value) {
            addCriterion("ios_status_desc not like", value, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescIn(List<String> values) {
            addCriterion("ios_status_desc in", values, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescNotIn(List<String> values) {
            addCriterion("ios_status_desc not in", values, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescBetween(String value1, String value2) {
            addCriterion("ios_status_desc between", value1, value2, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andIosStatusDescNotBetween(String value1, String value2) {
            addCriterion("ios_status_desc not between", value1, value2, "iosStatusDesc");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameIsNull() {
            addCriterion("google_deputy_name is null");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameIsNotNull() {
            addCriterion("google_deputy_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameEqualTo(String value) {
            addCriterion("google_deputy_name =", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameNotEqualTo(String value) {
            addCriterion("google_deputy_name <>", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameGreaterThan(String value) {
            addCriterion("google_deputy_name >", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameGreaterThanOrEqualTo(String value) {
            addCriterion("google_deputy_name >=", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameLessThan(String value) {
            addCriterion("google_deputy_name <", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameLessThanOrEqualTo(String value) {
            addCriterion("google_deputy_name <=", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameLike(String value) {
            addCriterion("google_deputy_name like", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameNotLike(String value) {
            addCriterion("google_deputy_name not like", value, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameIn(List<String> values) {
            addCriterion("google_deputy_name in", values, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameNotIn(List<String> values) {
            addCriterion("google_deputy_name not in", values, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameBetween(String value1, String value2) {
            addCriterion("google_deputy_name between", value1, value2, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andGoogleDeputyNameNotBetween(String value1, String value2) {
            addCriterion("google_deputy_name not between", value1, value2, "googleDeputyName");
            return (Criteria) this;
        }

        public Criteria andCanFastIsNull() {
            addCriterion("can_fast is null");
            return (Criteria) this;
        }

        public Criteria andCanFastIsNotNull() {
            addCriterion("can_fast is not null");
            return (Criteria) this;
        }

        public Criteria andCanFastEqualTo(Boolean value) {
            addCriterion("can_fast =", value, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastNotEqualTo(Boolean value) {
            addCriterion("can_fast <>", value, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastGreaterThan(Boolean value) {
            addCriterion("can_fast >", value, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastGreaterThanOrEqualTo(Boolean value) {
            addCriterion("can_fast >=", value, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastLessThan(Boolean value) {
            addCriterion("can_fast <", value, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastLessThanOrEqualTo(Boolean value) {
            addCriterion("can_fast <=", value, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastIn(List<Boolean> values) {
            addCriterion("can_fast in", values, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastNotIn(List<Boolean> values) {
            addCriterion("can_fast not in", values, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastBetween(Boolean value1, Boolean value2) {
            addCriterion("can_fast between", value1, value2, "canFast");
            return (Criteria) this;
        }

        public Criteria andCanFastNotBetween(Boolean value1, Boolean value2) {
            addCriterion("can_fast not between", value1, value2, "canFast");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumIsNull() {
            addCriterion("week_download_num is null");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumIsNotNull() {
            addCriterion("week_download_num is not null");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumEqualTo(Long value) {
            addCriterion("week_download_num =", value, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumNotEqualTo(Long value) {
            addCriterion("week_download_num <>", value, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumGreaterThan(Long value) {
            addCriterion("week_download_num >", value, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumGreaterThanOrEqualTo(Long value) {
            addCriterion("week_download_num >=", value, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumLessThan(Long value) {
            addCriterion("week_download_num <", value, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumLessThanOrEqualTo(Long value) {
            addCriterion("week_download_num <=", value, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumIn(List<Long> values) {
            addCriterion("week_download_num in", values, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumNotIn(List<Long> values) {
            addCriterion("week_download_num not in", values, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumBetween(Long value1, Long value2) {
            addCriterion("week_download_num between", value1, value2, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andWeekDownloadNumNotBetween(Long value1, Long value2) {
            addCriterion("week_download_num not between", value1, value2, "weekDownloadNum");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
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