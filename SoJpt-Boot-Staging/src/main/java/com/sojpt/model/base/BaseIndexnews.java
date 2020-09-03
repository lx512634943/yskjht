package com.sojpt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseIndexnews<M extends BaseIndexnews<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setNewsname(java.lang.String newsname) {
		set("newsname", newsname);
	}
	
	public java.lang.String getNewsname() {
		return getStr("newsname");
	}

	public void setPhotos(java.lang.String photos) {
		set("photos", photos);
	}
	
	public java.lang.String getPhotos() {
		return getStr("photos");
	}

	public void setNid(java.lang.Integer nid) {
		set("nid", nid);
	}
	
	public java.lang.Integer getNid() {
		return getInt("nid");
	}

}