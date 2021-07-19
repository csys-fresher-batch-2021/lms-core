package in.lmscore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import in.lmscore.util.Logger;

public class AddNewEmployeeDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// code developed by Arun R
		// dont touch this code without my permission
		String driverClassName = System.getenv("DB_DRIVER_NAME");
		String url = System.getenv("DB_URL");
		String username = System.getenv("DB_USERNAME");
		String password = System.getenv("DB_PASSWORD");

		// Step 1: Load the driver
		Class.forName(driverClassName);

		// Step 2: Connection

		Connection connection = DriverManager.getConnection(url, username, password);
		// connection.setAutoCommit(false);//default true

		System.out.println(connection);

		String userId = "E1021";
		String uname = "Jagan";
		String pwd = "Welcome#2";
		String userType = "Employee";

		String sql = "INSERT INTO LMS_EMP_LOGIN_DET (USER_ID,USER_TYPE,PASSWORD,USERNAME) VALUES(?,?,?,?)";
		System.out.println(sql);

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, userId);
		pst.setString(2, userType);
		pst.setString(3, pwd);
		pst.setString(4, uname);

		int rows = pst.executeUpdate();
		pst.close();

		connection.close();

		System.out.println("No of rows Inserted :" + rows);

	}

}
