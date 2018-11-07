package com.neo.service;

import com.neo.entity.TbAward;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public interface Sweepstake {

       TbAward getTbawardByIndex(List<TbAward> index,Integer jobbumber);

}
