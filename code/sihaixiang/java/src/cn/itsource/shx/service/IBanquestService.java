package cn.itsource.shx.service;

import java.util.List;

import cn.itsource.shx.entity.Banquest;

/**
 * 餐宴的业务层接口
 * @author Administrator
 *
 */
public interface IBanquestService {
	/**
	 * 查询热度前三的餐宴数据
	 * @return 热度前三的餐宴数据
	 */
	List<Banquest> getBanquests();
}
