package in.lmscore.model;

public class GroupEmpDetails {
	
	public String empCode;
	public String empName;
	public String gender;
	public String department;
	public String position;
	public String place;
	public String managerCode;
	public String empType;
	
	@Override
	public String toString() {
		return "GroupEmpDetails [empCode=" + empCode + ", empName=" + empName + ", gender=" + gender + ", department="
				+ department + ", position=" + position + ", place=" + place + ", managerCode=" + managerCode
				+ ", empType=" + empType + "]";
	}
	
	
	public GroupEmpDetails(String empCode, String empName, String gender, String department, String position,
			String place, String managerCode, String empType) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.gender = gender;
		this.department = department;
		this.position = position;
		this.place = place;
		this.managerCode = managerCode;
		this.empType = empType;
	}
	private GroupEmpDetails() {
		
	}
	
}
