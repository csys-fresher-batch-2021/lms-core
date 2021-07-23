package in.lmscore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;
import in.lmscore.validator.IdValidation;
import in.lmscore.validator.NameValidation;

public class CancelLeaveDAO {

	private CancelLeaveDAO() {

	}

	/*
	 * code developed by Karthi L 14-07-2021
	 * 
	 * @param employeedetails
	 * 
	 * @return
	 */
	public static void cancelEmployee() {

		Connection connection = null;
		PreparedStatement pst = null;

		try {
			connection = ConnectionUtil.getConnection();
			String status = "CANCELLED";
			int leaveId = 120;
			boolean updateEmployeeStatus = NameValidation.updateempstatus(status);
			boolean updateEmployeeLeaveid = IdValidation.checkId(leaveId);

			if (updateEmployeeStatus && updateEmployeeLeaveid) {

				String sql = "UPDATE LMS_EMPLOYEES_LEAVE_DET SET STATUS= ? Where LEAVE_ID = ?";
				Logger.debug(sql);

				pst = connection.prepareStatement(sql);
				pst.setString(1, status);
				pst.setInt(2, leaveId);
				int rows = pst.executeUpdate();

				if (rows > 0) {
					Logger.debug("No of rows Updated :" + rows);
				} else {
					Logger.debug("User ID Not Exists");
				}
			} else {
				Logger.debug("Invalid Datas");

			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}

	}
}
