package cn.itsource.shx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.itsource.shx.entity.Banner;
import cn.itsource.shx.entity.Banquest;
import cn.itsource.shx.entity.Cook;
import cn.itsource.shx.entity.OpenIdJson;
import cn.itsource.shx.entity.User;
import cn.itsource.shx.entity.Wish;
import cn.itsource.shx.service.IBannerService;
import cn.itsource.shx.service.IBanquestService;
import cn.itsource.shx.service.ICookService;
import cn.itsource.shx.service.IUserService;
import cn.itsource.shx.service.IWishService;
import cn.itsource.shx.util.HttpUtil;

/**
 * shx的控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/shx")
public class ShxController {
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IBannerService bannerService;
	
	@Autowired
	private ICookService cookService;
	
	@Autowired
	private IBanquestService banquestService;
	
	@Autowired
	private IWishService wishService;
	
	@ResponseBody
	@RequestMapping("/login")
	public User login(@RequestParam("code") String code,@RequestParam("nickname") String nickname,
			@RequestParam("headerImg") String headerImg) {
		String APPID = "wxd075cb8970fbbbf5";
		String SECRET = "0ac2fad6e2c6b6c4f70ebfda762e8c50";
		String url = "https://api.weixin.qq.com/sns/jscode2session?"
		+"appid="+APPID+"&secret="+SECRET+"&js_code="+code+"&grant_type=authorization_code";
		try {
			String result = HttpUtil.doGet(url, null);
			System.out.println("result:"+result);
			ObjectMapper mapper = new ObjectMapper();
			OpenIdJson openIdJson = mapper.readValue(result, OpenIdJson.class);
			System.out.println(openIdJson.getOpenid());
			
			//执行login业务
			User user = userService.login(openIdJson.getOpenid(), nickname, headerImg);
			user.setSessionKey(openIdJson.getSession_key());
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/banner")
	public Banner getBanner(Integer id) {
		Banner banner = bannerService.getBanner(id);
		return banner;
	}
	
	@ResponseBody
	@RequestMapping("/cook")
	public List<Cook> getCooks(){
		List<Cook> cooks = cookService.getCooks();
		return cooks;
	}
	
	@ResponseBody
	@RequestMapping("/banquest")
	public List<Banquest> getBanquests(){
		List<Banquest> banquests = banquestService.getBanquests();
		return banquests;
	}
	
	@ResponseBody
	@RequestMapping("/wish")
	public List<Wish> getWishs(String openId){
		List<Wish> wishs = wishService.findWishs(openId);
		return wishs;
	}
}











