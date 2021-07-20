package in.lmscore.dao;

import in.lmscore.model.EmpLeaveBalance;

import java.sql.SQLException;

import java.util.List;

public class EmployeeLeaveBalanceDAOTest {

	public static void main(String[] args) {
		try {
			List<EmpLeaveBalance> showeployeedetails = EmployeeLeaveBalanceDAO.showeployeedetails();

			for (EmpLeaveBalance GroupEmpLeaveDetails : showeployeedetails) {
				System.out.println(GroupEmpLeaveDetails);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}

