package in.lmscore.dao;

import in.lmscore.model.GroupEmpLeaveDetails;

import java.sql.SQLException;

import java.util.List;

public class ListEmployeeLeavesDAOTest {

	public static void main(String[] args) {
		try {
			List<GroupEmpLeaveDetails> showeployeedetails = ListEmployeeLeavesDAO.showeployeedetails();

			for (GroupEmpLeaveDetails GroupEmpLeaveDetails : showeployeedetails) {
				System.out.println(GroupEmpLeaveDetails);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
