package in.yourproject;

public class UserLogin {

		 String Username;
		 String Password;
	public UserLogin(String Username, String Password)
	{
		this.Username = Username;
		this.Password = Password;
		System.out.println("Login Successfully");
		
	}
	
	public static void display (String Username, String Password)
	{
		System.out.println("Username : "+Username);
		System.out.println("Password : "+Password);
	}
	
	public static void main(String[] args) {
		UserLogin e = new UserLogin("Arun","12345");
	
	}

}
