package cn.itsource.shx.mapper;

import java.util.List;

import cn.itsource.shx.entity.Wish;

/**
 * 心愿单数据的持久层接口
 * @author Administrator
 *
 */
public interface WishMapper {
	/**
	 * 查询心愿单列表
	 * @return
	 */
	List<Wish> findWishByOpenId(String openId);
}
