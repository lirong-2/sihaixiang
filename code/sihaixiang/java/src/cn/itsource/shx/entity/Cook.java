package cn.itsource.shx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 厨师数据的实体类
 * @author Administrator
 *
 */
public class Cook implements Serializable{
	private static final long serialVersionUID = -5955015214750539685L;
	private Integer id;
	private String name;
	private Integer headerId; //厨师头像和图片id
	private String headerUrl; //厨师头像和图片id的路径
	private Integer star;
	private String desc;
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
	public Integer getHeaderId() {
		return headerId;
	}
	public void setHeaderId(Integer headerId) {
		this.headerId = headerId;
	}
	public String getHeaderUrl() {
		return headerUrl;
	}
	public void setHeaderUrl(String headerUrl) {
		this.headerUrl = headerUrl;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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
		return "Cook [id=" + id + ", name=" + name + ", headerId=" + headerId + ", headerUrl=" + headerUrl + ", star="
				+ star + ", desc=" + desc + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}
