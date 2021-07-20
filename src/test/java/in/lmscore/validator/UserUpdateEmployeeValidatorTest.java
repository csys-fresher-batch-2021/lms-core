package in.lmscore.validator;

import in.lmscore.util.Logger;

public class UserUpdateEmployeeValidatorTest {

	/**
	 * Developed by - Karthi
	 * 
	 * @param employee
	 * @return
	 * @throws Exception
	 */

	public static boolean userupdatuseridvalidate(String userId) throws Exception {
		if (userId == null || userId.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean userupdatusertypevalidate(String userType) throws Exception {
		if (userType == null || userType.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean userupdatusername(String userName) throws Exception {
		if (userName == null || userName.trim().equals("")) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean userupdatepassword(String password) throws Exception {
		if (password == null || password.trim().equals("")) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		try {
			 boolean userupdatuseridvalidate = userupdatuseridvalidate("E101");
			 boolean userupdatusertypevalidate = userupdatusertypevalidate("");
		    boolean userupdatusername = userupdatusername("AA");
			boolean userupdatepassword = userupdatepassword("sddsfd");
			Logger.debug(userupdatuseridvalidate+"   "+userupdatusertypevalidate+"   "+userupdatusername+"   "+userupdatepassword);
			Logger.debug("Invalid leave");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.debug("Data: " + e.getMessage());
		}

	}
}
