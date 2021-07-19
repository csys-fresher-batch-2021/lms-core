package in.lmscore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import in.lmscore.model.GroupEmpDetails;
import in.lmscore.util.ConnectionUtil;

public class EmployeeDetailsDAO {

	private EmployeeDetailsDAO() {

	}

	public static List<GroupEmpDetails> showeployeedetails() throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		ArrayList<GroupEmpDetails> LMS_EMPLOYEES_DETAILS = null;

		try {
			con = ConnectionUtil.getConnection();
			String sql = "select EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE from LMS_EMPLOYEES_DET";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			LMS_EMPLOYEES_DETAILS = new ArrayList<>();
			while (rs.next()) {
				String employeeCode = rs.getString(1);
				String EmpName = rs.getString(2);
				Date dob = rs.getDate(3);
				String Gender = rs.getString(4);
				String department = rs.getString(5);
				String Position = rs.getString(6);
				Date hireDate = rs.getDate(7);
				String Place = rs.getString(8);
				String managerCode = rs.getString(9);
				String empType = rs.getString(10);

				GroupEmpDetails LMS_EMPLOYEES_DET = new GroupEmpDetails(employeeCode, EmpName,dob,Gender, department,
						Position,hireDate,Place, managerCode, empType);
				LMS_EMPLOYEES_DETAILS.add(LMS_EMPLOYEES_DET);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs, ps, con);
		}
		return LMS_EMPLOYEES_DETAILS;
	}

	public static void main(String[] args) {
		try {
			List<GroupEmpDetails> showeployeedetails = showeployeedetails();

			for (GroupEmpDetails groupEmpDetails : showeployeedetails) {
				System.out.println(groupEmpDetails);
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
