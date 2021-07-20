package in.lmscore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;
import in.lmscore.validator.IdValidation;
import in.lmscore.validator.NameValidation;

public class EmployeeUpdateLeaveDAO {
	
	private EmployeeUpdateLeaveDAO() {
		
	}
	
	/*
	 * code developed by Karthi L 14-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */
	public static void leaveUpdateEmployee() {

		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			connection = ConnectionUtil.getConnection();
			int leaveId = 101;
			String status = "Approved";
			String userName = "Manager";

			boolean userupdatuseridvalidate = NameValidation.userupdatuseridvalidate(status);
			boolean checkId = IdValidation.checkId(leaveId);

			if (userupdatuseridvalidate && checkId) {

				if (userName.equals("Manager")) {
					String sql = "Update LMS_EMPLOYEES_LEAVE_DET set Status = ? where LEAVE_ID = ?";
					
					pst = connection.prepareStatement(sql);
					pst.setString(1, status);
					pst.setInt(2, leaveId);
					int rows = pst.executeUpdate();

					Logger.debug("No of rows Updated :" + rows);
				} else {
					Logger.debug("You Cannot have a permission to delete.");

				}
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(pst,connection);
		}


	}
}
	