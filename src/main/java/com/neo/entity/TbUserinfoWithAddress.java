package com.neo.entity;

/**
 * Created by Administrator on 2017/12/12.
 */
public class TbUserinfoWithAddress {

    private Tbagent tbagent;
    private TbUserAddress tbUserAddress;

    public Tbagent getTbagent() {
        return tbagent;
    }

    public void setTbagent(Tbagent tbagent) {
        this.tbagent = tbagent;
    }

    public TbUserAddress getTbUserAddress() {
        return tbUserAddress;
    }

    public void setTbUserAddress(TbUserAddress tbUserAddress) {
        this.tbUserAddress = tbUserAddress;
    }
}


