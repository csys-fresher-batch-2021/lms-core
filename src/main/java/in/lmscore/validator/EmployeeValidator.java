package in.lmscore.validator;
import in.lmscore.util.Logger;

public class EmployeeValidator {
	// don't touch the command line
	/*
	 * code developed by Arun R 09-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */

	public static boolean empvalidate(String empCode) throws Exception {
		if (empCode == null || empCode.trim().equals("")) {
			throw new Exception("Invalid");
		} else {
			throw new Exception("valid");
		}
	}

	public static void emptypevalidate(String user_type) throws Exception {
		if (user_type == "Admin") {
			Logger.debug("You can add new employee");
		} else {
			Logger.debug("You cannot add new employee");
		}
	}

	public static void checkempvalidate(String user_type) throws Exception {
		if (user_type == "Employee") {
			Logger.debug("Inserted Successfully");
			// ("Inserted Successfully");
		} else {
			Logger.debug("user_type is not valid");
		}
	}
}
