package in.lmscore.dao;

import java.sql.Connection;
import in.lmscore.util.Logger;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import in.lmscore.validator.EmployeeLeaveValidator;

public class AllEmployeeLeavesDAOTest {

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

		String sql = "select leave_id,employee_code,manager_code,leave_type,leave_reason,leave_start_date,leave_end_date,no_of_days,total_leave,leave_balance,status from LMS_EMPLOYEES_LEAVE_DET";

		System.out.println(sql);

		PreparedStatement pst = connection.prepareStatement(sql);

		pst.executeUpdate();

		pst.close();

		connection.close();

	}

}
