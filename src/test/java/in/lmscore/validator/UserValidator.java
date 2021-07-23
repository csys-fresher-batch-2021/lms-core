package in.lmscore.validator;

import in.lmscore.util.Logger;
import in.lmscore.model.StringUtilTest;
import in.lmscore.model.User;

public class UserValidator {

	/**
	 * Developed by - Karthi L
	 * 
	 * @param employee
	 * @return
	 * @throws Exception
	 */
	public static boolean validate(User user1) throws Exception {
		// employee id
		boolean isValiduserId = StringUtilTest.isValidString(user1.getUserId());
		boolean isValiduserType = StringUtilTest.isValidString(user1.getUserType());
		boolean isValiduserName = StringUtilTest.isValidString(user1.getUserName());
		boolean isValidpassword = StringUtilTest.isValidString(user1.getPassword());

		if (isValiduserId && isValiduserType && isValiduserName && isValidpassword) {
			return true;
		} else {
			throw new Exception("Invalid User Details");
		}

	}

	public static void main(String[] args) throws Exception {
		User user = new User("E1013", "Employee", "Arun", "Welcome@123");
		boolean isValid1 = validate(user); // valid = true
		Logger.debug("User Details Valid:" + isValid1);

		/*
		 * User user1 = new User("E1013"," ","Arun","Welcome@123"); boolean isValid2 =
		 * validate(user1); //valid = false Logger.debug("User Details Valid:"+
		 * isValid2);
		 */
	}
}