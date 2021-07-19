package in.lmscore.dao;

import java.sql.Connection;
//import in.lmscore.util.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDetailsDAO {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// code developed by Arun R
		// dont touch this code without my permission
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

		String empCode = "E1003";

		String sql = "select EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE from LMS_EMPLOYEES_DET WHERE EMPLOYEE_CODE = ?";
		System.out.println(sql);

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, empCode);

		pst.executeUpdate();
		pst.close();

		connection.close();
	}

}
