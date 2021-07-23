package in.lmscore.service;

import in.lmscore.exception.ValidException;

class UserValidator1 {

	private UserValidator1() {

	}

	public static void isValidEmpId(String empId) throws ValidException {
		if (empId == null) {
			throw new ValidException("Invalid empId");
		}
	}

	public static boolean isAdmin(String userName) {
		if (userName.equals("Admin")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkAdminPermission(String userName) throws ValidException {
		if (userName.equals("Admin")) {
			return true;
		} else {
			throw new ValidException("You are not allowed.");
		}
	}

	public static boolean checkManagerPermission(String userName) throws ValidException {
		if (userName.equals("Manager")) {
			return true;
		} else {
			throw new ValidException("You are not allowed.");
		}
	}

}

public class UserDeleteService {

	private UserDeleteService() {

	}

	public static void deleteUser(String empId) throws ValidException {

		try {
			// Validation
			UserValidator1.isValidEmpId(empId);

		} catch (Exception e) {
			e.printStackTrace();
			throw new ValidException(e.getMessage());
		}

	}
}
