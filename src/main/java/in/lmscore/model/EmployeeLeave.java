package in.lmscore.model;

import java.time.LocalDate;

public class EmployeeLeave {
	static int leaveId;
	static String empCode;
	static String mgrCode;
	static String leaveType;
	static String leaveReason;
	static LocalDate leaveStartDate;
	static LocalDate leaveEndDate;
	static int noofdays;
	static int totalLeave;
	static int leaveBalance;
	static String status;

	public void display(int leaveId, String empCode, String mgrCode, String leaveType, String leaveReason,
			LocalDate leaveStartDate, LocalDate leaveEndDate, int noofdays, int totalLeave, int leaveBalance,
			String status) {
		/*
		 * this.leaveId = leaveId; this.empCode = empCode; this.mgrCode = mgrCode;
		 * this.leaveType = leaveType; this.leaveReason = leaveReason;
		 * this.leaveStartDate = leaveStartDate; this.leaveEndDate = leaveEndDate;
		 * this.totalAnnualLeave = totalAnnualLeave; this.status = status;
		 */
		System.out.println("LeaveId : " + leaveId);
		System.out.println("EmployeeCode : " + empCode);
		System.out.println("ManagerCode : " + mgrCode);
		System.out.println("LeaveType : " + leaveType);
		System.out.println("LeaveReason : " + leaveReason);
		System.out.println("LeaveStartDate : " + leaveStartDate);
		System.out.println("LeaveEndDate : " + leaveEndDate);
		System.out.println("No.of.days : " + noofdays);
		System.out.println("TotalLeave : " + totalLeave);
		System.out.println("LeaveBalance :" + leaveBalance);
		System.out.println("Status : " + status);

	}

	@Override
	public String toString() {
		return "Employee [leaveId : " + leaveId + "empCode : " + empCode + "mgrCode :" + mgrCode + "leaveType: "
				+ leaveType + "leaveReason: " + leaveReason + "leaveStartDate :" + leaveStartDate + "leaveEndDate: "
				+ leaveEndDate + "noofdays : " + noofdays + "totalLeave: " + totalLeave + "leaveBalance : "
				+ leaveBalance + "status: " + status + "]";
	}
}
