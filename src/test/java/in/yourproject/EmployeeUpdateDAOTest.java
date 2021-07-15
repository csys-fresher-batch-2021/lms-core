package in.yourproject;

public class EmployeeUpdateDAOTest {
	
	
	public static void Update (String userName,String Password,String userId) {
		
		String sql = "UPDATE LMS_EMP_LOGIN_DET SET USERNAME = '" + userName + "', PASSWORD = '" + Password + "' WHERE USER_ID = '" + userId + "';";
		System.out.println(sql);
		
		System.out.println("Updated this employee Code " + userId );
		
	}
	public static  boolean checkAdminPermission(String userName,String Password,String userId,String userType) throws Exception {
		if (userType.equals("EMPLOYEE") || userType.equals("ADMIN"))
				{
			return true;
		}
		else {
			throw new Exception("Data is Empty.");
			
		}
	}
	public static void main(String[] args) {
		String userName = "ARUN";
		String Password = "Welcome@123";
		String userID = "E1005";
		String usertype = "EMPLOYEE";
		try {
			checkAdminPermission(userName,Password,userID,usertype);
			Update("ARUN","Welcome@123","E1005");
		
		} catch (Exception e) {
			System.out.println("Error:"+ e.getMessage());
			e.printStackTrace();
		}
				
			
	}

}
