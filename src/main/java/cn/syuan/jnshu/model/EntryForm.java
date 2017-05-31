package cn.syuan.jnshu.model;

import java.io.Serializable;

public class EntryForm implements Serializable {
    private Integer id;

    private Long createTime;

    private Long updateTime;

    private String name;

    private String qq;

    private String major;

    private Long startDate;

    private String school;

    private String onlineclass;

    private String onlineno;

    private String recommender;

    private String censor;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getOnlineclass() {
        return onlineclass;
    }

    public void setOnlineclass(String onlineclass) {
        this.onlineclass = onlineclass == null ? null : onlineclass.trim();
    }

    public String getOnlineno() {
        return onlineno;
    }

    public void setOnlineno(String onlineno) {
        this.onlineno = onlineno == null ? null : onlineno.trim();
    }

    public String getRecommender() {
        return recommender;
    }

    public void setRecommender(String recommender) {
        this.recommender = recommender == null ? null : recommender.trim();
    }

    public String getCensor() {
        return censor;
    }

    public void setCensor(String censor) {
        this.censor = censor == null ? null : censor.trim();
    }
}