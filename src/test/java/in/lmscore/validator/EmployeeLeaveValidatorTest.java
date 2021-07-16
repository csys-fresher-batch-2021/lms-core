package in.lmscore.validator;
import in.lmscore.util.Logger;
public class EmployeeLeaveValidatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeLeaveValidator.empvalidate("E1002");
			EmployeeLeaveValidator.leavevalidate("Casual_leave");
			EmployeeLeaveValidator.leaveidvalidate(103);
			Logger.debug("Invalid leave");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.debug("Data: " + e.getMessage());
		}
	}
}
