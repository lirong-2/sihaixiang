package cn.itsource.shx.test.tservice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Wish;
import cn.itsource.shx.service.IWishService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class WishServiceTestCase {
	@Autowired
	private IWishService wishService;
	
	@Test
	public void getWishs() {
		String openId = "o89RK5PQcfEqjhj9y2mwYvtmHr9c";
		List<Wish> wishs = wishService.findWishs(openId);
		System.out.println("BEGIN:");
		for (Wish wish : wishs) {
			System.out.println("wish:"+wish);
		}
		System.out.println("END.");
	}
}
