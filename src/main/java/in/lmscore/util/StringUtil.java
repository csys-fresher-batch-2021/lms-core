package in.lmscore.util;

public class StringUtil {
	public static boolean isValidString(String input) {
		if (input == null || input.trim().equals("")) {
			return false;
		}
		else
		{
		return true;
		}
	}

	public static void main(String[] args) {
		String userName = "Reka";
		String passWord = "123678";
		Logger.debug("userName:" + StringUtil.isValidString(userName));
		Logger.debug("passWord:" + StringUtil.isValidString(passWord));

		// Task 1: If firstName and lastName is valid, then we will store user details
		// in "users" table.
		if (StringUtil.isValidString(userName) && StringUtil.isValidString(passWord)) {
			Logger.debug("Success");
		} else {
			Logger.debug("Data is invalid");
		}
	}

}
