package com.dbkj.account.dic;

public enum UserType {
	USER(0,"普通用户"),
	ADMIN(1,"管理员");
	
	
	private UserType(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}
	private int value;
	private String desc;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
