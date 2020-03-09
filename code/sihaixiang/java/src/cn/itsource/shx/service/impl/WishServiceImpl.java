package cn.itsource.shx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itsource.shx.entity.Banquest;
import cn.itsource.shx.entity.Img;
import cn.itsource.shx.entity.Wish;
import cn.itsource.shx.mapper.BanquestMapper;
import cn.itsource.shx.mapper.ImgMapper;
import cn.itsource.shx.mapper.WishMapper;
import cn.itsource.shx.service.IWishService;

/**
 * 心愿单数据的业务层接口
 * @author Administrator
 *
 */
@Service
public class WishServiceImpl implements IWishService{
	@Autowired
	private WishMapper wishMapper;
	
	@Autowired
	private BanquestMapper banquestMapper;
	
	@Autowired
	private ImgMapper imgMapper;

	@Override
	public List<Wish> findWishs(String openId) {
		//根据用户微信唯一识别码查询到所有收藏
		List<Wish> wishs = findWishByOpenId(openId);
		//补充其他数据
		/*
		 * private String banquestTitle;
	private Integer price;
	private Integer hot;
	private String imgUrl;
		 */
		Banquest banquest;
		Img img;
		for (Wish wish : wishs) {
			banquest = findByBanquestId(wish.getBanquestId());
			img = findByImgId(banquest.getImgId());
			wish.setBanquestTitle(banquest.getTitle());
			wish.setPrice(banquest.getPrice());
			wish.setHot(banquest.getHot());
			wish.setImgUrl(img.getImgUrl());
		}
		return wishs;
	}
	
	/**
	 * 查询心愿单列表
	 * @return
	 */
	private List<Wish> findWishByOpenId(String openId){
		return wishMapper.findWishByOpenId(openId);
	}
	
	/**
	 * 根据餐宴id查询餐宴数据
	 * @param id
	 * @return
	 */
	private Banquest findByBanquestId(Integer id) {
		return banquestMapper.findById(id);
	}
	
	/**
	 * 根据图片id获取图片数据
	 * @param id
	 * @return
	 */
	private Img findByImgId(Integer id) {
		return imgMapper.findById(id);
	}

}
