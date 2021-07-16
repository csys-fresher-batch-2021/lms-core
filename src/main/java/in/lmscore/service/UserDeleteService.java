package in.lmscore.service;

class UserValidator1 {

	public static void isValidEmpId(String empId) throws Exception {
		if (empId == null) {
			throw new Exception("Invalid empId");
		}
	}
	
	public static boolean isAdmin(String userName) {
		if(userName == "Admin") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkAdminPermission(String userName) throws Exception {
		if(userName == "Admin") {
			return true;
		}
		else {
			throw new Exception("You are not allowed.");
		}
	}



public static boolean checkManagerPermission(String userName) throws Exception {
	if(userName == "Manager") {
		return true;
	}
	else {
		throw new Exception("You are not allowed.");
	}
}

}

public class UserDeleteService {

	public static void deleteUser(String userName, String empId) throws Exception {

		try {
			// Validation
			UserValidator1.isValidEmpId(empId);
			
			/*if(UserValidator1.isAdmin(userName)) {
				// Directly calling DAO
				UserDeleteDAO.delete(empId);
			}
			else {
				Logger.debug("You Cannot have a permission to delete");
			}*/

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}

	}
}
