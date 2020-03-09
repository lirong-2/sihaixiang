package cn.itsource.shx.service.impl;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itsource.shx.entity.User;
import cn.itsource.shx.mapper.UserMapper;
import cn.itsource.shx.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;
	
	public User login(String openId,String nickname,String headerImg) {
		//根据openId查询用户数据
		User data = findByOpenId(openId);
		//判断用户数据是否为空
		User user = new User();
		if(Objects.isNull(data)) {
			//是：执行插入操作
			user.setOpenId(openId);
			user.setNickname(nickname);
			user.setHeaderImg(headerImg);
			user.setRegisterTime(new Date());
			user.setLastLoginTime(new Date());
			insert(user);
		}else {
			//否：执行更新操作
			user.setOpenId(openId);
			user.setNickname(nickname);
			user.setHeaderImg(headerImg);
			user.setLastLoginTime(new Date());
			update(user);
		}
		return user;
	}
	
	/**
	 * 用户数据的插入（第一次登录）
	 * @param user 用户数据
	 */
	private void insert(User user) {
		//下次处理异常
		userMapper.addnew(user);
	}
	
	/**
	 * 根据微信唯一识别码（openId）查询用户数据
	 * @param openId 微信唯一识别码
	 * @return 用户数据
	 */
	private User findByOpenId(String openId) {
		return userMapper.findByOpenId(openId);
	}
	
	/**
	 * 根据用户数据更新用户数据（非第一次登录）
	 * @param user 提交的用户数据
	 */
	private void update(User user) {
		//下次处理异常
		userMapper.update(user);
	}
}
