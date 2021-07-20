package in.lmscore.validator;

public class IdValidation {
	
	private IdValidation() {
		
	}
	
	public static boolean checkId(int id) {
		
		if(id > 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
