package in.lmscore.model;
public class User {
	//If any Changes in this Code inform to me
		/*code developed by Karthi L 14-07-2021
		 * @param employeedetails 
		 * @return*/
		public String userId;
		public String userType;
		public String userName;
		public String password;
		
		public User() {
			System.out.println("Constructor created for User");
			
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
