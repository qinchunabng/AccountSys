package com.dbkj.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserAuth<M extends BaseUserAuth<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setAuthName(java.lang.String authName) {
		set("auth_name", authName);
	}

	public java.lang.String getAuthName() {
		return getStr("auth_name");
	}

	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}

	public java.lang.String getDesc() {
		return getStr("desc");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setParentId(java.lang.Integer parentId) {
		set("parent_id", parentId);
	}

	public java.lang.Integer getParentId() {
		return getInt("parent_id");
	}

	public void setMenu(java.lang.Boolean menu) {
		set("menu", menu);
	}

	public java.lang.Boolean getMenu() {
		return get("menu");
	}

	public void setOrder(java.lang.Integer order) {
		set("order", order);
	}

	public java.lang.Integer getOrder() {
		return getInt("order");
	}

}
