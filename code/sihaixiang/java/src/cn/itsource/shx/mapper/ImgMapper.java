package cn.itsource.shx.mapper;

import java.util.List;

import cn.itsource.shx.entity.Img;

/**
 * 图片数据的持久层接口
 * @author Administrator
 *
 */
public interface ImgMapper {
	/**
	 * 插入图片数据
	 * @param img 图片数据
	 * @return 执行成功的行数
	 */
	Integer addnew(Img img);
	
	/**
	 * 根据轮播图id获取对应所有图片
	 * @param bannerId 轮播图id
	 * @return 对应所有图片
	 */
	List<Img> findAllByBannerId(Integer bannerId);
	
	/**
	 * 根据图片id获取图片数据
	 * @param id
	 * @return
	 */
	Img findById(Integer id);
}
