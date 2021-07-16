package in.lmscore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.util.Logger;

public class AddNewEmployeeDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// code developed by Arun R
		// dont touch this code without my permission
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
		String username = "apps";
		String password = "apps";

		// Step 1: Load the driver
		Class.forName(driverClassName);

		// Step 2: Connection

		Connection connection = DriverManager.getConnection(url, username, password);
		// connection.setAutoCommit(false);//default true

		Logger.debug(connection);

		String userId = "E1021";
		String uname = "Jagan";
		String pwd = "Welcome#2";
		String userType = "Employee";

		String sql = "INSERT INTO LMS_EMP_LOGIN_DET (USER_ID,USER_TYPE,PASSWORD,USERNAME) VALUES(?,?,?,?)";
		Logger.debug(sql);

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
