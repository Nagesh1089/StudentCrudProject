package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="StudentDetails")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;

	@Column
	String fname;
	
	@Column
	String lname;
	
	@Column
	String  branch;
	
	@Column
	int age;

	public int getSId() {
		return sid;
	}

	public void setSId(int id) {
		this.sid = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fame) {
		this.fname = fame;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	

	public Student(int sid, String fname, String lname, String branch, int age) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.branch = branch;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", branch=" + branch + ", age=" + age
				+ "]";
	}

	
	
	
	
}
