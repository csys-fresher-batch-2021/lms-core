package in.lmscore.dao;
import java.sql.SQLException;

import in.lmscore.util.Logger;
public class EmployeeLeaveBalanceDAOTest {
	public static void main(String[] args) {
		List<EmpLeaveBalance> showeployeedetails = showeployeedetails();

		for (EmpLeaveBalance EmpLeaveBalance : showeployeedetails) {
			Logger.debug(EmpLeaveBalance);
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
		
	}
