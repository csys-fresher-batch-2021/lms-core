package in.lmscore.validator;

public class EmployeeLeaveValidator {
	public static final String Invalid = "Invalid";
	public static final String valid = "valid";
	// code developed by Arun R
	// dont touch this code without my permission

	public static boolean empvalidate(String empCode) {
		if (empCode == null || empCode.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean leavevalidate(String leaveType) {
		if (leaveType == null || leaveType.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean leaveidvalidate(int leaveId) {

		if (leaveId == 0) {
			return false;
		} else {
			return true;
		}

	}

}