package in.lmscore.model;

import java.sql.Date;

public class GroupEmpDetails {

	String empCode;
	String empName;
	Date   dob;
	String gender;
	String department;
	String position;
	Date   hireDate;
	String place;
	String managerCode;
	String empType;

	@Override
	public String toString() {
		return "GroupEmpDetails [empCode=" + empCode + ", empName=" + empName + ", dob=" + dob + ", gender=" + gender
				+ ", department=" + department + ", position=" + position + ", hireDate=" + hireDate + ", place="
				+ place + ", managerCode=" + managerCode + ", empType=" + empType + "]";
	}

	public GroupEmpDetails(String empCode, String empName, Date dob, String gender, String department, String position,
			Date hireDate, String place, String managerCode, String empType) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.dob = dob;
		this.gender = gender;
		this.department = department;
		this.position = position;
		this.hireDate = hireDate;
		this.place = place;
		this.managerCode = managerCode;
		this.empType = empType;
	}

}
