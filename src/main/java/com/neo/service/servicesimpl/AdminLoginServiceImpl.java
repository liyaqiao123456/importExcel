package com.neo.service.servicesimpl;

import com.neo.LianjiaException.LianjiaException;
import com.neo.entity.TbAdmin;
import com.neo.entity.TbAdminCriteria;
import com.neo.enums.ResultEnum;
import com.neo.mapper.TbAdminMapper;
import com.neo.service.IadminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

/**
 * Created by Administrator on 2018/1/14.
 */
@Service
@Transactional
public class AdminLoginServiceImpl implements IadminService{

    @Value("${lianjia.salt}")
    private static String salt;

    @Autowired private TbAdminMapper tbAdminMapper;

    @Override
    public void AdminLogin(String adminUserName, String adminPass) {
        checkAdminUsername(adminUserName,adminPass);
    }

    @Override
    public boolean checkAdminUsername(String adminUsername, String adminPassword) {
        TbAdmin tbAdmin = getTbadminUserInfo(adminUsername);
        System.out.println(generateEncryPass(adminPassword)+">>>>>>>>>>>>>>>>>>>>>>>>>");
//        if(!(tbAdmin.getAdmin_password().equals(generateEncryPass(adminPassword))))
//        {
//            throw new LianjiaException(ResultEnum.PASSWORD_IS_ERROR);
//        }
        return true;
    }


    /**
     * 明文加密
     * @param clearPass
     * @return
     */
    public static String generateEncryPass(String clearPass){
        return DigestUtils.md5DigestAsHex((salt+DigestUtils.md5DigestAsHex(clearPass.getBytes())).getBytes());
    }

    public TbAdmin getTbadminUserInfo(String adminUsername){
        TbAdminCriteria tbAdminCriteria = new TbAdminCriteria();
        tbAdminCriteria.or().andAdmin_nameEqualTo(adminUsername);
        TbAdmin tbAdmin = tbAdminMapper.selectByExample(tbAdminCriteria).get(0);
        if(tbAdmin == null){
            throw new LianjiaException(ResultEnum.USERNAME_IS_ERROR);
        }
        return tbAdmin;
   }
}