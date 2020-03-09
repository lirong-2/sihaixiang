package cn.itsource.shx.service;

import java.util.List;

import cn.itsource.shx.entity.Cook;

/**
 * 厨师数据的业务层接口
 * @author Administrator
 *
 */
public interface ICookService {
	/**
	 * 查询星级前三的厨师数据
	 * @return 星级前三的厨师数据
	 */
	List<Cook> getCooks();
}
