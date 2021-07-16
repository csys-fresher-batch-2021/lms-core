package in.lmscore.validator;

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
			System.out.println("You can add new employee");
		} else {
			System.out.println("You cannot add new employee");
		}
	}

	public static void checkempvalidate(String user_type) throws Exception {
		if (user_type == "Employee") {
			System.out.println("Inserted Successfully");
			// ("Inserted Successfully");
		} else {
			System.out.println("user_type is not valid");
		}
	}
}
