package in.lmscore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.model.User;
import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;

public class UserDeleteDAO {
	// If any Changes in this Code inform to me
	/*
	 * code developed by Karthi L 14-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */
	public static void DeleteEmployee()  {

		PreparedStatement ps = null;
		Connection con = null;

		try {
			con = ConnectionUtil.getConnection();
			String userId1 = "E1005";
			String userName = "Admin";
		    String status = "INACTIVE";

			if (userName.equals("Admin")) {
			String sql = "Update LMS_EMP_LOGIN_DET_V1 set STATUS = ? where USER_ID = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, status);
			ps.setString(2, userId1);

			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println(count + " row deleted");
			} else {
				System.out.println("You Cannot have a permission to delete.");
				
			}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(ps, con);
		}

	}

}