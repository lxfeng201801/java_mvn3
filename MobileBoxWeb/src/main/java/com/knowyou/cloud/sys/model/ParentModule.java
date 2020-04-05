package com.knowyou.cloud.sys.model;

import java.util.List;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月18日 上午10:08:34
 * @version 1.0
 */
public class ParentModule {

	private int id;

	private int gid;

	private String name;

	private int pid;

	private String url;

	private String ico;

	private List<ParentModule> child;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public List<ParentModule> getChild() {
		return child;
	}

	public void setChild(List<ParentModule> child) {
		this.child = child;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
