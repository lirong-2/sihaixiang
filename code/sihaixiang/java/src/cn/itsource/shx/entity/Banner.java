package cn.itsource.shx.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 轮播图数据的实体类
 * @author Administrator
 *
 */
public class Banner implements Serializable{
	private static final long serialVersionUID = 8946184296492764283L;
	private Integer id;
	private String name;
	private String desc;
	private Integer status;
	private List<Img> imgs = new ArrayList<Img>();
	private Date createTime;
	private Date updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<Img> getImgs() {
		return imgs;
	}
	public void setImgs(List<Img> imgs) {
		this.imgs = imgs;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Banner [id=" + id + ", name=" + name + ", desc=" + desc + ", status=" + status + ", imgs=" + imgs
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}
