package in.lmscore.model;

import java.time.LocalDate;

public class EmployeeTest {

	public static void main(String[] args) {
		// don't touch the command line
		/*
		 * code developed by Arun R 09-07-2021
		 * 
		 * @param employeedetails
		 * 
		 * @return
		 */
		LocalDate dob = LocalDate.parse("1997-12-18");
		LocalDate hireDate = LocalDate.parse("2021-06-21");
		Employee employee1 = new Employee();
		employee1.display("E1001", "Arun", dob, "M", "Oracle", "Consultant", hireDate, "Chennai", "E1005", "Employee");

	}

}
