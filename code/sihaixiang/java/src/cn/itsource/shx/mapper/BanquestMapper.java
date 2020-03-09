package cn.itsource.shx.mapper;

import java.util.List;

import cn.itsource.shx.entity.Banquest;

/**
 * 餐宴数据的持久层接口
 * @author Administrator
 *
 */
public interface BanquestMapper {
	/**
	 * 插入餐宴数据
	 * @param banquest
	 * @return
	 */
	Integer addnew(Banquest banquest);
	
	/**
	 * 查询热度前三的餐宴数据
	 * @return 热度前三的餐宴数据
	 */
	List<Banquest> findByTopThree();
	
	/**
	 * 根据餐宴id查询餐宴数据
	 * @param id
	 * @return
	 */
	Banquest findById(Integer id);
}
