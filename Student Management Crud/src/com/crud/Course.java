package com.crud;

public class Course {
	private int cid;
	private String cname;
	private float cfees;

	public Course() {

	}

	public Course(int cid, String cname, float cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getCfees() {
		return cfees;
	}

	public void setCfees(float cfees) {
		this.cfees = cfees;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}
}
