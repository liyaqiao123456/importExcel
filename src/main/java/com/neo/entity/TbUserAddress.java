package com.neo.entity;

import java.util.Date;

public class TbUserAddress {
    private Integer address_id;

    private Integer job_number;

    private Integer award_id;

    private String user_name;

    private String user_address;

    private String user_phone;

    private Date create_time;

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getJob_number() {
        return job_number;
    }

    public void setJob_number(Integer job_number) {
        this.job_number = job_number;
    }

    public Integer getAward_id() {
        return award_id;
    }

    public void setAward_id(Integer award_id) {
        this.award_id = award_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}