package in.yourproject;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class EmployeeUpdateDAO {
	//If any Changes in this Code inform to me
			/*code developed by Karthi L 14-07-2021
			 * @param employeedetails 
			 * @return*/
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
		String userName = "REKA";
		String password1 = "Welcome@123";
		String userId = "E1005";
		
		
			String sql = "Update LMS_EMP_LOGIN_DET set USERNAME = ?, PASSWORD = ? where USER_ID = ?";
			System.out.println(sql);

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, userName);
			pst.setString(2, password1);
			pst.setString(3, userId);
			int rows = pst.executeUpdate();
			pst.close();

			connection.close();

			System.out.println("No of rows Updated :" + rows);
	
		}
		// String sql = "insert into test_students(name) values ('" + name + "')";
		
		// String sql = "delete from test_students where name = ?";
		
		
		

		// connection.commit();

		// connection.rollback();

		

	}

