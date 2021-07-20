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
