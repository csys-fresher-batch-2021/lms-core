package in.lmscore.dao;

import java.sql.Connection;
import in.lmscore.util.Logger;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class EmployeeDetailsDAO {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// code developed by Arun R
		// dont touch this code without my permission
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

		
		String empCode = "E1003";

		String sql = "select EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE from LMS_EMPLOYEES_DET WHERE EMPLOYEE_CODE = ?";
		Logger.debug(sql);

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, empCode);

		pst.executeUpdate();
		pst.close();

		connection.close();

		

	}
	

}
