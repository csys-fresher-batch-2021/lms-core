package in.yourproject;

import java.time.LocalDate;

public class EmployeeLeaveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empCode = null;
		LocalDate leaveDate = LocalDate.parse("2021-02-07");
		//LocalDate leaveEndDate = LocalDate.parse("07-02-2021");
		//EmployeeLeaveValidator ev1 = new EmployeeLeaveValidator();
		
		EmployeeLeave e1 = new EmployeeLeave();
		e1.display(101,"E1002","E1006","CASUAL_LEAVE","FUNCTION",leaveDate,leaveDate,21,"APLLIED");	
		System.out.println("Employee Leave Applied Successfully");
	}
	}
