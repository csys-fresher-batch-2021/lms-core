package in.lmscore.dao;

import java.sql.Connection;
//import in.lmscore.util.Logger;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeUpdateLeaveDAO {
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

		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
		String username = "apps";
		String password = "apps";

		// Step 1: Load the driver
		Class.forName(driverClassName);

		// Step 2: Connection

		Connection connection = DriverManager.getConnection(url, username, password);
		// connection.setAutoCommit(false);//default true

		System.out.println(connection);

		// String name = ;
		int leaveId = 101;
		String status = "Approved";
		String userName = "Manager";

		if (userName.equals("Manager")) {
			String sql = "Update LMS_EMPLOYEES_LEAVE_DET set Status = ? where LEAVE_ID = ?";
			System.out.println(sql);

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, status);
			pst.setInt(2, leaveId);
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