package in.lmscore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class EmployeeLeaveDAOTest {

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

		int leaveId = 121;
		String empCode = "E1009";
		String mgrCode = "E1010";
		String leaveType = "MEDICAL_LEAVE";
		String leaveReason = "COROANA_TEST";
		LocalDate leaveStartDate = LocalDate.parse("2015-05-01");
		LocalDate leaveEndDate = LocalDate.parse("2015-05-01");
		int noofdays = 1;
		int totalLeave = 21;
		int leavebalance = 20;
		String status = "APPLIED";
		String sql = "insert into LMS_EMPLOYEES_LEAVE_DET (LEAVE_ID,EMPLOYEE_CODE,MANAGER_CODE,LEAVE_TYPE,LEAVE_REASON,LEAVE_START_DATE,LEAVE_END_DATE,NO_OF_DAYS,TOTAL_LEAVE,LEAVE_BALANCE,STATUS)values (?,?,?,?,?,?,?,?,?,?,?)";
		System.out.println(sql);

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, leaveId);
		pst.setString(2, empCode);
		pst.setString(3, mgrCode);
		pst.setString(4, leaveType);
		pst.setString(5, leaveReason);
		pst.setDate(6, Date.valueOf(leaveStartDate));
		pst.setDate(7, Date.valueOf(leaveEndDate));
		pst.setInt(8, noofdays);
		pst.setInt(9, totalLeave);
		pst.setInt(10, leavebalance);
		pst.setString(11, status);
		int rows = pst.executeUpdate();

		pst.close();

		connection.close();

		System.out.println("No of rows inserted :" + rows);

	}

}
