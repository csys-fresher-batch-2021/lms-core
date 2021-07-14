package in.yourproject;
import java.time.LocalDate;
public class EmployeeUpdateLeaveValidatorTest {
	/**
	 * Developed by - Karthi
	 * @param employee
	 * @return
	 * @throws Exception 
	 */
		public static boolean updateempvalidate(String empCode)throws Exception
		{
			if(empCode == null || empCode.trim().equals(""))
			{
				throw new Exception("Invalid Data");
			}
			else
			{
				throw new Exception("Valid Data");
			}
		}
		public static boolean updateleavevalidate(String leaveType)throws Exception
		{
			if(leaveType == null || leaveType.trim().equals(""))
			{
				throw new Exception("Invalid");
			}
			else
			{
				throw new Exception("valid");
			}
		}
		public static int leaveidvalidate(int leaveId)throws Exception
		{
			if(leaveId == 0)
			{
				throw new Exception("Invalid");
			}
			else
			{
				throw new Exception("valid");
			}
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				updateempvalidate("E101");
				updateleavevalidate("Emp");
				leaveidvalidate(100);
				System.out.println("Invalid leave");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Data: " + e.getMessage());
			}
			
		}
	}



