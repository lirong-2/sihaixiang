package cn.itsource.shx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itsource.shx.entity.Cook;
import cn.itsource.shx.entity.Img;
import cn.itsource.shx.mapper.CookMapper;
import cn.itsource.shx.mapper.ImgMapper;
import cn.itsource.shx.service.ICookService;
/**
 * 厨师数据的业务层
 * @author Administrator
 *
 */
@Service
public class CookServiceImpl implements ICookService{
	@Autowired
	private CookMapper cookMapper;
	
	@Autowired
	private ImgMapper imgMapper;
	
	@Override
	public List<Cook> getCooks() {
		//获取星级前三的厨师数据
		List<Cook> cooks = findByTopThree();
		//循环调用每个厨师数据
		for (Cook cook : cooks) {
			//根据厨师数据中的头像id在图片持久层中获取图片路径
			String headerUrl = findById(cook.getHeaderId()).getImgUrl();
			//补充厨师数据中的图片路径
			cook.setHeaderUrl(headerUrl);
		}
		return cooks;
	}
	
	/**
	 * 查询星级前三的厨师数据
	 * @return 星级前三的厨师数据
	 */
	private List<Cook> findByTopThree(){
		return cookMapper.findByTopThree();
	}
	
	/**
	 * 根据图片id获取图片数据
	 * @param id
	 * @return
	 */
	private Img findById(Integer id) {
		return imgMapper.findById(id);
	}

}
