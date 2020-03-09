package cn.itsource.shx.test.tservice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Banquest;
import cn.itsource.shx.service.IBanquestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BanquestServiceTestCase {
	@Autowired
	private IBanquestService banquestService;
	
	@Test
	public void getBanquests() {
		List<Banquest> banquests = banquestService.getBanquests();
		System.out.println("BEGIN:");
		for (Banquest banquest : banquests) {
			System.out.println("banquest:"+banquest);
		}
		System.out.println("END.");
	}
}
