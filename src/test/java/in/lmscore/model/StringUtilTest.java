package in.lmscore.model;

import in.lmscore.util.Logger;

public class StringUtilTest {
	// If any Changes in this Code inform to me
	/*
	 * code developed by Karthi L 14-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */
	public static boolean isValidString(String input) {
		if (input == null || input.trim().equals("")) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		String userID = "E1013";
		String userType = "Employee";
		String userName = "Arun";
		String password = "Welcome@123";
		System.out.println("UserId:" + StringUtilTest.isValidString(userID));
		System.out.println("UserType:" + StringUtilTest.isValidString(userType));
		System.out.println("UserName:" + StringUtilTest.isValidString(userName));
		System.out.println("Password:" + StringUtilTest.isValidString(password));

		// Task 1: If firstName and lastName is valid, then we will store user details
		// in "users" table.
		if (StringUtilTest.isValidString(userID) && StringUtilTest.isValidString(userType)
				&& StringUtilTest.isValidString(userName) && StringUtilTest.isValidString(password)) {
			System.out.println("Success");
		} else {
			System.out.println("Data is invalid");
		}
	}

}


