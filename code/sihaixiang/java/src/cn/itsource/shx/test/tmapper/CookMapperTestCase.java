package cn.itsource.shx.test.tmapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Cook;
import cn.itsource.shx.mapper.CookMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CookMapperTestCase {
	@Autowired
	private CookMapper cookMapper;
	
	@Test
	public void addnew() {
		/*
		 * #{name},#{headerId},#{star},
			#{desc},#{createTime},#{updateTime}
		 */
		Cook cook = new Cook();
		cook.setName("李大厨");
		cook.setHeaderId(12);
		cook.setStar(2);
		cook.setDesc("好大厨");
		cook.setCreateTime(new Date());
		cook.setUpdateTime(new Date());
		Integer rows = cookMapper.addnew(cook);
		System.out.println("rows:"+rows);
	}
	
	@Test
	public void findByTopThree() {
		List<Cook> cooks = cookMapper.findByTopThree();
		System.out.println("BEGIN:");
		for (Cook cook : cooks) {
			System.out.println("cook:"+cook);
		}
		System.out.println("END.");
	}
}







