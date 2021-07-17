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
		System.out.println("userName:" + StringUtil.isValidString(userName));
		System.out.println("passWord:" + StringUtil.isValidString(passWord));

		// Task 1: If firstName and lastName is valid, then we will store user details
		// in "users" table.
		if (StringUtil.isValidString(userName) && StringUtil.isValidString(passWord)) {
			System.out.println("Success");
		} else {
			System.out.println("Data is invalid");
		}
	}

}
