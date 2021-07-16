package com.mastek.hrmgnt.model;

public class Employee {
	private String Ename,designation;
	private int Eno;
	public String getEname() {
		return Ename;
	}
	public String getDesignation() {
		return designation;
	}
	public int getEno() {
		return Eno;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setEno(int eno) {
		Eno = eno;
	}

}
