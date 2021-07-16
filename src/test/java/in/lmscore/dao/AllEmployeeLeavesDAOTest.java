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

		String sql = "select leave_id,employee_code,manager_code,leave_type,leave_reason,leave_start_date,leave_end_date,no_of_days,total_leave,leave_balance,status from LMS_EMPLOYEES_LEAVE_DET";

		Logger.debug(sql);

		PreparedStatement pst = connection.prepareStatement(sql);

		pst.executeUpdate();

		pst.close();

		connection.close();

	}

}
