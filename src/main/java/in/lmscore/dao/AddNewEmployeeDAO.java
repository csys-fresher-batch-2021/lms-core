package in.lmscore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;
import in.lmscore.validator.NameValidation;

public class AddNewEmployeeDAO {

	private AddNewEmployeeDAO() {

	}

	public static void addNewEmployee() {
		// code developed by Arun R
		// dont touch this code without my permission

		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			connection = ConnectionUtil.getConnection();
		
		// connection.setAutoCommit(false);//default true

		String userId = "E1002";
		String uname = "karthi";
		String pwd = "Welcome#2";
		String userType = "Employee";

		boolean userupdatuseridvalidate = NameValidation.userupdatuseridvalidate(userId);
		boolean userupdatusertypevalidate = NameValidation.userupdatusertypevalidate(uname);
		boolean userupdatusername = NameValidation.userupdatusername(pwd);
		boolean userupdatepassword = NameValidation.userupdatepassword(userType);

		if (userupdatuseridvalidate && userupdatusertypevalidate && userupdatusername && userupdatepassword) {

			String sql = "INSERT INTO LMS_USER_LOGIN (USER_ID,USER_TYPE,PASSWORD,USERNAME) VALUES(?,?,?,?)";

			pst = connection.prepareStatement(sql);
			pst.setString(1, userId);
			pst.setString(2, userType);
			pst.setString(3, pwd);
			pst.setString(4, uname);

			int rows = pst.executeUpdate();

			Logger.debug("No of rows Inserted :" + rows);
		}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
		}
	

}
