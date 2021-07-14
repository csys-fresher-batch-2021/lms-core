package in.yourproject;

public class UserUpdateEmployeeValidatorTest {
	
	/**
	 * Developed by - Karthi
	 * @param employee
	 * @return
	 * @throws Exception 
	 */

			public static boolean userupdatuseridvalidate(String userId)throws Exception
			{
				if(userId == null || userId.trim().equals(""))
				{
					throw new Exception("Invalid Data");
				}
				else
				{
					throw new Exception("Valid Data");
				}
			}
			public static boolean userupdatusertypevalidate(String userType)throws Exception
			{
				if(userType == null || userType.trim().equals(""))
				{
					throw new Exception("Invalid");
				}
				else
				{
					throw new Exception("valid");
				}
			}
			public static boolean userupdatusername(String userName)throws Exception
			{
				if(userName == null || userName.trim().equals(""))
				{
					throw new Exception("Invalid");
				}
				else
				{
					throw new Exception("valid");
				}
				
			}
			
			public static boolean userupdatepassword(String password)throws Exception
			{
				if(password == null || password.trim().equals(""))
				{
					throw new Exception("Invalid");
				}
				else
				{
					throw new Exception("valid");
				}
				
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
					userupdatuseridvalidate("E101");
					userupdatusertypevalidate("Emp");
					userupdatusername("AA");
					userupdatepassword ("AA");
					System.out.println("Invalid leave");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Data: " + e.getMessage());
				}
				
			}
		}


