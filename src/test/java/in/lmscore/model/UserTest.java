package in.lmscore.model;
import in.lmscore.util.Logger;
public class UserTest {
	//If any Changes in this Code inform to me
			/*code developed by Karthi L 14-07-2021
			 * @param employeedetails 
			 * @return*/
	public static void main(String[] args) {
		String userId = "E1013";
		String userType = "Employee";
		String userName = "Arun";
		String password = "Welcome@123"; 
		// TODO Auto-generated method stub
		/*User user1 = new User("E1011","Admin","Arun","Welcome@123");
		Logger.debug(user1);
		Logger.debug("inserted");*/
		String sql = "insert into user_emp_login (user_id,user_type,username,password) values('" + userId + "','" + userType + "','" + userName +
				"','" + password + "')"; 
		Logger.debug(sql);
	}

}
