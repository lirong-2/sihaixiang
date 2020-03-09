package cn.itsource.shx.service;

import java.util.List;

import cn.itsource.shx.entity.Wish;

/**
 * 心愿单数据的业务层接口
 * @author Administrator
 *
 */
public interface IWishService {
	/**
	 * 查询心愿单列表
	 * @return
	 */
	List<Wish> findWishs(String openId);
}
