package cn.itsource.shx.test.tservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.User;
import cn.itsource.shx.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTestCase {
	@Autowired
	private IUserService userService;
	
	@Test
	public void login() {
		String openId = "222";
		String nickname = "小龙";
		String headerImg = "头像4";
		User user = userService.login(openId, nickname, headerImg);
		System.out.println("user:"+user);
	}
}
