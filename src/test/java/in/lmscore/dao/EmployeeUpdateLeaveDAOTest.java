package in.lmscore.dao;
import in.lmscore.util.Logger;

public class EmployeeUpdateLeaveDAOTest {
	
	
	public static void Update (String empcode, String status,int  leaveId) {
		
		String sql = "UPADTE LMS_EMPLOYEES_LEAVE_DET SET EMPLOYEE_CODE = '" + empcode + "', STATUS = '" + status + "' WHERE LEAVE_ID = " + leaveId + ";";
		Logger.debug(sql);
		
		Logger.debug("Updated this employee Code " + empcode );
		
	}
	public static  boolean checkAdminPermission(String empcode, String status,int leaveId, String empType) throws Exception {
		if (empType.equals("MANAGER"))
				{
			return true;
		}
		else {
			throw new Exception("You Cannot Permission to update.");
			
		}
	}
	public static void main(String[] args) {
		int leaveId = 101;
		String status = "APPROVED";
		String empcode = "E1005";
		String empType = "MANAGER";
		try {
			checkAdminPermission(empcode,status,leaveId,empType);
			Update("E1005","APPROVED",101);
		
		} catch (Exception e) {
			Logger.debug("Error:"+ e.getMessage());
			e.printStackTrace();
		}
				
			
	}

}
