package in.lmscore.model;
import in.lmscore.util.Logger;
public class User {
	//If any Changes in this Code inform to me
		/*code developed by Karthi L 14-07-2021
		 * @param employeedetails 
		 * @return*/
		public static String userId;
		public static String userType;
		public static String userName;
		public static String password;
		
		public User() {
			Logger.debug("Constructor created for User");
			
		}
		public User(String userId,
					String userType,
					String userName,
					String password)
		{
			super();
			User.userId = userId;
			User.userType = userType;
			User.userName = userName;
			User.password = password;
		}
		
		@Override
		public String toString() {
			return "User [id=" + userId + ", usertype=" + userType + ", username=" + userName + ",username=" + password + "]";
		}
		public String getuserId() {

			return null;
		}
	
}
