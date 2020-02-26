package com.sunmengjie.pojo;

import java.io.Serializable;

public class Sun implements Serializable{

	private String dt1;
	private String dt2;
	private String select;
	public Sun(String dt1, String dt2, String select) {
		super();
		this.dt1 = dt1;
		this.dt2 = dt2;
		this.select = select;
	}
	public Sun() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDt1() {
		return dt1;
	}
	public void setDt1(String dt1) {
		this.dt1 = dt1;
	}
	public String getDt2() {
		return dt2;
	}
	public void setDt2(String dt2) {
		this.dt2 = dt2;
	}
	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}
	@Override
	public String toString() {
		return "Sun [dt1=" + dt1 + ", dt2=" + dt2 + ", select=" + select + "]";
	}
	
	
}
