package in.yourproject;

import in.yourproject.User;
import in.yourproject.StringUtil;

public class UserValidator {
	

		/**
		 * Developed by - Karthi
		 * @param employee
		 * @return
		 * @throws Exception 
		 */
		public static boolean validate(User user1) throws Exception {
			//employee id
			boolean isValiduserId = StringUtilTest.isValidString(user1.userId);
			boolean isValiduserType = StringUtilTest.isValidString(user1.userType);
			boolean isValiduserName = StringUtilTest.isValidString(user1.userName);
			boolean isValidpassword =  StringUtilTest.isValidString(user1.password);
			
			if(isValiduserId && isValiduserType && isValiduserName && isValidpassword) {
				return true;
			}
			else {
				throw new Exception("Invalid User Details");
			}
			
		}
		public static void main(String[] args) throws Exception  {
			User user = new User("E1013","Employee","Arun","Welcome@123");
			boolean isValid1 = validate(user); //valid = true
			System.out.println("User Details Valid:"+ isValid1);
			
			/*User user1 = new User("E1013"," ","Arun","Welcome@123");
			boolean isValid2 = validate(user1); //valid = false
			System.out.println("User Details Valid:"+ isValid2);*/
		}
}