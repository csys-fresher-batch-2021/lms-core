package in.yourproject;

public class UserLoginValidator {

	public static void validate(String userName, String passWord) throws Exception {

		if (userName == null || passWord == null) {
			throw new Exception("Invalid username / password");
		}

		// End Validation

		// StudentDAO.save(name);
		// UserLogin e = new UserLogin(" ","25678");
		// System.out.println(" Login Successfully");

	}

	public static void main(String[] args) {
		// employee id

		String Username = null;
		String Password = "678";

		try {
			validate(Username, Password);
			System.out.println("Validation completed");
		} catch (Exception e) {
			// System.out.println("Catch");
			String errorMessage = e.getMessage();
			System.out.println("errorMessage:" + errorMessage);
			// e.printStackTrace();
		}
	}

}
