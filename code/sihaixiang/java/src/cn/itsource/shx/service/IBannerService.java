package cn.itsource.shx.service;

import cn.itsource.shx.entity.Banner;

/**
 * 轮播图数据的业务层接口
 * @author Administrator
 *
 */
public interface IBannerService {
	/**
	 * 根据轮播图id获取轮播图数据
	 * @param id 轮播图id
	 * @return 轮播图数据
	 */
	Banner getBanner(Integer id);
}
