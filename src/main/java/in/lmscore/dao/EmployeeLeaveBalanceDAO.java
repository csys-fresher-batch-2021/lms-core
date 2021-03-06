package in.lmscore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import in.lmscore.model.EmpLeaveBalance;
import in.lmscore.util.ConnectionUtil;
import in.lmscore.util.Logger;

public class EmployeeLeaveBalanceDAO {

	private EmployeeLeaveBalanceDAO() {

	}

	public static List<EmpLeaveBalance> showeployeedetails() throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection con = null;

		ResultSet rs = null;
		ArrayList<EmpLeaveBalance> lmsEmployeeLeaveDetails = null;

		try {
			con = ConnectionUtil.getConnection();

			String sql = "select leave_id,EMPLOYEE_CODE,LEAVE_BALANCE from LMS_EMPLOYEES_LEAVE_DET  where EMPLOYEE_CODE = 'E1001' ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			lmsEmployeeLeaveDetails = new ArrayList<>();
			while (rs.next()) {
				int leaveId = rs.getInt(1);
				String empCode = rs.getString(2);
				int leaveBalance = rs.getInt(3);

				EmpLeaveBalance lmsEmployeeLeaveDet = new EmpLeaveBalance(leaveId,empCode,leaveBalance);
				lmsEmployeeLeaveDetails.add(lmsEmployeeLeaveDet);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs, ps, con);
		}
		return lmsEmployeeLeaveDetails;
	}

	public static void main(String[] args) {
		try {
			List<EmpLeaveBalance> showeployeedetails = showeployeedetails();

			for (EmpLeaveBalance EmpLeaveBalance : showeployeedetails) {
				Logger.debug(EmpLeaveBalance);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		
	}
	}
}
