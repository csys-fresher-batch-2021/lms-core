package in.lmscore.dao;

import java.sql.Connection;
import in.lmscore.util.Logger;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import in.lmscore.validator.EmployeeLeaveValidator;

public class EmployeeLeaveBalanceDAOTest {

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

		String empCode = "E1008";

		String sql = "select EMPLOYEE_CODE, LEAVE_BALANCE from LMS_EMPLOYEES_LEAVE_DET WHERE EMPLOYEE_CODE = ?";
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
