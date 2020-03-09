package cn.itsource.shx.mapper;

import cn.itsource.shx.entity.Banner;

/**
 * 轮播图数据的持久层接口
 * @author Administrator
 *
 */
public interface BannerMapper {
	/**
	 * 插入轮播图数据
	 * @param banner 轮播图数据
	 * @return 执行成功的行数
	 */
	Integer addnew(Banner banner);
	
	/**
	 * 通过轮播图id获取轮播图数据
	 * @param id 轮播图id
	 * @return 轮播图数据
	 */
	Banner findById(Integer id);
}
