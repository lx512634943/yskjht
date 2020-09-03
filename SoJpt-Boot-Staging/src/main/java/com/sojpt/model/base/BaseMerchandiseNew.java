package com.sojpt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMerchandiseNew<M extends BaseMerchandiseNew<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setCommodityName(java.lang.String commodityName) {
		set("commodity_name", commodityName);
	}
	
	public java.lang.String getCommodityName() {
		return getStr("commodity_name");
	}

	public void setContainerNumber(java.lang.String containerNumber) {
		set("container_number", containerNumber);
	}
	
	public java.lang.String getContainerNumber() {
		return getStr("container_number");
	}

	public void setUnit(java.lang.String unit) {
		set("unit", unit);
	}
	
	public java.lang.String getUnit() {
		return getStr("unit");
	}

	public void setInventory(java.lang.Integer inventory) {
		set("inventory", inventory);
	}
	
	public java.lang.Integer getInventory() {
		return getInt("inventory");
	}

	public void setPurchase(java.lang.String purchase) {
		set("purchase", purchase);
	}
	
	public java.lang.String getPurchase() {
		return getStr("purchase");
	}

	public void setMoney(java.lang.String money) {
		set("money", money);
	}
	
	public java.lang.String getMoney() {
		return getStr("money");
	}

	public void setGet(java.lang.Integer get) {
		set("get", get);
	}
	
	public java.lang.Integer getGet() {
		return getInt("get");
	}

	public void setGetPeopel(java.lang.String getPeopel) {
		set("get_peopel", getPeopel);
	}
	
	public java.lang.String getGetPeopel() {
		return getStr("get_peopel");
	}

	public void setGetTime(java.util.Date getTime) {
		set("get_time", getTime);
	}
	
	public java.util.Date getGetTime() {
		return get("get_time");
	}

	public void setResidue(java.lang.Integer residue) {
		set("residue", residue);
	}
	
	public java.lang.Integer getResidue() {
		return getInt("residue");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setMerchandisetypeid(java.lang.Integer merchandisetypeid) {
		set("merchandisetypeId", merchandisetypeid);
	}
	
	public java.lang.Integer getMerchandisetypeid() {
		return getInt("merchandisetypeId");
	}

}