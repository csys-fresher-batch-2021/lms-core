package in.lmscore.validator;

public class EmployeeLeaveValidatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeLeaveValidator.empvalidate("E1002");
			EmployeeLeaveValidator.leavevalidate("Casual_leave");
			EmployeeLeaveValidator.leaveidvalidate(103);
			System.out.println("Invalid leave");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Data: " + e.getMessage());
		}
	}
}
