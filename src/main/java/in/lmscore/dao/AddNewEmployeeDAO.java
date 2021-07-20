package in.lmscore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;
import in.lmscore.validator.NameValidation;

public class AddNewEmployeeDAO {

	public static void addNewEmployee() throws SQLException, ClassNotFoundException {
		// code developed by Arun R
		// dont touch this code without my permission

		Connection connection = ConnectionUtil.getConnection();
		// connection.setAutoCommit(false);//default true

		String userId = "E1021";
		String uname = "Jagan";
		String pwd = "Welcome#2";
		String userType = "Employee";
		
		 boolean userupdatuseridvalidate = NameValidation.userupdatuseridvalidate(userId);
		 boolean userupdatusertypevalidate = NameValidation.userupdatusertypevalidate(uname);
	    boolean userupdatusername = NameValidation.userupdatusername(pwd);
		boolean userupdatepassword =NameValidation.userupdatepassword(userType);

		if(userupdatuseridvalidate && userupdatusertypevalidate && userupdatusername && userupdatepassword) {
		
		String sql = "INSERT INTO LMS_EMP_LOGIN_DET (USER_ID,USER_TYPE,PASSWORD,USERNAME) VALUES(?,?,?,?)";
		
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, userId);
		pst.setString(2, userType);
		pst.setString(3, pwd);
		pst.setString(4, uname);

		int rows = pst.executeUpdate();
		pst.close();

		connection.close();

		Logger.debug("No of rows Inserted :" + rows);
		}
	}
	
}
