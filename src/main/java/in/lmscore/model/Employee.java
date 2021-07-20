package in.lmscore.model;

import java.time.LocalDate;

import in.lmscore.util.Logger;

public class Employee {

	// don't touch the command line
	/*
	 * code developed by Arun R 09-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */

	String empCode;
	String empName;
	LocalDate dob;
	String gender;
	String dept;
	String postn;
	LocalDate hireDate;
	String place;
	String mgrCode;
	String empType;

	public void display(String empCode, String empName, LocalDate dob, String gender, String dept, String postn,
			LocalDate hireDate, String place, String mgrCode, String empType) {
		Logger.debug("EmpCode : " + empCode);
		Logger.debug("EmpName : " + empName);
		Logger.debug("DOB : " + dob);
		Logger.debug("Gender : " + gender);
		Logger.debug("Dept : " + dept);
		Logger.debug("Postn : " + postn);
		Logger.debug("HireDate : " + hireDate);
		Logger.debug("Place : " + place);
		Logger.debug("MgrCode : " + mgrCode);
		Logger.debug("EmpType : " + empType);
	}

	public Employee() {
		Logger.debug("Constructor created for employee");
	}

	public Employee(String empCode, String empName, LocalDate dob, String gender, String dept, String postn,
			LocalDate hireDate, String place, String mgrCode, String empType) {
		this.empCode = empCode;
		this.empName = empName;
		this.dob = dob;
		this.gender = gender;
		this.dept = dept;
		this.postn = postn;
		this.hireDate = hireDate;
		this.place = place;
		this.mgrCode = mgrCode;
		this.empType = empType;

	}

	@Override
	public String toString() {
		return "Employee [empcode : " + empCode + "empName : " + empName + "dob :" + dob + "gender: " + gender
				+ "dept: " + dept + "postn :" + postn + "hireDate: " + hireDate + "place: " + place + "mgrCode: "
				+ mgrCode + "empType: " + empType + "]";
	}
}
