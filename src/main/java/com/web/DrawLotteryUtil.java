//package com.web;
//
//import com.alibaba.fastjson.JSON;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class DrawLotteryUtil {
//
//    public static int drawGift(List<Gift> giftList){
//
//        if(null != giftList && giftList.size()>0){
//            List orgProbList = new ArrayList(giftList.size());
//            for(Gift gift:giftList){
//            //按顺序将概率添加到集合中
//                orgProbList.add(gift.getProb());
//            }
//
//            return draw(orgProbList);
//
//        }
//        return -1;
//    }
//
//    public static int draw(List<Double> giftProbList){
//
//        List sortRateList = new ArrayList();
//
//        // 计算概率总和
//        Double sumRate = 0D;
//        for(Double prob : giftProbList){
//            sumRate += prob;
//        }
//
//        if(sumRate != 0){
//            double rate = 0D; //概率所占比例
//            for(Double prob : giftProbList){
//                rate += prob;
//             // 构建一个比例区段组成的集合(避免概率和不为1)
//                sortRateList.add(rate / sumRate);
//            }
//
//           // 随机生成一个随机数，并排序
//            double random = Math.random();
//            sortRateList.add(random);
//            Collections.sort(sortRateList);
//
//         // 返回该随机数在比例集合中的索引
//            return sortRateList.indexOf(random);
//        }
//
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Gift iphone = new Gift();
//        iphone.setId(101);
//        iphone.setName("苹果手机");
//        iphone.setProb(0.01D);
//
//        Gift thanks = new Gift();
//        thanks.setId(102);
//        thanks.setName("再接再厉");
//        thanks.setProb(0.4D);
//
//        Gift wangyi = new Gift();
//        thanks.setId(104);
//        thanks.setName("网易云");
//        thanks.setProb(0.2D);
//
//        Gift vip = new Gift();
//        vip.setId(103);
//        vip.setName("优酷会员");
//        vip.setProb(0.3D);
//
//        List list = new ArrayList();
//        list.add(vip);
//        list.add(thanks);
//        list.add(iphone);
//        list.add(wangyi);
//
//        for(int i=0;i<100;i++){
//            int index = drawGift(list);
//            System.out.println(JSON.toJSON(list.get(index)));
//        }
//    }
//
//}
