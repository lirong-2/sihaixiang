package cn.itsource.shx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itsource.shx.entity.Banner;
import cn.itsource.shx.entity.Img;
import cn.itsource.shx.mapper.BannerMapper;
import cn.itsource.shx.mapper.ImgMapper;
import cn.itsource.shx.service.IBannerService;
/**
 * 轮播图数据的业务层
 * @author Administrator
 *
 */
@Service
public class BannerServiceImpl implements IBannerService{
	@Autowired
	private BannerMapper bannerMapper;
	
	@Autowired
	private ImgMapper imgMapper;
	
	@Override
	public Banner getBanner(Integer id) {
		//根据轮播图id获取轮播图数据
		Banner data = findById(id);
		//判断是否为空，这里异常不加处理
		//补充图片数据到轮播图中
		List<Img> imgs = findAllByBannerId(id);
		data.setImgs(imgs);
		return data;
	}
	
	/**
	 * 通过轮播图id获取轮播图数据
	 * @param id 轮播图id
	 * @return 轮播图数据
	 */
	private Banner findById(Integer id) {
		return bannerMapper.findById(id);
	}
	
	/**
	 * 根据轮播图id获取对应所有图片
	 * @param bannerId 轮播图id
	 * @return 对应所有图片
	 */
	private List<Img> findAllByBannerId(Integer bannerId){
		return imgMapper.findAllByBannerId(bannerId);
	}

}
