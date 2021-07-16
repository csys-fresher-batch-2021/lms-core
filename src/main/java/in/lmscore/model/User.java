package in.lmscore.model;
import in.lmscore.util.Logger;
public class User {
	//If any Changes in this Code inform to me
		/*code developed by Karthi L 14-07-2021
		 * @param employeedetails 
		 * @return*/
		static String userId;
		static String userType;
		static String userName;
		static String password;
		
		public User() {
			Logger.debug("Constructor created for User");
			
		}
		public User(String userId,
					String userType,
					String userName,
					String password)
		{
			super();
			this.userId = userId;
			this.userType = userType;
			this.userName = userName;
			this.password = password;
		}
		
		@Override
		public String toString() {
			return "User [id=" + userId + ", usertype=" + userType + ", username=" + userName + ",username=" + password + "]";
		}
}
