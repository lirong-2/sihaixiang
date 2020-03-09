package cn.itsource.shx.service;

import cn.itsource.shx.entity.User;

/**
 * 用户数据的业务层接口
 * @author Administrator
 *
 */
public interface IUserService {
	/**
	 * 处理用户登录操作
	 * @param openId 微信唯一识别码
	 * @param nickname 昵称
	 * @param headerImg 头像
	 * @return 用户数据
	 */
	public User login(String openId,String nickname,String headerImg);
}
