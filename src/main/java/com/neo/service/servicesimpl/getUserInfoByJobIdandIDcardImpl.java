package com.neo.service.servicesimpl;

import com.neo.LianjiaException.LianjiaException;
import com.neo.entity.Tbagent;
import com.neo.entity.TbagentCriteria;
import com.neo.enums.ResultEnum;
import com.neo.mapper.TbagentMapper;
import com.neo.service.getUserInfoByJobIdandIDcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/12/12.
 */
@Service
@Transactional
@ComponentScan("com.neo")
public class getUserInfoByJobIdandIDcardImpl implements getUserInfoByJobIdandIDcard {

    @Autowired
    private TbagentMapper tbagentMapper;
    /**
     * 获取用户资料信息
     * @param jobNumber 工号
     * @param IDcard 身份证号
     * @return
     */
    @Override
    public Tbagent getUserInfo(Integer jobNumber, String  IDcard) {
        TbagentCriteria tbagentCriteria1 = new TbagentCriteria();
        tbagentCriteria1.or().andJob_numberEqualTo(jobNumber);
        int tbagent = tbagentMapper.selectByExample(tbagentCriteria1).size();
        if(tbagent==0){
            throw new LianjiaException(ResultEnum.JOBNUMER_OR_IDCARD_ERROR);
        }
        if(jobNumber == null || IDcard == null){
            throw new LianjiaException(ResultEnum.JOBNUMER_OR_IDCARD_NULL);
        }
        TbagentCriteria tbagentCriteria = new TbagentCriteria();
        tbagentCriteria.or().andIdcardEqualTo(IDcard).andJob_numberEqualTo(jobNumber);
        return tbagentMapper.selectByExample(tbagentCriteria).get(0);
    }

}
