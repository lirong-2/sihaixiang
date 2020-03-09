package cn.itsource.shx.test.tmapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Banquest;
import cn.itsource.shx.mapper.BanquestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BanquestMapperTestCase {
	@Autowired
	private BanquestMapper banquestMapper;
	
	@Test
	public void addnew() {
		/*
		 * #{title},#{desc},#{hot},
			#{price},#{imgId},#{genre},
			#{status},#{createTime},#{updateTime}
		 */
		Banquest banquest = new Banquest();
		banquest.setTitle("老干妈");
		banquest.setDesc("好吃");
		banquest.setHot(4201);
		banquest.setPrice(425);
		banquest.setImgId(32);
		banquest.setGenre(1);
		banquest.setStatus(0);
		banquest.setCreateTime(new Date());
		banquest.setUpdateTime(new Date());
		Integer rows = banquestMapper.addnew(banquest);
		System.out.println("rows:"+rows);
	}
	
	@Test
	public void findByTopThree() {
		List<Banquest> banquests = banquestMapper.findByTopThree();
		System.out.println("BEGIN:");
		for (Banquest banquest : banquests) {
			System.out.println("banquest:"+banquest);
		}
		System.out.println("END.");
	}
	
	@Test
	public void findById() {
		Integer id = 4;
		Banquest banquest = banquestMapper.findById(id);
		System.out.println("banquest:"+banquest);
	}
}







