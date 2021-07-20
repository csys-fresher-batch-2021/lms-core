package in.lmscore.validator;

import in.lmscore.util.Logger;

public class NameValidation {

	/**
	 * Developed by - Karthi
	 * 
	 * @param employee
	 * @return
	 * @throws Exception
	 */

	public static boolean userupdatuseridvalidate(String userId) {
		if (userId == null || userId.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean userupdatusertypevalidate(String userType) {
		if (userType == null || userType.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean userupdatusername(String userName) {
		if (userName == null || userName.trim().equals("")) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean userupdatepassword(String password) {
		if (password == null || password.trim().equals("")) {
			return false;
		} else {
			return true;
		}

	}
	public static boolean updateempstatus(String status) {
		if (status == null || status.trim().equals("")) {
			return false;
		} else {
			return true;
		}

	}



	public static void main(String[] args) {

		boolean userupdatuseridvalidate = userupdatuseridvalidate("E101");
		boolean userupdatusertypevalidate = userupdatusertypevalidate("");
		boolean userupdatusername = userupdatusername("AA");
		boolean userupdatepassword = userupdatepassword("sddsfd");
		Logger.debug(userupdatuseridvalidate + "   " + userupdatusertypevalidate + "   " + userupdatusername + "   "
				+ userupdatepassword);
		Logger.debug("Invalid leave");

	}
}
