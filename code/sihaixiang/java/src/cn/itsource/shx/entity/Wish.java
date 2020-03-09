package cn.itsource.shx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 心愿单数据的实体类
 * @author Administrator
 *
 */
public class Wish implements Serializable{
	private static final long serialVersionUID = 5766496076737613834L;
	private Integer id;
	private String openId;
	private Integer banquestId;
	private String banquestTitle;
	private Integer price;
	private Integer hot;
	private String imgUrl;
	private Date addTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Integer getBanquestId() {
		return banquestId;
	}
	public void setBanquestId(Integer banquestId) {
		this.banquestId = banquestId;
	}
	public String getBanquestTitle() {
		return banquestTitle;
	}
	public void setBanquestTitle(String banquestTitle) {
		this.banquestTitle = banquestTitle;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getHot() {
		return hot;
	}
	public void setHot(Integer hot) {
		this.hot = hot;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "Wish [id=" + id + ", openId=" + openId + ", banquestId=" + banquestId + ", banquestTitle="
				+ banquestTitle + ", price=" + price + ", hot=" + hot + ", imgUrl=" + imgUrl + ", addTime=" + addTime
				+ "]";
	}
}
