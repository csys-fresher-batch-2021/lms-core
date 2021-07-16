package in.lmscore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.lmscore.util.Logger;
public class ListEmployeeLeavesDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

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

		String empCode = "E1001";

		String sql = "select * from LMS_EMPLOYEES_LEAVE_DET where EMPLOYEE_CODE = ? ";
		Logger.debug(sql);

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, empCode);
		pst.executeUpdate();

		// connection.commit();

		// connection.rollback();

		pst.close();

		connection.close();

	}

}
