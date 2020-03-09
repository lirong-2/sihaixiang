package cn.itsource.shx.test.tmapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itsource.shx.entity.Img;
import cn.itsource.shx.mapper.ImgMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ImgMapperTestCase {
	@Autowired
	private ImgMapper imgMapper;
	
	@Test
	public void addnew() {
		/*
		 * img_url,`desc`,genre,
			upload_time
		 */
		Img img = new Img();
		img.setImgUrl("http://localhost:8080/shx/img/w4.png");
		img.setDesc("这是描述！");
		img.setGenre(1);
		img.setUploadTime(new Date());
		Integer rows = imgMapper.addnew(img);
		System.out.println("rows:"+rows);
	}
	
	@Test
	public void findAllByBannerId() {
		Integer bannerId = 2;
		List<Img> imgs = imgMapper.findAllByBannerId(bannerId);
		System.out.println("BEGIN:");
		for (Img img : imgs) {
			System.out.println("img:"+img);
		}
		System.out.println("END.");
	}
	
	@Test
	public void findById() {
		Integer id = 12;
		Img img = imgMapper.findById(id);
		System.out.println("img:"+img);
	}
}






