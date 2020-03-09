package cn.itsource.shx.test.tservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Banner;
import cn.itsource.shx.service.IBannerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BannerServiceTestCase {
	@Autowired
	private IBannerService bannerService;
	
	@Test
	public void getBanner() {
		Integer id = 1;
		Banner banner = bannerService.getBanner(id);
		System.out.println("banner:"+banner);
	}
}
