package in.lmscore.validator;

import in.lmscore.util.Logger;

public class UserLoginValidator {

	public static void validate(String userName, String passWord) throws Exception {

		if (userName == null || passWord == null) {
			throw new Exception("Invalid userName / passWord");
		}

	}
	public static void main(String[] args) {
		// employee id

		String userName = "Reka";
		String passWord = "123678";

		try {
			validate(userName, passWord);
			Logger.debug("Validation completed");
		} catch (Exception e) {
			
			String errorMessage = e.getMessage();
			Logger.debug("errorMessage:" + errorMessage);
			
		}
	}

}
