package in.lmscore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import in.lmscore.model.GroupEmpLeaveDetails;
import in.lmscore.util.ConnectionUtil;

public class AllEmployeeLeavesDAO {

	private AllEmployeeLeavesDAO() {

	}

	public static List<GroupEmpLeaveDetails> showeployeedetails() throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection con = null;

		ResultSet rs = null;
		ArrayList<GroupEmpLeaveDetails> LMS_EMPLOYEES_LEAVE_DETAILS = null;

		try {
			con = ConnectionUtil.getConnection();

			String sql = "select leave_id,EMPLOYEE_CODE,LEAVE_TYPE,LEAVE_START_DATE,LEAVE_END_DATE,NO_OF_DAYS,LEAVE_REASON,STATUS from LMS_EMPLOYEES_LEAVE_DET  where EMPLOYEE_CODE = 'E1001' ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			LMS_EMPLOYEES_LEAVE_DETAILS = new ArrayList<>();
			while (rs.next()) {
				int leaveId = rs.getInt(1);
				String empCode = rs.getString(2);
				String empType1 = rs.getString(3);
				Date leaveStartDate = rs.getDate(4);
				Date leaveEndDate = rs.getDate(4);
				int noOfDays = rs.getInt(6);
				String leaveReason = rs.getString(7);
				String status = rs.getString(8);

				GroupEmpLeaveDetails LMS_EMPLOYEES_LEAVE_DET = new GroupEmpLeaveDetails(leaveId, empCode, empType1,
						leaveStartDate, leaveEndDate, noOfDays, leaveReason, status);
				LMS_EMPLOYEES_LEAVE_DETAILS.add(LMS_EMPLOYEES_LEAVE_DET);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs, ps, con);
		}
		return LMS_EMPLOYEES_LEAVE_DETAILS;
	}

	public static void main(String[] args) {
		try {
			List<GroupEmpLeaveDetails> showeployeedetails = showeployeedetails();

			for (GroupEmpLeaveDetails GroupEmpLeaveDetails : showeployeedetails) {
				System.out.println(GroupEmpLeaveDetails);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
