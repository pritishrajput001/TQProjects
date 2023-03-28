package com.crud;

public class Student {
	private int sid;
	private String name;
	private int age;
	private Course course;

	public Student() {

	}

	public Student(int sid, String name, int age, Course course) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}

}
