package in.lmscore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.lmscore.util.Logger;

public class UserDeleteDAO {
	// If any Changes in this Code inform to me
	/*
	 * code developed by Karthi L 14-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

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

		// String name = ;
		String userId = "E1012";
		String userName = "Admin";

		if (userName.equals("Admin")) {
			String sql = "DELETE FROM LMS_EMP_LOGIN_DET WHERE USER_ID = ?";
			System.out.println(sql);

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, userId);

			int rows = pst.executeUpdate();
			pst.close();

			connection.close();

			System.out.println("No of rows Updated :" + rows);
		} else {
			System.out.println("You Cannot have a permission to delete.");

		}

		// connection.commit();

		// connection.rollback();

	}

}