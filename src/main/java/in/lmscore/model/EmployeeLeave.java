package in.lmscore.model;

import java.time.LocalDate;
import in.lmscore.util.Logger;

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
		Logger.debug("LeaveId : " + leaveId);
		Logger.debug("EmployeeCode : " + empCode);
		Logger.debug("ManagerCode : " + mgrCode);
		Logger.debug("LeaveType : " + leaveType);
		Logger.debug("LeaveReason : " + leaveReason);
		Logger.debug("LeaveStartDate : " + leaveStartDate);
		Logger.debug("LeaveEndDate : " + leaveEndDate);
		Logger.debug("No.of.days : " + noofdays);
		Logger.debug("TotalLeave : " + totalLeave);
		Logger.debug("LeaveBalance :" + leaveBalance);
		Logger.debug("Status : " + status);

	}

	@Override
	public String toString() {
		return "Employee [leaveId : " + leaveId + "empCode : " + empCode + "mgrCode :" + mgrCode + "leaveType: "
				+ leaveType + "leaveReason: " + leaveReason + "leaveStartDate :" + leaveStartDate + "leaveEndDate: "
				+ leaveEndDate + "noofdays : " + noofdays + "totalLeave: " + totalLeave + "leaveBalance : "
				+ leaveBalance + "status: " + status + "]";
	}
}
