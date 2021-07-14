package in.yourproject;

public class StringUtil {
		public static boolean isValidString(String input) {
				if (input == null|| input.trim().equals("")) {
					return false;
				}
				return true;
			}

			public static void main(String[] args) {
				String Username= null;
				String Password = "678";
				System.out.println("UserName:" + StringUtil.isValidString(Username));
				System.out.println("Password:" + StringUtil.isValidString(Password));
				
				// Task 1: If firstName and lastName is valid, then we will store user details in "users" table.
				if(StringUtil.isValidString(Username) && StringUtil.isValidString(Password) ) {
					System.out.println("Success");
				}
				else {
					System.out.println("Data is invalid");
				}
			}

}

