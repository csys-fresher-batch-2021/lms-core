package in.lmscore.model;

public class EmpLeaveBalance {

    int leaveId;
	String empCode;
	int leaveBalance;

	@Override
	public String toString() {
		return "EmpLeaveBalance [leaveId=" + leaveId + ", empCode=" + empCode + ", leaveBalance=" + leaveBalance + "]";
	}

	public EmpLeaveBalance(int leaveId, String empCode, int leaveBalance) {
		super();
		this.leaveId = leaveId;
		this.empCode = empCode;
		this.leaveBalance = leaveBalance;
	}

}
