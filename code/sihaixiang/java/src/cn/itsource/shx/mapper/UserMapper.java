package cn.itsource.shx.mapper;

import cn.itsource.shx.entity.User;

/**
 * 用户数据的持久层接口
 * @author Administrator
 *
 */
public interface UserMapper {
	/**
	 * 用户数据的插入（第一次登录）
	 * @param user 用户数据
	 * @return 执行成功的行数
	 */
	Integer addnew(User user);
	
	/**
	 * 根据微信唯一识别码（openId）查询用户数据
	 * @param openId 微信唯一识别码
	 * @return 用户数据
	 */
	User findByOpenId(String openId);
	
	/**
	 * 根据用户数据更新用户数据（非第一次登录）
	 * @param user 提交的用户数据
	 * @return 用户数据
	 */
	Integer update(User user);
}
