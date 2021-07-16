package com.mastek.profile.model;

public class jobDetail {

	protected String jobname;
	public String role;
	public float yearOfExperiance;
	public jobDetail() {
		super();
		
	}
	public jobDetail(String jobname, String role, float yearOfExperiance) {
		super();
		this.jobname = jobname;
		this.role = role;
		this.yearOfExperiance = yearOfExperiance;
	}
	@Override
	public String toString() {
		return "jobDetail [jobname=" + jobname + ", role=" + role + ", yearOfExperiance=" + yearOfExperiance + "]";
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getYearOfExperiance() {
		return yearOfExperiance;
	}
	public void setYearOfExperiance(float yearOfExperiance) {
		this.yearOfExperiance = yearOfExperiance;
	} 
	
	
}
