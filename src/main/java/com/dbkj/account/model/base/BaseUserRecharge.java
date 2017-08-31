package com.dbkj.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserRecharge<M extends BaseUserRecharge<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUserid(java.lang.Integer userid) {
		set("userid", userid);
	}

	public java.lang.Integer getUserid() {
		return getInt("userid");
	}

	public void setTime(java.util.Date time) {
		set("time", time);
	}

	public java.util.Date getTime() {
		return get("time");
	}

	public void setCharge(java.math.BigDecimal charge) {
		set("charge", charge);
	}

	public java.math.BigDecimal getCharge() {
		return get("charge");
	}

	public void setRealcharge(java.math.BigDecimal realcharge) {
		set("realcharge", realcharge);
	}

	public java.math.BigDecimal getRealcharge() {
		return get("realcharge");
	}

	public void setChargetype(java.lang.Integer chargetype) {
		set("chargetype", chargetype);
	}

	public java.lang.Integer getChargetype() {
		return getInt("chargetype");
	}

	public void setSerialnum(java.lang.String serialnum) {
		set("serialnum", serialnum);
	}

	public java.lang.String getSerialnum() {
		return getStr("serialnum");
	}

	public void setChargeuser(java.lang.Long chargeuser) {
		set("chargeuser", chargeuser);
	}

	public java.lang.Long getChargeuser() {
		return getLong("chargeuser");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return getStr("remark");
	}

}