package com.dbkj.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}

	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return getStr("name");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setCharge(java.math.BigDecimal charge) {
		set("charge", charge);
	}

	public java.math.BigDecimal getCharge() {
		return get("charge");
	}

	public void setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
	}

	public java.lang.Long getRoleId() {
		return getLong("role_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setModifyTime(java.util.Date modifyTime) {
		set("modify_time", modifyTime);
	}

	public java.util.Date getModifyTime() {
		return get("modify_time");
	}

	public void setAvailable(java.lang.Boolean available) {
		set("available", available);
	}

	public java.lang.Boolean getAvailable() {
		return get("available");
	}

}
