package in.lmscore.validator;

import in.lmscore.exception.ValidException;
import in.lmscore.util.Logger;

public class UserLoginValidator {

	public static void validate(String userName, String passWord) throws ValidException {

		if (userName == null || passWord == null) {
			throw new ValidException("Invalid userName / passWord");
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
