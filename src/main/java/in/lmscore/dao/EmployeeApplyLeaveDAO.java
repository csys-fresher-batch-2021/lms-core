package in.lmscore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;
import in.lmscore.validator.EmployeeLeaveValidator;

public class EmployeeApplyLeaveDAO {

	// code developed by Arun R
	// dont touch this code without my permission

	public static void applyLeave() throws Exception {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = ConnectionUtil.getConnection();
			int leaveId = 125;
			String empCode = "E1003";
			String mgrCode = "E1005";
			String leaveType = "VACATION";
			String leaveReason = "TOUR";
			LocalDate leaveStartDate = LocalDate.parse("2021-07-26");
			LocalDate leaveEndDate = LocalDate.parse("2021-07-28");
			int noofdays = leaveEndDate.getDayOfMonth() - leaveStartDate.getDayOfMonth();
			int totalLeave = 21;
			int leavebalance = totalLeave - noofdays;
			String status = "APPLIED";

			boolean empvalidate = EmployeeLeaveValidator.empvalidate(empCode);
			boolean leavevalidate = EmployeeLeaveValidator.leavevalidate(leaveType);
			boolean leaveidvalidate = EmployeeLeaveValidator.leaveidvalidate(leaveId);

			if (empvalidate && leavevalidate && leaveidvalidate) {

				String sql = "insert into LMS_EMPLOYEES_LEAVE_DET (LEAVE_ID,EMPLOYEE_CODE,MANAGER_CODE,LEAVE_TYPE,LEAVE_REASON,LEAVE_START_DATE,LEAVE_END_DATE,NO_OF_DAYS,TOTAL_LEAVE,LEAVE_BALANCE,STATUS)values (?,?,?,?,?,?,?,?,?,?,?)";
				Logger.debug(sql);

				PreparedStatement pst1 = con.prepareStatement(sql);
				pst1.setInt(1, leaveId);
				pst1.setString(2, empCode);
				pst1.setString(3, mgrCode);
				pst1.setString(4, leaveType);
				pst1.setString(5, leaveReason);
				pst1.setDate(6, Date.valueOf(leaveStartDate));
				pst1.setDate(7, Date.valueOf(leaveEndDate));
				pst1.setInt(8, noofdays);
				pst1.setInt(9, totalLeave);
				pst1.setInt(10, leavebalance);
				pst1.setString(11, status);
				int rows = pst1.executeUpdate();
				if (rows > 0) {
					Logger.debug("No of rows Updated :" + rows);
				} else {
					Logger.debug("User ID Not Exists");
				}
			} else {
				Logger.debug("Invalid Data");
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, con);
		}
	}
}