package cn.itsource.shx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户数据的实体类
 * @author Administrator
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = -2782075173007481657L;
	private Integer id;
	private String openId;
	private String nickname;
	private String headerImg;
	private String telphone;
	private Date registerTime;
	private Date lastLoginTime;
	private String sessionKey;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHeaderImg() {
		return headerImg;
	}
	public void setHeaderImg(String headerImg) {
		this.headerImg = headerImg;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", openId=" + openId + ", nickname=" + nickname + ", headerImg=" + headerImg
				+ ", telphone=" + telphone + ", registerTime=" + registerTime + ", lastLoginTime=" + lastLoginTime
				+ ", sessionKey=" + sessionKey + "]";
	}
}
