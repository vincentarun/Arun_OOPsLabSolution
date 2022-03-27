package com.greatlearning.ga1;

public class TechDepartment extends SuperDepartment {
	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String getTechStackInformation;

	public String departmentName() {

		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "core JAVA";
	}

}
