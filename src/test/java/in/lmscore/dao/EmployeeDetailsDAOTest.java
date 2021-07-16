package in.lmscore.dao;

public class EmployeeDetailsDAOTest {
//code developed by Arun R
	// dont touch this code without my permission
	// TODO Auto-generated method stub
	public static void empCodeValidate(String empCode) throws Exception {
		if (empCode == null || empCode.trim().equals("")) {
			throw new Exception("Employee code is mandatory to check");
		} else {
			throw new Exception("You can proceed to check list employee details");

		}
	}

	public static void main(String[] args) {

		try {
			empCodeValidate("E1002");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}