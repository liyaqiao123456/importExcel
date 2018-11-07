package com.neo.entity;

public class TbAward {
    private Integer award_id;

    private String award_name;

    private Integer award_weight;

    private Integer award_mount;

    private String remarks;

    public Integer getAward_id() {
        return award_id;
    }

    public void setAward_id(Integer award_id) {
        this.award_id = award_id;
    }

    public String getAward_name() {
        return award_name;
    }

    public void setAward_name(String award_name) {
        this.award_name = award_name;
    }

    public Integer getAward_weight() {
        return award_weight;
    }

    public void setAward_weight(Integer award_weight) {
        this.award_weight = award_weight;
    }

    public Integer getAward_mount() {
        return award_mount;
    }

    public void setAward_mount(Integer award_mount) {
        this.award_mount = award_mount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}