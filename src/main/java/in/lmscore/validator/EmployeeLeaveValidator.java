package in.lmscore.validator;

import java.time.LocalDate;

public class EmployeeLeaveValidator {
	public static final String Invalid = "Invalid";
	public static final String valid = "valid";

	public static boolean empvalidate(String empCode) throws Exception {
		if (empCode == null || empCode.trim().equals("")) {
			throw new Exception(Invalid);
		} else {
			throw new Exception(valid);
		}
	}

	public static boolean leavevalidate(String leaveType) throws Exception {
		if (leaveType == null || leaveType.trim().equals("")) {
			throw new Exception(Invalid);
		} else {
			throw new Exception(valid);
		}
	}

	public static int leaveidvalidate(int leaveId) throws Exception {
		if (leaveId == 0) {
			throw new Exception(Invalid);
		} else {
			throw new Exception(valid);
		}

	}

	public static boolean leavebalancecalculation(int totalLeave, int noofdays) throws Exception {
		int leaveBalance;
		leaveBalance = totalLeave - noofdays;
		return true;
	}

}