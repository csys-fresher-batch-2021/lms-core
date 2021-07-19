package in.lmscore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.lmscore.util.Logger;

public class ListEmployeeLeavesDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

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

		String empCode = "E1001";

		String sql = "select * from LMS_EMPLOYEES_LEAVE_DET where EMPLOYEE_CODE = ? ";
		System.out.println(sql);

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, empCode);
		pst.executeUpdate();

		// connection.commit();

		// connection.rollback();

		pst.close();

		connection.close();

	}

}
