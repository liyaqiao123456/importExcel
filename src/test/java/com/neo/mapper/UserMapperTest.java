package com.neo.mapper;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.neo.entity.*;

import com.neo.excelmapper.ExcelMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.enums.UserSexEnum;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.neo.excelmapper.ExcelMapper")
public class UserMapperTest {

	@Autowired
	private UserMapper UserMapper;

	@Autowired private ExcelMapper excelMapper;

	@Autowired
	private TbagentMapper tbagentMapper;

	@Autowired
	private TbuserinfowithaddressMapper tbuserinfowithaddressMapper;

	@Autowired
	private  TbAdminMapper tbAdminMapper;
	@Test
	public void testaGetUserInfo() {
		Integer jobnumber =80647;
		String idcard ="191456";
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

		TbagentCriteria tbagentCriteria = new TbagentCriteria();
		tbagentCriteria.or().andJob_numberEqualTo(jobnumber).andIdcardEqualTo(idcard);
		System.out.println(JSON.toJSON(tbagentMapper.selectByExample(tbagentCriteria).get(0)));
	}

	@Test
	public void testgetAdminUserinfo(){
		System.out.println(JSON.toJSONString(tbAdminMapper.selectByPrimaryKey(1)));
	}

    @Test
	public void testBatchInsert(){
		List<Tbagent> tbagents = new ArrayList<>();
		Tbagent tbagent = new Tbagent();
		tbagent.setRegion_rankings(1);
		tbagent.setRegion("e");
		tbagent.setDistance_first_region(1L);
		tbagent.setDistance_first_company(2L);
		tbagent.setDistance_first_department(3L);
		tbagent.setIdcard("123");
		tbagent.setDepartment("beijign");
		tbagent.setJob_number(1223);
		tbagent.setDepartment_rankings(33);
		tbagent.setUsername("zhouge");
		tbagent.setCompany_rankings(3);
		tbagents.add(tbagent);

		Tbagent tbagent1 = new Tbagent();
		tbagent1.setRegion_rankings(1);
		tbagent1.setRegion("e");
		tbagent1.setDistance_first_region(1L);
		tbagent1.setDistance_first_company(2L);
		tbagent1.setDistance_first_department(3L);
		tbagent1.setIdcard("1243");
		tbagent1.setDepartment("beijign");
		tbagent1.setJob_number(12412);
		tbagent1.setDepartment_rankings(33);
		tbagent1.setUsername("zhouge");
		tbagent1.setCompany_rankings(3);
		tbagents.add(tbagent1);

		excelMapper.batchInsert(tbagents);


	}


//
//	@Test
//	public void getUserInfoWithAddress(){
//		Integer jobnumber = 173699;
//		userinfoDto tbUserinfoWithAddress = tbuserinfowithaddressMapper.getUserinfo(jobnumber);
//		System.out.println("_______________________"+JSON.toJSONString(tbUserinfoWithAddress));
////		tbUserinfoWithAddress.get(0).getTbagent();
////		tbUserinfoWithAddress.get(0).getTbUserAddress();
//		System.out.println(JSON.toJSON(tbuserinfowithaddressMapper.getUserinfo(jobnumber)+"************************"));
//
//	}




//	@Test
//	public void testInsert() throws Exception {
//		UserMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
//		UserMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
//		UserMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));
//
//		Assert.assertEquals(12, UserMapper.getAll().size());
//	}

//	@Test
//	public void testQuery() throws Exception {
//		List<UserEntity> users = UserMapper.getAll();
//		if(users==null || users.size()==0){
//			System.out.println("is null");
//		}else{
//			System.out.println(users.toString());
//		}
//	}

//	@Test
//	public void testGetUserInfo(){
//		TbagentCriteria tbagentCriteria = new TbagentCriteria();
//		tbagentCriteria.or().andJob_numberEqualTo(173699);
//		System.out.println(JSON.toJSON(tbagentMapper.selectByExample(tbagentCriteria).get(0)));
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
//	}

//	@Test
//	public void testUpdate() throws Exception {
//		UserEntity user = UserMapper.getOne(6l);
//		System.out.println(user.toString());
//		user.setNickName("neo");
//		UserMapper.update(user);
//		Assert.assertTrue(("neo".equals(UserMapper.getOne(6l).getNickName())));
//	}

}