package in.lmscore.validator;

public class EmployeeValidatorTest {
//code developed by Arun R
	// dont touch the code without my permission
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeValidator.empvalidate("");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			EmployeeValidator.emptypevalidate("Admin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			EmployeeValidator.checkempvalidate("Employee");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
