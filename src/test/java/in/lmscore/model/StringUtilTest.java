package in.lmscore.model;
import in.lmscore.util.Logger;
public class StringUtilTest {
	//If any Changes in this Code inform to me
			/*code developed by Karthi L 14-07-2021
			 * @param employeedetails 
			 * @return*/
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
		Logger.debug("UserId:" + StringUtilTest.isValidString(userID));
		Logger.debug("UserType:" + StringUtilTest.isValidString(userType));
		Logger.debug("UserName:" + StringUtilTest.isValidString(userName));
		Logger.debug("Password:" + StringUtilTest.isValidString(password));
		
		// Task 1: If firstName and lastName is valid, then we will store user details in "users" table.
		if(StringUtilTest.isValidString(userID) && StringUtilTest.isValidString(userType) && StringUtilTest.isValidString(userName) && StringUtilTest.isValidString(password)) {
			Logger.debug("Success");
		}
		else {
			Logger.debug("Data is invalid");
		}
	}

}
