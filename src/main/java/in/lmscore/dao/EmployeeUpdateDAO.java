package in.lmscore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;
import in.lmscore.validator.NameValidation;

public class EmployeeUpdateDAO {

	private EmployeeUpdateDAO() {

	}

	/*
	 * code developed by Karthi L 14-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */
	public static void UpdateEmployee() {

		Connection connection = null;
		PreparedStatement pst = null;

		try {
			connection = ConnectionUtil.getConnection();
			String userName = "REKA";
			String password1 = "Welcome@123";
			String userId = "E1005";

			boolean userupdatusernamevalidate = NameValidation.userupdatusername(userName);
			boolean userupdatpasswordvalidate = NameValidation.userupdatepassword(password1);
			boolean userupdatuseridvalidate = NameValidation.userupdatusername(userId);

			if (userupdatusernamevalidate && userupdatpasswordvalidate && userupdatuseridvalidate) {

				String sql = "Update LMS_EMP_LOGIN_DET_V1 set USERNAME = ?, PASSWORD = ? where USER_ID = ?";

				pst = connection.prepareStatement(sql);
				pst.setString(1, userName);
				pst.setString(2, password1);
				pst.setString(3, userId);
				int rows = pst.executeUpdate();

				if (rows > 0) {
					Logger.debug("No of rows Updated :" + rows);
				} else {
					Logger.debug("User ID Not Exists");
				}
			} else {
				Logger.debug("Invalid Datas");

			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}

	}
}
