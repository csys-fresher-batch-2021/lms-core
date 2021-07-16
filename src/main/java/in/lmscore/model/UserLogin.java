package in.lmscore.model;
import in.lmscore.util.Logger;
public class UserLogin {

	String userName;
	String passWord;

	// constructor starts
	public UserLogin(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
		Logger.debug("Login Successfully");

	}
}
// constructor ends

// method starts
/*
 * public static void display (String userName, String passWord) {
 * Logger.debug("userName : "+ userName);
 * Logger.debug("passWord : "+ passWord);
 * Logger.debug("Login Successfully"); } //method ends
 */