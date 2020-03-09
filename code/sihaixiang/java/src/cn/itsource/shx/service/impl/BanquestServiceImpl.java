package cn.itsource.shx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itsource.shx.entity.Banquest;
import cn.itsource.shx.entity.Img;
import cn.itsource.shx.mapper.BanquestMapper;
import cn.itsource.shx.mapper.ImgMapper;
import cn.itsource.shx.service.IBanquestService;
/**
 * 餐宴数据的业务层
 * @author Administrator
 *
 */
@Service
public class BanquestServiceImpl implements IBanquestService{
	@Autowired
	private BanquestMapper banquestMapper;
	
	@Autowired
	private ImgMapper imgMapper;

	@Override
	public List<Banquest> getBanquests() {
		//获取热度前三的餐宴数据
		List<Banquest> banquests = findByTopThree();
		//判断餐宴数据是否为空，空则抛异常，这里不处理，默认能找到
		//根据图片数据获取图片地址补充到餐宴中
		for (Banquest banquest : banquests) {
			String imgUrl = findById(banquest.getImgId()).getImgUrl();
			banquest.setImgUrl(imgUrl);
		}
		return banquests;
	}
	
	/**
	 * 查询热度前三的餐宴数据
	 * @return 热度前三的餐宴数据
	 */
	private List<Banquest> findByTopThree(){
		return banquestMapper.findByTopThree();
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
