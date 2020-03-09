package cn.itsource.shx.entity;

import java.io.Serializable;

/**
 * openid的实体类
 * @author Administrator
 *
 */
public class OpenIdJson implements Serializable{
	private static final long serialVersionUID = 6422031980342381898L;
	private String session_key;
	private String openid;
	public String getSession_key() {
		return session_key;
	}
	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	@Override
	public String toString() {
		return "OpenIdJson [session_key=" + session_key + ", openid=" + openid + "]";
	}
}
