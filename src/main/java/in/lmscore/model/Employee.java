package in.lmscore.model;

import java.time.LocalDate;

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
		System.out.println("EmpCode : " + empCode);
		System.out.println("EmpName : " + empName);
		System.out.println("DOB : " + dob);
		System.out.println("Gender : " + gender);
		System.out.println("Dept : " + dept);
		System.out.println("Postn : " + postn);
		System.out.println("HireDate : " + hireDate);
		System.out.println("Place : " + place);
		System.out.println("MgrCode : " + mgrCode);
		System.out.println("EmpType : " + empType);
	}

	public Employee() {
		System.out.println("Constructor created for employee");

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
