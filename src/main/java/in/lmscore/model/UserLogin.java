package in.lmscore.model;

public class UserLogin {

	String userName;
	String passWord;

	// constructor starts
	public UserLogin(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
		System.out.println("Login Successfully");

	}
}
// constructor ends

// method starts
/*
 * public static void display (String userName, String passWord) {
 * System.out.println("userName : "+ userName);
 * System.out.println("passWord : "+ passWord);
 * System.out.println("Login Successfully"); } //method ends
 */