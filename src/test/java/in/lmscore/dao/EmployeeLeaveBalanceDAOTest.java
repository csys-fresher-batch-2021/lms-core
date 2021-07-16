package in.lmscore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import in.lmscore.validator.EmployeeLeaveValidator;

public class EmployeeLeaveBalanceDAOTest {

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
