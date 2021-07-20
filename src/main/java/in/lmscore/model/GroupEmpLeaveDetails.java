package in.lmscore.model;

import java.sql.Date;

public class GroupEmpLeaveDetails {

	int leaveId;
	String empCode;
	String empType1;
	Date leaveStartDate;
	Date leaveEndtDate;
	int noOfDays;
	String leaveReason;
	String status;
	int leaveBalance;

	@Override
	public String toString() {
		return "GroupEmpLeaveDetails [leaveId=" + leaveId + ", empCode=" + empCode + ", empType1=" + empType1
				+ ", leaveStartDate=" + leaveStartDate + ", leaveEndtDate=" + leaveEndtDate + ", noOfDays=" + noOfDays
				+ ", leaveReason=" + leaveReason + ", status=" + status + ", leaveBalance=" + leaveBalance + "]";
	}

	public GroupEmpLeaveDetails(int leaveId, String empCode, String empType1, Date leaveStartDate2, Date leaveEndDate,
			int noOfDays, String leaveReason, String status) {
		super();
		this.leaveId = leaveId;
		this.empCode = empCode;
		this.empType1 = empType1;
		this.leaveStartDate = leaveStartDate2;
		this.leaveEndtDate = leaveEndDate;
		this.noOfDays = noOfDays;
		this.leaveReason = leaveReason;
		this.status = status;
	}

}
