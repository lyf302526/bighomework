package org.big.domain;

import java.io.Serializable;

public class Manager implements Serializable{
	private Integer id;			// id
	private String loginname;	// 登录名
	private String password;	// 密码
	public  Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", loginname=" + loginname + ", password="
				+ password + "]";
	}
}

