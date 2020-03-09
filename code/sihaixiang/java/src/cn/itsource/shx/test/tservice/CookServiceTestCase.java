package cn.itsource.shx.test.tservice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Cook;
import cn.itsource.shx.service.ICookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CookServiceTestCase {
	@Autowired
	private ICookService cookService;
	
	@Test
	public void getCooks() {
		List<Cook> cooks = cookService.getCooks();
		System.out.println("BEGIN:");
		for (Cook cook : cooks) {
			System.out.println("cook:"+cook);
		}
		System.out.println("END.");
	}
}
