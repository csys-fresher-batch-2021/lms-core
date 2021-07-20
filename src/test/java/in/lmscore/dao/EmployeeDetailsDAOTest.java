package in.lmscore.dao;
import in.lmscore.model.GroupEmpDetails;

import java.sql.SQLException;

import java.util.List;

public class EmployeeDetailsDAOTest {

	public static void main(String[] args) {
		try {
			List<GroupEmpDetails> showeployeedetails = EmployeeDetailsDAO.showeployeedetails();

			for (GroupEmpDetails GroupEmpLeaveDetails : showeployeedetails) {
				System.out.println(GroupEmpLeaveDetails);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}

