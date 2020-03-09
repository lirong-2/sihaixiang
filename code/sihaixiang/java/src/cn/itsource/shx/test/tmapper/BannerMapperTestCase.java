package cn.itsource.shx.test.tmapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Banner;
import cn.itsource.shx.mapper.BannerMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BannerMapperTestCase {
	@Autowired
	private BannerMapper bannerMapper;
	
	@Test
	public void addnew() {
		/**
		 * #{name},#{desc},#{status},
			#{createTime},#{updateTime}
		 */
		Banner banner = new Banner();
		banner.setName("首页底部轮播图");
		banner.setDesc("首页底部轮播图");
		banner.setCreateTime(new Date());
		banner.setUpdateTime(new Date());
		Integer rows = bannerMapper.addnew(banner);
		System.out.println("rows:"+rows);
	}
	
	@Test
	public void findById() {
		Integer id = 2;
		Banner banner = bannerMapper.findById(id);
		System.out.println("banner:"+banner);
	}
}
