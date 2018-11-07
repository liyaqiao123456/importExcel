package com.neo.service.servicesimpl;

import com.neo.entity.TbAward;
import com.neo.entity.TbAwardCriteria;
import com.neo.entity.Tbagent;
import com.neo.mapper.TbAwardMapper;
import com.neo.mapper.TbagentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by Administrator on 2017/12/12.
 */
@Service
@Transactional
public class Sweepstakes implements com.neo.service.Sweepstake {

    @Autowired
    private TbAwardMapper tbawardmapper;

    @Autowired
    private TbagentMapper tbagentmapper;
    @Override
    public TbAward getTbawardByIndex(List<TbAward> listaward, Integer jobnumber) {
        int index =  drawGift(listaward);
         tbawardmapper.selectByPrimaryKey(index);
        // 判断 减库存 设置条件 已经抽过的用户不能再次进行抽奖
        return  null;
    }

    public static int drawGift(List<TbAward> giftList){

        //  获取奖品信息的中奖概率
        if(null != giftList && giftList.size()>0){
            List orgProbList = new ArrayList(giftList.size());
            for(TbAward gift:giftList){
                //按顺序将概率添加到集合中
                orgProbList.add(gift.getRemarks());
            }
            return draw(orgProbList);
        }
        return -1;
    }

    private static int draw(List<Double> orgProbList) {
        List<Double> problist = new ArrayList<>();
        Double sumrate = 0D;
        for(Double orgprb:orgProbList){
            sumrate+=orgprb;
        }
        if(sumrate !=0 ){
            Double rate =0D;
            for(Double prob :orgProbList){
                rate+=prob;
                problist.add(rate/sumrate);
            }
            Double random = Math.random();
            problist.add(random);
            Collections.sort(problist);
            return problist.indexOf(random);
        }
     return -1;
    }
}
