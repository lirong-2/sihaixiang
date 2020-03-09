package cn.itsource.shx.mapper;

import java.util.List;

import cn.itsource.shx.entity.Cook;

/**
 * 厨师数据的持久层接口
 * @author Administrator
 *
 */
public interface CookMapper {
	/**
	 * 插入厨师数据
	 * @param cook 厨师数据
	 * @return 执行成功的行数
	 */
	Integer addnew(Cook cook);
	
	/**
	 * 查询星级前三的厨师数据
	 * @return 星级前三的厨师数据
	 */
	List<Cook> findByTopThree();
}
