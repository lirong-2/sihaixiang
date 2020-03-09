package cn.itsource.shx.test.tmapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.User;
import cn.itsource.shx.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTestCase {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void addnew() {
		User user = new User();
		user.setOpenId("111");
		user.setNickname("小王");
		user.setHeaderImg("头像");
		user.setTelphone("15717252541");
		user.setRegisterTime(new Date());
		user.setLastLoginTime(new Date());
		Integer rows = userMapper.addnew(user);
		System.out.println("rows:"+rows);
	}
	
	@Test
	public void findByOpenId() {
		String openId = "111";
		User user = userMapper.findByOpenId(openId);
		System.out.println("user:"+user);
	}
	
	@Test
	public void update() {
		User user = new User();
		user.setOpenId("111");
		user.setNickname("小李");
		user.setHeaderImg("头像2");
		user.setTelphone("15927089739");
		user.setLastLoginTime(new Date());
		Integer rows = userMapper.update(user);
		System.out.println("rows:"+rows);
	}
}
