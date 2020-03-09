package cn.itsource.shx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片数据的实体类
 * @author Administrator
 *
 */
public class Img implements Serializable{
	private static final long serialVersionUID = 7113329463197942232L;
	private Integer id;
	private String imgUrl;
	private String desc;
	private Integer genre; //类别 0--banner 1--餐宴 2--食材 3--菜品4--其他
	private Date uploadTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getGenre() {
		return genre;
	}
	public void setGenre(Integer genre) {
		this.genre = genre;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	@Override
	public String toString() {
		return "Img [id=" + id + ", imgUrl=" + imgUrl + ", desc=" + desc + ", genre=" + genre + ", uploadTime="
				+ uploadTime + "]";
	}
}
