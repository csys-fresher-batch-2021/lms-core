package in.lmscore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import in.lmscore.model.EmpLeaveBalance;
import in.lmscore.util.ConnectionUtil;

public class EmployeeLeaveBalanceDAO {

	private EmployeeLeaveBalanceDAO() {

	}

	public static List<EmpLeaveBalance> showeployeedetails() throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection con = null;

		ResultSet rs = null;
		ArrayList<EmpLeaveBalance> LMS_EMPLOYEES_LEAVE_DETAILS = null;

		try {
			con = ConnectionUtil.getConnection();

			String sql = "select leave_id,EMPLOYEE_CODE,LEAVE_BALANCE from LMS_EMPLOYEES_LEAVE_DET  where EMPLOYEE_CODE = 'E1001' ";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			LMS_EMPLOYEES_LEAVE_DETAILS = new ArrayList<>();
			while (rs.next()) {
				int leaveId = rs.getInt(1);
				String empCode = rs.getString(2);
				int leaveBalance = rs.getInt(3);

				EmpLeaveBalance LMS_EMPLOYEES_LEAVE_DET = new EmpLeaveBalance(leaveId,empCode,leaveBalance);
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
			List<EmpLeaveBalance> showeployeedetails = showeployeedetails();

			for (EmpLeaveBalance EmpLeaveBalance : showeployeedetails) {
				System.out.println(EmpLeaveBalance);
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
